package HelloWorld;

import java.util.HashSet;

public class hashset {
    public static void main(String[] args) {
        HashSet<String> tags = new HashSet<>();
        tags.add("java");
        tags.add("collections");
        tags.add("execeptions");

        for(String tag : tags)

        System.out.println(tags);
    }
}


