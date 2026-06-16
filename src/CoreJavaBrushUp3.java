
public class CoreJavaBrushUp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		string is an object 
		String s1 = "Prathamesh Suresh Sawant";
		String s2 = "Vishal";
		
		// new 
		String s3 = new String("Welcome");
		String s4 = new String("Manual testing");
		
		String[] splitedString = s1.split(" ");
		System.out.println(splitedString[0]);
		System.out.println(splitedString[1]);
		System.out.println(splitedString[2]);
		
		String[] newArr = s1.split("Suresh");
		System.out.println(newArr[0]);
		System.out.println(newArr[1]);
		System.out.println(newArr[1].trim());
		
		for(int i = 0; i < s1.length(); i++) {
			
			System.out.println(s1.charAt(i));
		}
		
		for(int i = s1.length()-1; i>=0; i--) {
			System.out.println(s1.charAt(i));
		}
		
	}

}
