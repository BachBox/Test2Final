package Test2.Model;

import java.util.Scanner;

public class MyUtil {
    private static Scanner sc = new Scanner(System.in);

    public static int getAnInteger() {
        int n;
        while (true) {
            try {          
                n = Integer.parseInt(sc.nextLine());
                return n;
            } catch (Exception e) {
                System.out.println("Wrong type, input again");
            }
        }
    }

}
