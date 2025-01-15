public class Pessoa{
    private String nome, sexo, rua, bairro;
    private int idade, quantIrmaos, numero;
    private double altura;
    
    //construtor
    public Pessoa(String nome, String sexo, int idade, double altura, int quantIrmaos, String rua, String bairro, int numero){
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.altura = altura;
        this.quantIrmaos = quantIrmaos;
        this.rua = rua;
        this.bairro = bairro;
        this.numero = numero;
    }
    
    //getters e setters
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getSexo(){
        return sexo;
    }
    
    public void setSexo(String sexo){
        this.sexo = sexo;
    }
    
    public int getIdade(){
        return idade;
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }
    
    public double getAltura(){
        return altura;
    }
    
    public void setAltura(double altura){
        this.altura = altura;
    }
    
    public int getQuantIrmaos(){
        return quantIrmaos;
    }
    
    public void setQuantIrmaos(int quantIrmaos){
        this.quantIrmaos = quantIrmaos;
    }
    
    public String getRua(){
        return rua;
    }
    
    public void setRua(String rua){
        this.rua = rua;
    }
    
    public String getBairro(){
        return bairro;
    }
    
    public void setBairro(String bairro){
        this.bairro = bairro;
    }
    
    public int getNumero(){
        return numero;
    }
    
    public void setNumero(int numero){
        this.numero = numero;
    }
    
    //imprime informações da pessoa
    public void imprimeInformacoes(){
        System.out.println("Nome: "+nome);
        System.out.println("Idade: "+idade+" anos");
        System.out.println("Altura: "+altura+" cm");
        System.out.println("Quantidade de irmãos: "+quantIrmaos);
        System.out.println("Endereço:" +rua+",  bairro" +bairro+", " +numero);
    }
    
    public void isFilhoUnico(){
        if(quantIrmaos <= 0)
            System.out.println("Filho único");
        else
            System.out.println("Não é filho único");
    }
    
    
}