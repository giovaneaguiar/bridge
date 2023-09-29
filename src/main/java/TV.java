public class TV implements DispositivoEntretenimento {

    private boolean ligada = false;
    private int canal = 0;

    public boolean isLigada() {
        return ligada;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    @Override
    public void ligar() {
        ligada = true;

    }

    @Override
    public void desligar() {
        ligada = false;
    }

    @Override

    public void ajustarCanal(int canal) {
        if (ligada) {
            this.canal = canal;
        }
    }

    public String getStatus() {
        if (ligada) {
            return "TV está ligada, canal atual: " + canal;
        } else {
            return "TV está desligada";
        }
    }
}
