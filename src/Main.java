import java.util.ArrayList;
import java.util.Scanner;

import model.Filme;
import model.Pessoa;
import service.PessoaService;

public class Main {

    public static Filme adicionarFilmes(Scanner scan){
        Filme f = new Filme();
        scan.nextLine();
        System.out.println("Informe o nome do filme:");
        String nome = scan.nextLine();
        
        System.out.println("Informe a nota do filme:");
        double nota = scan.nextDouble();
        f.setNome(nome);
        f.setNota(nota);

        return f;
    }

    public static void main(String[] args) {
        PessoaService ps = new PessoaService();
        Scanner scan = new Scanner(System.in);
        int escolha;
        do {
            System.out.println("==================");
            System.out.println("Olá, fresco! Escolhe uma opção ai:");
            System.out.println("1 - Cadastrar Pessoa");
            System.out.println("2 - Listar Pessoas");
            System.out.println("3 - Editar Pessoas");
            System.out.println("4 - Ecluir Pessoas");
            System.out.println("5 - Sair");
            escolha = scan.nextInt();
            scan.nextLine();
            
            Pessoa p = new Pessoa();
            switch (escolha) {
                case 1:
                    System.out.println("Informe o nome:");
                    p.setNome(scan.nextLine());
                    System.out.println("Informe seu CPF:");
                    p.setCpf(scan.nextLine());
                    System.out.println("Informe a sua idade:");
                    p.setIdade(scan.nextInt());
                    System.out.println("Informe agora seus filmes favoritos");
                    p.setFilme(adicionarFilmes(scan));
                    System.out.println("Pessoa adcionada com sucesso!");

                    ps.cadastrar(p);
                    break;
                case 2:
                    System.out.println("Listando todas as pessoas");
                    ArrayList<Pessoa> pessoas = ps.listar();
                    for (Pessoa pessoa : pessoas) {
                        System.out.println("==========");
                        System.out.println("Nome:" + pessoa.getNome());
                        System.out.println("CPF:" + pessoa.getCpf());
                        System.out.println("Idade:" + pessoa.getIdade());
                        System.out.println("Filme favorito: " + pessoa.getFilme().getNome());
                    }
                    break;
                case 3:
                    System.out.println("Editando uma pessoa");
                    System.out.println("Informe o CPF dela:");
                    p = ps.buscarPessoa(scan.nextLine());

                    if (p != null){
                        System.out.println("Pessoa encontrada!");
                        System.out.println("Informe o novo nome:");
                        p.setNome(scan.nextLine());
                        System.out.println("Informe o CPF:");
                        p.setCpf(scan.nextLine());
                        System.out.println("Informe o nome do novo filme:");
                        String nome = scan.nextLine();
                        System.out.println("Informe a nova nota: ");
                        double nota = scan.nextDouble();
                        
                        p.setFilme(new Filme(nome, nota));

                        if (ps.editar(p)){
                            System.out.println("Pessoa editada com sucesso!");
                        } else {
                            System.out.println("Erro ao editar pessoa");
                        }
                    } else {
                        System.out.println("Pessoa não encontrada!");
                    }
                    break;
                case 4:
                    System.out.println("Excluindo uma pessoa");
                    System.out.println("Informe o CPF dela:");
                    p = ps.buscarPessoa(scan.nextLine());

                    if (p != null){
                        System.out.println("Pessoa encontrada!");
                        System.out.println("Excluindo...");

                        if (ps.excluir(p)){
                            System.out.println("Pessoa excluida com sucesso!");
                        } else {
                            System.out.println("Erro ao excluir pessoa");
                        }
                    } else {
                        System.out.println("Pessoa não encontrada!");
                    }
                    break;
                default:
                    break;
            }
        } while (escolha != 5);
    }
}
