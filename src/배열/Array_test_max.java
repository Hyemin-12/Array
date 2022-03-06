package 배열;

import java.util.Scanner;
// 입력받은 수가 100이 넘어가면 다시 입력받을 수 있도록 한다. 

public class Array_test_max {
	public static void main(String args[]) {
		
		//1.변수
		Scanner scan= new Scanner(System.in);
		int score[]=new int[10]; //길이 10번 입력 
		int max=score[0]; //최대값 =길이 0 
		
		//2.입력
		for(int i=0; i<score.length;i++) {
			System.out.println("점수입력:");
			score[i]=scan.nextInt( );
			
			while(score[i]>100) {
			//if(score[i]>100) {
				System.out.println("다시 입력하세요");
				score[i]=scan.nextInt( );
				//continue;
				}
				
				if(score[i]>max) {
					max=score[i]; 
					}
	}
		//3.출력
		for(int i=0; i<score.length;i++) {
			System.out.println("점수"+(i+1)+":"+score[i]);
		}
		System.out.println("최고점수:"+ max);
	}
	}





