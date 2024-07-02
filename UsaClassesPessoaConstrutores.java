public class UsaClassesPessoaConstrutores {

    public static void main(String[] args) {
    
        Pessoa p = new Pessoa("sylvester stallone", 77, 40000000.0);

        System.out.println("nome: " + p.nome);
        System.out.println("idade: " + p.idade);
        System.out.println("renda: " + p.renda);
    }
}