/*
 * This Java source file was generated by the Gradle 'init' task.
 */
import org.junit.Assert;
import org.junit.Test;


public class SeleccionTest {
    @Test
    public void clienteTest_concentracion() {
        SeleccionFutbol seleccionFutbol = new SeleccionFutbol(101,"Rodrigo","Sanchez",25);
        boolean actual = seleccionFutbol.concentrarse(true);
        boolean expect = true;
        Assert.assertEquals(expect,actual);
    }

    @Test
    public void clienteTest_viajar(){
        SeleccionFutbol seleccionFutbol = new SeleccionFutbol(101,"Rodrigo","Sanchez",25);
        boolean actual = seleccionFutbol.viajar(true);
        boolean expect = true;
        Assert.assertEquals(expect,actual);
    }

    @Test
    public  void  cleinteTest_msgEntrenamiento(){
        SeleccionFutbol seleccionFutbol = new SeleccionFutbol(101,"Rodrigo","Sanchez",25);
        boolean actual = seleccionFutbol.MsgEntrenamiento(true);
        boolean expect = true;
        Assert.assertEquals(expect,actual);
    }

}