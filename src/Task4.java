import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int i = 1;
        do {
            System.out.println(str.charAt(i));
            i = (char) (i + 2);


        } while (i < str.length());
    }
}
