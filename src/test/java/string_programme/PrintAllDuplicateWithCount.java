package string_programme;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class PrintAllDuplicateWithCount {
    public static void main(String[] args) {
        //programming  o/p: g → 2 ,r → 2, m → 2

        String str = "programming";
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " -> " + entry.getValue());
            }
        }
    }
}
