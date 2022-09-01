import org.junit.jupiter.api.Test;

import java.text.ParseException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestData {
    @Test
    void imprimirCorreto() throws ParseException {
        DataC dataUsuario = new DataC("20/04/2003");
        String dataConvertida = dataUsuario.dataEmString();
        assertEquals(dataConvertida, "20/04/2003");
    }

    @Test
     void criarData() throws ParseException {
        DataC dataUsuario = new DataC("20/04/2003");
        assertEquals(dataUsuario.dataEmString(), "20/04/2003");
    }

    @Test
    void criarDataVazia() throws ParseException {
        DataC dataUsuario = new DataC();
        assertEquals(dataUsuario.dataEmString(), "01/01/2022");
    }

}
