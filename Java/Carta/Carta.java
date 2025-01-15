public class Carta{
    private String naipe;
    private int valor;
    private char simbolo;
    private boolean coringa;
    
    public Carta(String naipe, int valor, char simbolo, boolean coringa){
        this.naipe = naipe;
        this.valor = valor;
        this.simbolo = simbolo;
        this.coringa = coringa;
    }
    
    public String getNaipe(){
        return naipe;
    }
    
    public void setNaipe(String naipe){
        this.naipe = naipe;
    }
    
    public int getValor(){
        return valor;
    }
    
    public void setValor(int valor){
        this.valor = valor;
    }
    
    public char getSimbolo(){
        return simbolo;
    }
    
    public void setSimbolo(char simbolo){
        this.simbolo = simbolo;
    }
    
    public boolean isCoringa(){
        return coringa;
    }
    
    public void setCoringa(boolean coringa){
        this.coringa = coringa;
    }
    
}