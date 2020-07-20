package JUnitMockito;

public class Calculator {

    CalculatorService cs;

    public Calculator(CalculatorService cs) {
        this.cs = cs;
    }

    public int perform(int n1, int n2) {
        return cs.add(n1, n2) * n1;
    }
}
