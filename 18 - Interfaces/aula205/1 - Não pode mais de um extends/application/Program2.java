public abstract class Program2 {
    public static void main(String[] args) {
        Printer2 p = new Printer2("1080");
        p.processDoc("My Letter");
        p.print("My Letter");

        Scanner2 s = new Scanner2("2003");
        s.processDoc("My email");
        System.out.println("Scan result: " + s.scan());
    }
}
