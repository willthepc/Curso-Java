public class Printer2 extends Device2 {
    public Printer2(String serialNumber) {
        super(serialNumber);
    }

    @Override
    public void processDoc(String doc) {
        System.out.println("Printer processing: " + doc);
    }

    public void print(String doc) {
        System.out.println("Printing: " + doc);
    }
}
