// import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
// import java.util.Date;
import java.util.regex.Pattern;

public class DateValidator{
    static int index = 0;
	
    public static boolean isValid(String value){
		// UserDao.create("Thebe", "Ramathebane", "The@test.com", "28/08/1997", "The1");
		String testDate = UserDao.getAll()[index++][3];
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        // SimpleDateFormat myFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        try{
            String refStr = sdf.format(sdf.parse(value, new ParsePosition(0))); // Exception!!!!!!!!!!!!!!!!!!!
            String myDate = refStr.substring(0, 10); //01/01/2000
			String [] pieces = myDate.split("/");
			String alphs = "[^0-9]";
			// String [] strErr = alphs.split("");
			// Checking if the date provided is equal to the length of dd/mm/yyyy == 10
			if(myDate.length() != 10){
				System.out.println("1st");
				return false;
			}
			for(String str : pieces){
				if(Pattern.matches(alphs, str)){   
					System.out.println("2nd");
					return false;
				}
			}
			if(pieces.length != 3){
				System.out.println("3rd");
				return false;
			}
            // System.out.println(myDate);
        // System.out.println(testDate);
        }
        catch (Exception e) { 
            e.printStackTrace();
        }

    	//Check that all the pieces are numeric

    	return true;
    }
}