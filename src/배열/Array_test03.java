package �迭;

public class Array_test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]=new int[4][4];
		int b=1;
	
		
		for (int i=0; i<a.length;i++) { //4�� �ݺ�  
			for(int j=0;j<=i;j++) {   //0���� 
				a[i][j]=b++;    //
				System.out.print(a[i][j]+"\t");

			}
			System.out.println("");
 
		}
	}
}
