import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int i = 0;
        int x = 0;
        do {
            System.out.println(str.charAt(i));
            if (str.charAt(i) == ' ') {
                x++;

            }

            i++;


        } while (x < 3 && i < str.length());
    }
}
