package 배열;

import java.util.Scanner;

public class Array_max_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan= new Scanner(System.in);
		int score[]=new int[10]; //길이 10번 입력 
		int max=score[0]; //최대값 =길이 0 
		
		for(int i=0; i<score.length;i++) { //0부터 10번 입력할때까지의 숫자
			System.out.println("점수 입력:");     
			score[i]=scan.nextInt(); //입력받을 점수 
			if(score[i]>max) {
				max=score[i];
			}
		} 
		System.out.println("최대값 : " + max);
	}
}
