class NonGen {

	int num;

	NonGen(int o) { num = o; }

	int getnum() { return num; }
}

class Gen<T> extends NonGen {

	T ob;

	Gen(int num, T o) { 
		super(num);
		ob = o; 
	}

	T getob() { return ob; }
}

class Gen2<T, V> extends Gen<T> {

	V ob2;

	Gen2(int num, T o, V o2) {
		super(num, o);
		ob2 = o2;
	}

	V getob2() {
		return ob2;
	}
}

class HierDemo2 {
	public static void main(String[] args) {
		
		Gen2<String, Integer> x =
			new Gen2<String, Integer>(2, " string ", 420);

		System.out.print(x.getnum());
		System.out.print(x.getob());
		System.out.println(x.getob2());
	}
}