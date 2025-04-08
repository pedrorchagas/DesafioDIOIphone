package Services.Musicas;

public interface IPod {
    void tocarMusica();
    void pararMusica();
    void selecionarMusica(String musica);
    String getMusic();
    boolean getStateMusic();
}
