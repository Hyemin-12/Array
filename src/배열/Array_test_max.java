package �迭;

import java.util.Scanner;
// �Է¹��� ���� 100�� �Ѿ�� �ٽ� �Է¹��� �� �ֵ��� �Ѵ�. 

public class Array_test_max {
	public static void main(String args[]) {
		
		//1.����
		Scanner scan= new Scanner(System.in);
		int score[]=new int[10]; //���� 10�� �Է� 
		int max=score[0]; //�ִ밪 =���� 0 
		
		//2.�Է�
		for(int i=0; i<score.length;i++) {
			System.out.println("�����Է�:");
			score[i]=scan.nextInt( );
			
			while(score[i]>100) {
			//if(score[i]>100) {
				System.out.println("�ٽ� �Է��ϼ���");
				score[i]=scan.nextInt( );
				//continue;
				}
				
				if(score[i]>max) {
					max=score[i]; 
					}
	}
		//3.���
		for(int i=0; i<score.length;i++) {
			System.out.println("����"+(i+1)+":"+score[i]);
		}
		System.out.println("�ְ�����:"+ max);
	}
	}





