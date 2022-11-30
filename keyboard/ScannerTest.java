import java.util.Scanner;
public class ScannerTest{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("please input an integer");
		int number1 = sc.nextInt();
		System.out.println("please input an integer");
		int number2 = sc.nextInt();
		System.out.println(number1+number2);
	}
	
}