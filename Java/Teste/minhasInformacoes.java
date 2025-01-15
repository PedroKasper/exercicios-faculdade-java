public class minhasInformacoes {
    public static void main(String[] args){
        String nome = Teclado.leString("Digite seu nome:");
        double altura = Teclado.leDouble("Digite sua altura:"); 
        String nascimento = Teclado.leString("Digite sua data de nascimento:");
        int rg = Teclado.leInt("Digite seu rg:");
        String rua = Teclado.leString("Digite o nome da sua rua:");
        int numero = Teclado.leInt("Digite o numero da sua residência:");
        int complemento = Teclado.leInt("Digite o número do seu complemento:");
        
        System.out.println("Nome: "+ nome);
        System.out.println("Altura: "+ altura);
        System.out.println("Data de nascimento: "+ nascimento + "- RG: " + rg);
        System.out.println("Endereço: "+ rua + "- Número" + numero + "- Complemento:" + complemento);
    }
}

