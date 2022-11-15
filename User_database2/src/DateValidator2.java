
public class DateValidator2{
    public static boolean isValid(String value){
    	if(value.length() != 10){
    		return false;
    	}

    	if(!value.contains("/")){
    		return false;
    	}

    	String [] pieces = value.split("/");

    	if(pieces.length != 3){
    		return false;
    	}

    	//Check that all the pieces are numeric
        

    	return true;
    }
}