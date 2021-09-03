public class Main {
    public static void main(String[] args){
        Animal novoAnimal = new Animal("Camelo", 150, "Amarelo", "Terra", 4 , 2);
        Animal novoAnimal2 = new Animal();
        Peixe novoPeixe = new Peixe("Lambari", "Pequeno", 5, 1);
        Peixe novoPeixe2 = new Peixe();
        Mamifero novoMamifero = new Mamifero("Gato", 50, "Preto", "Terra", 13, 4, "Leite");
        Mamifero novoMamifero2 = new Mamifero();
    
        novoAnimal2.setNome("Urso");
        novoAnimal2.setComprimento(180);
        novoAnimal2.setCor("Marrom");
        novoAnimal2.setAmbiente("Terra");
        novoAnimal2.setVelocidade(2.5);
        novoAnimal2.setPatas(4);
        
        novoPeixe2.setNome("Piranha");
        novoPeixe2.setComprimento(10);
        novoPeixe2.setVelocidade(4.5);
        novoPeixe2.setCaracteristica("Carnivora");
        novoPeixe2.setAmbiente("Agua");
        novoPeixe2.setCor("Cinzento");

        novoMamifero2.setNome("Cachorro");
        novoMamifero2.setComprimento(80);
        novoMamifero2.setVelocidade(10);
        novoMamifero2.setAlimento("Carne");
        novoMamifero2.setAmbiente("Terra");
        novoMamifero2.setCor("Branco");
        novoMamifero2.setPatas(4);

        novoAnimal.dados();
        System.out.println("\n");
        novoAnimal2.dados();
        System.out.println("\n");
        novoPeixe.dados();
        System.out.println("\n");
        novoPeixe2.dados();
        System.out.println("\n");
        novoMamifero.dados();
        System.out.println("\n");
        novoMamifero2.dados();
    }
}
