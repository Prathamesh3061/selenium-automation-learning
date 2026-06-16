import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaBrushUp2 {

	public static void main(String[] args) {
		
//		int[] numbers = {1,2,4,5,7,8,12,16};
//		
////		check if array has multiple of 2
//		
//		for(int i = 0; i < numbers.length; i++) {
//			
//			if(numbers[i] % 2 == 0) {
//				System.out.println(numbers[i]);
//			}
//			else {
//				System.out.println(numbers[i]+" is not multiply of 2");
//			}
//		}
		
		
//		array list
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("Prathamesh");
		a.add("Ramjan");
		a.add("Sonu");
		a.add("Tushar");
		
		for(int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i));
		}
		
		System.out.println("***************");
		
//		enhanced loop
		for(String val :a) {
			System.out.println(val);
		}
		
//		items present in arraylist or not
		System.out.println(a.contains("Ramjan"));
		
		
//		way to convert simple array into arraylist
		String [] info = {"Vishal", "Yuvraj", "Chidanand"};
		
		List<String> infoArrayList = Arrays.asList(info);
		System.out.println(infoArrayList.contains("Vishal"));
		}

	}


