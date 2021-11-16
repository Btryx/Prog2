class light {

	public static void main(String[] args) {
		
		int lightSpeed = 299792;

		long days = 1000;
		long second = 24*60*60 * days;
		long distance = second * lightSpeed;

		System.out.println("In " + days + " days light travels " +
		distance + " kms.");
	}
}