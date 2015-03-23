import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by sergei on 23.03.2015.
 */
public class CounterWord {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        System.out.println("Введите предложение");
        Scanner scanner = new Scanner(System.in);
        String s;
        s = scanner.nextLine();
        System.out.println(s);
        String[] parts = s.split(" ");
        for (int i = 0; i < parts.length; i++) {
            String tmp = parts[i];
            if (map.isEmpty()) {
                map.put(tmp, i + 1);
                continue;
            }
            if (map.containsKey(tmp)) {
                map.put(parts[i], map.get(parts[i]) + 1);
            } else {
                map.put(parts[i], 1);
            }
        }
        System.out.println(map);
    }
}

