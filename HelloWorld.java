import java.util.Scanner;
public class HelloWorld {
    public static void main(String []args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("please tell us your name");
        String name = scan.nextLine();
        System.out.println("Hello" + name);
    }

}
