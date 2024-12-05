package com.deloitte.collections;

class MathsSub<M>{
	
	M val;
	public void getvalue(M val) {
		this.val=val;
	}
	public M add() {
		return val;
	} 
}

public class GenericClassExample {

	public static void main(String[] args) {
		MathsSub<Integer> obj = new MathsSub<Integer>();
		obj.getvalue(54);
		System.out.println(obj.add());

		MathsSub<String> obj2 = new MathsSub<String>();
		obj2.getvalue("Dinesh");
		System.out.println(obj2.add());
	}
}