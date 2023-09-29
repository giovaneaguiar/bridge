import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TVTest {

    @Test
    public void testTVLigada() {
        TV tv = new TV();
        tv.ligar();
        assertEquals(true, tv.isLigada());
    }

    @Test
    public void testTVDesligada() {
        TV tv = new TV();
        tv.desligar();
        assertEquals(false, tv.isLigada());
    }

    @Test
    public void testAjustarCanal() {
        TV tv = new TV();
        tv.ligar();
        tv.ajustarCanal(5);
        assertEquals(5, tv.getCanal());
    }

    @Test
    public void testStatusTVDesligada() {
        TV tv = new TV();
        assertEquals(true, tv.getStatus().contains("desligada"));
    }

    @Test
    public void testStatusTVLigada() {
        TV tv = new TV();
        tv.ligar();
        assertEquals(true, tv.getStatus().contains("ligada"));
    }
}
