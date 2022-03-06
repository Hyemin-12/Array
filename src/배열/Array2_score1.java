package �迭;
//���� ���� 
/*
* 1.�Է� intputScore
* 2.���� getSumScore
* 3.���� getRank
* 4.��� printResult
*/

import java.util.Scanner;
public class Array2_score1 {
   public static void main(String[] args) {
    
      Scanner scan = new Scanner(System.in);
      int score[][]=new int[5][5]; // ����κ�
      intputScore(score); //�Է�
      getSumScore(score); //����
      getRank(score);  //����
      printResult(score); //���
   }
   
    public static int[][] intputScore(int[][] score) {  //�Է�
      Scanner scan=new Scanner(System.in);
      
      for(int i=0; i<score.length; i++){   //�Է��� 5�� ���� �� �ֵ��� �迭 ����
          System.out.println((i+1)+"���� �׸� ���� �Է�,\n��(0���� 20���� �Է� ����)");
          //i+1�� 1�� 1+1�� 2+1���� �ǵ��� 
          for(int j=0; j<score.length-2; j++){  //�迭 5�� �� 3���� �޾ƾ� �ϹǷ� (�ϼ��� â�Ǽ� ���ص��� ���� �� �ֵ���*���� ���� ����)
        	  switch(j+1) {  //if���̶� ����ѵ� ��ȣ ���� ���� �����̴�.
        	  case 1: System.out.print("�ϼ��� �Է�:"); break;
        	  case 2: System.out.print("â�Ǽ� �Է�:"); break;
        	  case 3: System.out.print("���ص� �Է�:"); break;
        	  }
             score[i][j]=scan.nextInt();  
             
             while(score[i][j]>20||score[i][j]<0) {   //20�ʰ� �̰ų� 0�̸��� �� �ٽ� �Է�
                System.out.println("�ٽ� �Է�:");
                  score[i][j]=scan.nextInt();
             }
           }
      }
      return score; //�Է¹��� �� ���� �ϼ��� â�Ǽ� ���ص��� ���� �����ش�. 
    }
    
   public static int[][] getSumScore(int[][] score) {   //���� 
      //����
	   int[] sum=new int[5];   //5���� ����
	   int temp;  //������ ���� ����� 
       for(int i=0; i<score.length; i++){  //5���̿��� 5�� �ݺ� 
             for(int j=0; j<score.length-1; j++){ //�ϼ�.â��.���ص� => �������� �������� (������ ����) -1 => �ؿ� [i][3]�� �־
                sum[i]+=score[i][j];  //������ 5���� ������ ���� �������ش�.
        		temp = sum[i];   //������� ������ �־� �д�. //��ġ�� �� ������ �ٲ��� ���Ѵ�. �׷��� ������� �־�� �ٲ� �� �ִ�. 
        		sum[i]=score[i][3]; //������� �� sum�� ������ �־��ش�.
        		score[i][3]=temp;  //������� �� score�� ������ �����Ѵ�. 
             }
   }
      return score;
   }
   
   public static int[][] getRank(int score[][]){  //����
	      for(int i = 0; i<score.length; i++) {  //5�� 5�� �ݺ� 
	         score[i][4]=1;  //������ 1�� ���� ���Խ����ش�. 
	         for(int j = 0; j<score.length; j++) {  //5�� �ݺ� => ���� ������ ���ϱ� ���ؼ� �� â �� �� ��(5��)���� �� �ݺ����Ѿ� �Ѵ�.
	            if(score[i][3]<score[j][3]) { //�� ���� ���ؼ� �ڿ� �ִ� ���ڰ� �� ũ�� ������ ���ڸ� �÷��ش�.
	               score[i][4]++; //���� �׸��� �迭��ȣ�� �������� ������ �����.
	           } 
	         }
	      }
	      return score;
	   }
   public static void printResult(int[][] score) { //���
	   int team=0; //�ְ��� 
	   int max=0;  //�ְ��� ���� 
      System.out.println("����ȣ\t�ϼ���\tâ�Ǽ�\t���ص�\t����");
      System.out.println("====================================");
      
      for(int i=0; i<score.length; i++){ //�� 5�� 
    	  System.out.print((i+1)+"��"+"\t");   //1-5�� ���
         for(int j =0; j<score[i].length-1; j++) { //5��  
               System.out.print(score[i][j]+"\t"); //���� ���
         }  
         System.out.println(""); // �� �� ����  
         if(score[i][4]==1) {    //����� 1���̸� 
        	team=(i+1);  // i�� 0���� ���������� i+1�� ���ش�. 
        	max=score[i][3];  //[i][4]�� 1���϶� ������ [i][3]�� �ְ����� �ȴ�.
     	
         }
      }
      System.out.println("====================================");
      System.out.println("\n"+"�ְ���:"+team+"=> ����:"+max);
}
   }
