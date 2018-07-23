package connect6;

import java.util.Scanner;

public class Main {
	public static int[][] map = null;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Initialize initMap = new Initialize();
		EnemyInput enemy = new EnemyInput();
		RaspberryPi raspberryPi = new RaspberryPi();
		
		System.out.println("-1: WHITE 1: BLACK");
		int color = scan.nextInt();
		
		

		
		
		//맵을 초기화 하는 클래스 하나
		map = initMap.makeMap(map, color);
		printMap(map);
		while(true) {
			
		//1.상대방에게서 입력을 받는다.
			//입력받는 클래스 하나
			//기존맵 정보, 다시 물어보기와 확인하는 절차.
			
		//2.입력받은걸 맵에 업데이트 시킨다.
			//입력받은 클래스 안에 넣기
			//enemyinput클래스에서 업데이트 된 맵 받아온다.
			enemy.recordToMap(map, color);
		//3.그 상황을 컴퓨터가 계산한다.
		//4.계산후 맵을 업데이트
		//5.다음 돌의 위치를 출력한다.
			raspberryPi.recordToMap(map, color);
		//6.플레이어가 컴퓨터 하라는대로 돌을 둔다
			printMap(map);
		//7.무한반복(지면 종료)
		}
		
		

	}
	
	static private void printMap(int[][]map) {
		int i,j = 0;
		for(i=0;i<map.length;i++) {
			for(j=0;j<map[i].length;j++) {
				System.out.print(  map[i][j]);
			}
			System.out.println("");
		}
		
	}
}





