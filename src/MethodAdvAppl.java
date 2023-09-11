
/*Задача 1

В классе MethodAdvAppl создать метод принимающий радиус и вычисляющий площадь окружности.
В методе main проверить работу метода вызвав его несколько раз. Результат вывести в консоль.
 */
public class MethodAdvAppl {
    public static void main(String[] args) {
        double result = circleArea(15);
        printResult(result);
        result = circleArea(105);
        printResult(result);
        result = circleArea(78);
        printResult(result);

    }

    public static double circleArea(double radius) {
        return pi() * radius * radius;
    }

    private static double pi() {
        return 3.1415926;
    }

    public static void printResult(double a) {
        System.out.print("Result = ");
        System.out.println(a);
    }
}
