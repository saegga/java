import java.util.Map;
import java.util.TreeMap;

/**
 * Created by sergei on 24.03.2015.
 */

//задание 0-2
public class TreeMaping {

    public static void main(String[] args) {
        Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
        int mass[] = new int[1000];

        for (int i = 0; i < mass.length; i++) {
            mass[i] = (int) (Math.random() * 25);
        }
        System.out.println("Current massive ");
        int start = (int) System.currentTimeMillis();
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
        int end = (int) System.currentTimeMillis();
        System.out.print("\nTreemap");
        for (Map.Entry<Integer, Integer> integerEntry : map.entrySet()) {
            int value = integerEntry.getValue();
            for (int i = 0; i < value; i++) {
                if (i % 20 == 0) {
                    System.out.print("\n");
                }
                System.out.print(integerEntry.getKey() + " ");
            }
        }
        System.out.println("\nTime :" + (end - start));

        System.out.println("Метод пузырька ");
        int start1 = (int) System.currentTimeMillis();
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass.length - 1; j++) {
                if (mass[j] > mass[j + 1]) {
                    int t = mass[j + 1];
                    mass[j + 1] = mass[j];
                    mass[j] = t;
                }
            }
        }
        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i] + " ");
        }
        int end1 = (int) System.currentTimeMillis();
        System.out.println("\nTime :" + (end1 - start1));


    }

}


