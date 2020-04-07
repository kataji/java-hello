package type;

public class OverLoad {
	void f(int n){
		System.out.println("running f(int)");
	}
	void f(double n){
		System.out.println("running f(double)");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1;
		double m = 1;
		OverLoad o = new OverLoad();
		o.f(n);
		o.f(m);
	}

}
