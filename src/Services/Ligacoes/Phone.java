package Services.Ligacoes;

public interface Phone {

    void realizarLigacao();
    void desligarLigacao();
    void selecionarContato(String contato);
    String contatoAtual();
    boolean getLigacao();
    String getContato();
}
