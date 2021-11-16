class Q{
	//az adatot tartalmazza, és egy-egy fgvényt az adat lekérésére és modositasara
	int n;	
	//az iras és az olvasas két külön szálon fog futni

	synchronized int get(){
		System.out.println("Get: " + n);
		return n;
	}

	synchronized void put(int n){
		this.n = n;
		System.out.println("Put: " + n);
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

class PC {
	public static void main(String[] args) {
		
		Q q = new Q();

		Producer p = new Producer(q);
		Consumer c = new Consumer(q);

		p.t.start();
		c.t.start();

		System.out.println("Ctrl+c to stop");
	}
}