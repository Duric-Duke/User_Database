// import java.util.Scanner;

// public class Test {
//     static void print()
//     {
//         Scanner in = new Scanner(System.in);
//         String name = "", surname = "",email = "", dob = "", id = "";
//         int option = 0;
//         System.out.println("================MENU=============== \n○ 1. Add user\n○ 2. Delete user\n○ 3. Update user - Should prompt for email\n○ 4. List users - Displays all the users in the Database \n");

//         do
//         {
//             System.out.println("\nEnter your choice");
//             option = in.nextInt();
//             switch (option)
//             {
//                 case 1: 
//                     Prompter.Ask();
//                     break;

//                 case 2:
//                     UserDAO.getUserByEmail(email);
//                     UserDAO.deleteUser(email);
//                     break;
//                 case 3:
//                     System.out.println("Enter your email:");
//                     email = in.nextLine();
//                     UserDAO.updateUser(name, surname, email, dob, id);
//                     break;
//                 // case 4: 
//                 UserDAO.findAll();
//                 break;
//             }
//         }while (option != 0 && option <5);
//     }
// }
