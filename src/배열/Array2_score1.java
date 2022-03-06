package 배열;
//시험 문제 
/*
* 1.입력 intputScore
* 2.총점 getSumScore
* 3.순위 getRank
* 4.출력 printResult
*/

import java.util.Scanner;
public class Array2_score1 {
   public static void main(String[] args) {
    
      Scanner scan = new Scanner(System.in);
      int score[][]=new int[5][5]; // 선언부분
      intputScore(score); //입력
      getSumScore(score); //총점
      getRank(score);  //순위
      printResult(score); //출력
   }
   
    public static int[][] intputScore(int[][] score) {  //입력
      Scanner scan=new Scanner(System.in);
      
      for(int i=0; i<score.length; i++){   //입력을 5번 받을 수 있도록 배열 길이
          System.out.println((i+1)+"팀의 항목별 점수 입력,\n단(0부터 20까지 입력 가능)");
          //i+1은 1조 1+1조 2+1조가 되도록 
          for(int j=0; j<score.length-2; j++){  //배열 5개 중 3개만 받아야 하므로 (완성도 창의성 이해도만 받을 수 있도록*총점 석차 제외)
        	  switch(j+1) {  //if문이랑 비슷한데 괄호 안이 값이 조건이다.
        	  case 1: System.out.print("완성도 입력:"); break;
        	  case 2: System.out.print("창의성 입력:"); break;
        	  case 3: System.out.print("이해도 입력:"); break;
        	  }
             score[i][j]=scan.nextInt();  
             
             while(score[i][j]>20||score[i][j]<0) {   //20초과 이거나 0미만일 시 다시 입력
                System.out.println("다시 입력:");
                  score[i][j]=scan.nextInt();
             }
           }
      }
      return score; //입력받은 각 조의 완성도 창의성 이해도를 리턴 시켜준다. 
    }
    
   public static int[][] getSumScore(int[][] score) {   //총점 
      //총점
	   int[] sum=new int[5];   //5팀의 점수
	   int temp;  //총점을 넣을 빈공간 
       for(int i=0; i<score.length; i++){  //5팀이여서 5번 반복 
             for(int j=0; j<score.length-1; j++){ //완성.창의.이해도 => 총점까지 사용됨으로 (석차만 빼고) -1 => 밑에 [i][3]이 있어서
                sum[i]+=score[i][j];  //총점을 5팀의 점수에 각각 대입해준다.
        		temp = sum[i];   //빈공간에 총점을 넣어 둔다. //위치를 한 번만에 바꾸지 못한다. 그래서 빈공간이 있어야 바꿀 수 있다. 
        		sum[i]=score[i][3]; //빈공간이 된 sum에 총점을 넣어준다.
        		score[i][3]=temp;  //빈공간이 된 score에 총점을 대입한다. 
             }
   }
      return score;
   }
   
   public static int[][] getRank(int score[][]){  //순위
	      for(int i = 0; i<score.length; i++) {  //5팀 5번 반복 
	         score[i][4]=1;  //석차에 1을 각각 대입시켜준다. 
	         for(int j = 0; j<score.length; j++) {  //5번 반복 => 총점 석차를 구하기 위해서 완 창 이 총 석(5열)까지 다 반복시켜야 한다.
	            if(score[i][3]<score[j][3]) { //두 조를 비교해서 뒤에 있는 숫자가 더 크면 앞조의 숫자를 올려준다.
	               score[i][4]++; //순위 항목의 배열번호를 증가시켜 순위를 만든다.
	           } 
	         }
	      }
	      return score;
	   }
   public static void printResult(int[][] score) { //출력
	   int team=0; //최고조 
	   int max=0;  //최고조 점수 
      System.out.println("조번호\t완성도\t창의성\t이해도\t총점");
      System.out.println("====================================");
      
      for(int i=0; i<score.length; i++){ //조 5번 
    	  System.out.print((i+1)+"조"+"\t");   //1-5조 출력
         for(int j =0; j<score[i].length-1; j++) { //5열  
               System.out.print(score[i][j]+"\t"); //전부 출력
         }  
         System.out.println(""); // 한 줄 띄우기  
         if(score[i][4]==1) {    //등수가 1등이면 
        	team=(i+1);  // i가 0부터 시작함으로 i+1을 해준다. 
        	max=score[i][3];  //[i][4]가 1등일때 총점인 [i][3]이 최고점이 된다.
     	
         }
      }
      System.out.println("====================================");
      System.out.println("\n"+"최고팀:"+team+"=> 점수:"+max);
}
   }
