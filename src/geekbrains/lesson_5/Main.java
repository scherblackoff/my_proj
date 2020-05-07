package geekbrains.lesson_5;

import java.util.Scanner;

public class Main {
    private static Scanner arrow = new Scanner(System.in);
    private static int score ;

    public static void main(String[] args) {

        while (true) {
            System.out.println("угадай число етпа");
            System.out.println("A для начала выбери число до которого мне моно загадать тебе число");
            int her = arrow.nextInt();


            int rec = (int) (Math.random() * her);
            System.out.println("число лежит в интервале от 1 до " + her);
           for (int i =1 ; i <3 ; i ++ );
            Play_level(her, rec);
        }

    }

    private static void Play_level(int her, int rec) {
        while (true) {

            int g = arrow.nextInt();
            if (g == rec) {
                System.out.println("Ты угадал");
                score += 10;

                System.out.println("your score " + score);
                break;
            }

            if (g < rec) {
                System.out.println("плохой из тебя угадывалщик , бери больше");
                score--;
            } else {
                System.out.println("плохо плохо, число которое  загадал будет меньше");
                score--;


            }

        }
    }
}

