import static org.junit.Assert.assertEquals;
import org.junit.Test;
/**
 * @author Pedro Javier Marroquín Abrego
 * @version 1.0
 * @since 19/01/2022
 * Prueba unitaria para verificar que se guarde exitosamente
 * una estación de radio
 */
public class SaveStationTest {
    @Test
    /**
     * 
     */
    public void TestSaveStation()
    {
        IRadio RadioPrueba = new IRadio(true, "FM",530, 87.9, 530, 530, 530, 530, 530, 530, 87.9, 87.9, 87.9, 87.9, 87.9, 87.9);
        RadioPrueba.saveStation(2, 102.5);
        Double obtenido = RadioPrueba.getEmisora_Favorita8();
        Double esperado = 102.5;
        assertEquals(esperado, obtenido);
    }
}
