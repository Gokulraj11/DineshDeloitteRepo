package package_two;

public class AccessModifiersExample2 extends AccessModifiersExample{
	
	public void Messages() {
		
		 System.out.println(publicMsg); 
	     System.out.println(protectedMsg);
	     System.out.println(defaultMsg);
	        
	     // System.out.println(privateMessage); 
	}

	public static void main(String[] args) {
		AccessModifiersExample2 example2 = new AccessModifiersExample2();
        example2.Messages();

	}

}