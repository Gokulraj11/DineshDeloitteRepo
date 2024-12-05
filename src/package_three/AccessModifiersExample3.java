package package_three;

import package_two.AccessModifiersExample;

public class AccessModifiersExample3 extends AccessModifiersExample {
	
	public void Messages() {
		
     		 System.out.println(publicMsg); 
     		 System.out.println(protectedMsg);

	        //System.out.println(defaultMsg);
	        // System.out.println(privateMsg);
	}

	public static void main(String[] args) {
		AccessModifiersExample3 example3 = new AccessModifiersExample3();
        example3.Messages();
       

	}

}
