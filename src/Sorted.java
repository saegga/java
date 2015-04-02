import java.util.Arrays;
import java.util.TreeMap;

/**
 * Created by sergei on 23.03.2015.
 */
public class Sorted {


    public static void main(String[] args) {
        int mass[] = new int[10000];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = (int) (Math.random() * 50);
        }
        TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
        for (int i = 0; i < mass.length; i++) {
            map.put(i, mass[i]);
        }
        int start1 = (int) System.currentTimeMillis();
        for (int k = 0; k < map.size(); k++) {
            int min = k;
            for (int i = k + 1; i < map.size(); i++) {
                if (map.get(i) < map.get(min)) {
                    min = i;
                    int t = map.get(min);
                    map.replace(min, map.get(k));
                    map.replace(k, t);
                    min = k;
                }
            }
        }
        int end1 = (int) System.currentTimeMillis();
        System.out.println("Сортированный TreeMap");
        System.out.println(map);
        System.out.println("Исходный массив");
        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i] + " ");
        }

        System.out.println("\nTimes in miles " + (end1 - start1));
        int start2 = (int) System.currentTimeMillis();
        Arrays.sort(mass);
        int end2 = (int) System.currentTimeMillis();
        System.out.println("Сортировка массива методом sort");
        System.out.println(Arrays.toString(mass));
        System.out.println("Times in miles " + (end2 - start2));

        for (int i = 0; i < mass.length; i++) {
            mass[i] = (int) (Math.random() * 50);
        }
        int start3 = (int) System.currentTimeMillis();
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass.length - 1; j++) {
                if (mass[j] > mass[j + 1]) {
                    int t = mass[j + 1];
                    mass[j + 1] = mass[j];
                    mass[j] = t;
                }
            }
        }
        int end3 = (int) System.currentTimeMillis();
        System.out.println("Сортированный массив метод пузырька");
        System.out.println(Arrays.toString(mass));
        System.out.println("Times in miles " + (end3 - start3));
    }

}



