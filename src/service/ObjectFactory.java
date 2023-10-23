
package service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _VerAlbuns_QNAME = new QName("http://service/", "verAlbuns");
    private final static QName _VerAlbums_QNAME = new QName("http://service/", "verAlbums");
    private final static QName _CadastrarAlbumResponse_QNAME = new QName("http://service/", "cadastrarAlbumResponse");
    private final static QName _CadastrarAlbum_QNAME = new QName("http://service/", "cadastrarAlbum");
    private final static QName _VerAlbunsPorAnoResponse_QNAME = new QName("http://service/", "verAlbunsPorAnoResponse");
    private final static QName _VerAlbunsResponse_QNAME = new QName("http://service/", "verAlbunsResponse");
    private final static QName _VerAlbunsPorAno_QNAME = new QName("http://service/", "verAlbunsPorAno");
    private final static QName _VerInfosAlbunsResponse_QNAME = new QName("http://service/", "verInfosAlbunsResponse");
    private final static QName _VerInfosAlbuns_QNAME = new QName("http://service/", "verInfosAlbuns");
    private final static QName _VerAlbumsResponse_QNAME = new QName("http://service/", "verAlbumsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CadastrarAlbum }
     * 
     */
    public CadastrarAlbum createCadastrarAlbum() {
        return new CadastrarAlbum();
    }

    /**
     * Create an instance of {@link VerAlbunsPorAnoResponse }
     * 
     */
    public VerAlbunsPorAnoResponse createVerAlbunsPorAnoResponse() {
        return new VerAlbunsPorAnoResponse();
    }

    /**
     * Create an instance of {@link CadastrarAlbumResponse }
     * 
     */
    public CadastrarAlbumResponse createCadastrarAlbumResponse() {
        return new CadastrarAlbumResponse();
    }

    /**
     * Create an instance of {@link VerAlbums }
     * 
     */
    public VerAlbums createVerAlbums() {
        return new VerAlbums();
    }

    /**
     * Create an instance of {@link VerAlbuns }
     * 
     */
    public VerAlbuns createVerAlbuns() {
        return new VerAlbuns();
    }

    /**
     * Create an instance of {@link VerAlbumsResponse }
     * 
     */
    public VerAlbumsResponse createVerAlbumsResponse() {
        return new VerAlbumsResponse();
    }

    /**
     * Create an instance of {@link VerInfosAlbuns }
     * 
     */
    public VerInfosAlbuns createVerInfosAlbuns() {
        return new VerInfosAlbuns();
    }

    /**
     * Create an instance of {@link VerInfosAlbunsResponse }
     * 
     */
    public VerInfosAlbunsResponse createVerInfosAlbunsResponse() {
        return new VerInfosAlbunsResponse();
    }

    /**
     * Create an instance of {@link VerAlbunsPorAno }
     * 
     */
    public VerAlbunsPorAno createVerAlbunsPorAno() {
        return new VerAlbunsPorAno();
    }

    /**
     * Create an instance of {@link VerAlbunsResponse }
     * 
     */
    public VerAlbunsResponse createVerAlbunsResponse() {
        return new VerAlbunsResponse();
    }

    /**
     * Create an instance of {@link Album }
     * 
     */
    public Album createAlbum() {
        return new Album();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerAlbuns }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "verAlbuns")
    public JAXBElement<VerAlbuns> createVerAlbuns(VerAlbuns value) {
        return new JAXBElement<VerAlbuns>(_VerAlbuns_QNAME, VerAlbuns.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerAlbums }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "verAlbums")
    public JAXBElement<VerAlbums> createVerAlbums(VerAlbums value) {
        return new JAXBElement<VerAlbums>(_VerAlbums_QNAME, VerAlbums.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CadastrarAlbumResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "cadastrarAlbumResponse")
    public JAXBElement<CadastrarAlbumResponse> createCadastrarAlbumResponse(CadastrarAlbumResponse value) {
        return new JAXBElement<CadastrarAlbumResponse>(_CadastrarAlbumResponse_QNAME, CadastrarAlbumResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CadastrarAlbum }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "cadastrarAlbum")
    public JAXBElement<CadastrarAlbum> createCadastrarAlbum(CadastrarAlbum value) {
        return new JAXBElement<CadastrarAlbum>(_CadastrarAlbum_QNAME, CadastrarAlbum.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerAlbunsPorAnoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "verAlbunsPorAnoResponse")
    public JAXBElement<VerAlbunsPorAnoResponse> createVerAlbunsPorAnoResponse(VerAlbunsPorAnoResponse value) {
        return new JAXBElement<VerAlbunsPorAnoResponse>(_VerAlbunsPorAnoResponse_QNAME, VerAlbunsPorAnoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerAlbunsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "verAlbunsResponse")
    public JAXBElement<VerAlbunsResponse> createVerAlbunsResponse(VerAlbunsResponse value) {
        return new JAXBElement<VerAlbunsResponse>(_VerAlbunsResponse_QNAME, VerAlbunsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerAlbunsPorAno }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "verAlbunsPorAno")
    public JAXBElement<VerAlbunsPorAno> createVerAlbunsPorAno(VerAlbunsPorAno value) {
        return new JAXBElement<VerAlbunsPorAno>(_VerAlbunsPorAno_QNAME, VerAlbunsPorAno.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerInfosAlbunsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "verInfosAlbunsResponse")
    public JAXBElement<VerInfosAlbunsResponse> createVerInfosAlbunsResponse(VerInfosAlbunsResponse value) {
        return new JAXBElement<VerInfosAlbunsResponse>(_VerInfosAlbunsResponse_QNAME, VerInfosAlbunsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerInfosAlbuns }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "verInfosAlbuns")
    public JAXBElement<VerInfosAlbuns> createVerInfosAlbuns(VerInfosAlbuns value) {
        return new JAXBElement<VerInfosAlbuns>(_VerInfosAlbuns_QNAME, VerInfosAlbuns.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerAlbumsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "verAlbumsResponse")
    public JAXBElement<VerAlbumsResponse> createVerAlbumsResponse(VerAlbumsResponse value) {
        return new JAXBElement<VerAlbumsResponse>(_VerAlbumsResponse_QNAME, VerAlbumsResponse.class, null, value);
    }

}
