import java.util.Scanner;

public class Home3 {

    public static void main(String[] args) {
        GuessNumber();
    }

    public static void GuessNumber() {
        Scanner in = new Scanner(System.in);

        int a, n = (int) (Math.random() * 10);
        System.out.println("Компьютер загадал число от 0 до 9, угадай его");
        for (int i = 0; i < 3; i++) {
            System.out.println("Попытка " + (i + 1) + ": ");
            a = in.nextInt();
            if (a < n) System.out.println("Число больше!");
            if (a > n) System.out.println("Число меньше!");
            if (a == n) {System.out.println("Угадал Молодец!");
                System.out.println("Повторить игру еще раз? 1 - да / 0 - нет");
                a = in.nextInt();
                if (a == 1) GuessNumber();
                else {System.out.println("Спасибо за игру!");
                    break;
                }
            }
        }
        System.out.println("Вы не угадали x_x ");
        System.out.println("Повторить попытку еще раз ? 1 - да / 0 - нет");
        a = in.nextInt();
        if (a == 1) GuessNumber();
        else {System.out.println("Спасибо за игра!");
        }
    }
}

