package �迭;

import java.util.Scanner;

public class Array_max_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan= new Scanner(System.in);
		int score[]=new int[10]; //���� 10�� �Է� 
		int max=score[0]; //�ִ밪 =���� 0 
		
		for(int i=0; i<score.length;i++) { //0���� 10�� �Է��Ҷ������� ����
			System.out.println("���� �Է�:");     
			score[i]=scan.nextInt(); //�Է¹��� ���� 
			if(score[i]>max) {
				max=score[i];
			}
		} 
		System.out.println("�ִ밪 : " + max);
	}
}
