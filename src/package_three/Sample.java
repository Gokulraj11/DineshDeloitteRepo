package package_three;

public class Sample {
	
	public static void main (String[] args) {
		String str1 ="din";
		String str2 ="din";
		
		String str3 = new String("din");
		String str4 = new String("din");
		
		System.out.println(str1==str2);
		System.out.println(str3==str4);

		System.out.println(str3.equals(str4));
		
		System.out.println(String.join("_", "welcom","to","Del"));
	}
	
}

