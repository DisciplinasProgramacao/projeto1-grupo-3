import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws ParseException {
        LocalDate l = LocalDate.of(2022, 2, 28);

        LocalDate a = l.plusDays(1);

        System.out.print(a);

    }
}
