package p1;

public class Protection{
	int n = 1;
	private int priN = 2;
	protected int proN =  3;
	public int pubN = 4;

	public Protection(){
		System.out.println("\nBase Constructor");
		System.out.println("n= "+ n);
		System.out.println("Private n= "+ priN);
		System.out.println("Protected n="+ proN);
		System.out.println("Public n="+ pubN);
	}
}