public class GetUserByEmailTest {
    public static void main(String[] args){
        UserDao.create("Thebe","Ramathebane","theberamathebane3@gmail.com","01/01/2000","2"); 
        print(UserDao.getUserByEmail("theberamathebane3@gmail.com"));

    }
    public static void print(String [] user){

            if(null != user && null != user[0]){
                System.out.println("name = "+user[0]
                    +" surname = "+user[1]
                    +" email = "+user[2]
                    +" dob = "+user[3]
                    +" id = "+user[4]);
            }
    }
}
