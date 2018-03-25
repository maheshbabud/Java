package com.patterns.singleton;

public class Singleton {
	public static void main(String[] args) {
		A a1 = A.getInstance();
		System.out.println(a1);
		A a2 = A.getInstance();
		System.out.println(a2);
	}
}

class A{	
	static A  a = null;
	private A(){}
	public static A getInstance(){
		if(a == null){
			a = new A();
		}
		return a;
	}
}
