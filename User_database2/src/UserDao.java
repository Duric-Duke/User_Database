// import java.io.*;

public class UserDao {
    // Create, Update, Delete, Get.
    static String users[][] = new String[100][5];
    static int index = 0;
    // Create User and store them in the Array of users.
    public static void create(String name, String surname, String email, String dob, String id) {
        String [] user = new String[5];
        user[0] = name;
        user[1] = surname;
        user[2] = email;
        user[3] = dob;
        user[4] = id;
        users[index++] = user;
        String username = user[0] + " " + user[1];
        System.out.println("The following user: " + username + " has been added the database.😁");
        CreateUserDaoFile.writeArrayToFile(users, "Users.txt");
        CreateUserDaoFile.createJsonFile(users, "Users.json");
        // CreateUserDaoFile.writeArrayToFile(users, "Users.json");
    }
    // Update user; name, surname and Date of Birth(dob).
    public static void update(String name, String surname, String email, String dob) {
        for (String[] myUser : users){
            if((myUser != null) && email.equals(myUser[2])){
                myUser[0] = name;
                myUser[1] = surname;
                myUser[3] = dob;
            }
        }
    }
    // Returns the user by email.
    public static String [] getUserByEmail(String email) {

        for (String[] myUser : users){
            if((myUser != null) && email.equals(myUser[2])){
                System.out.println("Testing Get User by Email method...");
                return myUser;
            }
        }
        return null;
    }
    // Delete user by email.
    public static void delete(String email) {
        for(int i = 0; i < users.length; i++){
            if((users[i] != null) && email.equals(users[i][2])){
                users[i] = null;
            }
        }
    }
    // Returns All the users.
    public static String [][] getAll(){
        return users;
    }
    // Add
}
