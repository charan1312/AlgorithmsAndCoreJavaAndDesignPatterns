package edu.asu.foa.algo.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

import edu.asu.foa.algo.bean.Course;
import edu.asu.foa.algo.bean.TA;
import edu.asu.foa.algo.constant.Constant;


public class CourseAndTAAsgnmnt2 {

	public static void main(String[] args) throws InterruptedException
	{
		Queue<Integer> Clist = new LinkedList<Integer>();
		Set<Integer> TAlistAlredyAsgned = new HashSet<Integer>();
		List<Integer> r = new ArrayList<Integer>();

/*		Course[] C = new Course[Constant.N];
		C[0] = new Course();
		C[0].setCid(0);
		C[0].TAPrefofC.add(3);C[0].TAPrefofC.add(5);C[0].TAPrefofC.add(1);C[0].TAPrefofC.add(4);C[0].TAPrefofC.add(2);
		Clist.add(C[0].getCid());

		C[1] = new Course();
		C[1].setCid(1);
		C[1].TAPrefofC.add(1);C[1].TAPrefofC.add(2);C[1].TAPrefofC.add(3);C[1].TAPrefofC.add(5);C[1].TAPrefofC.add(4);
		Clist.add(C[1].getCid());

		C[2] = new Course();
		C[2].setCid(2);
		C[2].TAPrefofC.add(1);C[2].TAPrefofC.add(5);C[2].TAPrefofC.add(3);C[2].TAPrefofC.add(2);C[2].TAPrefofC.add(4);
		Clist.add(C[2].getCid());

		C[3] = new Course();
		C[3].setCid(3);
		//WRONG PREFERENCES STORED FOR THE 4TH COURSE
		C[3].TAPrefofC.add(2);C[3].TAPrefofC.add(5);C[3].TAPrefofC.add(4);C[3].TAPrefofC.add(3);C[3].TAPrefofC.add(1);
		Clist.add(C[3].getCid());
		
		C[4] = new Course();
		C[4].setCid(4);
		C[4].TAPrefofC.add(4);C[4].TAPrefofC.add(5);C[4].TAPrefofC.add(3);C[4].TAPrefofC.add(2);C[4].TAPrefofC.add(1);
		Clist.add(C[4].getCid());

*/
		
		Course[] C = new Course[Constant.N];
		C[0] = new Course();
		C[0].setCid(0);
		C[0].TAPrefofCforA2.add(3);C[0].TAPrefofCforA2.add(5);C[0].TAPrefofCforA2.add(1);C[0].TAPrefofCforA2.add(4);C[0].TAPrefofCforA2.add(2);
		Clist.add(C[0].getCid());

		C[1] = new Course();
		C[1].setCid(1);
		C[1].TAPrefofCforA2.add(1);C[1].TAPrefofCforA2.add(2);C[1].TAPrefofCforA2.add(3);C[1].TAPrefofCforA2.add(5);C[1].TAPrefofCforA2.add(4);
		Clist.add(C[1].getCid());

		C[2] = new Course();
		C[2].setCid(2);
		C[2].TAPrefofCforA2.add(1);C[2].TAPrefofCforA2.add(5);C[2].TAPrefofCforA2.add(3);C[2].TAPrefofCforA2.add(2);C[2].TAPrefofCforA2.add(4);
		Clist.add(C[2].getCid());

		C[3] = new Course();
		C[3].setCid(3);
		//WRONG PREFERENCES STORED FOR THE 4TH COURSE
		C[3].TAPrefofCforA2.add(2);C[3].TAPrefofCforA2.add(5);C[3].TAPrefofCforA2.add(4);C[3].TAPrefofCforA2.add(3);C[3].TAPrefofCforA2.add(1);
		Clist.add(C[3].getCid());

		C[4] = new Course();
		C[4].setCid(4);
		C[4].TAPrefofCforA2.add(4);C[4].TAPrefofCforA2.add(5);C[4].TAPrefofCforA2.add(3);C[4].TAPrefofCforA2.add(2);C[4].TAPrefofCforA2.add(1);
		Clist.add(C[4].getCid());




		TA[] ta = new TA[Constant.N];
		ta[0] = new TA();

		ta[0].setTAId(0);
		ta[0].CPrefofTA.add(5);ta[0].CPrefofTA.add(4);ta[0].CPrefofTA.add(1);ta[0].CPrefofTA.add(2);ta[0].CPrefofTA.add(3);

		ta[1] = new TA();
		ta[1].setTAId(1);
		ta[1].CPrefofTA.add(1);ta[1].CPrefofTA.add(4);ta[1].CPrefofTA.add(5);ta[1].CPrefofTA.add(2);ta[1].CPrefofTA.add(3);

		ta[2] = new TA();
		ta[2].setTAId(2);
		ta[2].CPrefofTA.add(3);ta[2].CPrefofTA.add(4);ta[2].CPrefofTA.add(1);ta[2].CPrefofTA.add(2);ta[2].CPrefofTA.add(5);

		ta[3] = new TA();
		ta[3].setTAId(3);
		ta[3].CPrefofTA.add(4);ta[3].CPrefofTA.add(2);ta[3].CPrefofTA.add(3);ta[3].CPrefofTA.add(5);ta[3].CPrefofTA.add(1);

		ta[4] = new TA();
		ta[4].setTAId(4);
		ta[4].CPrefofTA.add(5);ta[4].CPrefofTA.add(4);ta[4].CPrefofTA.add(1);ta[4].CPrefofTA.add(2);ta[4].CPrefofTA.add(3);

		
		System.out.println("C <--------> TA     ---------   TA <--------> C");
		for(int i=0;i<C.length;i++)
		{
			System.out.println(C[i].getCid() + " <--------> " + C[i].assignedTA +"      ---------   "+ ta[i].getTAId() + " <-------->" + ta[i].assignedCourse);
		}
		System.out.println("");

		int currentC,currentCTopriorityTAidx,currentTAAsgndC,currentTAAsgndCPriority, currentCPriorityFromTA, i=0 ;
		while(!Clist.isEmpty())
		{
			currentC = Clist.remove();

			currentCTopriorityTAidx = C[currentC].TAPrefofCforA2.get(C[currentC].index) - 1 ;
			C[currentC].index = C[currentC].index + 1;

			if(ta[currentCTopriorityTAidx].assignedCourse == -1)
			{
				C[currentC].assignedTA = currentCTopriorityTAidx;
				ta[currentCTopriorityTAidx].assignedCourse = currentC;
			}
			else if (ta[currentCTopriorityTAidx].assignedCourse != -1)
			{
				currentTAAsgndC = ta[currentCTopriorityTAidx].assignedCourse;
				currentTAAsgndCPriority = ta[currentCTopriorityTAidx].CPrefofTA.get(currentTAAsgndC) - 1;
				currentCPriorityFromTA =  ta[currentCTopriorityTAidx].CPrefofTA.get(currentC) - 1;
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


		System.out.println("OUTPUT WITH THE INCORRECT VALUES");
		System.out.println("C <--------> TA     ---------   TA <--------> C");
		for(i=0;i<C.length;i++)
		{
			System.out.println(C[i].getCid() + " <--------> " + C[i].assignedTA +"      ---------   "+ ta[i].getTAId() + " <-------->" + ta[i].assignedCourse);
		}
		System.out.println("");


		for(i=0;i<Constant.N;i++)
			System.out.println("C["+i+"] index before:" + C[i].index); // = 0;

		
		//MAIN CHANGES STARTS
		int X = 3;
		C[X].TAPrefofCforA2.clear();
		C[X].TAPrefofCforA2.add(4);C[3].TAPrefofCforA2.add(5);C[3].TAPrefofCforA2.add(3);C[3].TAPrefofCforA2.add(2);C[3].TAPrefofCforA2.add(1);
		for(i=0;i<Constant.N;i++)
		{
			if (i<X)
			{
				C[i].index =1;
				TAlistAlredyAsgned.add(C[i].TAPrefofCforA2.get(0) - 1);				
			}
			if(i>=X)
			{
				C[i].index=0;
			}
		}
		
		for(Integer k : TAlistAlredyAsgned)
			System.out.println("TAl VAlues" + k);
		
		for(i=0;i<Constant.N;i++)
		{
			if(!TAlistAlredyAsgned.contains(i))
			{
				ta[i].assignedCourse = -1;
			}
			else
			{
				r.add(ta[i].assignedCourse);
			}
		}

		for(i=0;i<Constant.N;i++)
		{
			if(!r.contains(C[i].getCid()))
			{
				C[i].assignedTA = -1;
				Clist.add(C[i].getCid());
			}
		}
		
		for(i=0;i<Constant.N;i++)
			System.out.println("C["+i+"] index after:" + C[i].index); // = 0;

		System.out.println("C AND TA VALUES");
		System.out.println("C <--------> TA     ---------   TA <--------> C");
		for(i=0;i<C.length;i++)
		{
			System.out.println(C[i].getCid() + " <--------> " + C[i].assignedTA +"      ---------   "+ ta[i].getTAId() + " <-------->" + ta[i].assignedCourse);
		}
		System.out.println("");		


		System.out.println("OUTPUT WITH THE BEFORE CORRECTING VALUES");
		System.out.println("C <--------> TA     ---------   TA <--------> C");
		for(i=0;i<C.length;i++)
		{
			System.out.println(C[i].getCid() + " <--------> " + C[i].assignedTA +"      ---------   "+ ta[i].getTAId() + " <-------->" + ta[i].assignedCourse);
		}
		System.out.println("");

		currentC = X;
		while(!Clist.isEmpty() && C[currentC].index <Constant.N)
		{
			currentC = Clist.remove();
			System.out.println("CurrentC:" + currentC);

			currentCTopriorityTAidx = C[currentC].TAPrefofCforA2.get(C[currentC].index) - 1 ;
			C[currentC].index = C[currentC].index + 1;

			if(ta[currentCTopriorityTAidx].assignedCourse == -1)
			{
				C[currentC].assignedTA = currentCTopriorityTAidx;
				ta[currentCTopriorityTAidx].assignedCourse = currentC;
			}
			else if (ta[currentCTopriorityTAidx].assignedCourse != -1)
			{
				currentTAAsgndC = ta[currentCTopriorityTAidx].assignedCourse;
				currentTAAsgndCPriority = ta[currentCTopriorityTAidx].CPrefofTA.get(currentTAAsgndC) - 1;
				currentCPriorityFromTA =  ta[currentCTopriorityTAidx].CPrefofTA.get(currentC) - 1;
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

		System.out.println("OUTPUT WITH THE MODIFIEDs_CORRECT VALUES");
		System.out.println("C <--------> TA");
		for(i=0;i<C.length;i++)
		{
			System.out.println(C[i].getCid() + " <--------> " + C[i].assignedTA);
		}

	}

}
