import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int i = 0;
        do {
            System.out.print(str.charAt(i));
            if (str.charAt(i) == ' ') {
                System.out.println();

            }
            i++;

        } while (i < str.length());
    }
}
