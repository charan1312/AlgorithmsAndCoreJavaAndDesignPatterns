package edu.asu.foa.algo.visa.hackerrank;

public class DNSCheck {

	public static void main(String[] args) {
	
		String[] sin = new String[] { "0:1:1231:00ff:2321:2323:0:f0g0", "121.233.0.221", "0:1:1231:00ff:2321:2323:0:f0f0" };
		
		String[] sout =  DNSCheckCalculate(sin);
		
		for(String s : sout) {
			System.out.println(s);
		}
	}

	private static String[] DNSCheckCalculate(String[] sin) {
		
		String[] out = new String[sin.length];
		//System.out.println(Integer.parseInt("ffff",16));
		int hexMax = 65535;
		int intMax = 255;
		int index = -1;
		for( String s : sin) {
			++index;
			String[] m = s.split(":");
			boolean isValid = true;
			if(m.length == 8) {
				for (String e : m) {
					try {
						int i = Integer.parseInt(e, 16);
						if(i < 0 || i > 65535) {
							isValid = false;
							break;
						}
					} catch(Exception e1) {
						isValid = false;
						break;
					}
				}
				if(isValid) {
					out[index] = "IPv6";
				} else {
					out[index] = "Neither";
				}
				continue;
			}
			
			m = s.split("\\.");
			if(m.length == 4) {
				for(String e : m) {
					try{
						int i = Integer.parseInt(e,10);
						if(i < 0 || i > 255) {
							isValid = false;
							break;
						} 
					} catch(Exception e1) {
						isValid = false;
						break;
					}
				}
				if(isValid) {
					out[index] = "IPv4";
				} else {
					out[index] = "Neither";
				}
				continue;
			}
			
			out[index] = "Neither";
		}
		
		return out;
	}
	 
}
