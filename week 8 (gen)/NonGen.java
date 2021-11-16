 class NonG {

 	Object ob;
 	NonG(Object o) { ob = o; }

 	Object getOb() {return ob;}

 	void showType() {
 		System.out.println("Type: " + ob.getClass().getName());
 	}
 }

 class NonGen {

 	public static void main(String[] args) {
 		
 		NonG iOb = new NonG(66);

 		iOb.showType();

 		int v = (Integer) iOb.getOb();

 		System.out.println("int value: " + v);


 		NonG sOb = new NonG("dsifhs");

 		sOb.showType();

 		String s = (String) sOb.getOb();

 		System.out.println("string value: " + s);

 	}
 }