package �迭;
import java.util.Scanner;
public class testd {
	public static void main(String args[]) {
		
		Scanner scan=new Scanner(System.in);
		int score[]=new int[10];
		int max=score[0];
		
		for(int i=0;i<score.length;i++) {
			System.out.println("���� �Է�");
				score[i]=scan.nextInt();
				
				while(score[i]>100) {
					System.out.println("�ٽ� �Է�");
						score[i]=scan.nextInt();
					}
					if(score[i]>max) {
						score[i]=max;
				}
				
			}
		for(int i=0;i<score.length;i++) {
			System.out.println("����"+(i+1)+":"+score[i]);
		}
		System.out.println("�ִ밪"+max);
		}
	}
