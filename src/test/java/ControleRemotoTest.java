import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ControleRemotoTest {

    @Test
    public void testControleRemotoBasicoLigar() {
        TV tv = new TV();
        ControleRemoto controleBasico = new ControleRemotoBasico(tv);

        controleBasico.ligar();
        assertEquals(true, tv.isLigada());
    }

    @Test
    public void testControleRemotoBasicoDesligar() {
        TV tv = new TV();
        ControleRemoto controleBasico = new ControleRemotoBasico(tv);

        controleBasico.desligar();
        assertEquals(false, tv.isLigada());
    }

    @Test
    public void testControleRemotoAvancadoLigar() {
        Radio radio = new Radio();
        ControleRemoto controleAvancado = new ControleRemotoAvancado(radio);

        controleAvancado.ligar();
        assertEquals(true, radio.isLigado());
    }

    @Test
    public void testControleRemotoAvancadoDesligar() {
        Radio radio = new Radio();
        ControleRemoto controleAvancado = new ControleRemotoAvancado(radio);

        controleAvancado.desligar();
        assertEquals(false, radio.isLigado());
    }
}
