package Services.Ligacoes;

public class Ligacoes implements Phone{

    private String contato = "";
    private Boolean ligacao = false;

    @Override
    public void realizarLigacao() {
        System.out.println("Realizando ligação com o número: " + contato);
        this.ligacao = true;
    }

    @Override
    public void desligarLigacao() {
        System.out.println("Desligando chamada com o número: " + contato);
        this.ligacao = false;
    }

    @Override
    public void selecionarContato(String contato) {
        this.contato = contato;
    }

    @Override
    public String contatoAtual() {
        return this.contato;
    }

    @Override
    public boolean getLigacao() {
        return ligacao;
    }

    @Override
    public String getContato() {
        return contato;
    }
}
