package day09_method;
import java.util.Scanner;
public class Q01main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Q01 b = new Q01();
		int num1,num2;
		System.out.print("ù��° �� �Է� : ");
		num1 = input.nextInt();
		System.out.print("�ι�° �� �Է� : ");
		num2 = input.nextInt();
		int result = b.big(num1,num2);
		b.outPut(num1,num2,result);
	}

}
