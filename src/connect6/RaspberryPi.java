package connect6;
import java.util.Scanner;

public class RaspberryPi {
	Scanner scan = new Scanner(System.in);
	int[][] temp = new int[2][2];
	int x1,x2,y1,y2;
	
	RaspberryPi(){
		x1=0;x2=0;y1=0;y2=0;
	}

	
	public void recordToMap(int[][] map, int color) {
		compute(map, color);
		x1 = temp[0][0];y1 = temp[0][1]; 
		x2 = temp[1][0];y2 = temp[1][1];
		System.out.println("x1 : " + x1 + " y1: " + y1 + " x2 : " + x2 + " y2 : " + y2);
		if(color == Global.WHITE) {map[x1][y1] = Global.WHITE;map[x2][y2] = Global.WHITE;}
		else if(color == Global.BLACK)  {map[x1][y1] = Global.BLACK;map[x2][y2] = Global.BLACK;}
		
	}
	
	private void compute(int[][]map, int color) {
				
	}

}
