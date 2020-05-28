package CamachoClass.Aula01;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class FormatacaoDeDatas {

    public static void main(String[] args) throws ParseException {
        Locale loc = new Locale("fr", "FR");
        DateFormat dt = DateFormat.getDateInstance(DateFormat.DEFAULT, loc);
        String date = dt.format(new Date());
        System.out.println(date);

        String pattern = "MM-dd-yyyy";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern); //pode receber mais um parametro, o Locale.

        String date2 = sdf.format(new Date());
        System.out.println(date2);

        Date date3 = sdf.parse("12-01-2018");
        System.out.println(date3);
    }

}
