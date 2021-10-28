class NewThread implements Runnable{
	String name;
	Thread t;

	NewThread(String n){
		name = n;
		t = new Thread(this, name);
		System.out.println("New Thread" + t);
	}

	public void run(){
		try{
			for(int i = 0; i < 6; i++){
				System.out.println(i);
				Thread.sleep(300);

			}
		}catch(InterruptedException e){
			System.out.println(name + " thread interrupted.");
		}
		System.out.println("Exiting " + name + "thread");
	}
}




class DemoJoin{
	public static void main(String[] args) {
		NewThread nt1 = new NewThread("First");
		NewThread nt2 = new NewThread("Second");
		NewThread nt3 = new NewThread("Third");

		nt1.t.start();
		nt2.t.start();
		nt3.t.start();

		System.out.println("First thread is alive: " + nt1.t.isAlive());
		System.out.println("Second thread is alive: " + nt2.t.isAlive());
		System.out.println("Third thread is alive: " + nt3.t.isAlive());

		try{
			nt1.t.join();
			nt2.t.join();
			nt3.t.join();
		}catch(InterruptedException e){
			System.out.println("Main thread interrupted.");
		}

		System.out.println("First thread is alive: " + nt1.t.isAlive());
		System.out.println("Second thread is alive: " + nt2.t.isAlive());
		System.out.println("Third thread is alive: " + nt3.t.isAlive());

		System.out.println("Exiting main thread");
	}
}