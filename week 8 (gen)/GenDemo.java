class Gen<T> {

	T ob;

	Gen(T o) {ob = o;}

	T getOb() { return ob; }

	void showType(){
		System.out.println("Type is " + ob.getClass().getName());
	}
}

class GenDemo{
	public static void main(String[] args) {
		
		Gen<Integer> iOb;

		iOb = new Gen<Integer>(77);

		iOb.showType();

		int i = iOb.getOb();
		System.out.println("Value: " + i);

		Gen<String> sOb = new Gen<String>("dfsidfh");

		sOb.showType();

		String s = sOb.getOb();

		System.out.println("String value is: "+ s);
	}
}