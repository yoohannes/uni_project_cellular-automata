package test;
import processing.core.PApplet;
import processing.core.PShape;
public class datastructure extends PApplet{

	int width ;
	int height;

	
	public datastructure(int width, int height) {   
		this.height = height;
		this.width = width;
	}

	public int[][] getArray() {                          //creates a random array of value 1 or 0
		int[][] grid = new int[this.width][this.height];
		for (int i = 0; i < width; i++) {
			for (int j = 0; j < height; j++) {

				grid[i][j] = (int) Math.round(Math.random());

			}
		}
		
		return grid;
	}

	public int[][] nextGetArray(int[][] grid){           //creates next generation array based on the rule of game of life 
		 int[][] next=new int[this.height][this.width];
		 for (int x = 1; x < width-1 ; x++) {
		      for (int y = 1; y < height-1 ; y++) {
		    	 int res=countneigbors(grid,x,y);
		        
		     

		        
		        if ((grid[x][y] == 1) && (res < 2)) next[x][y] = 0;     //rule of game of life
		        else if ((grid[x][y] == 1) && (res > 3)) next[x][y] = 0;
		        else if ((grid[x][y] == 0) && (res== 3)) next[x][y] = 1;
		        else next[x][y] = grid[x][y];
		      }
		    }

		   
		    return next;
	 
     }
	

	public int countneigbors(int[][] grid, int h, int w) {   //gets the surrounding 8 neighbors 
		int neighbors = 0;
		for (int i = -1; i <= 1; i++) {
			for (int j = -1; j <= 1; j++) {
				neighbors += grid[h + i][w + j];

			}
		}

		
		return neighbors -= grid[h][w];
	}
	
	 
	
	
	
}

