package intermediate.Encapsulation;

public class Main {
    public static void main(String[] args) {
        ContohEncapsulation object = new ContohEncapsulation();
        object.GantiBentuk("Minibus");
        object.GantiMerk("Isuzu");
        System.out.println("Bentuk Mobil adalah : " + object.getBentuk());
        System.out.println("Merk Mobil adalah : " + object.getMerk());
    }
}