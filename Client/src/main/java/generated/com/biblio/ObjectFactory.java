
package com.biblio;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.biblio package. 
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

    private final static QName _SearchBiblio_QNAME = new QName("http://biblio.com/", "searchBiblio");
    private final static QName _UtilisateurResponse_QNAME = new QName("http://biblio.com/", "UtilisateurResponse");
    private final static QName _PretResponse_QNAME = new QName("http://biblio.com/", "PretResponse");
    private final static QName _AddPret_QNAME = new QName("http://biblio.com/", "addPret");
    private final static QName _AddUserResponse_QNAME = new QName("http://biblio.com/", "addUserResponse");
    private final static QName _SearchPret_QNAME = new QName("http://biblio.com/", "searchPret");
    private final static QName _AddBiblio_QNAME = new QName("http://biblio.com/", "addBiblio");
    private final static QName _BibliothequeResponse_QNAME = new QName("http://biblio.com/", "BibliothequeResponse");
    private final static QName _AddDocumentResponse_QNAME = new QName("http://biblio.com/", "addDocumentResponse");
    private final static QName _SearchBookResponse_QNAME = new QName("http://biblio.com/", "searchBookResponse");
    private final static QName _DocumentResponse_QNAME = new QName("http://biblio.com/", "DocumentResponse");
    private final static QName _SearchPretResponse_QNAME = new QName("http://biblio.com/", "searchPretResponse");
    private final static QName _AddDocument_QNAME = new QName("http://biblio.com/", "addDocument");
    private final static QName _DoLoginResponse_QNAME = new QName("http://biblio.com/", "doLoginResponse");
    private final static QName _SearchBiblioResponse_QNAME = new QName("http://biblio.com/", "searchBiblioResponse");
    private final static QName _AddBiblioResponse_QNAME = new QName("http://biblio.com/", "addBiblioResponse");
    private final static QName _AddPretResponse_QNAME = new QName("http://biblio.com/", "addPretResponse");
    private final static QName _SearchBook_QNAME = new QName("http://biblio.com/", "searchBook");
    private final static QName _DoLogin_QNAME = new QName("http://biblio.com/", "doLogin");
    private final static QName _AddUser_QNAME = new QName("http://biblio.com/", "addUser");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.biblio
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DoLogin }
     * 
     */
    public DoLogin createDoLogin() {
        return new DoLogin();
    }

    /**
     * Create an instance of {@link AddUser }
     * 
     */
    public AddUser createAddUser() {
        return new AddUser();
    }

    /**
     * Create an instance of {@link SearchBiblioResponse }
     * 
     */
    public SearchBiblioResponse createSearchBiblioResponse() {
        return new SearchBiblioResponse();
    }

    /**
     * Create an instance of {@link AddBiblioResponse }
     * 
     */
    public AddBiblioResponse createAddBiblioResponse() {
        return new AddBiblioResponse();
    }

    /**
     * Create an instance of {@link AddPretResponse }
     * 
     */
    public AddPretResponse createAddPretResponse() {
        return new AddPretResponse();
    }

    /**
     * Create an instance of {@link SearchBook }
     * 
     */
    public SearchBook createSearchBook() {
        return new SearchBook();
    }

    /**
     * Create an instance of {@link AddBiblio }
     * 
     */
    public AddBiblio createAddBiblio() {
        return new AddBiblio();
    }

    /**
     * Create an instance of {@link BibliothequeResponse }
     * 
     */
    public BibliothequeResponse createBibliothequeResponse() {
        return new BibliothequeResponse();
    }

    /**
     * Create an instance of {@link AddDocumentResponse }
     * 
     */
    public AddDocumentResponse createAddDocumentResponse() {
        return new AddDocumentResponse();
    }

    /**
     * Create an instance of {@link SearchBookResponse }
     * 
     */
    public SearchBookResponse createSearchBookResponse() {
        return new SearchBookResponse();
    }

    /**
     * Create an instance of {@link DocumentResponse }
     * 
     */
    public DocumentResponse createDocumentResponse() {
        return new DocumentResponse();
    }

    /**
     * Create an instance of {@link SearchPretResponse }
     * 
     */
    public SearchPretResponse createSearchPretResponse() {
        return new SearchPretResponse();
    }

    /**
     * Create an instance of {@link AddDocument }
     * 
     */
    public AddDocument createAddDocument() {
        return new AddDocument();
    }

    /**
     * Create an instance of {@link DoLoginResponse }
     * 
     */
    public DoLoginResponse createDoLoginResponse() {
        return new DoLoginResponse();
    }

    /**
     * Create an instance of {@link SearchBiblio }
     * 
     */
    public SearchBiblio createSearchBiblio() {
        return new SearchBiblio();
    }

    /**
     * Create an instance of {@link UtilisateurResponse }
     * 
     */
    public UtilisateurResponse createUtilisateurResponse() {
        return new UtilisateurResponse();
    }

    /**
     * Create an instance of {@link PretResponse }
     * 
     */
    public PretResponse createPretResponse() {
        return new PretResponse();
    }

    /**
     * Create an instance of {@link AddPret }
     * 
     */
    public AddPret createAddPret() {
        return new AddPret();
    }

    /**
     * Create an instance of {@link AddUserResponse }
     * 
     */
    public AddUserResponse createAddUserResponse() {
        return new AddUserResponse();
    }

    /**
     * Create an instance of {@link SearchPret }
     * 
     */
    public SearchPret createSearchPret() {
        return new SearchPret();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchBiblio }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://biblio.com/", name = "searchBiblio")
    public JAXBElement<SearchBiblio> createSearchBiblio(SearchBiblio value) {
        return new JAXBElement<SearchBiblio>(_SearchBiblio_QNAME, SearchBiblio.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UtilisateurResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://biblio.com/", name = "UtilisateurResponse")
    public JAXBElement<UtilisateurResponse> createUtilisateurResponse(UtilisateurResponse value) {
        return new JAXBElement<UtilisateurResponse>(_UtilisateurResponse_QNAME, UtilisateurResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PretResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://biblio.com/", name = "PretResponse")
    public JAXBElement<PretResponse> createPretResponse(PretResponse value) {
        return new JAXBElement<PretResponse>(_PretResponse_QNAME, PretResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddPret }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://biblio.com/", name = "addPret")
    public JAXBElement<AddPret> createAddPret(AddPret value) {
        return new JAXBElement<AddPret>(_AddPret_QNAME, AddPret.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://biblio.com/", name = "addUserResponse")
    public JAXBElement<AddUserResponse> createAddUserResponse(AddUserResponse value) {
        return new JAXBElement<AddUserResponse>(_AddUserResponse_QNAME, AddUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchPret }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://biblio.com/", name = "searchPret")
    public JAXBElement<SearchPret> createSearchPret(SearchPret value) {
        return new JAXBElement<SearchPret>(_SearchPret_QNAME, SearchPret.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddBiblio }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://biblio.com/", name = "addBiblio")
    public JAXBElement<AddBiblio> createAddBiblio(AddBiblio value) {
        return new JAXBElement<AddBiblio>(_AddBiblio_QNAME, AddBiblio.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BibliothequeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://biblio.com/", name = "BibliothequeResponse")
    public JAXBElement<BibliothequeResponse> createBibliothequeResponse(BibliothequeResponse value) {
        return new JAXBElement<BibliothequeResponse>(_BibliothequeResponse_QNAME, BibliothequeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddDocumentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://biblio.com/", name = "addDocumentResponse")
    public JAXBElement<AddDocumentResponse> createAddDocumentResponse(AddDocumentResponse value) {
        return new JAXBElement<AddDocumentResponse>(_AddDocumentResponse_QNAME, AddDocumentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchBookResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://biblio.com/", name = "searchBookResponse")
    public JAXBElement<SearchBookResponse> createSearchBookResponse(SearchBookResponse value) {
        return new JAXBElement<SearchBookResponse>(_SearchBookResponse_QNAME, SearchBookResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://biblio.com/", name = "DocumentResponse")
    public JAXBElement<DocumentResponse> createDocumentResponse(DocumentResponse value) {
        return new JAXBElement<DocumentResponse>(_DocumentResponse_QNAME, DocumentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchPretResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://biblio.com/", name = "searchPretResponse")
    public JAXBElement<SearchPretResponse> createSearchPretResponse(SearchPretResponse value) {
        return new JAXBElement<SearchPretResponse>(_SearchPretResponse_QNAME, SearchPretResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddDocument }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://biblio.com/", name = "addDocument")
    public JAXBElement<AddDocument> createAddDocument(AddDocument value) {
        return new JAXBElement<AddDocument>(_AddDocument_QNAME, AddDocument.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoLoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://biblio.com/", name = "doLoginResponse")
    public JAXBElement<DoLoginResponse> createDoLoginResponse(DoLoginResponse value) {
        return new JAXBElement<DoLoginResponse>(_DoLoginResponse_QNAME, DoLoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchBiblioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://biblio.com/", name = "searchBiblioResponse")
    public JAXBElement<SearchBiblioResponse> createSearchBiblioResponse(SearchBiblioResponse value) {
        return new JAXBElement<SearchBiblioResponse>(_SearchBiblioResponse_QNAME, SearchBiblioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddBiblioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://biblio.com/", name = "addBiblioResponse")
    public JAXBElement<AddBiblioResponse> createAddBiblioResponse(AddBiblioResponse value) {
        return new JAXBElement<AddBiblioResponse>(_AddBiblioResponse_QNAME, AddBiblioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddPretResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://biblio.com/", name = "addPretResponse")
    public JAXBElement<AddPretResponse> createAddPretResponse(AddPretResponse value) {
        return new JAXBElement<AddPretResponse>(_AddPretResponse_QNAME, AddPretResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchBook }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://biblio.com/", name = "searchBook")
    public JAXBElement<SearchBook> createSearchBook(SearchBook value) {
        return new JAXBElement<SearchBook>(_SearchBook_QNAME, SearchBook.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoLogin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://biblio.com/", name = "doLogin")
    public JAXBElement<DoLogin> createDoLogin(DoLogin value) {
        return new JAXBElement<DoLogin>(_DoLogin_QNAME, DoLogin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://biblio.com/", name = "addUser")
    public JAXBElement<AddUser> createAddUser(AddUser value) {
        return new JAXBElement<AddUser>(_AddUser_QNAME, AddUser.class, null, value);
    }

}
