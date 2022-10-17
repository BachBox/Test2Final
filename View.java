package Test2.View;

public class View {
    public void printStart(){
        System.out.println("Welcome to our program. You want: ");
        System.out.println("1. Login");
        System.out.println("2. Register");
    }
    public void printIncorrectPass(){
        System.out.println("Password is incorrect. Choose 1 or 2: ");
        System.out.println("1. Re login");
        System.out.println("2. Fogot password");
    }
    public void printMenu(){
        System.out.println("1. Change Username");
        System.out.println("2. Change Email");
        System.out.println("3. Change Password");
        System.out.println("4. Log out");
        System.out.println("0. Exit");
    }

}
