public class ControleRemotoAvancado implements ControleRemoto {
    protected DispositivoEntretenimento dispositivo;

    public ControleRemotoAvancado(DispositivoEntretenimento dispositivo) {
        this.dispositivo = dispositivo;
    }

    @Override
    public void ligar() {
        dispositivo.ligar();
    }

    @Override
    public void desligar() {
        dispositivo.desligar();
    }

    @Override
    public void ajustarCanal(int canal) {
        dispositivo.ajustarCanal(canal);
    }

    public String getStatus() {
        return dispositivo.getStatus();
    }
}
