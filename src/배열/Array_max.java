package 배열;

/* 10명의 점수를 입력 받아 최고점수를 받은 학생을 결정하는 프로그램을 작성하라.
 * 1.Scanner를 통해 입력받아 score 배열에 점수를 저장하라.
 * 2.score 배열은 정수합이고 길이는 10이다
 * 3.최대값은 결정하기 위한 변수 max를 사용하라.
 */
import java.util.Scanner;
public class Array_max {
	public static void main(String args[]) {
		
		//1.변수
		Scanner scan= new Scanner(System.in);
		int score[]=new int[10]; //길이 10번 입력 
		int max=score[0]; //최대값 =길이 0 
		
		//2.입력
		for(int i=0; i<score.length;i++) {
			System.out.println("점수입력:");
			score[i]=scan.nextInt( );
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
