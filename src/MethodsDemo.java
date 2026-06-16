
public class MethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodsDemo m = new MethodsDemo();
		String name = m.getData();
		System.out.println(name);
		
		MethodsDemo2 m2 = new MethodsDemo2();
		m2.getInfo();
	}
	
	public String getData() {
		System.out.println("Hello world");
		return "Prathamesh Sawant";
	}
	
}
