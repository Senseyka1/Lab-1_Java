
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        System.out.print("Введiть вiк: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        switch (n) {
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
                System.out.println(n + " років"); break;
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
                System.out.println(n + " роки"); break;
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
                System.out.println(n + " рік"); break;
            default:
                System.out.println("Число має бути більше 20 і менше 69");
        }
    }
}

