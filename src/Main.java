import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < intList.size(); i++) {
            if (0 < intList.get(i) && intList.get(i) % 2 == 0 ) {
                list.add(intList.get(i));
            }
        }

        Collections.sort(list);
        System.out.println(list);
    }
}
