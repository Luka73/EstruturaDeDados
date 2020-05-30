package DateQuestion;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class DateTransform {

    public static List<String> formatStrings = Arrays.asList("yyyy/MM/dd", "dd/MM/yyyy", "MM-dd-yyyy");

    public static Date tryParse(String date)
    {
        for (String formatString : formatStrings)
        {
            try
            {
                return new SimpleDateFormat(formatString).parse(date);
            }
            catch (ParseException e) {}
        }

        return null;
    }

    public static String changeDateFormat(String date) throws ParseException {
        String pattern = "yyyyMMdd";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        Date data = sdf.parse(date);
        String formatedDate = sdf.format(data);

        return formatedDate;
    }

    public static void main(String[] args) throws ParseException {
        System.out.println(changeDateFormat("2020-02-03"));
    }
}
