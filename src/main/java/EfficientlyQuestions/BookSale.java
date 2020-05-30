package EfficientlyQuestions;

import java.util.HashMap;
import java.util.Map;

public class BookSale {

    public static void nthLowestSelling(int[] sales) {
        int current = 0;
        int count = 0;
        Map<Integer, Integer> integerMap = new HashMap<>(); //Integer1 -> chave / Integer2 -> valor (quantidade de ocorrencias)

        for(int i = 0; i < sales.length; i++) {
            current = sales[i];
            if(integerMap.containsKey(current)) {
                count = integerMap.get(current) + 1; //Retorna o valor dessa chave e soma mais 1
                integerMap.put(current, count);
            } else {
                integerMap.put(current, 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : integerMap.entrySet()) {
            System.out.println("O número " + entry.getKey() + " ocorre " + entry.getValue() + " vezes.");
        }
    }

    public static void main(String[] args) {
        nthLowestSelling(new int[] { 5, 4, 3, 2, 1, 5, 4, 3, 2, 5, 4, 3, 5, 4, 5 });
    }
}
