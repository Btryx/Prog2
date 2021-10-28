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
				Thread.sleep(1000);

			}
		}catch(InterruptedException e){
			System.out.println(name + " thread interrupted.");
		}
		System.out.println("Exiting " + name + "thread");
	}
}




class MultiThreadDemo{
	public static void main(String[] args) {
		NewThread nt1 = new NewThread("First");
		NewThread nt2 = new NewThread("Second");
		NewThread nt3 = new NewThread("Third");

		nt1.t.start();
		nt2.t.start();
		nt3.t.start();

		try{
			Thread.sleep(10000);
		}catch(InterruptedException e){
			System.out.println("Main thread interrupted.");
		}
		System.out.println("Exiting main thread");
	}
}