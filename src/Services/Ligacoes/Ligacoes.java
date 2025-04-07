package Services.Ligacoes;

public class Ligacoes implements Phone{

    private String contato;

    @Override
    public void realizarLigacao() {
        System.out.println("Realizando ligação com o número: " + contato);
    }

    @Override
    public void desligarLigacao() {
        System.out.println("Desligando chamada com o número: " + contato);
    }

    @Override
    public void selecionarContato(String contato) {
        this.contato = contato;
    }

    @Override
    public String contatoAtual() {
        return this.contato;
    }
}
