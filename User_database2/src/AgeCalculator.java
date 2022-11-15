public class AgeCalculator{
	public static int calculate(String dob){
		String [] pieces = dob.split("/");
		String year = pieces[2];
		int iYear = Integer.parseInt(year);

		return 2022 - iYear;
	}
}