public class Esporte{
    private int quantJogadores;
    private String nome, categoria;
    private boolean olimpico, individual;
    
    public Esporte(int quantJogadores, String nome, String categoria, boolean olimpico, boolean individual){
        this.quantJogadores = quantJogadores;
        this.nome = nome;
        this.categoria = categoria;
        this.olimpico = olimpico;
        this.individual = individual;
    }

    public int getQuantJogadores(){
        return quantJogadores;
    }
    
    public void setQuantJogadores(int quantJogadores){
        this.quantJogadores = quantJogadores;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getCategoria(){
        return categoria;
    }
    
    public void setCategoria(String categoria){
        this.categoria = categoria;
    }
    
    public boolean isOlmpico(){
        return olimpico;
    }
    
    public void setOlimpico(boolean olimpico){
        this.olimpico = olimpico;
    }
    
    public boolean isIndividual(){
        return individual;
    }
    
    public void setIndividual(boolean individual){
        this.individual = individual;
    }
}

