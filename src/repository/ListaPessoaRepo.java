package repository;

import model.ListaPessoa;
import model.Pessoa;

public class ListaPessoaRepo {
    ListaPessoa pessoas = new ListaPessoa();

    public boolean cadastrar(Pessoa p){
        while (pessoas.getProximaListaPessoa() != null){
            pessoas = pessoas.getProximaListaPessoa();
        }

        pessoas.setProximaListaPessoa(new ListaPessoa(p, null));
        
        return true;
    }

    public boolean editar(Pessoa p){
      return true;
    }

    public boolean excluir(Pessoa p){
       return true;
    }

    public ListaPessoa listar(){
       return pessoas;
    }

    public ListaPessoa buscarPessoa(String cpf){
        return null;
    }
}
