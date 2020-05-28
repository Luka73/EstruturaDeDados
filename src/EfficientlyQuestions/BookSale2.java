package EfficientlyQuestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookSale2 {

    public static int nthLowestSelling(int[] sales, int n) {
        int count = 0;

        Map<Integer, Integer> integerMap = new HashMap<>();
        for(int i = 0; i < sales.length; i++) {
            if(integerMap.containsKey(sales[i])) {
                count = integerMap.get(sales[i]) + 1;
                integerMap.put(sales[i], count);
            } else {
                integerMap.put(sales[i], 1);
            }
        }

        List<Map.Entry<Integer, Integer>> mainList = new ArrayList<>();
        mainList.addAll(integerMap.entrySet());
        mainList.sort(Map.Entry.comparingByValue());

        return mainList.get(n-1).getKey();
    }

    public static void main(String[] args) {
        int x = nthLowestSelling(new int[] { 5, 4, 3, 2, 1, 5, 4, 3, 2, 5, 4, 3, 5, 4, 5 }, 2);
        System.out.println(x);
    }
}
