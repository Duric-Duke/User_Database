public class UpdateUserTest {

    public static void main(String [] args){

        UserDao.create("Bokamoso", "Semoko", "theberamathebane3@gmail.com", "01/01/2000", "10");
        UserDao.update("Thebe", "Ramathebane", "theberamathebane3@gmail.com", "01/01/2020");
        // UserDao.update("Thabo", "Moropoli", "thabomoropoli@gmail.com", "02/02/2023");
        
        print(UserDao.getAll());
    }
    public static void print(String [][] db){
        for(String [] row:db){
            if(null != row && null != row[0]){
                System.out.println("name = "+row[0]
                    +" surname = "+row[1]
                    +" email = "+row[2]
                    +" dob = "+row[3]
                    +" id = "+row[4]);
            }
        }
    }
}