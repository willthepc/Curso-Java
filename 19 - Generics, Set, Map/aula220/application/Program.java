import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, Integer> map = new HashMap<>();
        String path = "c:\\temp\\in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();

            while (line != null) {
                String[] fields = line.split(",");
                String Name = fields[0];
                int votos = Integer.parseInt(fields[1]);

                Candidact cd = new Candidact(Name, votos);

                if (map.containsKey(cd.getName())) {
                    int totalAteAgora = map.get(cd.getName());
                    map.put(cd.getName(), totalAteAgora + cd.getVoto());
                } else {
                    map.put(cd.getName(), cd.getVoto());
                }

                line = br.readLine();


            }
            for (String key : map.keySet()) {
                System.out.println(key + ": " + map.get(key));
            }
            System.out.println("Total users: " + map.size());

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}
