import org.junit.jupiter.api.Test;
import org.testng.Assert;
import java.text.ParseException;


public class TestDada {
    @Test
    void imprimirCorreto() throws ParseException {
        DataC dataUsuario = new DataC("20/04/2003");
        String dataConvertida = dataUsuario.dataEmString();
        Assert.assertEquals(dataConvertida, "20/04/2003");
    }

    @Test
    void criarData() throws ParseException {
        DataC dataUsuario = new DataC("20/04/2003");
        Assert.assertEquals(dataUsuario.dataEmString(), "20/04/2003");
    }

    @Test
    void criarDataVazia() throws ParseException {
        DataC dataUsuario = new DataC();
        Assert.assertEquals(dataUsuario.dataEmString(), "01/01/2022");
    }

}
