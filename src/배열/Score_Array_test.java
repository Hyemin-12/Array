package �迭;
//���� ���� 
/*
* 1.�Է� intputScore
* 2.���� getSumScore
* 3.���� getRank
* 4.��� printResult
* ��ȿ�� �˻� 20�ʰ� �̰ų� 0�̸��� �� �ٽ� �Է�
*/
import java.util.Scanner;
public class Score_Array_test {
	public static void main(String args[]) {
		
		//Scanner scan=new Scanner(System.in);
		int score[][]=new int[5][5]; //�� (����) 5 | �� (����) 5
		/* [5][5]
		 ===========================================
		 * [0] => [0|0]  [0|1]  [0|2]   [0|3]  [0|4]
		 * [1] => [1|0]  [1|1]  [1|2]   [1|3]  [1|4]
		 * [2] => [2|0]  [2|1]  [2|2]   [2|3]  [2|4]
		 * [3] => [3|0]  [3|1]  [3|2]   [3|3]  [3|4]
		 * [4] => [4|0]  [4|1]  [4|2]   [4|3]  [4|4]	 
		 ============================================
		    ����ȣ     	���ص�	â�ǵ�	�ϼ��� 	���� 	 ���
	     ===========================================
		 *1 [0] => [0|0]  [0|1]  [0|2]   [0|3]  [0|4]
		 *2 [1] => [1|0]  [1|1]  [1|2]   [1|3]  [1|4]
		 *3 [2] => [2|0]  [2|1]  [2|2]   [2|3]  [2|4]
		 *4 [3] => [3|0]  [3|1]  [3|2]   [3|3]  [3|4]
		 *5 [4] => [4|0]  [4|1]  [4|2]   [4|3]  [4|4]	 
		 ============================================
		 */
		getinput(score);  //���� �Է�
  		getSum(score);    //����
		getRank(score);   //���
		printResult(score); //���
		}
	public static int[][] getinput(int[][] score) {
		Scanner scan=new Scanner(System.in);
		// TODO Auto-generated method stub
		for(int i=0;i<score.length;i++) {
			System.out.println((i+1)+"���� ������ �Է��Ͻÿ�(��,0���� 20������ �����ϴ�.)");
			for(int j=0;j<score.length-2;j++) {   //���ص� â�ǵ� �ϼ����� �Է������� -2�� ���ش�. 
			switch(j+1) {
			case 1: System.out.print("���ص� �Է�:");break;
			case 2: System.out.print("â�ǵ� �Է�:");break;
			case 3: System.out.print("�ϼ��� �Է�:");break;
			}
			score[i][j]=scan.nextInt();
			
			while(score[i][j]>20||score[i][j]<0) {
				System.out.println("�ٽ��Է�:");
				score[i][j]=scan.nextInt();
			}
		   }
		}
		return score;
	}

	public static int[][] getSum(int[][] score) {  //����
		// TODO Auto-generated method stub
		int sum[]=new int[5]; //����
		int team; //��� 
		for(int i=0;i<score.length;i++) {
			for(int j=0;j<score.length-1;j++) {
				sum[i]=score[i][j];  //�� ������ = �� �̿�â
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
			score[i][4]=1; //5���� ��� �ڸ��� ���� �� 1�� ������ش�. 
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
		System.out.println("����ȣ\t���ص�\tâ�ǵ�\t�ϼ���\t����\t���");
		System.out.println("=========================================");
		for(int i=0;i<score.length;i++) {    //���� (��)
			System.out.print((i+1)+"����ȣ"+"\t"); 
			for(int j=0;j<score[i].length;j++) {  //���� (��) 
				System.out.print(score[i][j]+"\t");
			}
			System.out.println("");
			if(score[i][4]==1) {
				team=(i+1);
				max=score[i][3];
			}
		}
		System.out.println("=========================================");
		System.out.println("\n"+"�ְ���:"+team+"���� ��"+"����:"+max);
}
}
