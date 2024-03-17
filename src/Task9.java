import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String word = "";
        switch (num) {
            case 79:
                word = "Россия";
                break;
            case 7:
                word = "Казахстан";
                break;
            case 1:
                word = "США";
                break;
            case 49:
                word = "Германия";
                break;
            case 44:
                word = "Великобритания";
        }
        System.out.println(word);
    }
}
