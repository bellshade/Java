package learn.intermediate.innerClass;

public class DemoInnerClass {
    private class DalamClass {
        public void printText() {
            System.out.println("Ini Merupakan Contoh dari Inner Class pada program java");
        }
    }

    public static void main(String[] args) {
        DemoInnerClass ContohLuarClass = new DemoInnerClass();
        DemoInnerClass.DalamClass LuarClass = ContohLuarClass.new DalamClass();
        LuarClass.printText();
    }
}