public class Principal{
    public static void main(String[] args){
        Pessoa a = new Pessoa("Pedro", "masculino", 22, 1.80, 2, "Av.João Klauck", "Beira Rio", 804);
        a.imprimeInformacoes();
        a.isFilhoUnico();  
    }
}  