package package1;

public class ThisKeyMethod {
	
	public void KeyMethod() {
		this.KeyMethod3(10, 20, 30);
		System.out.println("Default Method");
		this.KeyMethod1(10); //One Parameterized Method
	}
	public void KeyMethod1(int x) {
		System.out.println("One Parametrized Method");
		this.KeyMethod2(10, 20); //Two Parameterized Method
		this.KeyMethod4(10, 20, 30, 40); //Four Parameterized Method
	}
	public void KeyMethod2(int x,int y) {
		System.out.println("Two Parameterized Method");
	}
	public void KeyMethod3(int x,int y,int z) {
		System.out.println("Three Parameterized Method");
	}
	public void KeyMethod4(int x,int y,int z,int z1) {
		System.out.println("Four Parameterized Method");
	}
	public static void main(String[] args) {
		ThisKeyMethod thiskey = new ThisKeyMethod();
		System.out.println("Output gets displayed in the below sequence using 'this' keyword method:");
		System.out.println("-------------------------------------------------------------------------");
		thiskey.KeyMethod(); //Default Parameterized Method
	}
}
