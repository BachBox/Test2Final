package Test2.Controller;

import java.util.Scanner;

import Test2.Model.MyUtil;
import Test2.Model.UserModel;
import Test2.View.View;

public class Main {
    static UserModel userModel = new UserModel();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        User userTest = new User("bach1", "bach123", "bach181020@gmail.com");
        userModel.register(userTest);
        View view = new View();
        

        System.out.println("\n--------------------------------");
        view.printStart();
        System.out.println("Your choice is: ");
        int choice = MyUtil.getAnInteger();
        switch (choice) {
            case 1:
                userModel.login();
                int key;
                do {
                    System.out.println( "Welcome! You can perform the following tasks");
                    view.printMenu();
                    System.out.println("Your choice is: ");
                    key = MyUtil.getAnInteger();
                    switch (key) {
                        case 1:
                            String userName;
                            System.out.println("Input user name u want to change: ");
                            userName = sc.nextLine();
                            userModel.changeUserName(userName);
                            break;

                        case 2:
                        String userName2;
                        System.out.println("Input user name u want to change: ");
                        userName2 = sc.nextLine();
                            userModel.changeEmail(userName2);
                            break;
                        case 3:
                        String userName3;
                        System.out.println("Input user name u want to change: ");
                        userName3 = sc.nextLine();
                            userModel.changePassword(userName3);
                            break;
                        case 4:
                            userModel.logOut();
                            break;
                        default:
                            System.out.println("Input an integer from 0 - 4");
                            break;
                    }
                } while (key != 0);

                break;

            case 2:
                userModel.register();
                break;

            default:
                break;
        }
    }

}
