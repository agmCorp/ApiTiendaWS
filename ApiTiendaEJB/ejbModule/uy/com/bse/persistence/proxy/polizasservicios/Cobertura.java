
package uy.com.bse.persistence.proxy.polizasservicios;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para cobertura complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="cobertura">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="actualizado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bienDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bienNum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="capital" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="coberturaCod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="coberturaDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deducible" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="editable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="elementosNum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="error" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="errorGenerado" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="planes" type="{http://ws.polizas.bse.com.uy/}planPago" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="prima" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="ramoCod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="requerido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sumaAsegurada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sumaDisponible" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="tasaPrima" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valor" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cobertura", propOrder = {
    "actualizado",
    "bienDesc",
    "bienNum",
    "capital",
    "coberturaCod",
    "coberturaDesc",
    "deducible",
    "descripcion",
    "editable",
    "elementosNum",
    "error",
    "errorGenerado",
    "nombre",
    "planes",
    "prima",
    "ramoCod",
    "requerido",
    "sumaAsegurada",
    "sumaDisponible",
    "tasaPrima",
    "valor"
})
public class Cobertura {

    protected String actualizado;
    protected String bienDesc;
    protected Integer bienNum;
    protected Double capital;
    protected String coberturaCod;
    protected String coberturaDesc;
    protected Double deducible;
    protected String descripcion;
    protected String editable;
    protected Integer elementosNum;
    protected String error;
    protected Boolean errorGenerado;
    protected String nombre;
    @XmlElement(nillable = true)
    protected List<PlanPago> planes;
    protected Double prima;
    protected Integer ramoCod;
    protected String requerido;
    protected String sumaAsegurada;
    protected Double sumaDisponible;
    protected String tasaPrima;
    protected Double valor;

    /**
     * Obtiene el valor de la propiedad actualizado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActualizado() {
        return actualizado;
    }

    /**
     * Define el valor de la propiedad actualizado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActualizado(String value) {
        this.actualizado = value;
    }

    /**
     * Obtiene el valor de la propiedad bienDesc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBienDesc() {
        return bienDesc;
    }

    /**
     * Define el valor de la propiedad bienDesc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBienDesc(String value) {
        this.bienDesc = value;
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
     * Obtiene el valor de la propiedad capital.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCapital() {
        return capital;
    }

    /**
     * Define el valor de la propiedad capital.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCapital(Double value) {
        this.capital = value;
    }

    /**
     * Obtiene el valor de la propiedad coberturaCod.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoberturaCod() {
        return coberturaCod;
    }

    /**
     * Define el valor de la propiedad coberturaCod.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoberturaCod(String value) {
        this.coberturaCod = value;
    }

    /**
     * Obtiene el valor de la propiedad coberturaDesc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoberturaDesc() {
        return coberturaDesc;
    }

    /**
     * Define el valor de la propiedad coberturaDesc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoberturaDesc(String value) {
        this.coberturaDesc = value;
    }

    /**
     * Obtiene el valor de la propiedad deducible.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDeducible() {
        return deducible;
    }

    /**
     * Define el valor de la propiedad deducible.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDeducible(Double value) {
        this.deducible = value;
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
     * Obtiene el valor de la propiedad editable.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEditable() {
        return editable;
    }

    /**
     * Define el valor de la propiedad editable.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEditable(String value) {
        this.editable = value;
    }

    /**
     * Obtiene el valor de la propiedad elementosNum.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getElementosNum() {
        return elementosNum;
    }

    /**
     * Define el valor de la propiedad elementosNum.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setElementosNum(Integer value) {
        this.elementosNum = value;
    }

    /**
     * Obtiene el valor de la propiedad error.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getError() {
        return error;
    }

    /**
     * Define el valor de la propiedad error.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setError(String value) {
        this.error = value;
    }

    /**
     * Obtiene el valor de la propiedad errorGenerado.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isErrorGenerado() {
        return errorGenerado;
    }

    /**
     * Define el valor de la propiedad errorGenerado.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setErrorGenerado(Boolean value) {
        this.errorGenerado = value;
    }

    /**
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Gets the value of the planes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the planes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlanes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PlanPago }
     * 
     * 
     */
    public List<PlanPago> getPlanes() {
        if (planes == null) {
            planes = new ArrayList<PlanPago>();
        }
        return this.planes;
    }

    /**
     * Obtiene el valor de la propiedad prima.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPrima() {
        return prima;
    }

    /**
     * Define el valor de la propiedad prima.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPrima(Double value) {
        this.prima = value;
    }

    /**
     * Obtiene el valor de la propiedad ramoCod.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRamoCod() {
        return ramoCod;
    }

    /**
     * Define el valor de la propiedad ramoCod.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRamoCod(Integer value) {
        this.ramoCod = value;
    }

    /**
     * Obtiene el valor de la propiedad requerido.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequerido() {
        return requerido;
    }

    /**
     * Define el valor de la propiedad requerido.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequerido(String value) {
        this.requerido = value;
    }

    /**
     * Obtiene el valor de la propiedad sumaAsegurada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSumaAsegurada() {
        return sumaAsegurada;
    }

    /**
     * Define el valor de la propiedad sumaAsegurada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSumaAsegurada(String value) {
        this.sumaAsegurada = value;
    }

    /**
     * Obtiene el valor de la propiedad sumaDisponible.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSumaDisponible() {
        return sumaDisponible;
    }

    /**
     * Define el valor de la propiedad sumaDisponible.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSumaDisponible(Double value) {
        this.sumaDisponible = value;
    }

    /**
     * Obtiene el valor de la propiedad tasaPrima.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTasaPrima() {
        return tasaPrima;
    }

    /**
     * Define el valor de la propiedad tasaPrima.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTasaPrima(String value) {
        this.tasaPrima = value;
    }

    /**
     * Obtiene el valor de la propiedad valor.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getValor() {
        return valor;
    }

    /**
     * Define el valor de la propiedad valor.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setValor(Double value) {
        this.valor = value;
    }

}
