class NewThread implements Runnable{

	Thread t;

	NewThread(){
		t = new Thread(this, "Demo Thread");
		System.out.println("Child Thread" + t);
	}

	public static NewThread createAndStart(){
		NewThread myNewThread = new NewThread();
		myNewThread.t.start();
		return myNewThread;
	}
	public void run(){
		try{
			for(int i = 0; i < 6; i++){
				System.out.println(i);
				Thread.sleep(500);

			}
		}catch(InterruptedException e){
			System.out.println("Child thread interrupted.");
		}
		System.out.println("Exiting child thread");
	}
}




class NewThreadFactoryDemo{
	public static void main(String[] args) {

		NewThread nt = NewThread.createAndStart();

		try{
			for(int i = 0; i < 6; i++){
				System.out.println("Main thread: " + i);
				Thread.sleep(1000);

			}
		}catch(InterruptedException e){
			System.out.println("Main thread interrupted.");
		}
		System.out.println("Exiting main thread");
	}
}