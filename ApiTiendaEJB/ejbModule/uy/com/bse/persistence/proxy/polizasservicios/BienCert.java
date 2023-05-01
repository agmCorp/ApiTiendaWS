
package uy.com.bse.persistence.proxy.polizasservicios;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para bienCert complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="bienCert">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="acreedoresBien" type="{http://ws.polizas.bse.com.uy/}acreedorBien" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="beneficiariosBien" type="{http://ws.polizas.bse.com.uy/}beneficiario" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="certificado" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="cliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="coberturas" type="{http://ws.polizas.bse.com.uy/}cobertura" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="codPlanCobertura" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoBien" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="consecutivo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="datos" type="{http://ws.polizas.bse.com.uy/}datosBienCert" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="etiquetaCapital" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaBaja" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="habilitoAcreedores" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="habilitoAnexos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="habilitoBeneficiarios" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="habilitoListaBienes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="habilitoNominas" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="habilitoQuitarBien" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="habilitoTextos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="habilitoUbicacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="objetosBien" type="{http://ws.polizas.bse.com.uy/}objetoBien" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="posicionBien" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="requierePadron" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="seleccionado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ubicacionBien" type="{http://ws.polizas.bse.com.uy/}ubicacion" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bienCert", propOrder = {
    "acreedoresBien",
    "beneficiariosBien",
    "certificado",
    "cliente",
    "coberturas",
    "codPlanCobertura",
    "codigoBien",
    "consecutivo",
    "datos",
    "descripcion",
    "etiquetaCapital",
    "fechaBaja",
    "habilitoAcreedores",
    "habilitoAnexos",
    "habilitoBeneficiarios",
    "habilitoListaBienes",
    "habilitoNominas",
    "habilitoQuitarBien",
    "habilitoTextos",
    "habilitoUbicacion",
    "objetosBien",
    "posicionBien",
    "requierePadron",
    "seleccionado",
    "ubicacionBien"
})
@XmlSeeAlso({
    BienCobertura.class,
    BienAsegurado.class
})
public class BienCert {

    @XmlElement(nillable = true)
    protected List<AcreedorBien> acreedoresBien;
    @XmlElement(nillable = true)
    protected List<Beneficiario> beneficiariosBien;
    protected Integer certificado;
    protected String cliente;
    @XmlElement(nillable = true)
    protected List<Cobertura> coberturas;
    protected String codPlanCobertura;
    protected Integer codigoBien;
    protected Integer consecutivo;
    @XmlElement(nillable = true)
    protected List<DatosBienCert> datos;
    protected String descripcion;
    protected String etiquetaCapital;
    protected String fechaBaja;
    protected String habilitoAcreedores;
    protected String habilitoAnexos;
    protected String habilitoBeneficiarios;
    protected String habilitoListaBienes;
    protected String habilitoNominas;
    protected String habilitoQuitarBien;
    protected String habilitoTextos;
    protected String habilitoUbicacion;
    @XmlElement(nillable = true)
    protected List<ObjetoBien> objetosBien;
    protected Integer posicionBien;
    protected String requierePadron;
    protected String seleccionado;
    protected Ubicacion ubicacionBien;

    /**
     * Gets the value of the acreedoresBien property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acreedoresBien property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcreedoresBien().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AcreedorBien }
     * 
     * 
     */
    public List<AcreedorBien> getAcreedoresBien() {
        if (acreedoresBien == null) {
            acreedoresBien = new ArrayList<AcreedorBien>();
        }
        return this.acreedoresBien;
    }

    /**
     * Gets the value of the beneficiariosBien property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the beneficiariosBien property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBeneficiariosBien().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Beneficiario }
     * 
     * 
     */
    public List<Beneficiario> getBeneficiariosBien() {
        if (beneficiariosBien == null) {
            beneficiariosBien = new ArrayList<Beneficiario>();
        }
        return this.beneficiariosBien;
    }

    /**
     * Obtiene el valor de la propiedad certificado.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCertificado() {
        return certificado;
    }

    /**
     * Define el valor de la propiedad certificado.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCertificado(Integer value) {
        this.certificado = value;
    }

    /**
     * Obtiene el valor de la propiedad cliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCliente() {
        return cliente;
    }

    /**
     * Define el valor de la propiedad cliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCliente(String value) {
        this.cliente = value;
    }

    /**
     * Gets the value of the coberturas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the coberturas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCoberturas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Cobertura }
     * 
     * 
     */
    public List<Cobertura> getCoberturas() {
        if (coberturas == null) {
            coberturas = new ArrayList<Cobertura>();
        }
        return this.coberturas;
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
     * Obtiene el valor de la propiedad codigoBien.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodigoBien() {
        return codigoBien;
    }

    /**
     * Define el valor de la propiedad codigoBien.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodigoBien(Integer value) {
        this.codigoBien = value;
    }

    /**
     * Obtiene el valor de la propiedad consecutivo.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConsecutivo() {
        return consecutivo;
    }

    /**
     * Define el valor de la propiedad consecutivo.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConsecutivo(Integer value) {
        this.consecutivo = value;
    }

    /**
     * Gets the value of the datos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the datos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDatos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DatosBienCert }
     * 
     * 
     */
    public List<DatosBienCert> getDatos() {
        if (datos == null) {
            datos = new ArrayList<DatosBienCert>();
        }
        return this.datos;
    }

    /**
     * Obtiene el valor de la propiedad descripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Define el valor de la propiedad descripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcion(String value) {
        this.descripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad etiquetaCapital.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEtiquetaCapital() {
        return etiquetaCapital;
    }

    /**
     * Define el valor de la propiedad etiquetaCapital.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEtiquetaCapital(String value) {
        this.etiquetaCapital = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaBaja.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaBaja() {
        return fechaBaja;
    }

    /**
     * Define el valor de la propiedad fechaBaja.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaBaja(String value) {
        this.fechaBaja = value;
    }

    /**
     * Obtiene el valor de la propiedad habilitoAcreedores.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHabilitoAcreedores() {
        return habilitoAcreedores;
    }

    /**
     * Define el valor de la propiedad habilitoAcreedores.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHabilitoAcreedores(String value) {
        this.habilitoAcreedores = value;
    }

    /**
     * Obtiene el valor de la propiedad habilitoAnexos.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHabilitoAnexos() {
        return habilitoAnexos;
    }

    /**
     * Define el valor de la propiedad habilitoAnexos.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHabilitoAnexos(String value) {
        this.habilitoAnexos = value;
    }

    /**
     * Obtiene el valor de la propiedad habilitoBeneficiarios.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHabilitoBeneficiarios() {
        return habilitoBeneficiarios;
    }

    /**
     * Define el valor de la propiedad habilitoBeneficiarios.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHabilitoBeneficiarios(String value) {
        this.habilitoBeneficiarios = value;
    }

    /**
     * Obtiene el valor de la propiedad habilitoListaBienes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHabilitoListaBienes() {
        return habilitoListaBienes;
    }

    /**
     * Define el valor de la propiedad habilitoListaBienes.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHabilitoListaBienes(String value) {
        this.habilitoListaBienes = value;
    }

    /**
     * Obtiene el valor de la propiedad habilitoNominas.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHabilitoNominas() {
        return habilitoNominas;
    }

    /**
     * Define el valor de la propiedad habilitoNominas.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHabilitoNominas(String value) {
        this.habilitoNominas = value;
    }

    /**
     * Obtiene el valor de la propiedad habilitoQuitarBien.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHabilitoQuitarBien() {
        return habilitoQuitarBien;
    }

    /**
     * Define el valor de la propiedad habilitoQuitarBien.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHabilitoQuitarBien(String value) {
        this.habilitoQuitarBien = value;
    }

    /**
     * Obtiene el valor de la propiedad habilitoTextos.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHabilitoTextos() {
        return habilitoTextos;
    }

    /**
     * Define el valor de la propiedad habilitoTextos.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHabilitoTextos(String value) {
        this.habilitoTextos = value;
    }

    /**
     * Obtiene el valor de la propiedad habilitoUbicacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHabilitoUbicacion() {
        return habilitoUbicacion;
    }

    /**
     * Define el valor de la propiedad habilitoUbicacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHabilitoUbicacion(String value) {
        this.habilitoUbicacion = value;
    }

    /**
     * Gets the value of the objetosBien property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the objetosBien property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObjetosBien().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjetoBien }
     * 
     * 
     */
    public List<ObjetoBien> getObjetosBien() {
        if (objetosBien == null) {
            objetosBien = new ArrayList<ObjetoBien>();
        }
        return this.objetosBien;
    }

    /**
     * Obtiene el valor de la propiedad posicionBien.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPosicionBien() {
        return posicionBien;
    }

    /**
     * Define el valor de la propiedad posicionBien.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPosicionBien(Integer value) {
        this.posicionBien = value;
    }

    /**
     * Obtiene el valor de la propiedad requierePadron.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequierePadron() {
        return requierePadron;
    }

    /**
     * Define el valor de la propiedad requierePadron.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequierePadron(String value) {
        this.requierePadron = value;
    }

    /**
     * Obtiene el valor de la propiedad seleccionado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeleccionado() {
        return seleccionado;
    }

    /**
     * Define el valor de la propiedad seleccionado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeleccionado(String value) {
        this.seleccionado = value;
    }

    /**
     * Obtiene el valor de la propiedad ubicacionBien.
     * 
     * @return
     *     possible object is
     *     {@link Ubicacion }
     *     
     */
    public Ubicacion getUbicacionBien() {
        return ubicacionBien;
    }

    /**
     * Define el valor de la propiedad ubicacionBien.
     * 
     * @param value
     *     allowed object is
     *     {@link Ubicacion }
     *     
     */
    public void setUbicacionBien(Ubicacion value) {
        this.ubicacionBien = value;
    }

}
