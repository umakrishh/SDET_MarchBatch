package package1;
import java.util.Scanner;
public class Scanner1 {				//Assignment 1: (((((x1*x2)+x3)-x4)+x5)/x6)
	public int sum(int a,int b) {
		int c = a+b;
		return c;}
	public int multi(int a,int b) {
		int c = a*b;
		return c;}
	public int sub(int a,int b) {
		int c = a-b;
		return c;}
	public int div(int a,int b) {
		int c = a/b;
		return c;}
	public static void main(String[] args) {
		Scanner1 s=new Scanner1();
		Scanner scanobj = new Scanner(System.in);
		System.out.println("Enter the value of X1:");
		int x1 = scanobj.nextInt();
		System.out.println("Enter the value of X2:");
		int x2 = scanobj.nextInt();
		int multiResult = s.multi(x1, x2);
		System.out.println("Enter the value of X3:");
		int x3 = scanobj.nextInt();
		int sumResult = s.sum(multiResult, x3);
		System.out.println("Enter the value of X4:");
		int x4 = scanobj.nextInt();
		int subResult = s.sub(sumResult, x4);
		System.out.println("Enter the value of X5:");
		int x5 = scanobj.nextInt();
		int sumResult1 = s.sum(subResult, x5);
		System.out.println("Enter the value of X6:");
		int x6 = scanobj.nextInt();
		int divResult = s.div(sumResult1, x6);
		System.out.println("Result of (((((x1*x2)+x3)-x4)+x5)/x6): "+divResult);
		scanobj.close();}
	}
