enum Grades{
	fail, pass, satisfactory, good, excellent;
}

class Grading {
	java.util.Random rand = new java.util.Random();

	Grades giveGrade(){
		//int prob = (int) (100*rand.nextDouble());
		int prob = rand.nextInt(100);

		if(prob < 30)
			return Grades.fail;
		else if(prob < 50)
			return Grades.pass;
		else if(prob < 80)
			return Grades.satisfactory;
		else if(prob < 90)
			return Grades.good;
		else
			return Grades.excellent;
	}
}

class Exam{
	public static void commit (Grades result) {
		
		switch(result){
			case fail:
				System.out.println("F");
				break;
			case pass:
				System.out.println("D");
				break;
			case satisfactory:
				System.out.println("C");
				break;
			case good:
				System.out.println("B");
				break;
			case excellent:
				System.out.println("A");
				break;
		}
	}

	public static void main(String[] args) {
		Grading g = new Grading();

		commit(g.giveGrade());
		commit(g.giveGrade());
		commit(g.giveGrade());
		commit(g.giveGrade());
		commit(g.giveGrade());
	}
}

