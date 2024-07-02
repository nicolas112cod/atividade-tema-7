public class UsaClassesCarroConstrutores {

    public static void main(String[] args) {
    
        Carro c = new Carro("fiat uno", "400km", 9.173);

        System.out.println("nome: " + c.nome);
        System.out.println("vida_ultil: " + c.vida_ultil);
        System.out.println("preço: " + c.preço);
    }
}