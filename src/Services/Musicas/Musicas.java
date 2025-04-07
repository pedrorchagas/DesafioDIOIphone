package Services.Musicas;

public class Musicas implements IPod{

    private String musica;

    @Override
    public void tocarMusica() {
        System.out.println("Tocando a musica: " + musica);
    }

    @Override
    public void pararMusica() {
        System.out.println("Parando a musica: " + musica);
    }

    @Override
    public void selecionarMusica(String musica) {
        this.musica = musica;
    }
}
