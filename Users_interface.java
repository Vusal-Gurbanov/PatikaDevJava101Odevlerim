package kosul_ifadeleri;

import java.util.Scanner;

public class Users_interface {
    public static void main(String[] args) {
        String userName, password, new_password ;


        Scanner input = new Scanner(System.in);
        System.out.println("please enter login name: ");
        userName = input.nextLine();
        System.out.println("enter password: ");
        password = input.nextLine();

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("You Are Signed In.");
        } else  {
            System.out.println("you entered wrong password:\nPress 1 if you want to reset your password:\nPress 2 if you want to log out:");
            int choice;
                choice = input.nextInt();
                    if (choice==1) {
                        System.out.println("Enter new password");
                        Scanner inp= new Scanner(System.in);
                        new_password = inp.nextLine();
                        System.out.println("Your password has been changed. Your new password is: " + new_password );
                 }
                     else {
                        System.out.println("System exited");
                }
            }

        }
}
