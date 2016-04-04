package edu.asu.foa.algo.controller;

import java.util.LinkedList;
import java.util.Queue;

import edu.asu.foa.algo.bean.Course;
import edu.asu.foa.algo.bean.TA;
import edu.asu.foa.algo.constant.Constant;

public class CourseAndTAAsgnmnt1 {
	
	
	public static void main(String[] args) throws InterruptedException
	{
		Queue<Integer> Clist = new LinkedList<Integer>();

		Course[] C = new Course[Constant.N];
		//		C1.setCid(1);
		//		C1.TPrefofCforA1.add(1);C1.TPrefofCforA1.add(5);C1.TPrefofCforA1.add(3);C1.TPrefofCforA1.add(2);C1.TPrefofCforA1.add(4);
		C[0] = new Course();
		C[0].setCid(0);
		C[0].TPrefofCforA1.add(1);C[0].TPrefofCforA1.add(5);C[0].TPrefofCforA1.add(3);C[0].TPrefofCforA1.add(2);C[0].TPrefofCforA1.add(4);
		C[0].TPrefofCforA1List.add(1);C[0].TPrefofCforA1List.add(4);C[0].TPrefofCforA1List.add(3);C[0].TPrefofCforA1List.add(5);C[0].TPrefofCforA1List.add(2);
		Clist.add(C[0].getCid());

		C[1] = new Course();
		C[1].setCid(1);
		C[1].TPrefofCforA1.add(1);C[1].TPrefofCforA1.add(5);C[1].TPrefofCforA1.add(3);C[1].TPrefofCforA1.add(2);C[1].TPrefofCforA1.add(4);
		C[1].TPrefofCforA1List.add(1);C[1].TPrefofCforA1List.add(4);C[1].TPrefofCforA1List.add(3);C[1].TPrefofCforA1List.add(5);C[1].TPrefofCforA1List.add(2);
		Clist.add(C[1].getCid());

		C[2] = new Course();
		C[2].setCid(2);
		C[2].TPrefofCforA1.add(1);C[2].TPrefofCforA1.add(5);C[2].TPrefofCforA1.add(3);C[2].TPrefofCforA1.add(2);C[2].TPrefofCforA1.add(4);
		C[2].TPrefofCforA1List.add(1);C[2].TPrefofCforA1List.add(4);C[2].TPrefofCforA1List.add(3);C[2].TPrefofCforA1List.add(5);C[2].TPrefofCforA1List.add(2);
		Clist.add(C[2].getCid());

		C[3] = new Course();
		C[3].setCid(3);
		C[3].TPrefofCforA1.add(1);C[3].TPrefofCforA1.add(5);C[3].TPrefofCforA1.add(3);C[3].TPrefofCforA1.add(2);C[3].TPrefofCforA1.add(4);
		C[3].TPrefofCforA1List.add(1);C[3].TPrefofCforA1List.add(4);C[3].TPrefofCforA1List.add(3);C[3].TPrefofCforA1List.add(5);C[3].TPrefofCforA1List.add(2);
		Clist.add(C[3].getCid());

		C[4] = new Course();
		C[4].setCid(4);
		C[4].TPrefofCforA1.add(1);C[4].TPrefofCforA1.add(5);C[4].TPrefofCforA1.add(3);C[4].TPrefofCforA1.add(2);C[4].TPrefofCforA1.add(4);
		C[4].TPrefofCforA1List.add(1);C[4].TPrefofCforA1List.add(4);C[4].TPrefofCforA1List.add(3);C[4].TPrefofCforA1List.add(5);C[4].TPrefofCforA1List.add(2);
		Clist.add(C[4].getCid());



		TA[] ta = new TA[Constant.N];
		ta[0] = new TA();

		ta[0].setTAId(0);
		ta[0].CPrefofTAforA1.add(5);ta[0].CPrefofTAforA1.add(4);ta[0].CPrefofTAforA1.add(1);ta[0].CPrefofTAforA1.add(2);ta[0].CPrefofTAforA1.add(3);
		ta[0].CPrefofTAforA1List.add(3);ta[0].CPrefofTAforA1List.add(4);ta[0].CPrefofTAforA1List.add(5);ta[0].CPrefofTAforA1List.add(2);ta[0].CPrefofTAforA1List.add(1);

		ta[1] = new TA();
		ta[1].setTAId(1);
		ta[1].CPrefofTAforA1.add(5);ta[1].CPrefofTAforA1.add(4);ta[1].CPrefofTAforA1.add(1);ta[1].CPrefofTAforA1.add(2);ta[1].CPrefofTAforA1.add(3);
		ta[1].CPrefofTAforA1List.add(3);ta[1].CPrefofTAforA1List.add(4);ta[1].CPrefofTAforA1List.add(5);ta[1].CPrefofTAforA1List.add(2);ta[1].CPrefofTAforA1List.add(1);

		ta[2] = new TA();
		ta[2].setTAId(2);
		ta[2].CPrefofTAforA1.add(5);ta[2].CPrefofTAforA1.add(4);ta[2].CPrefofTAforA1.add(1);ta[2].CPrefofTAforA1.add(2);ta[2].CPrefofTAforA1.add(3);
		ta[2].CPrefofTAforA1List.add(3);ta[2].CPrefofTAforA1List.add(4);ta[2].CPrefofTAforA1List.add(5);ta[2].CPrefofTAforA1List.add(2);ta[2].CPrefofTAforA1List.add(1);

		ta[3] = new TA();
		ta[3].setTAId(3);
		ta[3].CPrefofTAforA1.add(5);ta[3].CPrefofTAforA1.add(4);ta[3].CPrefofTAforA1.add(1);ta[3].CPrefofTAforA1.add(2);ta[3].CPrefofTAforA1.add(3);
		ta[3].CPrefofTAforA1List.add(3);ta[3].CPrefofTAforA1List.add(4);ta[3].CPrefofTAforA1List.add(5);ta[3].CPrefofTAforA1List.add(2);ta[3].CPrefofTAforA1List.add(1);

		ta[4] = new TA();
		ta[4].setTAId(4);
		ta[4].CPrefofTAforA1.add(5);ta[4].CPrefofTAforA1.add(4);ta[4].CPrefofTAforA1.add(1);ta[4].CPrefofTAforA1.add(2);ta[4].CPrefofTAforA1.add(3);
		ta[4].CPrefofTAforA1List.add(3);ta[4].CPrefofTAforA1List.add(4);ta[4].CPrefofTAforA1List.add(5);ta[4].CPrefofTAforA1List.add(2);ta[4].CPrefofTAforA1List.add(1);

		//C[0].assignedTA = 4; ta[0].assignedCourse =  3;
		//C[1].assignedTA = 2; ta[1].assignedCourse =  2;
		//C[2].assignedTA = 1; ta[2].assignedCourse =  1;
		//C[3].assignedTA = 0; ta[3].assignedCourse =  4;
		//C[4].assignedTA = 3; ta[4].assignedCourse =  0;
		
		C[0].assignedTA = 0; ta[0].assignedCourse =  0;
		C[1].assignedTA = 1; ta[1].assignedCourse =  1;
		C[2].assignedTA = 2; ta[2].assignedCourse =  2;
		C[3].assignedTA = 3; ta[3].assignedCourse =  3;
		C[4].assignedTA = 4; ta[4].assignedCourse =  4;
						
		

		int currentC,currentCTopriorityTAidx,currentTAAsgndC,currentTAAsgndCPriority, currentCPriorityFromTA;
		int currentCi,currentCj,currentCiAssignedTA,currentTAAssignedCi,currentCjAssignedTA,currentTAAssignedCj;
		int i,j,k,loopcnt,iterator;
		int a1,b1,a2,b2;
		System.out.println("Before entering For loop");
		for(i=0;i<Constant.N;i++)
		{
			j = i+1;
			if(j>=Constant.N)
			{
				j = 0;
			}
			loopcnt = 1;
			while(loopcnt <= Constant.N - 1)
			{
				currentCi = i;
				currentCiAssignedTA = C[i].assignedTA;

				if(j>=Constant.N)
				{
					j=0;
				}
				
				currentCj= j;
				currentCjAssignedTA = C[j].assignedTA;
				a1 = ta[currentCiAssignedTA].CPrefofTAforA1.get(currentCi);
				a2 = ta[currentCiAssignedTA].CPrefofTAforA1.get(currentCj);
				
				b1 = C[currentCj].TPrefofCforA1List.get(currentCjAssignedTA);
				b2 = C[currentCj].TPrefofCforA1List.get(currentCiAssignedTA);

				System.out.println("a1,b1,currentCi,currentCiAssignedTA:" + a1 + " " + b1 + " " + currentCi+ " " +currentCiAssignedTA);
				System.out.println("a2,b2,currentCj,currentCjAssignedTA:" + a2 + " " + b2 + " " + currentCj+ " " +currentCjAssignedTA);
				if((a1 < a2) && (b1 < b2))
				{
					System.out.println("EXCHANGE");
					System.out.println("a1,b1,a2,b2:" + a1 + " " + b1 + " " + a2  +" " + b2);
					C[currentCi].assignedTA = currentCjAssignedTA;
					C[currentCj].assignedTA = currentCiAssignedTA;
				}
				
				j = j + 1;
				loopcnt++; 
			}
		}
//	}
/*			//currentTAAssignedCi = ta[i].assignedCourse;
			for (j=0;j<Constant.N;j++)
			{
				if(j==Constant.N)
				{
					j = 0;
					k = 0;
				}
				else
				{
					k = j;
				}
				currentCj = j;
				currentCAssignedTAj = C[j].assignedTA;
				currentTAAssignedCj = ta[j].assignedCourse;
				while(iterator <= Constant.N)
				{
				//if()
					iterator++;
				}
				
				
			}

		
		}
		while(!Clist.isEmpty())
		{
			currentC = Clist.remove();
			currentCTopriorityTAidx = C[currentC].TPrefofCforA1.remove() - 1 ;  // -1 is for making the pref values start from 0 to 4
			//		for(i=0;i<C.length;i++)
			//		{
			if(ta[currentCTopriorityTAidx].assignedCourse == -1)
			{
				C[currentC].assignedTA = currentCTopriorityTAidx;
				ta[currentCTopriorityTAidx].assignedCourse = currentC;
			}
			else if (ta[currentCTopriorityTAidx].assignedCourse != -1)
			{
				currentTAAsgndC = ta[currentCTopriorityTAidx].assignedCourse;
				currentTAAsgndCPriority = ta[currentCTopriorityTAidx].CPrefofTAforA1.get(currentTAAsgndC) - 1;
				currentCPriorityFromTA =  ta[currentCTopriorityTAidx].CPrefofTAforA1.get(currentC) - 1;
				if (currentTAAsgndCPriority > currentCPriorityFromTA )  // New C priority better one ==> add old course to Queue
				{
					Clist.add(currentTAAsgndC);
					ta[currentCTopriorityTAidx].assignedCourse = currentC;
					C[currentC].assignedTA = currentCTopriorityTAidx;
				}
				else
				{
					Clist.add(currentC);       // Keeping the old C ==> add current C to Queue
				}
			}

		}
*/
		for(i=0;i<C.length;i++)
		{
			System.out.println(C[i].getCid() + " <--------> " + C[i].assignedTA);
		}
	}
}
