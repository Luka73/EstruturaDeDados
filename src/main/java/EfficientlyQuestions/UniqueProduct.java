package EfficientlyQuestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UniqueProduct {
    public static String firstUniqueProduct(String[] products) {
        int count;
        for(int i = 0; i < products.length; i++) {
            count = 0;
            for(int j = 0; j < products.length; j++) {
                if(products[i] == products[j]) {
                    count++;
                }
            }
            if(count == 1) {
                return products[i];
            }
        }

        return "No unique elements";
    }

    public static String newFirstUniqueProduct(String[] products) {
        Map<String, Integer> stringsCounts = new HashMap<>();
        for (String product : products) {
            if (stringsCounts.containsKey(product)) {
                int count = stringsCounts.get(product) + 1;
                stringsCounts.put(product, count);
            }
            else {
                stringsCounts.put(product, 1);
            }
        }

        for (Map.Entry<String, Integer> entry : stringsCounts.entrySet()) {
            if (entry.getValue() == 1)
                return entry.getKey();
        }

        return "No unique elements";

    }

    public static void main(String[] args) {
        System.out.println(firstUniqueProduct(new String[] { "Apple", "Apple", "Apple", "Apple"  }));
    }
}
