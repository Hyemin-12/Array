package �迭;

public class Array_test04 {
	public static void main(String[] args) {
		char a[][]=new char[5][5];
		char b='C';
		char c;
		
		for (int i=0; i<a.length;i++) {     //�� ���� 
			c=b++;   //"C"�� �� ���� ���� �����ֱ� �������ʹ�  "D"�� �������� 
			for(int j=i;j<a.length;j++) {    //�� ����   "D"���� �������� "E"���� ��������
				a[i][j]=c++;   //������ C�� a�� �迭 i�� j�� �־��ش�. 
				System.out.print(a[i][j]+"\t"); //��¹�
				}
			System.out.println("");
 
		}
	}
}
		
