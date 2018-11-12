import org.junit.Assert;
import org.junit.Test;

public class FechaTest {
    @Test
    public void testFecha(){
        Fechas fechas = new Fechas('28/11/2018');
        fechas.validarFecha("28/11/2018");
        String actual = ;
        String expect = ("28/11/2018");
        Assert.assertEquals(expect,actual);
    }
}
