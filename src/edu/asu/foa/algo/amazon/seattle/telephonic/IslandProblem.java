package edu.asu.foa.algo.amazon.seattle.telephonic;

import java.util.ArrayList;
import java.util.List;

class Out{
	int num;
	List<Pt> points;
	
	public Out() {
		points = new ArrayList<Pt>();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String l = "";
		for(Pt p : points) {
			l+= p.toString();
		}
		return "Island-"+ num + " contains Points:" + l;
	}
}

class Pt {
	int x;
	int y;
	
	public Pt(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "(" + x + "," + y +")";
	}
}
public class IslandProblem {

	static final int R = 5, C = 5;
	
	public static void main(String[] args) {
		
		int map1[][] = new int[][]  {  	
				{1, 0, 0, 0, 0},
				{1, 1, 0, 0, 0},
				{0, 0, 0, 0, 1},
				{0, 0, 1, 0, 0},
				{1, 0, 1, 0, 0}
		};
		
		System.out.println("Main method");
		IslandProblem ip = new IslandProblem();
		System.out.println("No.of Islands: " + ip.countIsland(map1));
		System.out.println("\n\n\n List of Islands:");
		List<Out> ans = new ArrayList<Out>();
		ans = ip.listIsland(map1);
		for (Out o : ans) {
			System.out.println(o);
		}
	}

	private int countIsland(int[][] map) {
		// TODO Auto-generated method stub
		boolean visited[][] = new boolean[R][C];
		
		int count = 0;
		for(int i = 0; i < R; ++i) {
			for(int j = 0; j < C; ++j) {
				if(map[i][j] == 1 && !visited[i][j]) {
					System.out.println("I val :" + i + ", J val :" + j );
					scan(map,i,j,visited);
					++count;
				}
			}
		}
		return count;
	}


	private List<Out> listIsland(int[][] map) {
		// TODO Auto-generated method stub
		boolean visited[][] = new boolean[R][C];
		List<Out> ans = new ArrayList<Out>();
		int count = 0;
		for(int i = 0; i < R; ++i) {
			for(int j = 0; j < C; ++j) {
				if(map[i][j] == 1 && !visited[i][j]) {
					System.out.println("I val :" + i + ", J val :" + j );
					Out o = new Out();
					o.num = ++count;
					scan1(map,i,j,visited,o);
					ans.add(o);
				}
			}
		}
		return ans;
	}

	private void scan(int[][] map, int i, int j, boolean[][] visited) {
		// TODO Auto-generated method stub
		System.out.println("Looking at : (" + i + "," +j +")");
		int neighbourRows[] = new int[] {-1,-1,-1,0,0,1,1,1};
		int neighbourCols[] = new int[] {-1,0,1,-1,1,-1,0,1};
		visited[i][j] = true;
		for (int k = 0; k < 8 ; ++k) {
			 if(isSafe(map,i + neighbourRows[k],j + neighbourCols[k], visited))
				 scan(map,i + neighbourRows[k],j + neighbourCols[k], visited);
		} 
	}

	private void scan1(int[][] map, int i, int j, boolean[][] visited, Out o) {
		// TODO Auto-generated method stub
		
		//System.out.println("Looking at : (" + i + "," +j +")");
		Pt p = new Pt(i, j);
		o.points.add(p);
		int neighbourRows[] = new int[] {-1,-1,-1,0,0,1,1,1};
		int neighbourCols[] = new int[] {-1,0,1,-1,1,-1,0,1};
		visited[i][j] = true;
		for (int k = 0; k < 8 ; ++k) {
			 if(isSafe(map,i + neighbourRows[k],j + neighbourCols[k], visited))
				 scan1(map,i + neighbourRows[k],j + neighbourCols[k], visited,o);
		} 
	}

	private boolean isSafe(int[][] map, int i, int j, boolean[][] visited) {
		// TODO Auto-generated method stub
		return (i >= 0) && (i < R) && (j >= 0) && (j < C) && ((map[i][j] == 1 && !visited[i][j]));
	}
}
