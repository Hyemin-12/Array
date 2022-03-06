package 배열;
//시험 문제 
/*
* 1.입력 intputScore
* 2.총점 getSumScore
* 3.순위 getRank
* 4.출력 printResult
* 유효성 검사 20초과 이거나 0미만일 시 다시 입력
*/
import java.util.Scanner;
public class Score_Array_test {
	public static void main(String args[]) {
		
		//Scanner scan=new Scanner(System.in);
		int score[][]=new int[5][5]; //행 (세로) 5 | 열 (가로) 5
		/* [5][5]
		 ===========================================
		 * [0] => [0|0]  [0|1]  [0|2]   [0|3]  [0|4]
		 * [1] => [1|0]  [1|1]  [1|2]   [1|3]  [1|4]
		 * [2] => [2|0]  [2|1]  [2|2]   [2|3]  [2|4]
		 * [3] => [3|0]  [3|1]  [3|2]   [3|3]  [3|4]
		 * [4] => [4|0]  [4|1]  [4|2]   [4|3]  [4|4]	 
		 ============================================
		    조번호     	이해도	창의도	완성도 	총점 	 등수
	     ===========================================
		 *1 [0] => [0|0]  [0|1]  [0|2]   [0|3]  [0|4]
		 *2 [1] => [1|0]  [1|1]  [1|2]   [1|3]  [1|4]
		 *3 [2] => [2|0]  [2|1]  [2|2]   [2|3]  [2|4]
		 *4 [3] => [3|0]  [3|1]  [3|2]   [3|3]  [3|4]
		 *5 [4] => [4|0]  [4|1]  [4|2]   [4|3]  [4|4]	 
		 ============================================
		 */
		getinput(score);  //점수 입력
  		getSum(score);    //총점
		getRank(score);   //등수
		printResult(score); //출력
		}
	public static int[][] getinput(int[][] score) {
		Scanner scan=new Scanner(System.in);
		// TODO Auto-generated method stub
		for(int i=0;i<score.length;i++) {
			System.out.println((i+1)+"팀의 점수를 입력하시오(단,0부터 20까지만 가능하다.)");
			for(int j=0;j<score.length-2;j++) {   //이해도 창의도 완성도만 입력함으로 -2를 해준다. 
			switch(j+1) {
			case 1: System.out.print("이해도 입력:");break;
			case 2: System.out.print("창의도 입력:");break;
			case 3: System.out.print("완성도 입력:");break;
			}
			score[i][j]=scan.nextInt();
			
			while(score[i][j]>20||score[i][j]<0) {
				System.out.println("다시입력:");
				score[i][j]=scan.nextInt();
			}
		   }
		}
		return score;
	}

	public static int[][] getSum(int[][] score) {  //총점
		// TODO Auto-generated method stub
		int sum[]=new int[5]; //총점
		int team; //빈방 
		for(int i=0;i<score.length;i++) {
			for(int j=0;j<score.length-1;j++) {
				sum[i]=score[i][j];  //빈 총점방 = 각 이완창
				team=sum[i];
				sum[i]=score[i][3];
				score[i][3]=team;
				}
		}
		return score;
	}
	
	public static int[][] getRank(int[][] score) {
		// TODO Auto-generated method stub
		for(int i=0;i<score.length;i++) {
			score[i][4]=1; //5팀의 등수 자리를 전부 다 1로 만들어준다. 
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
		System.out.println("조번호\t이해도\t창의도\t완성도\t총점\t등수");
		System.out.println("=========================================");
		for(int i=0;i<score.length;i++) {    //세로 (행)
			System.out.print((i+1)+"조번호"+"\t"); 
			for(int j=0;j<score[i].length;j++) {  //가로 (열) 
				System.out.print(score[i][j]+"\t");
			}
			System.out.println("");
			if(score[i][4]==1) {
				team=(i+1);
				max=score[i][3];
			}
		}
		System.out.println("=========================================");
		System.out.println("\n"+"최고팀:"+team+"번쩨 팀"+"점수:"+max);
}
}
