package �迭;

public class Array_01 {
	public static void main(String args[]) {
		//�迭 ���� ���� 
		//1. ���� 10�� ���� �迭
		
		int num[]; //����
		num = new int[10];    //�޸𸮿� ������ ������ִ� �� new 	
		System.out.println(num[5]); //�ʱⰪ ���� int���̹Ƿ� 0�̴�.

		//2.�Ǽ� 5�� �迭
		
		double num2[];
		num2=new double[5];   // new�� �޸𸮿� �Ǽ� 5�� ������ ������ִ� �� 
		System.out.println(num2[4]);  //�ʱⰪ�� ���� double���̹Ƿ� 0.0
		
		//3.�Ǽ� 12�� �迭
		
		double num3[];
		num3=new double[12];
		System.out.println(num3[11]);
		
		//4.���ٷ� �Ǽ� 12�� �迭 
		double num3_2[]=new double[12];
     }
}
