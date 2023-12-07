
public class SmallestNumber {

	int number1, number2, number3;
	
	public SmallestNumber(int number1, int number2, int number3) {
		this.number1 = number1;
		this.number2 = number2;
		this.number3 = number3;
	}
	
	
	public void checkNumber() {
		if (number1 < number2) {
			System.out.println("Small than " + number2);
			
		}if (number2 < number3) {
			System.out.println("Small than " + number3);
			
		}if (number3 == number2) {
			System.out.println("Its iqual number 2  " + number2);
		}else {
			System.out.println("Small than " + number1);
		}
	}
	
	
}
