package string_programme;

import java.util.LinkedHashMap;
import java.util.Map;

public class PrintFirstNonRepeatedCharacterInString {
    public static void main(String[] args) {
        //input=success -->u
        String str = "success";
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entr : map.entrySet()) {
            if (entr.getValue() == 1) {
                System.out.println(entr.getKey());
                break;
            }
        }
    }
}
