
package uy.com.bse.persistence.proxy.polizasservicios;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para impresionPoliza complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="impresionPoliza">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cartas" type="{http://ws.polizas.bse.com.uy/}opcion" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="codRamo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="codSucursal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="impresionAccidentesTrabajo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="impresionCartas" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="impresionCertificado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="impresionMercosur" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="impresionPoliza" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="impresionResumen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="impresionSoa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numCertificado" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="numEndoso" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="numPoliza" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="partes" type="{http://ws.polizas.bse.com.uy/}opcion" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="reportePremio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "impresionPoliza", propOrder = {
    "cartas",
    "codRamo",
    "codSucursal",
    "impresionAccidentesTrabajo",
    "impresionCartas",
    "impresionCertificado",
    "impresionMercosur",
    "impresionPoliza",
    "impresionResumen",
    "impresionSoa",
    "numCertificado",
    "numEndoso",
    "numPoliza",
    "partes",
    "reportePremio"
})
public class ImpresionPoliza {

    @XmlElement(nillable = true)
    protected List<Opcion> cartas;
    protected Integer codRamo;
    protected String codSucursal;
    protected String impresionAccidentesTrabajo;
    protected String impresionCartas;
    protected String impresionCertificado;
    protected String impresionMercosur;
    protected String impresionPoliza;
    protected String impresionResumen;
    protected String impresionSoa;
    protected Integer numCertificado;
    protected Integer numEndoso;
    protected Integer numPoliza;
    @XmlElement(nillable = true)
    protected List<Opcion> partes;
    protected String reportePremio;

    /**
     * Gets the value of the cartas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cartas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCartas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Opcion }
     * 
     * 
     */
    public List<Opcion> getCartas() {
        if (cartas == null) {
            cartas = new ArrayList<Opcion>();
        }
        return this.cartas;
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
     * Obtiene el valor de la propiedad codSucursal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodSucursal() {
        return codSucursal;
    }

    /**
     * Define el valor de la propiedad codSucursal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodSucursal(String value) {
        this.codSucursal = value;
    }

    /**
     * Obtiene el valor de la propiedad impresionAccidentesTrabajo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImpresionAccidentesTrabajo() {
        return impresionAccidentesTrabajo;
    }

    /**
     * Define el valor de la propiedad impresionAccidentesTrabajo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImpresionAccidentesTrabajo(String value) {
        this.impresionAccidentesTrabajo = value;
    }

    /**
     * Obtiene el valor de la propiedad impresionCartas.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImpresionCartas() {
        return impresionCartas;
    }

    /**
     * Define el valor de la propiedad impresionCartas.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImpresionCartas(String value) {
        this.impresionCartas = value;
    }

    /**
     * Obtiene el valor de la propiedad impresionCertificado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImpresionCertificado() {
        return impresionCertificado;
    }

    /**
     * Define el valor de la propiedad impresionCertificado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImpresionCertificado(String value) {
        this.impresionCertificado = value;
    }

    /**
     * Obtiene el valor de la propiedad impresionMercosur.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImpresionMercosur() {
        return impresionMercosur;
    }

    /**
     * Define el valor de la propiedad impresionMercosur.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImpresionMercosur(String value) {
        this.impresionMercosur = value;
    }

    /**
     * Obtiene el valor de la propiedad impresionPoliza.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImpresionPoliza() {
        return impresionPoliza;
    }

    /**
     * Define el valor de la propiedad impresionPoliza.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImpresionPoliza(String value) {
        this.impresionPoliza = value;
    }

    /**
     * Obtiene el valor de la propiedad impresionResumen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImpresionResumen() {
        return impresionResumen;
    }

    /**
     * Define el valor de la propiedad impresionResumen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImpresionResumen(String value) {
        this.impresionResumen = value;
    }

    /**
     * Obtiene el valor de la propiedad impresionSoa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImpresionSoa() {
        return impresionSoa;
    }

    /**
     * Define el valor de la propiedad impresionSoa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImpresionSoa(String value) {
        this.impresionSoa = value;
    }

    /**
     * Obtiene el valor de la propiedad numCertificado.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumCertificado() {
        return numCertificado;
    }

    /**
     * Define el valor de la propiedad numCertificado.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumCertificado(Integer value) {
        this.numCertificado = value;
    }

    /**
     * Obtiene el valor de la propiedad numEndoso.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumEndoso() {
        return numEndoso;
    }

    /**
     * Define el valor de la propiedad numEndoso.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumEndoso(Integer value) {
        this.numEndoso = value;
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

    /**
     * Gets the value of the partes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Opcion }
     * 
     * 
     */
    public List<Opcion> getPartes() {
        if (partes == null) {
            partes = new ArrayList<Opcion>();
        }
        return this.partes;
    }

    /**
     * Obtiene el valor de la propiedad reportePremio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportePremio() {
        return reportePremio;
    }

    /**
     * Define el valor de la propiedad reportePremio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportePremio(String value) {
        this.reportePremio = value;
    }

}
