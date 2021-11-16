enum Apple{

	Jonathan(10), GoldenDel(20), RedDel, WineSap(15), Cortland(18);

	private int price;

	Apple(int p) { price = p; }

	Apple() { price = 0; }

	int getPrice(){ return price; }
}

class EnumDemo2 {
	public static void main(String[] args) {
		
		System.out.println("Price of WineSap: " + Apple.WineSap.getPrice());

		for(var a : Apple.values())
			System.out.println(a + " costs " + a.getPrice() + " cents.");
		
	}
}