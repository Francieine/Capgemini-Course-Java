public class ProgramVeichle {

	public static void main(String[] args) {
		Vehicle minivan = new Vehicle ();
		Vehicle sportcar = new Vehicle();
		
		int ranger1, ranger2;
/*Assigning values to the attributes of new created objects*/
		minivan.passangers = 7;
		minivan.fuelcap = 16;   //Object 01 minivan
		minivan.mpg = 21;
		
		sportcar.passangers = 2;
		sportcar.fuelcap = 16;   //Object 02 sportcar
		sportcar.mpg = 12;
		
		
/*Getting the result of the method/calculation*/		
		ranger1 = minivan.ranger();
		ranger2 = sportcar.ranger();
		
		System.out.println("Minivan can carry"+ minivan.passangers + "with range of"+ minivan.ranger() + "miles");
	}

}
