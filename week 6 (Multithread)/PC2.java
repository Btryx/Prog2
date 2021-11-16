class Q{
	//az adatot tartalmazza, és egy-egy fgvényt az adat lekérésére és modositasara
	int n;	
	boolean valueSet = false;
	//az iras és az olvasas két külön szálon fog futni

	synchronized int get(){

		while(!valueSet){
			try{
				wait();
			}catch(InterruptedException e){
				System.out.println("Interr");
			}
		
		}
		System.out.println("Get: " + n);
		valueSet = false;
		notify();
		return n;
	}

	synchronized void put(int n){
		while(valueSet){
			try{
				wait();
			}catch(InterruptedException e){
				System.out.println("Interr");
		}
	}
		this.n = n;
		valueSet = true;
		System.out.println("Put: " + n);
		notify();
	}
}

//a producer irja, a consumer olvassa a q-t külön szálon

class Producer implements Runnable {
	Q q;
	Thread t;

	Producer(Q q){
		this.q = q;
		t = new Thread(this, "Producer thread");
	}

	public void run(){
		int i = 0;
		while(true)
			q.put(i++);
	}
}

class Consumer implements Runnable {
	Q q;
	Thread t;

	Consumer(Q q){
		this.q = q;
		t = new Thread(this, "COnsumer thread");
	}

	public void run(){
		while(true)
			q.get();
	}
}

class PC2 {
	public static void main(String[] args) {
		
		Q q = new Q();

		Producer p = new Producer(q);
		Consumer c = new Consumer(q);

		p.t.start();
		c.t.start();

		System.out.println("Ctrl+c to stop");
	}
}