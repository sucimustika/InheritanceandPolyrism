public class Main {
    public static void main(String[] args) {
        Bentuk b = new Bentuk("abu");
        b.infoPrint();

        BujurSangkar bs = new BujurSangkar(10, "kuning");
        bs.infoPrint();

        Lingkaran l = new Lingkaran(14, "ungu");
        l.infoPrint();

        Silinder s = new Silinder(20, 14, "pink");
        s.infoPrint();
    }
}