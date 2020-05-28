package DateQuestion;

import java.lang.reflect.Array;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DateParse {
    public static List<String> changeDateFormat(List<String> input) throws ParseException {

        List<String> dateList = new ArrayList<>();
        String inputPattern = "";
        String outputPattern = "yyyyMMdd";

        for(String i : input) {
            if (i.contains("-")) {
                inputPattern = "MM-dd-yyyy";
            } else if (i.contains("/")) {
                if(i.indexOf("/") == 2) {
                    inputPattern = "dd/MM/yyyy";
                } else if(i.indexOf("/") == 4) {
                    inputPattern = "yyyy/MM/dd";
                }
            } else {
                inputPattern = "";
            }

            if(!inputPattern.equals("")) {
                SimpleDateFormat inputFormat = new SimpleDateFormat(inputPattern);
                SimpleDateFormat outputFormat = new SimpleDateFormat(outputPattern);

                Date date = inputFormat.parse(i);
                dateList.add(outputFormat.format(date));
            }
        }

        return dateList;
    }

    public static void main(String[] args) throws ParseException {
        List<String> dateList = new ArrayList<>();
        dateList.add("2010/03/30");
        dateList.add("15/12/2016");
        dateList.add("11-15-2012");
        dateList.add("20130720");
        System.out.println(changeDateFormat(dateList));
    }
}
