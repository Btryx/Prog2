package p2;

class Protection2 extends p1.Protection{
	Protection2(){
		System.out.println("Derived other package constructor");
		System.out.println("n is only accesible in same package");
		System.out.println("Private n is only accesible in the same class");
		System.out.println("Protected n="+ proN);
		System.out.println("Public n="+ pubN);
	}
}