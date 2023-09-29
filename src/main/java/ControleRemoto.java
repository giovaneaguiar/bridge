public interface ControleRemoto {
    void ligar();

    void desligar();

    void ajustarCanal(int canal);

    String getStatus();
}