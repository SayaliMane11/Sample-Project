public class Loop {

	public static void main(String[] args) {
		Loop l = new Loop();
	//	l.leap();
		l.even();
		l.odd();
	}
	
	void leap() {
		System.out.println("Leap years between 1900 - 2020:");
		for(int year = 1900; year <=2020; year++) 
		{	
			if((year % 4 == 0 || year % 400 == 0)&& year % 100 != 0) 
			{ 
				System.out.print(year+",");
			}
		}
	}
	
	
	void even() {
		System.out.println("----------------------------------------------------------");
		System.out.println("List of even nos between 1 to 100:");
		for(int a = 1; a<=100; a++) {
			if(a % 2 == 0) {
				System.out.print(a + ",");
			}
		}
		System.out.println();
	}
	
	void odd() {
		System.out.println("----------------------------------------------------------");
		System.out.println("List of odd nos between 1 to 100:");
		for(int a = 1; a<=100; a++) {
			if(a % 2 != 0) {
				System.out.print(a + ",");
			}
		}
		System.out.println();
	}
	
}
