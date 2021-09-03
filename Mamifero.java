public class Mamifero extends Animal{
    private String alimento;
    public Mamifero(){
    }
    public Mamifero(String nome, int comprimento, String cor, String ambiente, double velocidade,  int patas, String alimento){
        super(nome, comprimento, cor , ambiente , velocidade, patas);
        this.alimento = alimento;
    }
    public String getAlimento(){
        return this.alimento;
    }
    public void setAlimento(String alimento){
        this.alimento = alimento;
    }
    public void dados(){
        super.dados();
        System.out.println("Alimento: " +this.alimento);
    }
}
