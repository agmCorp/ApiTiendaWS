
package uy.com.bse.persistence.proxy.firmaelectronica;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "FirmaElectronica", targetNamespace = "http://firma.ws.servicios.bse.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface FirmaElectronica {


    /**
     * 
     * @param usuario
     * @param contrasena
     * @param textoFirmar
     * @return
     *     returns uy.com.bse.persistence.proxy.firmaelectronica.FirmaTxtResp
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "firmarTexto", targetNamespace = "http://firma.ws.servicios.bse.com/", className = "uy.com.bse.persistence.proxy.firmaelectronica.FirmarTexto")
    @ResponseWrapper(localName = "firmarTextoResponse", targetNamespace = "http://firma.ws.servicios.bse.com/", className = "uy.com.bse.persistence.proxy.firmaelectronica.FirmarTextoResponse")
    public FirmaTxtResp firmarTexto(
        @WebParam(name = "usuario", targetNamespace = "")
        String usuario,
        @WebParam(name = "contrasena", targetNamespace = "")
        String contrasena,
        @WebParam(name = "textoFirmar", targetNamespace = "")
        String textoFirmar);

    /**
     * 
     * @param archivoFirmar
     * @param observaciones
     * @param usuario
     * @param contrasena
     * @param usuarioApp
     * @param nombreArchivoFirmar
     * @return
     *     returns uy.com.bse.persistence.proxy.firmaelectronica.FirmaArchivoResp
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "firmarXml", targetNamespace = "http://firma.ws.servicios.bse.com/", className = "uy.com.bse.persistence.proxy.firmaelectronica.FirmarXml")
    @ResponseWrapper(localName = "firmarXmlResponse", targetNamespace = "http://firma.ws.servicios.bse.com/", className = "uy.com.bse.persistence.proxy.firmaelectronica.FirmarXmlResponse")
    public FirmaArchivoResp firmarXml(
        @WebParam(name = "usuario", targetNamespace = "")
        String usuario,
        @WebParam(name = "contrasena", targetNamespace = "")
        String contrasena,
        @WebParam(name = "archivoFirmar", targetNamespace = "")
        String archivoFirmar,
        @WebParam(name = "nombreArchivoFirmar", targetNamespace = "")
        String nombreArchivoFirmar,
        @WebParam(name = "usuarioApp", targetNamespace = "")
        String usuarioApp,
        @WebParam(name = "observaciones", targetNamespace = "")
        String observaciones);

    /**
     * 
     * @param archivoPdfFirmar
     * @param observaciones
     * @param usuario
     * @param contrasena
     * @param nombrePdfFirmar
     * @param usuarioApp
     * @return
     *     returns uy.com.bse.persistence.proxy.firmaelectronica.FirmaArchivoResp
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "firmarPdf", targetNamespace = "http://firma.ws.servicios.bse.com/", className = "uy.com.bse.persistence.proxy.firmaelectronica.FirmarPdf")
    @ResponseWrapper(localName = "firmarPdfResponse", targetNamespace = "http://firma.ws.servicios.bse.com/", className = "uy.com.bse.persistence.proxy.firmaelectronica.FirmarPdfResponse")
    public FirmaArchivoResp firmarPdf(
        @WebParam(name = "usuario", targetNamespace = "")
        String usuario,
        @WebParam(name = "contrasena", targetNamespace = "")
        String contrasena,
        @WebParam(name = "archivoPdfFirmar", targetNamespace = "")
        String archivoPdfFirmar,
        @WebParam(name = "nombrePdfFirmar", targetNamespace = "")
        String nombrePdfFirmar,
        @WebParam(name = "usuarioApp", targetNamespace = "")
        String usuarioApp,
        @WebParam(name = "observaciones", targetNamespace = "")
        String observaciones);

}
