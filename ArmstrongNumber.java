package week1.day1;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i = 153,  remainder, original, calculated = 0 ;
  original = i;
while (i>0) {
	remainder = i %10;
	i = i/10;
	calculated = calculated + remainder* remainder * remainder;
		
		
}
if (original == calculated) {
	System.out.println("Armstrong Number " + calculated);
	}

	}

}
