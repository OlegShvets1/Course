package Lesson_8.Task_7;
/*7. In the Example class, implement a couple of equals / hashCode methods in accordance with the rules for implementing
these methods (check details with your favorite search engine).
Both the first and last strings should participate in the comparison using the equals method and the hashcode calculation.

public class Example {
    private final String first, last;

    public Example(String first, String last) {
        this.first = first;
        this.last = last;
    }

    @Override
    public boolean equals(Object o) {
        return false;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    public static void main(String[] args) {
        Set<Example> s = new HashSet<>();
        s.add(new Example("Donald", "Duck"));
        System.out.println(s.contains(new Example("Donald", "Duck")));
    }
}*/

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Example {

    private final String first, last;
    private int hash;

    public Example(String first, String last) {
        this.first = first;
        this.last = last;

        hash = 31 * hash + (first != null ? first.hashCode() : 0);
        hash = 31 * hash + (last != null ? last.hashCode() : 0);
    }

    @Override
    public boolean equals(Object o) {
        if (hash != o.hashCode()){return  false;}
        if (this == o) return true;
        if (!(o instanceof Example)) return false;
        if (o == null || getClass() != o.getClass()) return false;
        Example example = (Example) o;
        return first.equals(example.first) && last.equals(example.last);
    }

    @Override
    public int hashCode() {
        return hash;
    }

    public static void main(String[] args) {
        Set<Example> s = new HashSet<>();
        s.add(new Example("Donald", "Duck"));
        System.out.println(s.contains(new Example("Donald", "Duck")));
        System.out.println(s.contains(new Example("Donal", "Duck")));
    }
}

