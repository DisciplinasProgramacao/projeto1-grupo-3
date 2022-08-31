import java.util.*;
import java.text.*;

public class DataC {
    Date data;

    DataC(String inputUsuario) throws ParseException {
        init(inputUsuario);
    }

    DataC() throws ParseException {
        init("01/01/2022");
    }

    private void init(String inputUsuario) throws ParseException {
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        this.data = sdf1.parse(inputUsuario);
    }

    public String dataEmString() {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return dateFormat.format(this.data);
    }
}


