import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListExamples {

    static void main(String[] args) {

        //----ArrayList----//
        List<String> Fruit = new ArrayList<>();

        Fruit.add("Orange");
        Fruit.add("Mango");
        Fruit.add("Banana");
        Fruit.add("Orange");
        Fruit.add(1, "Kiwi");

        System.out.println(Fruit);
        System.out.println(Fruit.get(0));
        System.out.println(Fruit.size());
        System.out.println(Fruit.contains("Banana"));
        System.out.println(Fruit.indexOf("Orange"));

        Fruit.remove("Mango");
        Fruit.remove(0);
        System.out.println(Fruit);

        for (String fruit : Fruit) {
            System.out.println(" " + fruit);
        }

        for (int i = 0; i < Fruit.size(); i++) {
            System.out.println(i + ": " + Fruit.get(i));
        }

        Collections.sort(Fruit);
        System.out.println(Fruit);

        Fruit.sort(Comparator.reverseOrder());
        System.out.println(Fruit);

        Fruit.sort(Comparator.comparingInt(String::length));
        System.out.println(Fruit);

    }
}
