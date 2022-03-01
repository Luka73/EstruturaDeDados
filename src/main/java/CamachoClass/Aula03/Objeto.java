package CamachoClass.Aula03;

import java.math.BigDecimal;

public class Objeto {
    String code1;
    String code2;
    BigDecimal resulting;
    BigDecimal valor1;
    BigDecimal valor2;

    public Objeto() {
    }

    public Objeto(String code1, String code2, BigDecimal resulting, BigDecimal valor1, BigDecimal valor2) {
        this.code1 = code1;
        this.code2 = code2;
        this.resulting = resulting;
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    public String getCode1() {
        return code1;
    }

    public void setCode1(String code1) {
        this.code1 = code1;
    }

    public String getCode2() {
        return code2;
    }

    public void setCode2(String code2) {
        this.code2 = code2;
    }

    public BigDecimal getResulting() {
        return resulting;
    }

    public void setResulting(BigDecimal resulting) {
        this.resulting = resulting;
    }

    public BigDecimal getValor1() {
        return valor1;
    }

    public void setValor1(BigDecimal valor1) {
        this.valor1 = valor1;
    }

    public BigDecimal getValor2() {
        return valor2;
    }

    public void setValor2(BigDecimal valor2) {
        this.valor2 = valor2;
    }

    public boolean amountExists(BigDecimal value) {
        return value != null && BigDecimal.ZERO.compareTo(value) < 0;
    }
}
