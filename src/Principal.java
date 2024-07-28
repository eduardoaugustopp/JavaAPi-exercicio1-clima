import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        ConsultaCoordenada consultaCoordenada = new ConsultaCoordenada();
        GeradorDeArquivo geradorDeArquivo = new GeradorDeArquivo();

        while (true) {
            System.out.printf("Digite uma coordenada no formato 'latitude, longitude' para consulta (ou 'sair' para encerrar): ");
            String coordenadaInput = leitura.nextLine();

            if (coordenadaInput.equalsIgnoreCase("sair")) {
                System.out.println("Finalizando aplicação");
                break;
            }

            try {
                Coordenada novaCoordenada = consultaCoordenada.buscaCoordenada(coordenadaInput);
                System.out.println(novaCoordenada);
                geradorDeArquivo.salvaJson(novaCoordenada);
            } catch (RuntimeException | IOException e) {
                System.out.println(e.getMessage());
            }
        }
        leitura.close();
    }
}
