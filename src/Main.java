// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String dz3_1 = "ДЗ 3.1 -->";
        String dz3_2 = "ДЗ 3.2 -->";
        String dz3_3 = "ДЗ 3.3 -->";

        // ДЗ 3.1
        System.out.println(dz3_1);
        String flowersName = "Roses";
        int flowersNumber = 101;
        System.out.println("Значение переменной String: " + flowersName);
        System.out.println("Значение переменной Int: " + flowersNumber);

        int a = 15, b = 10;
        System.out.println("Сумма переменных a и b: " + (a + b));

        int c = a + b;
        System.out.println("Значение переменной c: " + c);

        float x = 2.5f, y = 5.8f, z = 3.4f;
        System.out.println("Значение переменных x, y, z: " + (x + y + z));

        int i, j, k, l;
        i = j = k = l = 10;
        System.out.println("Значение переменных i, j, k, l: " + (i + j + k + l));

        // ДЗ 3.2
        System.out.println(dz3_2);
        double d;
        d = x;
        System.out.println("Значение переменной d: " + d);

        final double PI = 3.14;
        final double g = 9.80665;
        final String myCity = "Kokshetau";

        System.out.println("Значение константы PI: " + PI);
        System.out.println("Значение константы g: " + g);
        System.out.println("Значение константы myCity: " + myCity);

        // ДЗ 3.3
        System.out.println(dz3_3);
        int h = 1000000;
        long p = h;
        System.out.println("Пример расширяющего приведения: " + p);

        double f = 5.78;
        int r = (int)f;
        System.out.println("Пример сужающего приведения: " + r);


    }
}