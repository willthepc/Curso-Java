public class condicionais {
    public static void main(String[] args){
        byte b = 100;
        short s = 10000;
        int i = 100000;
        long l = 100000L;
        float f = 10.5f;
        double d = 20.5;
        char c = 'A';
        String str = "Fernanda";
        boolean bool = true;

        // .isBlank() -> indica se o valor ta vazio

        if (str == "Feranda") {
            System.out.println("Verdadeiro.");
        }
        else if (str == "Fernanda") {
            System.out.println("Verdadeiro");
        }
        else {
            System.out.println("False.");
        }

    }
}
