package ¹è¿­;

public class Array_test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]a =new int[4][4];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
			    a[i][j]=1;
				System.out.print(a[i][j]+"\t");
			}
			System.out.println(" ");
		}
	}
	}
