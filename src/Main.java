public class Main {
    public static void main(String[] args) {

        // zadanie 1

        for (int i = 0; i < 11; i++ ) {
            System.out.println(i);

        }

        System.out.println("------------");

        // zadanie 2

        for (int i = 10; i > 0; i-- ) {
            System.out.println(i);

        }

        System.out.println("------------");

        // zadanie 3

        for (int i = 0; i < 17; i = i + 2) {
            System.out.println(i);
        }

        System.out.println("------------");

        // zadanie 4

        for (int i = 10; i > -11; i--) {
            System.out.println(i);

        }

        System.out.println("------------");

        // zadanie 5


        for (int year = 1904; year <= 2024; year = year + 4) {
            System.out.println(year + " год является високосным");
        }

        System.out.println("------------");

        // zadanie 6

        for (int chislo = 7; chislo <= 98; chislo = chislo + 7) {
            System.out.println(chislo);
        }

        System.out.println("------------");

        // zadanie 7

        for (int nomer = 1; nomer <= 512; nomer = nomer * 2) {
            System.out.println(nomer);
        }

        System.out.println("------------");

        // zadanie 8 9
        int zp = 29000;
        int total = 0;

        for (int i = 1; i < 13; i++) {
            total = total + total/100;
            total = total + zp;
            System.out.println("Месяц "+ i + " Итого " + total);
        }

        System.out.println("------------");

        // zadanie 10

        int dva = 2;
        int tri = 0;

        for (int g = 1; g < 11; g++) {
            tri = tri + dva;
            System.out.println("2 * " + g + " = " + tri);
        }








    }
}