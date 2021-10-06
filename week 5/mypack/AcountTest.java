package mypack;

class Balance{
	String name;
	double bal;

	Balance(String name, double bal){
		this.name = name;
		this.bal = bal;
	}

	void show(){
		if(bal < 0)
			System.out.println("-->");
		System.out.println(name + ": $" + bal);
	}
}

class AcountTest {
	public static void main(String[] args) {
		Balance current[] = new Balance[3];

		current[0] = new Balance("Endre", 100.43);
		current[1] = new Balance("András", 200.43);
		current[2] = new Balance("Béla", 1430.43);

		for(int i = 0; i < 3; i++) current[i].show();
	}
}