package src;
// Jasmine Chi

public class TestMedian {

    public static void main(String[] args) {

        System.out.println(median(7, 3, 9));        // 7

        System.out.println(median(29, -14, 11));    // 11

        System.out.println(median(52, 64, 121));   // 64

    }
    
public static int median(int x, int y, int z) { 
	
	if (z < x) {
	if (y < z) {
		return z; 

	} else if (x < y) {
	return x;
		
	} else { 
	return y; }
	
	} else if (y < x) {
	return x; 
	
	} else if (z < y) {	
	return z; 
	
	} else {
	return y; }
	
		}
	}


	   

	  