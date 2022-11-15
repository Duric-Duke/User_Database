public class DeleteUserTest {
    public static void main(String[] args){
        UserDao.create("Thebe","Ramathebane","theberamathebane3@gmail.com","01/01/2000","2");
        print(UserDao.getAll());
        UserDao.delete("theberamathebane3@gmail.com");
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