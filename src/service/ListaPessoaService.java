package service;

import model.ListaPessoa;
import model.Pessoa;
import repository.ListaPessoaRepo;

public class ListaPessoaService {
    ListaPessoaRepo pessoas = new ListaPessoaRepo();

    public boolean cadastrar(Pessoa p){
        return pessoas.cadastrar(p);
    }

    public boolean editar(Pessoa p){
        return pessoas.editar(p);
    }

    public boolean excluir(Pessoa p){
        return pessoas.excluir(p);
    }

    public ListaPessoa buscarPessoa(String cpf){
        return pessoas.buscarPessoa(cpf);
    }

    public ListaPessoa listar(){
        return pessoas.listar();
    }
}
