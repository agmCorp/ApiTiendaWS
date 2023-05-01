
package uy.com.bse.persistence.proxy.polizasservicios;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para resultAgregarCertificadoEndoso complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="resultAgregarCertificadoEndoso">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.polizas.bse.com.uy/}resultGenerico">
 *       &lt;sequence>
 *         &lt;element name="activo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bienes" type="{http://ws.polizas.bse.com.uy/}bienCert" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="certificados" type="{http://ws.polizas.bse.com.uy/}certificado" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="codPlanCobertura" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descPlanCobertura" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="habilitoInsertar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numCotizacion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="permiteAnular" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resultAgregarCertificadoEndoso", propOrder = {
    "activo",
    "bienes",
    "certificados",
    "codPlanCobertura",
    "descPlanCobertura",
    "habilitoInsertar",
    "numCotizacion",
    "permiteAnular"
})
public class ResultAgregarCertificadoEndoso
    extends ResultGenerico
{

    protected String activo;
    @XmlElement(nillable = true)
    protected List<BienCert> bienes;
    @XmlElement(nillable = true)
    protected List<Certificado> certificados;
    protected String codPlanCobertura;
    protected String descPlanCobertura;
    protected String habilitoInsertar;
    protected Integer numCotizacion;
    protected String permiteAnular;

    /**
     * Obtiene el valor de la propiedad activo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivo() {
        return activo;
    }

    /**
     * Define el valor de la propiedad activo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivo(String value) {
        this.activo = value;
    }

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
     * Gets the value of the certificados property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the certificados property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCertificados().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Certificado }
     * 
     * 
     */
    public List<Certificado> getCertificados() {
        if (certificados == null) {
            certificados = new ArrayList<Certificado>();
        }
        return this.certificados;
    }

    /**
     * Obtiene el valor de la propiedad codPlanCobertura.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodPlanCobertura() {
        return codPlanCobertura;
    }

    /**
     * Define el valor de la propiedad codPlanCobertura.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodPlanCobertura(String value) {
        this.codPlanCobertura = value;
    }

    /**
     * Obtiene el valor de la propiedad descPlanCobertura.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescPlanCobertura() {
        return descPlanCobertura;
    }

    /**
     * Define el valor de la propiedad descPlanCobertura.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescPlanCobertura(String value) {
        this.descPlanCobertura = value;
    }

    /**
     * Obtiene el valor de la propiedad habilitoInsertar.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHabilitoInsertar() {
        return habilitoInsertar;
    }

    /**
     * Define el valor de la propiedad habilitoInsertar.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHabilitoInsertar(String value) {
        this.habilitoInsertar = value;
    }

    /**
     * Obtiene el valor de la propiedad numCotizacion.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumCotizacion() {
        return numCotizacion;
    }

    /**
     * Define el valor de la propiedad numCotizacion.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumCotizacion(Integer value) {
        this.numCotizacion = value;
    }

    /**
     * Obtiene el valor de la propiedad permiteAnular.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPermiteAnular() {
        return permiteAnular;
    }

    /**
     * Define el valor de la propiedad permiteAnular.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPermiteAnular(String value) {
        this.permiteAnular = value;
    }

}
