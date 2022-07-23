package diatance;

public class dist {
	int distance = 40;

	void speed() {
		int time = 5;
		System.out.println("speed" + distance / time);
	}

	void distance() {
		System.out.println("distance" + distance);
	}

	int a() {
		int a = 10;
		int b = 20;
		int c = a + b;
		return c;
	}

	void b(int k) {
		System.out.println(k+10);
	}
	
	void c(int k,String z) {
		System.out.println("speed"+(k+z));
	}

}
