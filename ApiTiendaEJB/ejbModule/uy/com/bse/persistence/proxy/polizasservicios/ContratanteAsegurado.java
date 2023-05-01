
package uy.com.bse.persistence.proxy.polizasservicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para contratanteAsegurado complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="contratanteAsegurado">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codCliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codCondicionIva" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codMailDoc" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="codMailFact" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="codNacionalidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codPersoneria" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="codTarjeta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descMailDoc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descMailFact" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripCondicionIva" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripPersoneria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripTarjeta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="direccionCobro" type="{http://ws.polizas.bse.com.uy/}direccionEC" minOccurs="0"/>
 *         &lt;element name="direccionEnvio" type="{http://ws.polizas.bse.com.uy/}direccionEC" minOccurs="0"/>
 *         &lt;element name="enviarFacturaEMail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombrePersona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rut" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contratanteAsegurado", propOrder = {
    "codCliente",
    "codCondicionIva",
    "codMailDoc",
    "codMailFact",
    "codNacionalidad",
    "codPersoneria",
    "codTarjeta",
    "descMailDoc",
    "descMailFact",
    "descripCondicionIva",
    "descripPersoneria",
    "descripTarjeta",
    "direccionCobro",
    "direccionEnvio",
    "enviarFacturaEMail",
    "nombrePersona",
    "rut"
})
public class ContratanteAsegurado {

    protected String codCliente;
    protected String codCondicionIva;
    protected Integer codMailDoc;
    protected Integer codMailFact;
    protected String codNacionalidad;
    protected Integer codPersoneria;
    protected String codTarjeta;
    protected String descMailDoc;
    protected String descMailFact;
    protected String descripCondicionIva;
    protected String descripPersoneria;
    protected String descripTarjeta;
    protected DireccionEC direccionCobro;
    protected DireccionEC direccionEnvio;
    protected String enviarFacturaEMail;
    protected String nombrePersona;
    protected String rut;

    /**
     * Obtiene el valor de la propiedad codCliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodCliente() {
        return codCliente;
    }

    /**
     * Define el valor de la propiedad codCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodCliente(String value) {
        this.codCliente = value;
    }

    /**
     * Obtiene el valor de la propiedad codCondicionIva.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodCondicionIva() {
        return codCondicionIva;
    }

    /**
     * Define el valor de la propiedad codCondicionIva.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodCondicionIva(String value) {
        this.codCondicionIva = value;
    }

    /**
     * Obtiene el valor de la propiedad codMailDoc.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodMailDoc() {
        return codMailDoc;
    }

    /**
     * Define el valor de la propiedad codMailDoc.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodMailDoc(Integer value) {
        this.codMailDoc = value;
    }

    /**
     * Obtiene el valor de la propiedad codMailFact.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodMailFact() {
        return codMailFact;
    }

    /**
     * Define el valor de la propiedad codMailFact.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodMailFact(Integer value) {
        this.codMailFact = value;
    }

    /**
     * Obtiene el valor de la propiedad codNacionalidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodNacionalidad() {
        return codNacionalidad;
    }

    /**
     * Define el valor de la propiedad codNacionalidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodNacionalidad(String value) {
        this.codNacionalidad = value;
    }

    /**
     * Obtiene el valor de la propiedad codPersoneria.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodPersoneria() {
        return codPersoneria;
    }

    /**
     * Define el valor de la propiedad codPersoneria.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodPersoneria(Integer value) {
        this.codPersoneria = value;
    }

    /**
     * Obtiene el valor de la propiedad codTarjeta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodTarjeta() {
        return codTarjeta;
    }

    /**
     * Define el valor de la propiedad codTarjeta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodTarjeta(String value) {
        this.codTarjeta = value;
    }

    /**
     * Obtiene el valor de la propiedad descMailDoc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescMailDoc() {
        return descMailDoc;
    }

    /**
     * Define el valor de la propiedad descMailDoc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescMailDoc(String value) {
        this.descMailDoc = value;
    }

    /**
     * Obtiene el valor de la propiedad descMailFact.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescMailFact() {
        return descMailFact;
    }

    /**
     * Define el valor de la propiedad descMailFact.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescMailFact(String value) {
        this.descMailFact = value;
    }

    /**
     * Obtiene el valor de la propiedad descripCondicionIva.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripCondicionIva() {
        return descripCondicionIva;
    }

    /**
     * Define el valor de la propiedad descripCondicionIva.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripCondicionIva(String value) {
        this.descripCondicionIva = value;
    }

    /**
     * Obtiene el valor de la propiedad descripPersoneria.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripPersoneria() {
        return descripPersoneria;
    }

    /**
     * Define el valor de la propiedad descripPersoneria.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripPersoneria(String value) {
        this.descripPersoneria = value;
    }

    /**
     * Obtiene el valor de la propiedad descripTarjeta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripTarjeta() {
        return descripTarjeta;
    }

    /**
     * Define el valor de la propiedad descripTarjeta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripTarjeta(String value) {
        this.descripTarjeta = value;
    }

    /**
     * Obtiene el valor de la propiedad direccionCobro.
     * 
     * @return
     *     possible object is
     *     {@link DireccionEC }
     *     
     */
    public DireccionEC getDireccionCobro() {
        return direccionCobro;
    }

    /**
     * Define el valor de la propiedad direccionCobro.
     * 
     * @param value
     *     allowed object is
     *     {@link DireccionEC }
     *     
     */
    public void setDireccionCobro(DireccionEC value) {
        this.direccionCobro = value;
    }

    /**
     * Obtiene el valor de la propiedad direccionEnvio.
     * 
     * @return
     *     possible object is
     *     {@link DireccionEC }
     *     
     */
    public DireccionEC getDireccionEnvio() {
        return direccionEnvio;
    }

    /**
     * Define el valor de la propiedad direccionEnvio.
     * 
     * @param value
     *     allowed object is
     *     {@link DireccionEC }
     *     
     */
    public void setDireccionEnvio(DireccionEC value) {
        this.direccionEnvio = value;
    }

    /**
     * Obtiene el valor de la propiedad enviarFacturaEMail.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnviarFacturaEMail() {
        return enviarFacturaEMail;
    }

    /**
     * Define el valor de la propiedad enviarFacturaEMail.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnviarFacturaEMail(String value) {
        this.enviarFacturaEMail = value;
    }

    /**
     * Obtiene el valor de la propiedad nombrePersona.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombrePersona() {
        return nombrePersona;
    }

    /**
     * Define el valor de la propiedad nombrePersona.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombrePersona(String value) {
        this.nombrePersona = value;
    }

    /**
     * Obtiene el valor de la propiedad rut.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRut() {
        return rut;
    }

    /**
     * Define el valor de la propiedad rut.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRut(String value) {
        this.rut = value;
    }

}
