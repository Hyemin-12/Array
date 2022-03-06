package 배열;

public class Array_test04 {
	public static void main(String[] args) {
		char a[][]=new char[5][5];
		char b='C';
		char c;
		
		for (int i=0; i<a.length;i++) {     //행 가로 
			c=b++;   //"C"를 한 번씩 증감 시켜주기 다음부터는  "D"로 나오도록 
			for(int j=i;j<a.length;j++) {    //열 세로   "D"부터 나오도록 "E"부터 나오도록
				a[i][j]=c++;   //증감된 C를 a의 배열 i와 j에 넣어준다. 
				System.out.print(a[i][j]+"\t"); //출력문
				}
			System.out.println("");
 
		}
	}
}
		
