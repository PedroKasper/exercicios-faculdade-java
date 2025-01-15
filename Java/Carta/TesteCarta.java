public class TesteCarta{
    public static void main(String[] args){
        Carta a = new Carta("Espadas", 12, 'Q', false);
        char simbolo = a.getSimbolo();
        System.out.println(simbolo);
        a.setNaipe("Paus");
        String naipe = a.getNaipe();
        System.out.println(naipe);
    }
    

}