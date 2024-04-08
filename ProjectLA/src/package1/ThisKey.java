package package1;

public class ThisKey {
	public ThisKey() {
		this(10,20,30);
		System.out.println("Default Constructor is executed");
	}
	public ThisKey(int x) {
		this(10,20,30,40);
		System.out.println("One Parametrized Constructor is executed");
	}
	public ThisKey(int x,int y) {
		this(10);
		System.out.println("Two Parametrized Constructor is executed");
	}
	public ThisKey(int x,int y,int z) {
		System.out.println("Three Parametrized Constructor is executed");
	}
	public ThisKey(int x,int y,int z,int z1) {
		this();
		System.out.println("Four Parametrized Constructor is executed");
	}
	public static void main(String[] args) {
		ThisKey cons = new ThisKey(10,20);
	}
}
