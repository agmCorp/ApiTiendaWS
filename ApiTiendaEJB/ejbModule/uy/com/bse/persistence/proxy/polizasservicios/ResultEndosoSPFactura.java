
package uy.com.bse.persistence.proxy.polizasservicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para resultEndosoSPFactura complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="resultEndosoSPFactura">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.polizas.bse.com.uy/}resultGenerico">
 *       &lt;sequence>
 *         &lt;element name="codMailFact" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="codOrigen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codRamo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="codUsuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descMailFact" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaDesde" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaEmision" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mailsPersona" type="{http://ws.polizas.bse.com.uy/}mailEC" minOccurs="0"/>
 *         &lt;element name="marcaEnvioFactura" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numPoliza" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resultEndosoSPFactura", propOrder = {
    "codMailFact",
    "codOrigen",
    "codRamo",
    "codUsuario",
    "descMailFact",
    "fechaDesde",
    "fechaEmision",
    "mailsPersona",
    "marcaEnvioFactura",
    "numPoliza"
})
public class ResultEndosoSPFactura
    extends ResultGenerico
{

    protected Integer codMailFact;
    protected String codOrigen;
    protected Integer codRamo;
    protected String codUsuario;
    protected String descMailFact;
    protected String fechaDesde;
    protected String fechaEmision;
    protected MailEC mailsPersona;
    protected String marcaEnvioFactura;
    protected Integer numPoliza;

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
     * Obtiene el valor de la propiedad codOrigen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodOrigen() {
        return codOrigen;
    }

    /**
     * Define el valor de la propiedad codOrigen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodOrigen(String value) {
        this.codOrigen = value;
    }

    /**
     * Obtiene el valor de la propiedad codRamo.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodRamo() {
        return codRamo;
    }

    /**
     * Define el valor de la propiedad codRamo.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodRamo(Integer value) {
        this.codRamo = value;
    }

    /**
     * Obtiene el valor de la propiedad codUsuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodUsuario() {
        return codUsuario;
    }

    /**
     * Define el valor de la propiedad codUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodUsuario(String value) {
        this.codUsuario = value;
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
     * Obtiene el valor de la propiedad fechaDesde.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaDesde() {
        return fechaDesde;
    }

    /**
     * Define el valor de la propiedad fechaDesde.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaDesde(String value) {
        this.fechaDesde = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaEmision.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaEmision() {
        return fechaEmision;
    }

    /**
     * Define el valor de la propiedad fechaEmision.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaEmision(String value) {
        this.fechaEmision = value;
    }

    /**
     * Obtiene el valor de la propiedad mailsPersona.
     * 
     * @return
     *     possible object is
     *     {@link MailEC }
     *     
     */
    public MailEC getMailsPersona() {
        return mailsPersona;
    }

    /**
     * Define el valor de la propiedad mailsPersona.
     * 
     * @param value
     *     allowed object is
     *     {@link MailEC }
     *     
     */
    public void setMailsPersona(MailEC value) {
        this.mailsPersona = value;
    }

    /**
     * Obtiene el valor de la propiedad marcaEnvioFactura.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarcaEnvioFactura() {
        return marcaEnvioFactura;
    }

    /**
     * Define el valor de la propiedad marcaEnvioFactura.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarcaEnvioFactura(String value) {
        this.marcaEnvioFactura = value;
    }

    /**
     * Obtiene el valor de la propiedad numPoliza.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumPoliza() {
        return numPoliza;
    }

    /**
     * Define el valor de la propiedad numPoliza.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumPoliza(Integer value) {
        this.numPoliza = value;
    }

}
