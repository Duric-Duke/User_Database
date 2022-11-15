import java.util.Scanner;

public class Prompter {
    Scanner prompter = new Scanner(System.in);
    UserDao userdao = new UserDao();
    static int id = 0;

    public void menu(){
        // System.out.println("Pick an Option: ");
        // System.out.println("1. Add User: ");
        // System.out.println("2. Update: ");
        // System.out.println("3. Delete: ");
        // System.out.println("4. List: ");
        // System.out.println("5. Exit.");
        System.out.println("_____Menu_____\nPick an Option:\n 1. Add user: \n 2. Update user: \n 3. Delete user: \n 4. List \n 5. Exit");
        String inp = prompter.next();
        switch (inp) {
            case "1":
                addUser();
                break;
            case "2":
                update();
                break;
            case "3":
                delete();
                break;
            case "4":
                getUser();
                break;
            case "5":
                System.exit(0);
            default:
                menu();
        }
        menu();
    }
    public void addUser(){
        System.out.println("What is Your name?: ");
        String name = prompter.next();
        System.out.println("What is Your surname?: ");
        String surname = prompter.next();
        System.out.println("Enter your email: ");
        String email = prompter.next();
        System.out.println("What is Your Date of Birth?: DD/MM/YYYY: ");
        String dob = prompter.next();
        if(DateValidator.isValid(dob)){
            String uid = name.substring(0, 3) + id++;
        
        UserDao.create(name, surname, email, dob, uid);
        }
        else{
            System.out.println("Invalid Date of Birth. \nPlease input Date of Birth: DD/MM/YYYY: ");
            addUser();
        }
        
    }

    public void update(){
        System.out.println("Enter your email: ");
        String email = prompter.next();
        System.out.println("Enter your new information: ");
        System.out.println("What is Your name?: ");
        String name = prompter.next();
        System.out.println("What is Your surname?: ");
        String surname = prompter.next();
        System.out.println("What is Your Date of Birth?: DD/MM/YYYY: ");
        String dob = prompter.next();
        if(DateValidator.isValid(dob)){
            String uid = name.substring(0, 3) + id++;
            UserDao.update(name, surname, email, dob);
        }
        else{
            System.out.println("Invalid Date of Birth. \nPlease input Date of Birth: DD/MM/YYYY: ");
            update();
        }
        
    }
    public void delete(){
        System.out.println("Enter your email: ");
        String email = prompter.next();
        UserDao.delete(email);
    }
    public void getUser(){
        System.out.println("List by Email Or list All?: 1  or 2: ");
        String choice = prompter.next();
        if(choice.equals("1")){
            System.out.println("Enter your email: ");
            String email = prompter.next();
            String [] array = UserDao.getUserByEmail(email);
            if(array == null){
                getUser();
            }
            String name = array[0];
            String surname = array[1];
            String user_email = array[2];
            String dob = array[3];
            String id = array[4];
            int age = AgeCalculator.calculate(dob);
            System.out.println("The user is: " + name + " " + surname + " " + user_email + " " + dob  + " " + "Age: " + age + "At: " + id);
        }
        else if(choice.equals("2")){
            for(String [] row:UserDao.getAll()){
                if(null != row && null != row[0]){
                    System.out.println("name = "+row[0]
                        +" surname = "+row[1]
                        +" email = "+row[2]
                        +" dob = "+row[3]
                        +"Age = " + AgeCalculator.calculate(row[3])
                        +" id = "+row[4]);
                }
            }
        }
    }

}
