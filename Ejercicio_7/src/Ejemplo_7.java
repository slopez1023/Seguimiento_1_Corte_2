import java.util.ArrayList;
import java.util.List;

public class Ejemplo_7 {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();
        l1.add(4,5);
        l1.add(2,3);
        System.out.println(l1);

        List<Integer> l2 = new ArrayList<>();
        l2.add(7);
        l2.add(6);
        l2.add(8);
        l2.addAll(7,l2);
        System.out.println(l1);

        l1.remove(6);
        System.out.println(l1);

        System.out.println(l1.get(8));

        l1.set(1,9);
        System.out.println(l1);
    }
}
