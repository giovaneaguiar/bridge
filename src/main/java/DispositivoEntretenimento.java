public interface DispositivoEntretenimento {
    void ligar();

    void desligar();

    void ajustarCanal(int canal);

    String getStatus();
}
