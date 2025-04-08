package Services.Musicas;

public class Musicas implements IPod{

    private boolean stateMusic = false;
    private String musica;

    @Override
    public void tocarMusica() {
        System.out.println("Tocando a musica: " + musica);
        this.stateMusic = true;
    }

    @Override
    public void pararMusica() {
        System.out.println("Parando a musica: " + musica);
        this.stateMusic = false;
    }

    @Override
    public void selecionarMusica(String musica) {
        this.musica = musica;
    }

    @Override
    public String getMusic() {
        return this.musica;
    }

    @Override
    public boolean getStateMusic() {
        return this.stateMusic;
    }


}
