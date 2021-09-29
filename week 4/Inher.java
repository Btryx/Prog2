class A {
	
	int i;
	private int j;

	void setIJ(int a, int b){

		i = a;
		j = b;
	}

	int getJ(){

		return j;
	}

	void show() {
		System.out.println("i==" + i + " j=="+ j);
	}
}


class B extends A {
	int k;

	void showk() {
		System.out.println("k=="+ k);
	}

	void sum(){
		System.out.println("k+i+j= " + (k+getJ()+i));
	}
}

class Inher{
	public static void main(String[] args) {

		A superOb = new A();
		B subOb = new B();

		superOb.setIJ(10,25);

		System.out.println("SuperOb: ");
		superOb.show();

		subOb.setIJ(30,12);
		subOb.k = 76;

		System.out.println("SubOb: ");
		subOb.showk();
		subOb.show();

		subOb.sum();
	}
}