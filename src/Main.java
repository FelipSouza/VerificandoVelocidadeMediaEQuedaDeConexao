//--------------EXERCICIO 01---------------
/*import java.util.Scanner;

public class Main {

    // Função para calcular a velocidade média de conexão de internet
    public static double calcularVelocidadeMedia(String[] velocidades) {
        int total = 0;
        double media;
        // TODO: Some todas as velocidades registradas e calcule a média
        for(int i = 0; i<velocidades.length; i++){
            total += Double.parseDouble(velocidades[i]);
        }

        media = total/(velocidades.length);
        return media;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitando ao usuário a lista de velocidades de conexão registradas a cada hora
        String input = scanner.nextLine();

        // Convertendo a entrada em uma lista de strings
        String[] velocidades = input.split(",");

        // Calculando a velocidade média de conexão
        double velocidadeMedia = calcularVelocidadeMedia(velocidades);

        // Exibindo a velocidade média de conexão
        System.out.println((int)velocidadeMedia + " Mbps");

        scanner.close();


    }
}

*/

//--------------EXERCICIO 02---------------

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {

    // TODO: Preencha a função para verificar queda de conexão
    public static String verificarQuedaConexao(String[] velocidades) {

        boolean quedaConexao = false;
        String resultado = null;

        for(int i=0; i<velocidades.length; i++){
            if (velocidades[i].equalsIgnoreCase("0")){
                quedaConexao = true;
            }
        }
        if(quedaConexao){
            resultado = "Queda de Conexao";
        }else{
            resultado = "Sem Quedas";
        }

        return resultado;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitando ao usuário a lista de velocidades de conexão registradas a cada hora
        String input = scanner.nextLine();

        // Convertendo a entrada em uma lista de strings
        String[] velocidades = input.split(",");

        // Verificando se houve queda de conexão
        String resultado = verificarQuedaConexao(velocidades);

        // Exibindo o resultado da verificação
        System.out.println(resultado);

        scanner.close();
    }
}