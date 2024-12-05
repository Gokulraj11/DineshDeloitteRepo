package com.deloitte.collections;

import java.util.ArrayList;

class MyUser{
	public void perform(){
		System.out.println("this is from myUser");
	}
}
class OurUser extends MyUser{
	public void perform() {
		System.out.println("this is from OurUsers");
	}
}
class OtherUser extends OurUser{
	public void perform() {
		System.out.println("this is from OtherUsers");
	}
}
class Administrator extends MyUser{
	public void perform() {
		System.out.println("this is from Administrators only");
	}
}
public class GenericClassWithWildCards {

	public void systems(ArrayList< ? extends MyUser> test ) {

		for (MyUser user : test) {
			user.perform();
		}
	}

	public static void main(String[] args) {
		GenericClassWithWildCards obj = new GenericClassWithWildCards();

		ArrayList<OurUser> ouruser = new ArrayList<OurUser>();
		ArrayList<OtherUser> otheruser = new ArrayList<OtherUser>();
		ArrayList<Administrator> admin = new ArrayList<Administrator>();
		ArrayList<MyUser> myuser = new ArrayList<MyUser>();
		
		ouruser.add(new OurUser());
        otheruser.add(new OtherUser());
        admin.add(new Administrator());
        myuser.add(new MyUser());

        
        System.out.println("Calling systems with MyUser list:");
        obj.systems(myuser);
        System.out.println("\nCalling systems with OurUser list:");
        obj.systems(ouruser);  
        System.out.println("\nCalling systems with OtherUser list:");
        obj.systems(otheruser); 
        System.out.println("\nCalling systems with Administrator list:");
        obj.systems(admin); 

	}

}
