package model;

public class ListaPessoa {
    private Pessoa pessoa;
    private ListaPessoa proximaListaPessoa;
      
    public ListaPessoa() {
    }

    public ListaPessoa(Pessoa pessoa, ListaPessoa proximaListaPessoa) {
        this.pessoa = pessoa;
        this.proximaListaPessoa = proximaListaPessoa;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public ListaPessoa getProximaListaPessoa() {
        return proximaListaPessoa;
    }

    public void setProximaListaPessoa(ListaPessoa proximaListaPessoa) {
        this.proximaListaPessoa = proximaListaPessoa;
    }
 
}
