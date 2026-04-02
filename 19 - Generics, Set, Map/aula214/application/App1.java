import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class App1 {
    public static void main(String[] args) {
        Set<Integer> a = new TreeSet<>(Arrays.asList(0,2,3,4,5,6,7));
        Set<Integer> b = new TreeSet<>(Arrays.asList(5,6,7,8,12));

        //unior
        Set<Integer> c = new TreeSet<>(a);
        c.addAll(b);
        System.out.println(c);

        //intersection
        Set<Integer> d = new TreeSet<>(a);
        d.retainAll(b);
        System.out.println(d);

        //difference
        Set<Integer> e = new TreeSet<>(a);
        e.removeAll(b);
        System.out.println(e);
    }
}






















