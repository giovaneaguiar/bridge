public class Radio implements DispositivoEntretenimento {

    private boolean ligado = false;
    private double estacao = 0.0;
    private boolean mudo = false;

    @Override
    public void ligar() {
        ligado = true;
    }

    @Override
    public void desligar() {
        ligado = false;
    }

    @Override
    public void ajustarCanal(int canal) {
        if (ligado) {
            estacao = canal;
        }
    }

    public boolean isLigado() {
        return ligado;
    }

    public double getEstacao() {
        return estacao;
    }

    public boolean isMudo() {
        return mudo;
    }

    @Override
    public String getStatus() {
        if (ligado) {
            String status = "Rádio está ligado, estação atual: " + estacao;
            if (mudo) {
                status += " (Mudo)";
            }
            return status;
        } else {
            return "Rádio está desligado";
        }
    }

    public void ligarMudo() {
        mudo = true;
    }

    public void desligarMudo() {
        mudo = false;
    }

}
