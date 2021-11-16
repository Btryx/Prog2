package p1;

class SamePackage{
	SamePackage(){

		Protection p = new Protection();
		System.out.println("\nSame Package Constructor");
		System.out.println("n= "+ p.n);
		System.out.println("Private n is class only ");
		System.out.println("Protected n="+ p.proN);
		System.out.println("Public n="+ p.pubN);
	}
}