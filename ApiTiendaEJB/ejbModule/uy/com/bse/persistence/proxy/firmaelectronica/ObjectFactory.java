
package uy.com.bse.persistence.proxy.firmaelectronica;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the uy.com.bse.persistence.proxy.firmaelectronica package. 
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

    private final static QName _FirmarXmlResponse_QNAME = new QName("http://firma.ws.servicios.bse.com/", "firmarXmlResponse");
    private final static QName _FirmarPdf_QNAME = new QName("http://firma.ws.servicios.bse.com/", "firmarPdf");
    private final static QName _FirmarPdfResponse_QNAME = new QName("http://firma.ws.servicios.bse.com/", "firmarPdfResponse");
    private final static QName _FirmarTexto_QNAME = new QName("http://firma.ws.servicios.bse.com/", "firmarTexto");
    private final static QName _FirmarXml_QNAME = new QName("http://firma.ws.servicios.bse.com/", "firmarXml");
    private final static QName _FirmarTextoResponse_QNAME = new QName("http://firma.ws.servicios.bse.com/", "firmarTextoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: uy.com.bse.persistence.proxy.firmaelectronica
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FirmarPdf }
     * 
     */
    public FirmarPdf createFirmarPdf() {
        return new FirmarPdf();
    }

    /**
     * Create an instance of {@link FirmarPdfResponse }
     * 
     */
    public FirmarPdfResponse createFirmarPdfResponse() {
        return new FirmarPdfResponse();
    }

    /**
     * Create an instance of {@link FirmarXmlResponse }
     * 
     */
    public FirmarXmlResponse createFirmarXmlResponse() {
        return new FirmarXmlResponse();
    }

    /**
     * Create an instance of {@link FirmarTextoResponse }
     * 
     */
    public FirmarTextoResponse createFirmarTextoResponse() {
        return new FirmarTextoResponse();
    }

    /**
     * Create an instance of {@link FirmarXml }
     * 
     */
    public FirmarXml createFirmarXml() {
        return new FirmarXml();
    }

    /**
     * Create an instance of {@link FirmarTexto }
     * 
     */
    public FirmarTexto createFirmarTexto() {
        return new FirmarTexto();
    }

    /**
     * Create an instance of {@link FirmaTxtResp }
     * 
     */
    public FirmaTxtResp createFirmaTxtResp() {
        return new FirmaTxtResp();
    }

    /**
     * Create an instance of {@link FirmaArchivoResp }
     * 
     */
    public FirmaArchivoResp createFirmaArchivoResp() {
        return new FirmaArchivoResp();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FirmarXmlResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://firma.ws.servicios.bse.com/", name = "firmarXmlResponse")
    public JAXBElement<FirmarXmlResponse> createFirmarXmlResponse(FirmarXmlResponse value) {
        return new JAXBElement<FirmarXmlResponse>(_FirmarXmlResponse_QNAME, FirmarXmlResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FirmarPdf }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://firma.ws.servicios.bse.com/", name = "firmarPdf")
    public JAXBElement<FirmarPdf> createFirmarPdf(FirmarPdf value) {
        return new JAXBElement<FirmarPdf>(_FirmarPdf_QNAME, FirmarPdf.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FirmarPdfResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://firma.ws.servicios.bse.com/", name = "firmarPdfResponse")
    public JAXBElement<FirmarPdfResponse> createFirmarPdfResponse(FirmarPdfResponse value) {
        return new JAXBElement<FirmarPdfResponse>(_FirmarPdfResponse_QNAME, FirmarPdfResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FirmarTexto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://firma.ws.servicios.bse.com/", name = "firmarTexto")
    public JAXBElement<FirmarTexto> createFirmarTexto(FirmarTexto value) {
        return new JAXBElement<FirmarTexto>(_FirmarTexto_QNAME, FirmarTexto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FirmarXml }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://firma.ws.servicios.bse.com/", name = "firmarXml")
    public JAXBElement<FirmarXml> createFirmarXml(FirmarXml value) {
        return new JAXBElement<FirmarXml>(_FirmarXml_QNAME, FirmarXml.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FirmarTextoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://firma.ws.servicios.bse.com/", name = "firmarTextoResponse")
    public JAXBElement<FirmarTextoResponse> createFirmarTextoResponse(FirmarTextoResponse value) {
        return new JAXBElement<FirmarTextoResponse>(_FirmarTextoResponse_QNAME, FirmarTextoResponse.class, null, value);
    }

}
