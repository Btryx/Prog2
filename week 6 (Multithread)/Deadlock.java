//deadlock: két szál egymásra vár
class A {
	synchronized void foo(B b){
		String name = Thread.currentThread().getName();
		System.out.println(name + "entered A.foo...");

	try{
		Thread.sleep(1000);
	}catch(InterruptedException e){
		System.out.println("Exception");
	}

		System.out.println(name + "calling B.last()");
		b.last();
	}

	synchronized void last(){
		System.out.println("In A.last()");
	}
}

class B {
	synchronized void bar(A a){
		String name = Thread.currentThread().getName();
		System.out.println(name + "entered B.foo...");

	try{
		Thread.sleep(1000);
	}catch(InterruptedException e){
		System.out.println("Exception");
	}

		System.out.println(name + "calling A.last()");
		a.last();
	}

	synchronized void last(){
		System.out.println("In B.last()");
	}
}

class Deadlock implements Runnable {

	A a = new A();
	B b = new B();
	Thread t;

	Deadlock(){
		Thread.currentThread().setName("MainT");
		t = new Thread(this, "RacingT");
	}

	void dlStart(){
		t.start();
		a.foo(b);
		System.out.println("Mainthread");
	}

	public void run(){
		b.bar(a);
		System.out.println("Otherthread");
	}

	public static void main(String[] args) {
		Deadlock dl = new Deadlock();
		dl.dlStart();
	}
}
