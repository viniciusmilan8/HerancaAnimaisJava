public class Main {
    public static void main(String[] args){
        Animal dadosNovoAnimal = new Animal("camelo", 150, "Amarelo", "Terra", 4 , 2);
        Animal novoAnimal = new Animal();
        Peixe novoAnimalPeixe = new Peixe();
        novoAnimal.setNome("a");
        novoAnimal.setComprimento(10);
        novoAnimal.setCor("Preto");
        novoAnimal.setAmbiente("A");
        novoAnimal.setVelocidade(1);
        novoAnimal.setPatas(1);

        
        novoAnimalPeixe.setNome("A");
        novoAnimalPeixe.setComprimento(3);
        novoAnimalPeixe.setVelocidade(5);
        novoAnimalPeixe.setCaracteristica("Grande");

        dadosNovoAnimal.dados();
        System.out.println("\n");
        novoAnimal.dados();
        System.out.println("\n");
        novoAnimalPeixe.dados();
    }
}
