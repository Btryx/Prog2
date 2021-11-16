package p2;

class OtherPackage{

	OtherPackage(){
		p1.Protection p = new p1.Protection();
		System.out.println("Other package constructor(not derived class)");
		System.out.println("n is only accesible in same package");
		System.out.println("Private n is only accesible in the same class");
		System.out.println("Protected n is only accesible in subclass");
		System.out.println("Public n="+ p.pubN);
	}
}