package CamachoClass.Aula04.Programa3;

import java.util.Arrays;

public class Programa3 {
    public static void main(String[] args) {
        String[] carsEven = {"Volvo", "BMW", "Ford", "Mazda"};
        String[] carsOdd = {"Volvo", "BMW", "Ford", "Mazda", "Fiat"};

        System.out.println(Arrays.toString(reverse(carsEven)));
        System.out.println(Arrays.toString(reverse(carsOdd)));
    }

    public static Object[] reverse(Object[] input) {
        int i = 0;
        int j = input.length - 1;

        do {
            Object temp = input[i];
            input[i] = input[j];
            input[j] = temp;

            i++;
            j--;
        } while (i < j);

        return input;
    }
}
