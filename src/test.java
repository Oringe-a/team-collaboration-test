import java.util.Scanner;
public class test {
    Scanner input = new Scanner(System.in);
    public static void main(String[] args){
    System.out.println("Welcome to Douban Movie Network!");
        System.out.println("----------------------------------");
        System.out.println("The system is being initialized...");
        System.out.println("----------------------------------");
        System.out.println("Please log in first!");
    Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your username:");
    String username = scanner.nextLine();
        System.out.println("Please enter your password:");
    int password = scanner.nextInt();
    String name = "Qijie,Wang";
    int key = 123456;
        if (username == name && password == key){
        System.out.println("Login successfully!");
    }
        else {
        System.out.println("Wrong,try please again");
    }

}

    //git config user.email "yournewemail@example.com"
}
