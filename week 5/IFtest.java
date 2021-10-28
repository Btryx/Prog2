interface IntStack {
	void push(int item);
	int pop();
}


class FixedStack implements IntStack{
	private int stack[];
	private int tos;

	FixedStack(int size) {
		stack = new int[size];
		tos = -1;
	}

	public void push(int item) {
		if(tos == stack.length-1)
			System.out.println("stack is full");
		else
			stack[++tos] = item;
	}

	public int pop() {
		if(tos < 0){
			System.out.println("stack is empty");
			return 0;
		}
		else return stack[tos--];
	}
}

class IFtest{
	public static void main(String[] args) {
		FixedStack fs1 = new FixedStack(5);
		for(int i = 0; i < 5; i++) fs1.push(i);

		for(int i = 0; i < 5; i++) System.out.println(fs1.pop());
	}
}