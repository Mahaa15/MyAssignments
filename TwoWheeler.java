package week1.day1;

public class TwoWheeler {

	int noOfWheels = 589565898;
	short noOfMirrors = 32767;
	long chassisNumber = 8956598945612365L;
	boolean isPunctured = true;
	String bikeName = "Yamaha";
	double runningKM = 10.86596;
	
public static void main (String[] args) {
	TwoWheeler obj = new TwoWheeler();
	System.out.println("No of Wheels" +obj.noOfWheels);
	System.out.println("No of Mirrors" +obj.noOfMirrors);
	System.out.println("Chassis Number" +obj.chassisNumber);
	System.out.println("Punctured?" +obj.isPunctured);
	System.out.println("Bike Name" +obj.bikeName);
	System.out.println("Running KM" +obj.runningKM);
	}
}
