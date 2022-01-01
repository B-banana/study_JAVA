package Practice01;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Array {

	public static void main(String[] args) {
		
		
		System.out.println("#1.배열 선언과 초기화");
		int[] scores = {95, 100, 87, 91};
		scores[2]  = 90;	//두번째 배열의 수정
	
		//System.out.println(scores);	//object 형태로 출력
		for(int s : scores) {	//for(자료형 변수명 : 배열명) -> 변수에 배열을 차례로 넣고 for문 실행
			System.out.println(s);
		}
		
		System.out.println("#2.Arrays 메서드");
		System.out.println(Arrays.toString(scores));
		String[] cars = {"hyundai", "bmw", "benz", "toyota"};
		List<String> car_list = Arrays.asList(cars);	//배열을 가지고 리스트화
		System.out.println(car_list);
		System.out.println(car_list.get(1));	//0 : hyundai, 1 : bmw ...
		
		System.out.println("#3.Arrays 메서드 : 정렬");
		Arrays.sort(cars);	//배열을 정렬
		//System.out.println(car_list);
		System.out.println(Arrays.asList(cars));
		
		//역순 배열
		Arrays.parallelSort(cars, Collections.reverseOrder());
		System.out.println(Arrays.asList(cars));
		
		//구간 배열
		Arrays.parallelSort(cars, 0, 2);
		System.out.println(Arrays.asList(cars));
		
		System.out.println("#4.다차원 배열");
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
		
		//위의 배열을 for문을 이용하여 출력
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
