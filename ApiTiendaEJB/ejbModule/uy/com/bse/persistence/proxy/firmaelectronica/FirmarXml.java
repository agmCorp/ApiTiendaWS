
package uy.com.bse.persistence.proxy.firmaelectronica;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para firmarXml complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="firmarXml">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="usuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contrasena" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="archivoFirmar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombreArchivoFirmar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "firmarXml", propOrder = {
    "usuario",
    "contrasena",
    "archivoFirmar",
    "nombreArchivoFirmar",
    "usuarioApp",
    "observaciones"
})
public class FirmarXml {

    protected String usuario;
    protected String contrasena;
    protected String archivoFirmar;
    protected String nombreArchivoFirmar;
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
     * Obtiene el valor de la propiedad archivoFirmar.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArchivoFirmar() {
        return archivoFirmar;
    }

    /**
     * Define el valor de la propiedad archivoFirmar.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArchivoFirmar(String value) {
        this.archivoFirmar = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreArchivoFirmar.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreArchivoFirmar() {
        return nombreArchivoFirmar;
    }

    /**
     * Define el valor de la propiedad nombreArchivoFirmar.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreArchivoFirmar(String value) {
        this.nombreArchivoFirmar = value;
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
