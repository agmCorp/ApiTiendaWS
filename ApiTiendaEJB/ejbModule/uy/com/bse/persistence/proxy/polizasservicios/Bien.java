
package uy.com.bse.persistence.proxy.polizasservicios;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para bien complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="bien">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bienDescripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bienNum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="certificado" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="coberturas" type="{http://ws.polizas.bse.com.uy/}cobertura" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="codBien" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="consecutivo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="datos" type="{http://ws.polizas.bse.com.uy/}datosBien" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="detalleCoberturaXBienEtiquetaColumna" type="{http://ws.polizas.bse.com.uy/}detalleCoberturaXBienEtiquetaColumna" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="etiquetaCapital" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaBaja" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="franquicias" type="{http://ws.polizas.bse.com.uy/}franquicia" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="habilitoAcreedores" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="habilitoAnexos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="habilitoBeneficiarios" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="habilitoListaBienes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="habilitoNominas" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="habilitoQuitar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="habilitoTextos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="habilitoUbicacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="posBien" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
@XmlType(name = "bien", propOrder = {
    "bienDescripcion",
    "bienNum",
    "certificado",
    "coberturas",
    "codBien",
    "consecutivo",
    "datos",
    "detalleCoberturaXBienEtiquetaColumna",
    "etiquetaCapital",
    "fechaBaja",
    "franquicias",
    "habilitoAcreedores",
    "habilitoAnexos",
    "habilitoBeneficiarios",
    "habilitoListaBienes",
    "habilitoNominas",
    "habilitoQuitar",
    "habilitoTextos",
    "habilitoUbicacion",
    "posBien",
    "ubicacionBien"
})
public class Bien {

    protected String bienDescripcion;
    protected Integer bienNum;
    protected Integer certificado;
    @XmlElement(nillable = true)
    protected List<Cobertura> coberturas;
    protected Integer codBien;
    protected Integer consecutivo;
    @XmlElement(nillable = true)
    protected List<DatosBien> datos;
    @XmlElement(nillable = true)
    protected List<DetalleCoberturaXBienEtiquetaColumna> detalleCoberturaXBienEtiquetaColumna;
    protected String etiquetaCapital;
    protected String fechaBaja;
    @XmlElement(nillable = true)
    protected List<Franquicia> franquicias;
    protected String habilitoAcreedores;
    protected String habilitoAnexos;
    protected String habilitoBeneficiarios;
    protected String habilitoListaBienes;
    protected String habilitoNominas;
    protected String habilitoQuitar;
    protected String habilitoTextos;
    protected String habilitoUbicacion;
    protected Integer posBien;
    protected Ubicacion ubicacionBien;

    /**
     * Obtiene el valor de la propiedad bienDescripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBienDescripcion() {
        return bienDescripcion;
    }

    /**
     * Define el valor de la propiedad bienDescripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBienDescripcion(String value) {
        this.bienDescripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad bienNum.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBienNum() {
        return bienNum;
    }

    /**
     * Define el valor de la propiedad bienNum.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBienNum(Integer value) {
        this.bienNum = value;
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
     * Obtiene el valor de la propiedad codBien.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodBien() {
        return codBien;
    }

    /**
     * Define el valor de la propiedad codBien.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodBien(Integer value) {
        this.codBien = value;
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
     * {@link DatosBien }
     * 
     * 
     */
    public List<DatosBien> getDatos() {
        if (datos == null) {
            datos = new ArrayList<DatosBien>();
        }
        return this.datos;
    }

    /**
     * Gets the value of the detalleCoberturaXBienEtiquetaColumna property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the detalleCoberturaXBienEtiquetaColumna property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDetalleCoberturaXBienEtiquetaColumna().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DetalleCoberturaXBienEtiquetaColumna }
     * 
     * 
     */
    public List<DetalleCoberturaXBienEtiquetaColumna> getDetalleCoberturaXBienEtiquetaColumna() {
        if (detalleCoberturaXBienEtiquetaColumna == null) {
            detalleCoberturaXBienEtiquetaColumna = new ArrayList<DetalleCoberturaXBienEtiquetaColumna>();
        }
        return this.detalleCoberturaXBienEtiquetaColumna;
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
     * Gets the value of the franquicias property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the franquicias property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFranquicias().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Franquicia }
     * 
     * 
     */
    public List<Franquicia> getFranquicias() {
        if (franquicias == null) {
            franquicias = new ArrayList<Franquicia>();
        }
        return this.franquicias;
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
     * Obtiene el valor de la propiedad habilitoQuitar.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHabilitoQuitar() {
        return habilitoQuitar;
    }

    /**
     * Define el valor de la propiedad habilitoQuitar.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHabilitoQuitar(String value) {
        this.habilitoQuitar = value;
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
     * Obtiene el valor de la propiedad posBien.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPosBien() {
        return posBien;
    }

    /**
     * Define el valor de la propiedad posBien.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPosBien(Integer value) {
        this.posBien = value;
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
