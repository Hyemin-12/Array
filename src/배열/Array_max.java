package �迭;

/* 10���� ������ �Է� �޾� �ְ������� ���� �л��� �����ϴ� ���α׷��� �ۼ��϶�.
 * 1.Scanner�� ���� �Է¹޾� score �迭�� ������ �����϶�.
 * 2.score �迭�� �������̰� ���̴� 10�̴�
 * 3.�ִ밪�� �����ϱ� ���� ���� max�� ����϶�.
 */
import java.util.Scanner;
public class Array_max {
	public static void main(String args[]) {
		
		//1.����
		Scanner scan= new Scanner(System.in);
		int score[]=new int[10]; //���� 10�� �Է� 
		int max=score[0]; //�ִ밪 =���� 0 
		
		//2.�Է�
		for(int i=0; i<score.length;i++) {
			System.out.println("�����Է�:");
			score[i]=scan.nextInt( );
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
