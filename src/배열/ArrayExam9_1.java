package 배열;

public class ArrayExam9_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[];
		int []b;
		int[]c= {31,32,33};
		a=new int[4]; 
		b= new int[] {21,22,23,24};  
		c=b;
		System.out.println(a.length + " "+b.length+" "+c.length);
		
//배열 객체 b와 c는 똑같은 배열 객체를 가리키게 된다.
	}

}
