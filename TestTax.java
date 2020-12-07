// Jasmine Chi
// AP CS Peterson P4
// Tax Program Assignment

public class TestTax {

	public static void main(String[] args) {
		System.out.println("The tax at 50000 is " + tax(50000)); // 9237.5 
		System.out.println("The tax at 27500 is " + tax(27500)); // 3767.5
		System.out.println("The tax at 6000 is " + tax(6000)); // 600.0
		System.out.println("The tax at 1200000 is " + tax(120000)); } // 28227.0
		
		public static Double tax(int ourincome) {
			Double salary = new Double(ourincome);
			
			if (salary <= 7150.0) {
			return salary*0.1;
			}
			
			if (salary <= 29050.0) {
			return 715.0 + (salary-7150.0) * 0.15;
			}
			
			if (salary <= 70350.0){
			return 4000.0 + (salary-29050.0) * 0.25;
			}
			else {
				return  14325.0 + (salary-70350.0) * 0.28;
			}
			
	
	}

}
