class CurrentThreadDemo{
	public static void main(String[] args) {
		Thread t = Thread.currentThread();

		System.out.println("currentThread: " + t);

		t.setName("My thread");
		System.out.println("Name change: " + t);

		try{
			for(int i = 0; i < 6; i++){
				System.out.println(i);
				Thread.sleep(500);

			}
		}catch(InterruptedException e){
			System.out.println("Main thread interrupted.");
		}
	}
}