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
		
		

		
		
		//���� �ʱ�ȭ �ϴ� Ŭ���� �ϳ�
		map = initMap.makeMap(map, color);
		printMap(map);
		while(true) {
			
		//1.���濡�Լ� �Է��� �޴´�.
			//�Է¹޴� Ŭ���� �ϳ�
			//������ ����, �ٽ� ������ Ȯ���ϴ� ����.
			
		//2.�Է¹����� �ʿ� ������Ʈ ��Ų��.
			//�Է¹��� Ŭ���� �ȿ� �ֱ�
			//enemyinputŬ�������� ������Ʈ �� �� �޾ƿ´�.
			enemy.recordToMap(map, color);
		//3.�� ��Ȳ�� ��ǻ�Ͱ� ����Ѵ�.
		//4.����� ���� ������Ʈ
		//5.���� ���� ��ġ�� ����Ѵ�.
			raspberryPi.recordToMap(map, color);
		//6.�÷��̾ ��ǻ�� �϶�´�� ���� �д�
			printMap(map);
		//7.���ѹݺ�(���� ����)
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





