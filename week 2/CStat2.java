class CStat2 {
	public static void main(String[] args) {
		
		int n = 10;

		while(n > 0) {
			System.out.println("n is " + n);
			n--;
		}


		n = 10;

		do {
			System.out.println("n is " + n);
			n--;
		} while(n > 0);



		for(n=10; n>0; n--) {
			System.out.println("n is " + n);
		}

		int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		int sum = 0;

		for (int num : nums) {
			System.out.println(num);
			sum += num;
		}

		System.out.println("sum: " + sum);

		System.out.println("Avg: " + (double)sum/nums.length);
		

	}
}