import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by sergei on 24.03.2015.
 */
public class SortedReverse {

    public static void main(String[] args) {
        Comparator<Integer> reverse =  Collections.reverseOrder();
        Map<Integer, Integer> map = new TreeMap<Integer, Integer>(reverse);

        int mass[] = new int[10];

        for (int i = 0; i < mass.length; i++) {
            mass[i] = (int) (Math.random() * 10);
        }
        System.out.println("Current massive ");
        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i] + " ");
            if (map.isEmpty()) {
                map.put(mass[i], 1);
            } else if (map.containsKey(mass[i])) {
                map.put(mass[i], map.get(mass[i]) + 1);
            } else {
                map.put(mass[i], 1);
            }
        }
        System.out.println("\n" + (map));

    }

}
