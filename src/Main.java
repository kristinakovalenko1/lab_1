public class Main {
    /**
     * Первое задание, вариант 27
     * Дано вещественное число x. Вычислить x - x^3/3! + x^5/5! -x^7/7! +x^9/9!-x^11/11!+x^13/13!
     */
    public static int getFactorial(int f) {
        if (f <= 1) {
            return 1;
        } else {
            return f * getFactorial(f - 1);
        }
    }

    public static void task1() {

        double x = 2;
        double res = 0;
        for (int i = 0; i <= 12; i++) {
            if (i % 2 == 0) {
                res += Math.pow((x), (i + 1)) / (getFactorial(i + 1));
            }
        }
        System.out.println("\nResult is " + res);
    }

    /**
     * Второе задание, вариант 52
     * Найти сумму –1^2 + 2^2 – 3^2 + 4^2 + ... + 10^2. Условную инструкцию не использовать.
     */

    public static void task2() {
        int[] arrSigns = {-1, 1, -1, 1, -1, 1, -1, 1, -1, 1};
        int res = 0;
        for (int i = 0; i < 10; i++) {
            res += arrSigns[i] * (i + 1) * (i + 1);
        }
        System.out.println("\nResult is " + res);
    }

    /**
     * Третье задание, вариант 77
     * Около стены наклонно стоит палка длиной 4,5 м.
     * Нижний конец находится на расстоянии 3 м от стены.
     * Он начинает скользить в плоскости, перпендикулярной стене.
     * Определить значения угла между палкой и полом (в градусах) через каждые 0,2 м с момента начала скольжения до падения палки.
     */
    public static void task3() {

        double len = 4.5;
        double len2 = 3;
        while (len2 <= len) {
            System.out.println("\nThe cos of angle is " + Math.cos(len2 / len) + ". The angle is " + len2 / len + " radian " + (90 - (len2 / len) * (180 / Math.PI)) + " deg.");
            len2 = len2 + 0.2;
        }
    }

    /**
     * Четвёртое задание, вариант 102
     * В области N районов. Известны количество жителей (в тыс. чел.) и площадь (в км2) каждого района. Определить среднюю плотность населения по области в целом.
     */

    public static void task4() {
        int N = 10;
        double densityPopulation;
        double allCitizens = 0;
        double allSquare = 0;
        for (int i = 0; i < N; i++) {
            int numberOfCitizens = (int) (Math.random() * (110001)) + 10000;
            System.out.println("\nCitizens in district " + numberOfCitizens);
            allCitizens += numberOfCitizens;
            int squareOfDistrict = (int) (Math.random() * (105001)) + 5000;
            System.out.println("\nSquare of district " + squareOfDistrict);
            allSquare += squareOfDistrict;
        }
        densityPopulation = allCitizens / allSquare;
        System.out.println("\nThe density is " + densityPopulation + " person / km^2");
    }

    /**
     * Пятое задание, вариант 127
     * Задача Ал-Хорезми (780–850 гг.). Разложить число 10 на 2 слагаемых, сумма квадратов которых равна 58.
     */

    public static void task5() {

        for (int i = 0; i < 6; i++) {
            if (((10 - i) * (10 - i) + (i * i)) == 58) {
                System.out.println("\nThere are two numbers: first " + i + ", second " + (10 - i) + ".");
                break;
            }
        }
    }

    public static void main(String[] args) {
        System.out.print("\nTask 27");
        task1();
        System.out.print("\nTask 52");
        task2();
        System.out.print("\nTask 77");
        task3();
        System.out.print("\nTask 102");
        task4();
        System.out.print("\nTask 127");
        task5();
    }
}