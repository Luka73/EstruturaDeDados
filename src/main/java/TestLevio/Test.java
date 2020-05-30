package TestLevio;

public class Test extends MaeTest implements ITeste{

    public static void testeQ() {
        System.out.println("Methodo filho");
    }

    public static void main(String[] args) {
        ITeste.testeQ();
    }
}
