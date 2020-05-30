package CamachoClass.Aula01;

import java.text.DateFormat;
import java.util.Date;

public class Teste {
    public static void main(String[] args) {
        float f = 2.8f;
        double d = 2.4;

        double n1 =  Math.ceil(f);
        double n2 = Math.round(d);
        double n3 = Math.floor(f);

        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
    }
}
