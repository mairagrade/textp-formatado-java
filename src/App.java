public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        //%s - substitui no testo um valor String
        System.out.printf("vai imprimir %s. %s\n", "Um texto", "Qualquer");

        // %d - substitui o coringa  %d por um numero inteiro no texto 
        System.out.printf("Minha idade é: %d", 25);

        //%f - substitui o coringa %f por um numero flutuante 
        System.out.printf("\n0 valor de PI é: %f", 31415f);

        //%f.2 - substitui o coringa %f.2 por um numero flutuante 
        System.out.printf("\n0 valor de PI é: %f.2", 31415f);

        //b - substitui o coringa %b por um valor booleano 
        System.out.printf("\nEsse valor é %b", true);
        System.out.printf("\nEsse valor é %b", false);

        // %c - substitui o coringa %c por um caractere 
        System.out.printf("\n0 caractere é: %c", 'A');
        System.out.printf("\n0 caractere é: %c", '5');
        System.out.printf("\n0 caractere é: %c", '*');
        System.out.printf("\n0 caractere é: %c", '\\');
        System.out.printf("\n0 caractere é: %c", '\'');

        //printf com todos os tipos usando variaveis 
        String texto = "alguma coisa";
        int numeroInteiro = 1;
        float numeroQuebrado = 123.232f;
        boolean valorVerdadeiro = true;
        char umCaractere = 'º';
        System.out.printf("\n%s, %d, %.2f, %b, %c", texto, numeroInteiro, numeroQuebrado, valorVerdadeiro, umCaractere);
        


        
        

      


        




        


    }
}
