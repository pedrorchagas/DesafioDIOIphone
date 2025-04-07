package Services.Internet;

public class Internet implements Browser{

    int paginasAberta = 0;

    @Override
    public void novaPagina() {
        System.out.println("Nova pagina de internet");
        this.paginasAberta = this.paginasAberta + 1;
    }

    @Override
    public void fecharPagina() {
        System.out.println("Fechando página de internet, paginas abertas: "+ paginasAberta);
        this.paginasAberta = this.paginasAberta - 1;
    }

    @Override
    public void recarregarPagina() {
        System.out.println("Recarregando páginas.");
    }
}
