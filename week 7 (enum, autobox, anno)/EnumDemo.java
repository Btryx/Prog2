enum Apple{
	Jonathan, GoldenDel, RedDel, WineSap, Cortland
}

class EnumDemo {
	public static void main(String[] args) {
		Apple ap;
		ap = Apple.WineSap;

		System.out.println("Value of ap: " + ap);

		if(ap == Apple.GoldenDel){
			System.out.println("ap contains GoldenDel");
		}

		switch(ap) {
			case Jonathan:
				System.out.println("ap is jonathan");
				break;
			case GoldenDel:
				System.out.println("ap is golden");
				break;
			case RedDel:
				System.out.println("ap is red");
				break;
			case WineSap:
				System.out.println("ap is very red");
				break;
			case Cortland:
				System.out.println("ap is Cortland");
				break;
		}

		Apple all[] = Apple.values();

		for(var a : all)
			System.out.println(a);
	}
}