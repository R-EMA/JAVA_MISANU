package p2;

import p1.Base;
import p1.SamePackage;

public class Demo {
	public static void main(String[] args) {
		Base ob1 = new Base();
		
		System.out.println("-------------------------------------");
		SamePackage ob2 = new SamePackage();
		
		System.out.println("-------------------------------------");
		OtherPackage ob3 = new OtherPackage();
	}
}