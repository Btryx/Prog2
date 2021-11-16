package p1;

class Derived extends Protection {
	Derived(){
		System.out.println("\nDerived Constructor");
		System.out.println("n= "+ n);
		System.out.println("Private n is class only");
		System.out.println("Protected n="+ proN);
		System.out.println("Public n="+ pubN);
	}
}