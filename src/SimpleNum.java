import java.util.ArrayList;

/**
 * Created by sergei on 24.03.2015.
 */
//Задание 0-3
public class SimpleNum {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int[] mass;
        for (int i = 2; i < 100; i++) {
          int k = 0;
          int  count = 0;
            if (list.isEmpty()) {
                list.add(2);
            } else {
                mass = new int[list.size()];
                for (Integer integer : list) {
                    mass[k] = i % integer;
                    k++;

                }
                    for (int mas : mass) {
                        if (mas == 0) {
                            count++;
                        }
                    }
                if (count == 0) {
                    list.add(i);

                }

            }
        }
        System.out.println(list);
    }
}


