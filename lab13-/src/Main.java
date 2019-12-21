import java.util.Date;

public class Main {

    public static String addBeauty(int x) {
        if (x < 10)
            return "0" + x;
        else
            return Integer.toString(x);
    }

    public static void main(String[] args) {
        Date now = new Date();
        String day, month, year, hour, minutes;
        day = addBeauty(now.getDay());
        month = addBeauty(now.getMonth());
        year = Integer.toString(now.getYear() + 1900);
        hour = addBeauty(now.getHours());
        minutes = addBeauty(now.getMinutes());

        System.out.println("Ivanov Task: 12.11.2019 12:00 - " + day + "." + month + "." + year + " " + hour + ":" + minutes);
        System.out.println();



    }
}
