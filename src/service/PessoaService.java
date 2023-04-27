package service;

import java.util.ArrayList;

import model.Pessoa;
import repository.PessoaRepo;

public class PessoaService {
    PessoaRepo pessoas = new PessoaRepo();

    public boolean cadastrar(Pessoa p){
        return pessoas.cadastrar(p);
    }

    public boolean editar(Pessoa p){
        return pessoas.editar(p);
    }

    public boolean excluir(Pessoa p){
        return pessoas.excluir(p);
    }

    public Pessoa buscarPessoa(String cpf){
        return pessoas.buscarPessoa(cpf);
    }

    public ArrayList<Pessoa> listar(){
        return pessoas.listar();
    }
}
