
package uy.com.bse.persistence.proxy.polizasservicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para texto complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="texto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codSucursal" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="codTexto" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="darBaja" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripTexto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaDesde" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaHasta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="impresion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numConsecutivo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="numEndoso" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="persiste" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "texto", propOrder = {
    "codSucursal",
    "codTexto",
    "darBaja",
    "descripTexto",
    "fechaDesde",
    "fechaHasta",
    "impresion",
    "numConsecutivo",
    "numEndoso",
    "persiste"
})
public class Texto {

    protected Integer codSucursal;
    protected Integer codTexto;
    protected String darBaja;
    protected String descripTexto;
    protected String fechaDesde;
    protected String fechaHasta;
    protected String impresion;
    protected Integer numConsecutivo;
    protected Integer numEndoso;
    protected String persiste;

    /**
     * Obtiene el valor de la propiedad codSucursal.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodSucursal() {
        return codSucursal;
    }

    /**
     * Define el valor de la propiedad codSucursal.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodSucursal(Integer value) {
        this.codSucursal = value;
    }

    /**
     * Obtiene el valor de la propiedad codTexto.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodTexto() {
        return codTexto;
    }

    /**
     * Define el valor de la propiedad codTexto.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodTexto(Integer value) {
        this.codTexto = value;
    }

    /**
     * Obtiene el valor de la propiedad darBaja.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDarBaja() {
        return darBaja;
    }

    /**
     * Define el valor de la propiedad darBaja.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDarBaja(String value) {
        this.darBaja = value;
    }

    /**
     * Obtiene el valor de la propiedad descripTexto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripTexto() {
        return descripTexto;
    }

    /**
     * Define el valor de la propiedad descripTexto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripTexto(String value) {
        this.descripTexto = value;
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
     * Obtiene el valor de la propiedad fechaHasta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaHasta() {
        return fechaHasta;
    }

    /**
     * Define el valor de la propiedad fechaHasta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaHasta(String value) {
        this.fechaHasta = value;
    }

    /**
     * Obtiene el valor de la propiedad impresion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImpresion() {
        return impresion;
    }

    /**
     * Define el valor de la propiedad impresion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImpresion(String value) {
        this.impresion = value;
    }

    /**
     * Obtiene el valor de la propiedad numConsecutivo.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumConsecutivo() {
        return numConsecutivo;
    }

    /**
     * Define el valor de la propiedad numConsecutivo.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumConsecutivo(Integer value) {
        this.numConsecutivo = value;
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
     * Obtiene el valor de la propiedad persiste.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersiste() {
        return persiste;
    }

    /**
     * Define el valor de la propiedad persiste.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersiste(String value) {
        this.persiste = value;
    }

}
