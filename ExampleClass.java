package assigmet;

class Hi{
	public void show() {
		System.out.println("Hi......");
	}
}

 class Hello{
	public void show() {
		System.out.println("Hello......");
	}
}

public class ExampleClass {
	
	public static void main(String[] args) {
		Hi obj = new Hi();
		Hello obj1 = new Hello();
		obj.show();
		obj1.show();
		System.out.println("hiiii....");

	}

}
