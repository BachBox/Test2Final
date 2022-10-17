package Test2.Model;

import java.util.ArrayList;
import java.util.Scanner;

import Test2.Controller.User;
import Test2.View.View;

public class UserModel {
    private Scanner sc = new Scanner(System.in);
    private ArrayList<User> userList;
    private View view = new View();

    public UserModel() {
        this.userList = new ArrayList<User>();
    }

    public int searchUserName(String userName) {
        if (userList.isEmpty())
            return -1;
        for (int i = 0; i < userList.size(); i++)
            if (userList.get(i).getUserName().equals(userName))
                return i;
        return -1;
    }

    public void register(User user) {
        this.userList.add(user);
    }

    public void register() {
        String userName;
        int pos; // Save position of username in arraylist
        do {
            System.out.println("Input new User name");
            userName = sc.nextLine();
            pos = searchUserName(userName);
            if (pos != -1)
                System.out.println("This user name already exists. "
                        + "Input another one!");
        } while (pos != -1);
        System.out.println("Input new password: ");
        String passWord = sc.nextLine();
        System.out.println("Input new email: ");
        String email = sc.nextLine();
        this.userList.add(new User(userName, passWord, email));
        return;
    }

    public void login() {
        String userName;
        String passWord;
        int pos;
        do {
            System.out.println("Input Username");
            userName = sc.nextLine();
            pos = searchUserName(userName);
            if (pos == -1)
                System.out.println("Username is not valid. Please input again");
        } while (pos == -1); // != -1 mean user already exists

        while (true) {
            System.out.println("Input password: ");
            passWord = sc.nextLine();
            if (userList.get(pos).getPassWord().equals(passWord))
                break;
            else {
                System.out.println("Wrong password!");
                int choice;
                view.printIncorrectPass();
                choice = MyUtil.getAnInteger();
                switch (choice) {
                    case 1:
                        login();
                        break;

                    case 2:
                        String email;
                        System.out.println("Input email here: ");
                        email = sc.nextLine();
                        if (email.equals(userList.get(pos).getEmail())) {
                            // Change password
                            System.out.println("Email field is valid, type your new passwprd: ");
                            String newPass = sc.nextLine();
                            userList.get(pos).setPassWord(newPass);
                            login();
                        } else
                            System.out.println("Invalid email!");
                        break;

                    default:
                        break;
                }
                return;
            }
        }

    }

    public void changeUserName(String userName) {
        int x = searchUserName(userName);
        System.out.println("Input a new user name for " + userList.get(x).getUserName() + " :");
        String newUser = sc.nextLine();
        userList.get(x).setUserName(newUser);
        System.out.println("Change user name successfully!");
    }

    public void changeEmail(String userName) {
        int x = searchUserName(userName);
        System.out.println("Input a new email for " + userList.get(x).getUserName() + " :");
        String newEmail = sc.nextLine();
        userList.get(x).setEmail(newEmail);
        System.out.println("Change email successfully!");
    }

    public void changePassword(String userName) {
        int x = searchUserName(userName);
        System.out.println("Input a new password for " + userList.get(x).getUserName() + " :");
        String newPass = sc.nextLine();
        userList.get(x).setUserName(newPass);
        System.out.println("Change password successfully!");
    }

    public void logOut() {
        int choice;
        System.out.println("\n Log out. You want to: ");
        System.out.println("1. Log in");
        System.out.println("2. Register");
        choice = MyUtil.getAnInteger();
        switch (choice) {
            case 1:
                login();
                break;

            case 2:
                register();
                break;
            default:
                break;
        }
    }

}
