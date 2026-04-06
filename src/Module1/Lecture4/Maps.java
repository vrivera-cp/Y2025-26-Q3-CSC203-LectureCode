package Module1.Lecture4;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("mochi", 6);
        map.put("harvest", 5);
        map.put("pearl", 4);

        System.out.println(map);
        System.out.println(map.get("harvest"));

        System.out.println(map.getOrDefault("pearl", -1));

        map.remove("pearl");

        System.out.println(map.getOrDefault("pearl", -1));

        System.out.println(map.get("pearl")); // Error
    }
}
