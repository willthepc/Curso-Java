import java.util.ArrayList;
import java.util.List;

public class App2 {
    public static void main(String[] args) {
        List<?> myObjs = new ArrayList<>();
        List<Integer> myNumbers = new ArrayList<>();
        myObjs = myNumbers; // erro de compilação


    }
}