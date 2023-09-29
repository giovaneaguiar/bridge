public class TV implements DispositivoEntretenimento {

    private boolean ligada = false;
    private int canal = 0;

    @Override
    public void ligar() {
    }

    @Override
    public void desligar() {
    }

    @Override
    public void ajustarCanal(int canal) {
    }

    public String getStatus() {
        if (ligada) {
            return "TV está ligada, canal atual: " + canal;
        } else {
            return "TV está desligada";
        }
    }
}
