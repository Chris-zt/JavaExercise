

public class Main {
	public static void main(String[] argv) {
		int n = 5;
		n = n ^ 2;
		System.out.println(n);
		n = n ^ 0;
		System.out.println(n);
		n = n ^ 3;
		System.out.println(n);
		n = n ^ 1;
		System.out.println(n);
	}
}