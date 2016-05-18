package edu.asu.foa.algo.amazon.seattle.telephonic;

import java.util.List;

class Point {
    int x;
    int y;
    
    Point(int x, int y) {
    	this.x = x;
    	this.y = y;
    }
}

class Output{
    int islandNumber;
    List<Point> points;
}

public class IslandFinder {
	//find a land
	//check for the presence of 1 to its right and left, top and bottom
	static int inum = 0;
	int R = 4;
	int C = 5;	
	int map1[][] = new int[][]  {  	{1, 0, 0, 0},
									{1, 1, 0, 0},
									{0, 0, 1, 0},
									{0, 0, 1, 0},
									{1, 1, 0, 0}
									
								}; 
	int vmap[][] = new int[R][C] ;
	
	public List<Output> islandFinder(int[][] map) {
		int i = 0,j = 0;
	    while (i < R) {
	        while(j < C) {
	            if (vmap[i][j] != 1) {
	            	if(map[i][j] == 1) {
	            		Output o = new Output();
	            		o.islandNumber = inum++;
	            		Point p = new Point(i,j);
	            		o.points.add(p);
	            		if(j < C) {
	            			if (i < R) {
		            			if(map[i][j++] == 1 ) {
//		            				Point p1 = new 
		            			} 
		            			
		            			if(map[i++][j] == 1) {
		            				
//		            			} else if() {
		            				
//		            			} else if() {
		            				
		            			}
	            			} else {
	            				
	            			}
	            				
	            		} else {
	            			
	            		}
	            		
	            		if(j < C && i < R) {
	            			if(map[i][j++] == 1 ) {
	            				
	            			} else if(map[i++][j] == 1) {
	            				
//	            			} else if() {
	            				
//	            			} else if() {
	            				
	            			}
	            				
	            		} else {
	            			
	            		}
	            
	            	}
	            	else {
	            		
	            	}
	            	vmap[i][j]=1;
	            	j++;
		        } else {
		        	j++;
		        }
	        }
	        i++;
	    }
		return null;   
	}
}
