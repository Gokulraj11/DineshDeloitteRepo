package package_two;

public class AccessModifiersExample {
	
    public String publicMsg = "I am Public"; 
    protected String protectedMsg = "I am Protected";
    String defaultMsg = "I am Default"; 
    private String privateMsg = "I am Private";
    
	public static void main(String[] args) 
	{
		AccessModifiersExample example = new AccessModifiersExample();
		
        System.out.println(example.publicMsg);     
        System.out.println(example.protectedMsg);
        System.out.println(example.defaultMsg);
        System.out.println(example.privateMsg); 
	
}}