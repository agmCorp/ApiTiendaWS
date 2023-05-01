
package uy.com.bse.persistence.proxy.polizasservicios;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para paramModificacionSinPremio complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="paramModificacionSinPremio">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.polizas.bse.com.uy/}paramGenerico">
 *       &lt;sequence>
 *         &lt;element name="bienes" type="{http://ws.polizas.bse.com.uy/}bienCert" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="codMedioPago" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="codOrigenEndoso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codOrigenPago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="datosBancarios" type="{http://ws.polizas.bse.com.uy/}datosBanco" minOccurs="0"/>
 *         &lt;element name="fechaDesde" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numCertificado" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numEndoso" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numPoliza" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numRamo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paramModificacionSinPremio", propOrder = {
    "bienes",
    "codMedioPago",
    "codOrigenEndoso",
    "codOrigenPago",
    "datosBancarios",
    "fechaDesde",
    "numCertificado",
    "numEndoso",
    "numPoliza",
    "numRamo"
})
public class ParamModificacionSinPremio
    extends ParamGenerico
{

    @XmlElement(nillable = true)
    protected List<BienCert> bienes;
    protected Integer codMedioPago;
    protected String codOrigenEndoso;
    protected String codOrigenPago;
    protected DatosBanco datosBancarios;
    @XmlElement(required = true, nillable = true)
    protected String fechaDesde;
    @XmlElement(required = true, nillable = true)
    protected String numCertificado;
    @XmlElement(required = true, nillable = true)
    protected String numEndoso;
    @XmlElement(required = true, nillable = true)
    protected String numPoliza;
    @XmlElement(required = true, nillable = true)
    protected String numRamo;

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
     * Obtiene el valor de la propiedad codMedioPago.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodMedioPago() {
        return codMedioPago;
    }

    /**
     * Define el valor de la propiedad codMedioPago.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodMedioPago(Integer value) {
        this.codMedioPago = value;
    }

    /**
     * Obtiene el valor de la propiedad codOrigenEndoso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodOrigenEndoso() {
        return codOrigenEndoso;
    }

    /**
     * Define el valor de la propiedad codOrigenEndoso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodOrigenEndoso(String value) {
        this.codOrigenEndoso = value;
    }

    /**
     * Obtiene el valor de la propiedad codOrigenPago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodOrigenPago() {
        return codOrigenPago;
    }

    /**
     * Define el valor de la propiedad codOrigenPago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodOrigenPago(String value) {
        this.codOrigenPago = value;
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
     * Obtiene el valor de la propiedad numCertificado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumCertificado() {
        return numCertificado;
    }

    /**
     * Define el valor de la propiedad numCertificado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumCertificado(String value) {
        this.numCertificado = value;
    }

    /**
     * Obtiene el valor de la propiedad numEndoso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumEndoso() {
        return numEndoso;
    }

    /**
     * Define el valor de la propiedad numEndoso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumEndoso(String value) {
        this.numEndoso = value;
    }

    /**
     * Obtiene el valor de la propiedad numPoliza.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumPoliza() {
        return numPoliza;
    }

    /**
     * Define el valor de la propiedad numPoliza.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumPoliza(String value) {
        this.numPoliza = value;
    }

    /**
     * Obtiene el valor de la propiedad numRamo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumRamo() {
        return numRamo;
    }

    /**
     * Define el valor de la propiedad numRamo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumRamo(String value) {
        this.numRamo = value;
    }

}
