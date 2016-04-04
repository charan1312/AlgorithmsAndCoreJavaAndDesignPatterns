package edu.asu.foa.algo.visa.hackerrank;

public class DNS {

	public static void main(String[] args) {
		
		String[] inp = new String[] {"123.234.292", "234a:1212:ff0:f:0:3:2:2"};
		String[] out = checkDSN(inp);
		for(String s : out) {
			System.out.println(s);
		}
	}

	private static String[] checkDSN(String[] inp) {
		String[] ans =  new String[inp.length];
		int idx = 0;		
		for (String eachinp : inp) {
			boolean val = true;
			String[] parts = eachinp.split(":");
			if(parts.length == 8) {
//				System.out.println("len is 8");
				for(int i = 0; i< parts.length ; i++) {
					try
					{
						int v = Integer.parseInt(parts[i],16);
//						System.out.println(v);
						if(v< 0 || v> Integer.parseInt("ffff", 16)){
							val = false;
							break;
						}
					} catch(NumberFormatException e) {
						val = false;
						break;
					}
				}
//				System.out.println("ikkada:" + val);
				if(val == true) {
					ans[idx++] = "Ipv6";
					continue;
				}
			}
			parts = eachinp.split("\\.");
			if(parts.length == 4) {
				for(int i = 0; i< parts.length ; i++) {
					try
					{
						int v = Integer.parseInt(parts[i]);
						if(v<0 || v>255){
							val = false;
							break;
						}
					} catch(NumberFormatException e) {
						val = false;
						break;
					}
				}
				if(val == true) {
					ans[idx++] = "Ipv4";
					continue;
				}
			}
			
			ans[idx++] = "Neither";
		}
		
		
		return ans;
	}
}


//	//SELECT CUSTOMERNUMBER FROM ( SELECT CustomerNumber,count(*) from ORDERS GROUP BY CUSTOMERNUMBER ORDER BY count(*) DESC) WHERE ROWNUM =1;