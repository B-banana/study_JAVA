package Practice01;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Array {

	public static void main(String[] args) {
		
		
		System.out.println("#1.�迭 ����� �ʱ�ȭ");
		int[] scores = {95, 100, 87, 91};
		scores[2]  = 90;	//�ι�° �迭�� ����
	
		//System.out.println(scores);	//object ���·� ���
		for(int s : scores) {	//for(�ڷ��� ������ : �迭��) -> ������ �迭�� ���ʷ� �ְ� for�� ����
			System.out.println(s);
		}
		
		System.out.println("#2.Arrays �޼���");
		System.out.println(Arrays.toString(scores));
		String[] cars = {"hyundai", "bmw", "benz", "toyota"};
		List<String> car_list = Arrays.asList(cars);	//�迭�� ������ ����Ʈȭ
		System.out.println(car_list);
		System.out.println(car_list.get(1));	//0 : hyundai, 1 : bmw ...
		
		System.out.println("#3.Arrays �޼��� : ����");
		Arrays.sort(cars);	//�迭�� ����
		//System.out.println(car_list);
		System.out.println(Arrays.asList(cars));
		
		//���� �迭
		Arrays.parallelSort(cars, Collections.reverseOrder());
		System.out.println(Arrays.asList(cars));
		
		//���� �迭
		Arrays.parallelSort(cars, 0, 2);
		System.out.println(Arrays.asList(cars));
		
		System.out.println("#4.������ �迭");
		int[][][] allScores	= {
				{
					{90, 85, 70, 55, 60},
					{96, 88, 81, 91, 75},
					{90, 85, 70, 55, 60},
					{90, 85, 70, 55, 60}
				},
				{
					{90, 85, 70, 55, 60},
					{96, 88, 81, 91, 75},
					{90, 85, 70, 55, 60},
					{90, 85, 70, 55, 60}
				},
				{
					{90, 85, 70, 55, 60},
					{96, 88, 81, 91, 75},
					{90, 85, 70, 55, 60},
					{90, 85, 70, 55, 60}
				}
		};
		//System.out.println(allScores[1][2][0]);
		
		//���� �迭�� for���� �̿��Ͽ� ���
		for(int i=0; i<allScores.length; i++) {
			for(int j=0; j<allScores[i].length; j++) {
				for(int k=0; k<allScores[i][j].length; k++) {
					System.out.print(allScores[i][j][k] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
			
	}

}
