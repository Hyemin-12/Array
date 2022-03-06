package �迭;

import java.util.Scanner;
public class Arrayscore_TEST {
	public static void main(String args[][]) {
		
		Scanner scan=new Scanner(System.in);
		int score[][]=new int[5][5]; //5�� 5��(�Է� �ϼ��� â�Ǽ� ���ص� ���� ����) 
		inputScore(score); //���� �Է� 
		getSumScore(score);  //�������ϱ� 
		getRank(score);  //��� ���ϱ� 
		printResult(score);  //����ϱ� 
	}

	public static int[][] inputScore(int[][] score) {  //�Է¹ޱ� 
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<score.length;i++) {  //5�� 
			System.out.println((i+1)+"���� �׸� ���� �Է�:"); //�� �Է�
			for(int j=0;j<score.length-2;) {  //���ص� â�Ǽ� �ϼ���[3]
				switch(j+1) {  //j�� 0�̳��� +1 1-3���� 
				case 1: System.out.println("���ص� �Է�:"); 
				case 2: System.out.println("â�Ǽ� �Է�:");
				case 3: System.out.println("�ϼ��� �Է�:");
				}
				score[i][j]=scan.nextInt(); //��,���ص� â�Ǽ� �ϼ��� �Է� 				
				while(score[i][j]>20||score[i][j]<0) { //��ȿ�� �˻� 
					System.out.println("�ٽ� �Է�:");
					score[i][j]=scan.nextInt();
			}
		}
	}
		return score;
	}
	
	public static int[][] getSumScore(int[][] score) { //���� ���ϱ� 
		// TODO Auto-generated method stub
		int sum[]=new int[5]; //���� ���ϴ� �� 
		int temp;  //����� 
		for(int i=0;i<score.length;i++) {  //5��
			for(int j=0;j<score.length-1;i++) {  //5�� �� â �� �� �� 
				sum[i]+=score[i][j]; //�������� = ��������+������ ���ھ� 
				temp=sum[i];  //�����=������ ���ھ� 
				sum[i]=score[1][3];  //������ ���ھ�=���� �� ����ִ� ����
				score[i][3]=temp; //���� �� ����ִ� �� = ������ ���� ���ھ� 
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
		System.out.println("����ȣ\t���ص�\tâ�Ǽ�\t�ϼ���\t����\t����");
		System.out.println("==================================");
		
		for(int i=0;i<score.length;i++) {
			System.out.println((i+1)+"��"+"\t");
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
		System.out.println("\n"+"�ְ���:"+team+"��° ��"+"����:"+max);
	}
}

