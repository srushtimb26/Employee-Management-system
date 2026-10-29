package HelloWorld;

import java.util.ArrayList;

public class RemoveDemo {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Asha");
        names.add("Rahul");
        names.add("Meera");

        names.remove(1);       // removes by index
        names.remove("Meera"); // removes by value

        System.out.println(names);
    }
}