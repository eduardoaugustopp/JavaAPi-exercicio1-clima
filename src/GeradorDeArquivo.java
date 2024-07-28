import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException;

public class GeradorDeArquivo {

    public void salvaJson(Coordenada coordenada) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String nomeArquivo = coordenada.getName() != null ? coordenada.getName() : "coordenada";
        try (FileWriter escrita = new FileWriter(nomeArquivo + ".json")) {
            String json = gson.toJson(coordenada);
            escrita.write(json);
        }
    }
}
