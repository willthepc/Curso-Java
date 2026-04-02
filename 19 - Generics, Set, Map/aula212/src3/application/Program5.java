import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program5 {
    public static void main(String[] args) {
        List<Integer> myInts = Arrays.asList(1,2,3,4);
        List<Double> myDoubles = Arrays.asList(3.14,6.25);
        List<Object> myObjs = new ArrayList<Object>();

        copy(myInts, myObjs);
        imprimir(myObjs);
        copy(myDoubles, myObjs);
        imprimir(myObjs);
    }

    public static void copy(List<? extends Number> source, List<? super Number> destiny) {
        for (Number number : source) {
            destiny.add(number);
        }
    }

    public static void imprimir(List<?> list) {
        for (Object obj : list) {
            System.out.print(obj + " ");
        }

        System.out.println();
    }


}














