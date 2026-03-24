public class Scanner2 extends Device2 {
    public Scanner2(String serialNumber) {
        super(serialNumber);
    }

    @Override
    public void processDoc(String doc) {
        System.out.println("Scanner processing: " + doc);
    }

    public String scan() {
        return "Scanned content";
    }
}
