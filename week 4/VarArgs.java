//változo argumentum számú függvények
//pl printf

class VarArgs {
	static void vTest(int ... v) {
		System.out.println("NUmber of args: " + v.length + ", contents:\n");

		for(int i : v)
			System.out.println(i + " \n");
	}

	static void vTest(String msg, boolean ... v) {
		System.out.println(msg);
		System.out.println("NUmber of args: " + v.length + ", contents:\n");

		for(var i : v)
			System.out.println(i + " \n");
	}

	public static void main(String[] args) {
		vTest(10);
		vTest(10, 10, 22);
		vTest("Message", true, false, true);
	}
}