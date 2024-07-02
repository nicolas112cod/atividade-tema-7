public class UsaClasses {

    public static void main(String[] args) {
        
        Livro l = new Livro("percy jackson e o ladrao de raios", "fantasia", 2010);
         
        System.out.println("nome: " + l.nome);
        System.out.println("genero; " + l.genero);
        System.out.println("ano_de_lançamento: " + l.ano_de_lançamento);

        Livro l1 = new Livro("harry potter e a pedra filosofal", "fantasia", 1997);

        System.out.println("nome: " + l1.nome);
        System.out.println("genero; " + l1.genero);
        System.out.println("ano_de_lançamento: " + l1.ano_de_lançamento);

        Livro l2 = new Livro("six of crows", "fantasia", 2015);

        System.out.println("nome: " + l2.nome);
        System.out.println("genero; " + l2.genero);
        System.out.println("ano_de_lançamento: " + l2.ano_de_lançamento);

    }
    
}
