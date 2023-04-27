package repository;

import java.util.ArrayList;

import model.Pessoa;

public class PessoaRepo {
    ArrayList<Pessoa> pessoas = new ArrayList<>();

    public boolean cadastrar(Pessoa p){
        if (pessoas.add(p)){
            return true;
        } else {
            return false;
        }
    }

    public boolean editar(Pessoa p){
        if (pessoas.contains(p)){
            pessoas.set(pessoas.indexOf(p), p);
            return true;
        } else {
            return false;
        }
    }

    public boolean excluir(Pessoa p){
        if (pessoas.contains(p)){
            pessoas.remove(pessoas.indexOf(p));
            return true;
        } else {
            return false;
        }
    }

    public ArrayList<Pessoa> listar(){
        return pessoas;
    }

    public Pessoa buscarPessoa(String cpf){
        for (Pessoa pessoa : this.pessoas) {
            if (cpf.equals(pessoa.getCpf())){
                return pessoa;
            }
        }

        return null;
    }
}
