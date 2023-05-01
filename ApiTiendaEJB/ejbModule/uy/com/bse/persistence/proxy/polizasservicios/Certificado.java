
package uy.com.bse.persistence.proxy.polizasservicios;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para certificado complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="certificado">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="activo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="anexos" type="{http://ws.polizas.bse.com.uy/}anexo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="anulado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="asegurado" type="{http://ws.polizas.bse.com.uy/}cliente" minOccurs="0"/>
 *         &lt;element name="bien" type="{http://ws.polizas.bse.com.uy/}bien" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="bienCert" type="{http://ws.polizas.bse.com.uy/}bienCert" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="bienes" type="{http://ws.polizas.bse.com.uy/}bienCobertura" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="bienesCobertura" type="{http://ws.polizas.bse.com.uy/}bienCobertura" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="certificadoNuevo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codPlanCobertura" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descPlanCobertura" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="direccionesAsegurado" type="{http://ws.polizas.bse.com.uy/}direccionEC" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="existeAsegurado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="habilitoInsertar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="listaPlanesCobertura" type="{http://ws.polizas.bse.com.uy/}planCobertura" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="listaPosiblesPlanesCobertura" type="{http://ws.polizas.bse.com.uy/}planCobertura" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="numCertificado" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="permiteAnular" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requiereAsegurado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "certificado", propOrder = {
    "activo",
    "anexos",
    "anulado",
    "asegurado",
    "bien",
    "bienCert",
    "bienes",
    "bienesCobertura",
    "certificadoNuevo",
    "codPlanCobertura",
    "descPlanCobertura",
    "direccionesAsegurado",
    "existeAsegurado",
    "habilitoInsertar",
    "listaPlanesCobertura",
    "listaPosiblesPlanesCobertura",
    "numCertificado",
    "permiteAnular",
    "requiereAsegurado"
})
public class Certificado {

    protected String activo;
    @XmlElement(nillable = true)
    protected List<Anexo> anexos;
    protected String anulado;
    protected Cliente asegurado;
    @XmlElement(nillable = true)
    protected List<Bien> bien;
    @XmlElement(nillable = true)
    protected List<BienCert> bienCert;
    @XmlElement(nillable = true)
    protected List<BienCobertura> bienes;
    @XmlElement(nillable = true)
    protected List<BienCobertura> bienesCobertura;
    protected String certificadoNuevo;
    protected String codPlanCobertura;
    protected String descPlanCobertura;
    @XmlElement(nillable = true)
    protected List<DireccionEC> direccionesAsegurado;
    protected String existeAsegurado;
    protected String habilitoInsertar;
    @XmlElement(nillable = true)
    protected List<PlanCobertura> listaPlanesCobertura;
    @XmlElement(nillable = true)
    protected List<PlanCobertura> listaPosiblesPlanesCobertura;
    protected Integer numCertificado;
    protected String permiteAnular;
    protected String requiereAsegurado;

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
     * Gets the value of the anexos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the anexos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnexos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Anexo }
     * 
     * 
     */
    public List<Anexo> getAnexos() {
        if (anexos == null) {
            anexos = new ArrayList<Anexo>();
        }
        return this.anexos;
    }

    /**
     * Obtiene el valor de la propiedad anulado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnulado() {
        return anulado;
    }

    /**
     * Define el valor de la propiedad anulado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnulado(String value) {
        this.anulado = value;
    }

    /**
     * Obtiene el valor de la propiedad asegurado.
     * 
     * @return
     *     possible object is
     *     {@link Cliente }
     *     
     */
    public Cliente getAsegurado() {
        return asegurado;
    }

    /**
     * Define el valor de la propiedad asegurado.
     * 
     * @param value
     *     allowed object is
     *     {@link Cliente }
     *     
     */
    public void setAsegurado(Cliente value) {
        this.asegurado = value;
    }

    /**
     * Gets the value of the bien property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bien property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBien().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Bien }
     * 
     * 
     */
    public List<Bien> getBien() {
        if (bien == null) {
            bien = new ArrayList<Bien>();
        }
        return this.bien;
    }

    /**
     * Gets the value of the bienCert property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bienCert property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBienCert().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BienCert }
     * 
     * 
     */
    public List<BienCert> getBienCert() {
        if (bienCert == null) {
            bienCert = new ArrayList<BienCert>();
        }
        return this.bienCert;
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
     * {@link BienCobertura }
     * 
     * 
     */
    public List<BienCobertura> getBienes() {
        if (bienes == null) {
            bienes = new ArrayList<BienCobertura>();
        }
        return this.bienes;
    }

    /**
     * Gets the value of the bienesCobertura property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bienesCobertura property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBienesCobertura().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BienCobertura }
     * 
     * 
     */
    public List<BienCobertura> getBienesCobertura() {
        if (bienesCobertura == null) {
            bienesCobertura = new ArrayList<BienCobertura>();
        }
        return this.bienesCobertura;
    }

    /**
     * Obtiene el valor de la propiedad certificadoNuevo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificadoNuevo() {
        return certificadoNuevo;
    }

    /**
     * Define el valor de la propiedad certificadoNuevo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificadoNuevo(String value) {
        this.certificadoNuevo = value;
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
     * Gets the value of the direccionesAsegurado property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the direccionesAsegurado property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDireccionesAsegurado().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DireccionEC }
     * 
     * 
     */
    public List<DireccionEC> getDireccionesAsegurado() {
        if (direccionesAsegurado == null) {
            direccionesAsegurado = new ArrayList<DireccionEC>();
        }
        return this.direccionesAsegurado;
    }

    /**
     * Obtiene el valor de la propiedad existeAsegurado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExisteAsegurado() {
        return existeAsegurado;
    }

    /**
     * Define el valor de la propiedad existeAsegurado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExisteAsegurado(String value) {
        this.existeAsegurado = value;
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
     * Gets the value of the listaPlanesCobertura property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listaPlanesCobertura property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListaPlanesCobertura().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PlanCobertura }
     * 
     * 
     */
    public List<PlanCobertura> getListaPlanesCobertura() {
        if (listaPlanesCobertura == null) {
            listaPlanesCobertura = new ArrayList<PlanCobertura>();
        }
        return this.listaPlanesCobertura;
    }

    /**
     * Gets the value of the listaPosiblesPlanesCobertura property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listaPosiblesPlanesCobertura property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListaPosiblesPlanesCobertura().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PlanCobertura }
     * 
     * 
     */
    public List<PlanCobertura> getListaPosiblesPlanesCobertura() {
        if (listaPosiblesPlanesCobertura == null) {
            listaPosiblesPlanesCobertura = new ArrayList<PlanCobertura>();
        }
        return this.listaPosiblesPlanesCobertura;
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

    /**
     * Obtiene el valor de la propiedad requiereAsegurado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequiereAsegurado() {
        return requiereAsegurado;
    }

    /**
     * Define el valor de la propiedad requiereAsegurado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequiereAsegurado(String value) {
        this.requiereAsegurado = value;
    }

}
