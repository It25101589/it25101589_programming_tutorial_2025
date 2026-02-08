public class marathonDistance {
  public static void main(String[] args) {

    int miles = 26;
    int yards = 385;
    double kilometers;
        double totalMiles = miles + (yards / 1760.0);
        kilometers = totalMiles * 1.609;
		//Additional Code Segment :
        System.out.println("Distance in kilometers: " + kilometers);
    }
}
