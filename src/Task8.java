import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char str = sc.next().charAt(0);
        String word = "";
        switch (str) {
            case 'a':
                word = "аптека";
                break;
            case 'б':
                word = "банан";
                break;
            case 'в':
                word = "вангон";
                break;
            case 'г':
                word = "герб";
                break;
            case 'д':
                word = "дом";
        }
        System.out.println(word);
    }
}
