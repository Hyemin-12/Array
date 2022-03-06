package 배열;
//2행 3열 
public class Array2_01 {
	public static void main(String args[]) {
		
		int [][]a=new int [2][3];  //가로2 세로3 (2차원 배열)
		for (int i=0; i<a.length;i++) {  
				for(int j=0;j<a[i].length;j++) {
					System.out.print(a[i][j]+"\t");

				}
				System.out.println("");
		}
		
		int [][]b=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
		for (int i=0; i<b.length;i++) {  
			for(int j=0;j<b[i].length;j++) {
				System.out.print(b[i][j]+"\t");

			}
			System.out.println("");
	}
		
		int [][]c =new int[3][4];
		int k=1;
		for(int i=0;i<c.length;i++) {
			for(int j=0;j<c[i].length;j++) {
				c[i][j]=k++;
				System.out.print(c[i][j]+"\t");
			}
			System.out.println(" ");
		}
	}
}


