import service.AcervoWS;
import service.AcervoWSService;
import service.Album;
import java.util.List;


public class ClienteAlbumWS {
    public static void main(String[] args) {
        AcervoWS cliente = new AcervoWSService().getAcervoWSPort();
        //Criando um album
        Album album = cliente.cadastrarAlbum("Nome da musica", "Produtora A", 2023);
        System.out.println("Album cadastrado: " +
                album.getNome() + " - "
                + album.getProdutoras() + " - "
                + album.getAno());

        //Listando todos os albuns por ano
        List<String> lista = cliente.verAlbunsPorAno(2023);
        System.out.println("Albuns de 2023: ");
        for (String nome : lista) {
            System.out.println(nome);
        }

        //Listando todos os albuns
        List<String> lista2 = cliente.verInfosAlbuns();
        System.out.println("Todos os Albuns: ");
        for (String nome : lista2) {
            System.out.println(nome);
        }

    }
}