package lesson5;

public class homework {

    public static void main(String[] args) {
        System.out.println(recDegreeNumber(5, 4));
    }

  //  1. Написать программу по возведению числа в степень с помощью рекурсии.

    public static int recDegreeNumber(int number, int degree) {
        if (degree == 1) {
            return number;
        }
        return number * (recDegreeNumber(number, (degree - 1)));
    }

           // 2. Написать программу «Задача о рюкзаке» с помощью рекурсии.
}
