package CamachoClass.Aula04.Programa3;

import java.util.Arrays;

public class Programa3 {
    public static void main(String[] args) {
        String[] carsEven = {"Volvo", "BMW", "Ford", "Mazda"};
        String[] carsOdd = {"Volvo", "BMW", "Ford", "Mazda", "Fiat"};

        System.out.println(Arrays.toString(reverse(carsEven)));
        System.out.println(Arrays.toString(reverse(carsOdd)));
    }

    public static String[] reverse(String[] input) {
        int first = 0;
        int last = input.length - 1;
        int middle = (int) (input.length / 2.0);

        do {
            String temp = input[first];
            input[first] = input[last];
            input[last] = temp;

            first++;
            last--;
        } while (!(first == middle));

        return input;
    }
}
