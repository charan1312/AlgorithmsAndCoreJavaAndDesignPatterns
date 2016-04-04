package edu.asu.foa.algo.controller;

import java.util.LinkedList;
import java.util.Queue;

import edu.asu.foa.algo.bean.Course;
import edu.asu.foa.algo.bean.TA;
import edu.asu.foa.algo.constant.Constant;

public class CourseAndTAAsngWithArrayOfObj {
	
	
	public static void main(String[] args) throws InterruptedException
	{
		Queue<Integer> Clist = new LinkedList<Integer>();

		Course[] C = new Course[Constant.N];
		//		C1.setCid(1);
		//		C1.TAPrefofC.add(1);C1.TAPrefofC.add(5);C1.TAPrefofC.add(3);C1.TAPrefofC.add(2);C1.TAPrefofC.add(4);
		C[0] = new Course();
		C[0].setCid(0);
//		C[0].TAPrefofC.add(1);C[0].TAPrefofC.add(5);C[0].TAPrefofC.add(3);C[0].TAPrefofC.add(2);C[0].TAPrefofC.add(4);
		C[0].TAPrefofC.add(1);C[0].TAPrefofC.add(2);C[0].TAPrefofC.add(5);C[0].TAPrefofC.add(4);C[0].TAPrefofC.add(3);
		Clist.add(C[0].getCid());

		C[1] = new Course();
		C[1].setCid(1);
//		C[1].TAPrefofC.add(1);C[1].TAPrefofC.add(5);C[1].TAPrefofC.add(3);C[1].TAPrefofC.add(2);C[1].TAPrefofC.add(4);
		C[1].TAPrefofC.add(2);C[1].TAPrefofC.add(1);C[1].TAPrefofC.add(4);C[1].TAPrefofC.add(3);C[1].TAPrefofC.add(5);
		Clist.add(C[1].getCid());

		C[2] = new Course();
		C[2].setCid(2);
//		C[2].TAPrefofC.add(1);C[2].TAPrefofC.add(5);C[2].TAPrefofC.add(3);C[2].TAPrefofC.add(2);C[2].TAPrefofC.add(4);
		C[2].TAPrefofC.add(3);C[2].TAPrefofC.add(4);C[2].TAPrefofC.add(1);C[2].TAPrefofC.add(2);C[2].TAPrefofC.add(5);
		Clist.add(C[2].getCid());

		C[3] = new Course();
		C[3].setCid(3);
//		C[3].TAPrefofC.add(1);C[3].TAPrefofC.add(5);C[3].TAPrefofC.add(3);C[3].TAPrefofC.add(2);C[3].TAPrefofC.add(4);
		C[3].TAPrefofC.add(4);C[3].TAPrefofC.add(5);C[3].TAPrefofC.add(3);C[3].TAPrefofC.add(2);C[3].TAPrefofC.add(1);
//		C[3].TAPrefofC.add(3);C[1].TAPrefofC.add(1);C[3].TAPrefofC.add(2);C[3].TAPrefofC.add(4);C[3].TAPrefofC.add(5);
		Clist.add(C[3].getCid());

		C[4] = new Course();
		C[4].setCid(4);
//		C[4].TAPrefofC.add(1);C[4].TAPrefofC.add(5);C[4].TAPrefofC.add(3);C[4].TAPrefofC.add(2);C[4].TAPrefofC.add(4);
		C[4].TAPrefofC.add(5);C[4].TAPrefofC.add(1);C[4].TAPrefofC.add(2);C[4].TAPrefofC.add(4);C[4].TAPrefofC.add(3);
		Clist.add(C[4].getCid());



		TA[] ta = new TA[Constant.N];
		ta[0] = new TA();

		ta[0].setTAId(0);
//		ta[0].CPrefofTA.add(5);ta[0].CPrefofTA.add(4);ta[0].CPrefofTA.add(1);ta[0].CPrefofTA.add(2);ta[0].CPrefofTA.add(3);
		ta[0].CPrefofTA.add(5);ta[0].CPrefofTA.add(3);ta[0].CPrefofTA.add(2);ta[0].CPrefofTA.add(1);ta[0].CPrefofTA.add(4);

		ta[1] = new TA();
		ta[1].setTAId(1);
//		ta[1].CPrefofTA.add(5);ta[1].CPrefofTA.add(4);ta[1].CPrefofTA.add(1);ta[1].CPrefofTA.add(2);ta[1].CPrefofTA.add(3);
		ta[1].CPrefofTA.add(4);ta[1].CPrefofTA.add(1);ta[1].CPrefofTA.add(2);ta[1].CPrefofTA.add(3);ta[1].CPrefofTA.add(5);

		ta[2] = new TA();
		ta[2].setTAId(2);
//		ta[2].CPrefofTA.add(5);ta[2].CPrefofTA.add(4);ta[2].CPrefofTA.add(1);ta[2].CPrefofTA.add(2);ta[2].CPrefofTA.add(3);
		ta[2].CPrefofTA.add(1);ta[2].CPrefofTA.add(2);ta[2].CPrefofTA.add(4);ta[2].CPrefofTA.add(3);ta[2].CPrefofTA.add(5);

		ta[3] = new TA();
		ta[3].setTAId(3);
//		ta[3].CPrefofTA.add(5);ta[3].CPrefofTA.add(4);ta[3].CPrefofTA.add(1);ta[3].CPrefofTA.add(2);ta[3].CPrefofTA.add(3);
		ta[3].CPrefofTA.add(1);ta[3].CPrefofTA.add(2);ta[3].CPrefofTA.add(3);ta[3].CPrefofTA.add(4);ta[3].CPrefofTA.add(5);

		ta[4] = new TA();
		ta[4].setTAId(4);
//		ta[4].CPrefofTA.add(5);ta[4].CPrefofTA.add(4);ta[4].CPrefofTA.add(1);ta[4].CPrefofTA.add(2);ta[4].CPrefofTA.add(3);
		ta[4].CPrefofTA.add(4);ta[4].CPrefofTA.add(5);ta[4].CPrefofTA.add(3);ta[4].CPrefofTA.add(1);ta[4].CPrefofTA.add(2);


		int currentC,currentCTopriorityTAidx,currentTAAsgndC,currentTAAsgndCPriority, currentCPriorityFromTA;
		while(!Clist.isEmpty())
		{
			currentC = Clist.remove();
			currentCTopriorityTAidx = C[currentC].TAPrefofC.remove() - 1 ;  // -1 is for making the pref values start from 0 to 4
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

		for(int i=0;i<C.length;i++)
		{
			System.out.println(C[i].getCid() + " <--------> " + C[i].assignedTA);
		}
	}
}
