public class MinhasInformacoes {
    public static void main(String[] args) {
        int numeroInteiro = Teclado.leInteiro();
        double numeroDecimal = Teclado.leDecimal();
        String string = Teclado.leString();
        String linha = Teclado.leLinha();

        System.out.println("Número Inteiro: " + numeroInteiro);
        System.out.println("Número Decimal: " + numeroDecimal);
        System.out.println("String: " + string);
        System.out.println("Linha: " + linha);
    }
}