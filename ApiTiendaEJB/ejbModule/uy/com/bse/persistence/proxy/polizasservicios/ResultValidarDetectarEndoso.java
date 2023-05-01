
package uy.com.bse.persistence.proxy.polizasservicios;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para resultValidarDetectarEndoso complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="resultValidarDetectarEndoso">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.polizas.bse.com.uy/}resultGenerico">
 *       &lt;sequence>
 *         &lt;element name="bienes" type="{http://ws.polizas.bse.com.uy/}bienCert" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="codMail" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="datosBancarios" type="{http://ws.polizas.bse.com.uy/}datosBanco" minOccurs="0"/>
 *         &lt;element name="descMail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaEmision" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mails" type="{http://ws.polizas.bse.com.uy/}mailEC" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="marcaEnvioFac" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="medioPago" type="{http://ws.polizas.bse.com.uy/}medioPago" minOccurs="0"/>
 *         &lt;element name="mediosPago" type="{http://ws.polizas.bse.com.uy/}medioPago" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="origenPago" type="{http://ws.polizas.bse.com.uy/}origenPagoEndoso" minOccurs="0"/>
 *         &lt;element name="origenesXMedioPago" type="{http://ws.polizas.bse.com.uy/}medioPagoOrigenes" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resultValidarDetectarEndoso", propOrder = {
    "bienes",
    "codMail",
    "datosBancarios",
    "descMail",
    "fechaEmision",
    "mails",
    "marcaEnvioFac",
    "medioPago",
    "mediosPago",
    "origenPago",
    "origenesXMedioPago"
})
public class ResultValidarDetectarEndoso
    extends ResultGenerico
{

    @XmlElement(nillable = true)
    protected List<BienCert> bienes;
    protected Integer codMail;
    protected DatosBanco datosBancarios;
    protected String descMail;
    protected String fechaEmision;
    @XmlElement(nillable = true)
    protected List<MailEC> mails;
    protected String marcaEnvioFac;
    protected MedioPago medioPago;
    @XmlElement(nillable = true)
    protected List<MedioPago> mediosPago;
    protected OrigenPagoEndoso origenPago;
    @XmlElement(nillable = true)
    protected List<MedioPagoOrigenes> origenesXMedioPago;

    /**
     * Gets the value of the bienes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bienes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBienes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BienCert }
     * 
     * 
     */
    public List<BienCert> getBienes() {
        if (bienes == null) {
            bienes = new ArrayList<BienCert>();
        }
        return this.bienes;
    }

    /**
     * Obtiene el valor de la propiedad codMail.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodMail() {
        return codMail;
    }

    /**
     * Define el valor de la propiedad codMail.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodMail(Integer value) {
        this.codMail = value;
    }

    /**
     * Obtiene el valor de la propiedad datosBancarios.
     * 
     * @return
     *     possible object is
     *     {@link DatosBanco }
     *     
     */
    public DatosBanco getDatosBancarios() {
        return datosBancarios;
    }

    /**
     * Define el valor de la propiedad datosBancarios.
     * 
     * @param value
     *     allowed object is
     *     {@link DatosBanco }
     *     
     */
    public void setDatosBancarios(DatosBanco value) {
        this.datosBancarios = value;
    }

    /**
     * Obtiene el valor de la propiedad descMail.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescMail() {
        return descMail;
    }

    /**
     * Define el valor de la propiedad descMail.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescMail(String value) {
        this.descMail = value;
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
     * Gets the value of the mails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MailEC }
     * 
     * 
     */
    public List<MailEC> getMails() {
        if (mails == null) {
            mails = new ArrayList<MailEC>();
        }
        return this.mails;
    }

    /**
     * Obtiene el valor de la propiedad marcaEnvioFac.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarcaEnvioFac() {
        return marcaEnvioFac;
    }

    /**
     * Define el valor de la propiedad marcaEnvioFac.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarcaEnvioFac(String value) {
        this.marcaEnvioFac = value;
    }

    /**
     * Obtiene el valor de la propiedad medioPago.
     * 
     * @return
     *     possible object is
     *     {@link MedioPago }
     *     
     */
    public MedioPago getMedioPago() {
        return medioPago;
    }

    /**
     * Define el valor de la propiedad medioPago.
     * 
     * @param value
     *     allowed object is
     *     {@link MedioPago }
     *     
     */
    public void setMedioPago(MedioPago value) {
        this.medioPago = value;
    }

    /**
     * Gets the value of the mediosPago property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mediosPago property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMediosPago().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MedioPago }
     * 
     * 
     */
    public List<MedioPago> getMediosPago() {
        if (mediosPago == null) {
            mediosPago = new ArrayList<MedioPago>();
        }
        return this.mediosPago;
    }

    /**
     * Obtiene el valor de la propiedad origenPago.
     * 
     * @return
     *     possible object is
     *     {@link OrigenPagoEndoso }
     *     
     */
    public OrigenPagoEndoso getOrigenPago() {
        return origenPago;
    }

    /**
     * Define el valor de la propiedad origenPago.
     * 
     * @param value
     *     allowed object is
     *     {@link OrigenPagoEndoso }
     *     
     */
    public void setOrigenPago(OrigenPagoEndoso value) {
        this.origenPago = value;
    }

    /**
     * Gets the value of the origenesXMedioPago property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the origenesXMedioPago property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrigenesXMedioPago().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MedioPagoOrigenes }
     * 
     * 
     */
    public List<MedioPagoOrigenes> getOrigenesXMedioPago() {
        if (origenesXMedioPago == null) {
            origenesXMedioPago = new ArrayList<MedioPagoOrigenes>();
        }
        return this.origenesXMedioPago;
    }

}
