import java.util.ArrayList;

/**
 * Created by sergei on 24.03.2015.
 */
//Задание 0-3
public class SimpleNum {
    public static void main(String[] args) {
           public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(2);
        for (int i = 2; i < 1000; i++) {
            double temp = 1.0;
            for (Integer integer : list) {
                temp *= i % integer;
            }
            if (temp != 0) {
                list.add(i);
            }
        }
        System.out.println(list);
    }
}


