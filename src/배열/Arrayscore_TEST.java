package 배열;

import java.util.Scanner;
public class Arrayscore_TEST {
	public static void main(String args[][]) {
		
		Scanner scan=new Scanner(System.in);
		int score[][]=new int[5][5]; //5팀 5번(입력 완성도 창의성 이해도 총점 석차) 
		inputScore(score); //점수 입력 
		getSumScore(score);  //총점구하기 
		getRank(score);  //등수 구하기 
		printResult(score);  //출력하기 
	}

	public static int[][] inputScore(int[][] score) {  //입력받기 
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<score.length;i++) {  //5팀 
			System.out.println((i+1)+"팀의 항목별 점수 입력:"); //팀 입력
			for(int j=0;j<score.length-2;) {  //이해도 창의성 완성도[3]
				switch(j+1) {  //j가 0이나깐 +1 1-3까지 
				case 1: System.out.println("이해도 입력:"); 
				case 2: System.out.println("창의성 입력:");
				case 3: System.out.println("완성도 입력:");
				}
				score[i][j]=scan.nextInt(); //팀,이해도 창의성 완성도 입력 				
				while(score[i][j]>20||score[i][j]<0) { //유효성 검사 
					System.out.println("다시 입력:");
					score[i][j]=scan.nextInt();
			}
		}
	}
		return score;
	}
	
	public static int[][] getSumScore(int[][] score) { //총점 구하기 
		// TODO Auto-generated method stub
		int sum[]=new int[5]; //총점 구하는 방 
		int temp;  //빈공간 
		for(int i=0;i<score.length;i++) {  //5팀
			for(int j=0;j<score.length-1;i++) {  //5개 완 창 이 총 점 
				sum[i]+=score[i][j]; //빈총점방 = 빈총점방+각각의 스코어 
				temp=sum[i];  //빈공간=각각의 스코어 
				sum[i]=score[1][3];  //각각의 스코어=값이 안 들어있는 총점
				score[i][3]=temp; //값이 안 들어있는 값 = 각각의 총점 스코어 
			}
		}
		return score;
	}
	
	public static int[][] getRank(int[][] score) {
		// TODO Auto-generated method stub
		for(int i=0;i<score.length;i++) {
			score[i][4]=1;
			for(int j=0;j<score.length;j++) {
				if(score[i][3]<score[j][3]) {
					score[i][4]++;
				}
			}
		}
		return score;
	}
	
	public static void printResult(int[][] score) {
		// TODO Auto-generated method stub
		int team=0;
		int max=0;
		System.out.println("조번호\t이해도\t창의성\t완성도\t총점\t석차");
		System.out.println("==================================");
		
		for(int i=0;i<score.length;i++) {
			System.out.println((i+1)+"조"+"\t");
			for(int j=0;j<score[i].length;j++) {
				System.out.println(score[i][j]);
			}
			System.out.println("");
			if(score[i][4]==1) {
				team=(i+1);
				max=score[i][3];
			}
		}
		System.out.println("===================================");
		System.out.println("\n"+"최고팀:"+team+"번째 팀"+"점수:"+max);
	}
}

