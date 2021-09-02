public class Main {
    public static void main(String[] args){
        Animal dadosNovoAnimal = new Animal("camelo", 150, "Amarelo", "Terra", 4 , 2);
        Animal novoAnimal = new Animal();
        Peixe novoAnimalPeixe = new Peixe();
        Peixe novoAnimalPeixe2 = new Peixe();
        novoAnimal.setNome("Urso");
        novoAnimal.setComprimento(180);
        novoAnimal.setCor("Marron");
        novoAnimal.setAmbiente("Terra");
        novoAnimal.setVelocidade(0.5);
        novoAnimal.setPatas(4);

        novoAnimalPeixe.setNome("Lambari");
        novoAnimalPeixe.setComprimento(3);
        novoAnimalPeixe.setVelocidade(5);
        novoAnimalPeixe.setCaracteristica("Pequeno");
        novoAnimalPeixe.setAmbiente("Agua");
        novoAnimalPeixe.setCor("Cinza");

        dadosNovoAnimal.dados();
        System.out.println("\n");
        novoAnimal.dados();
        System.out.println("\n");
        novoAnimalPeixe.dados();
        System.out.println("\n");
        novoAnimalPeixe2.dados();
    }
}
