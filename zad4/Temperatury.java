import java.util.Arrays;

public class Temperatury {
    public static void main(String[] args) {
        int[] temperatury = {12, 15, 9, 18, 21, 17, 14}; //[cite: 1]
        System.out.println("Początkowa tablica: " + Arrays.toString(temperatury));
        int min = temperatury[0];
        int max = temperatury[0];
        int suma = 0;

        for (int t : temperatury) {
            if (t < min) {
                min = t;
            }
            if (t > max) {
                max = t;
            }
            suma += t;
        }

        double srednia = (double) suma / temperatury.length;

        System.out.println("Najniższa temperatura: " + min);
        System.out.println("Najwyższa temperatura: " + max);
        System.out.printf("Średnia temperatura: %.1f\n", srednia); //[cite: 1]

        int[] kopia = temperatury.clone();
        Arrays.sort(kopia); //[cite: 1]
        System.out.println("Posortowana kopia: " + Arrays.toString(kopia));

        int[] trzyNajwyzsze = Arrays.copyOfRange(kopia, kopia.length - 3, kopia.length);
        System.out.println("Trzy najwyższe temperatury: " + Arrays.toString(trzyNajwyzsze));
        System.out.println("Oryginalna tablica na końcu: " + Arrays.toString(temperatury));
    }
}