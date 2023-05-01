
package uy.com.bse.persistence.proxy.firmaelectronica;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para firmarPdf complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="firmarPdf">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="usuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contrasena" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="archivoPdfFirmar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombrePdfFirmar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="usuarioApp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="observaciones" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "firmarPdf", propOrder = {
    "usuario",
    "contrasena",
    "archivoPdfFirmar",
    "nombrePdfFirmar",
    "usuarioApp",
    "observaciones"
})
public class FirmarPdf {

    protected String usuario;
    protected String contrasena;
    protected String archivoPdfFirmar;
    protected String nombrePdfFirmar;
    protected String usuarioApp;
    protected String observaciones;

    /**
     * Obtiene el valor de la propiedad usuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * Define el valor de la propiedad usuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuario(String value) {
        this.usuario = value;
    }

    /**
     * Obtiene el valor de la propiedad contrasena.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContrasena() {
        return contrasena;
    }

    /**
     * Define el valor de la propiedad contrasena.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContrasena(String value) {
        this.contrasena = value;
    }

    /**
     * Obtiene el valor de la propiedad archivoPdfFirmar.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArchivoPdfFirmar() {
        return archivoPdfFirmar;
    }

    /**
     * Define el valor de la propiedad archivoPdfFirmar.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArchivoPdfFirmar(String value) {
        this.archivoPdfFirmar = value;
    }

    /**
     * Obtiene el valor de la propiedad nombrePdfFirmar.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombrePdfFirmar() {
        return nombrePdfFirmar;
    }

    /**
     * Define el valor de la propiedad nombrePdfFirmar.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombrePdfFirmar(String value) {
        this.nombrePdfFirmar = value;
    }

    /**
     * Obtiene el valor de la propiedad usuarioApp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuarioApp() {
        return usuarioApp;
    }

    /**
     * Define el valor de la propiedad usuarioApp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuarioApp(String value) {
        this.usuarioApp = value;
    }

    /**
     * Obtiene el valor de la propiedad observaciones.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservaciones() {
        return observaciones;
    }

    /**
     * Define el valor de la propiedad observaciones.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservaciones(String value) {
        this.observaciones = value;
    }

}
