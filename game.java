package test;
import processing.core.PApplet;
public class game extends PApplet {
	
	public static void main(String[] args) {
		
		
	               
	   PApplet.main("test.game");
		
	}
	 	        
		      
	datastructure board=new datastructure(40,40); //Initialize the constructor
	 int[][] gridnum1 =board.getArray();    
	 public void settings() {
		 size(620,620);
		}
	;
	public void setup() {
		frameRate(10);     
        }  
	
	int count=0;
     public void draw() {
    	    
    	for (int i = 0; i <40; i++) {
		      for (int j = 0; j < 40; j++) {
		        if ((gridnum1[i][j] == 1)) fill(121);
		        else fill(255);
		        stroke(0);
		        rect(i * 10, j * 10, 10, 10);              //draws the automats 
		
                   }
		      //delay(50);	
		      
		     	    	
          }
    	int[][] nextgen=board.nextGetArray(gridnum1);
	    gridnum1=nextgen;
    	
	    
	    //checking iterations and grabbing screenshots
    	/* count+=1;
    	int[] counttest=new int[] {1,5,10,20,50};
    	
    		if(counttest[0]==count||counttest[1]==count||counttest[2]==count||counttest[3]==count||counttest[4]==count) {
    			
    		try {
				Thread.sleep(10000);                   // this is just to freeze the thread 
			} catch (InterruptedException e) {        //	and take screenshot 								
				// TODO Auto-generated catch block		//
				e.printStackTrace();					//
			}
    	}
    		System.out.println(count);
    		*/
    	}
        
	}
    
    	
     


