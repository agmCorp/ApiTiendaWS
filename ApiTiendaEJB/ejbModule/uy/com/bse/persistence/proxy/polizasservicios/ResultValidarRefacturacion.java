
package uy.com.bse.persistence.proxy.polizasservicios;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para resultValidarRefacturacion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="resultValidarRefacturacion">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.polizas.bse.com.uy/}resultGenerico">
 *       &lt;sequence>
 *         &lt;element name="bienes" type="{http://ws.polizas.bse.com.uy/}bien" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="detallePoliza" type="{http://ws.polizas.bse.com.uy/}detalleRefacturacionPoliza" minOccurs="0"/>
 *         &lt;element name="habilitoEmitir" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="habilitoFacturacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="habilitoModificar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="habilitoRefacturar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resultValidarRefacturacion", propOrder = {
    "bienes",
    "detallePoliza",
    "habilitoEmitir",
    "habilitoFacturacion",
    "habilitoModificar",
    "habilitoRefacturar"
})
public class ResultValidarRefacturacion
    extends ResultGenerico
{

    @XmlElement(nillable = true)
    protected List<Bien> bienes;
    protected DetalleRefacturacionPoliza detallePoliza;
    protected String habilitoEmitir;
    protected String habilitoFacturacion;
    protected String habilitoModificar;
    protected String habilitoRefacturar;

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
     * {@link Bien }
     * 
     * 
     */
    public List<Bien> getBienes() {
        if (bienes == null) {
            bienes = new ArrayList<Bien>();
        }
        return this.bienes;
    }

    /**
     * Obtiene el valor de la propiedad detallePoliza.
     * 
     * @return
     *     possible object is
     *     {@link DetalleRefacturacionPoliza }
     *     
     */
    public DetalleRefacturacionPoliza getDetallePoliza() {
        return detallePoliza;
    }

    /**
     * Define el valor de la propiedad detallePoliza.
     * 
     * @param value
     *     allowed object is
     *     {@link DetalleRefacturacionPoliza }
     *     
     */
    public void setDetallePoliza(DetalleRefacturacionPoliza value) {
        this.detallePoliza = value;
    }

    /**
     * Obtiene el valor de la propiedad habilitoEmitir.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHabilitoEmitir() {
        return habilitoEmitir;
    }

    /**
     * Define el valor de la propiedad habilitoEmitir.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHabilitoEmitir(String value) {
        this.habilitoEmitir = value;
    }

    /**
     * Obtiene el valor de la propiedad habilitoFacturacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHabilitoFacturacion() {
        return habilitoFacturacion;
    }

    /**
     * Define el valor de la propiedad habilitoFacturacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHabilitoFacturacion(String value) {
        this.habilitoFacturacion = value;
    }

    /**
     * Obtiene el valor de la propiedad habilitoModificar.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHabilitoModificar() {
        return habilitoModificar;
    }

    /**
     * Define el valor de la propiedad habilitoModificar.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHabilitoModificar(String value) {
        this.habilitoModificar = value;
    }

    /**
     * Obtiene el valor de la propiedad habilitoRefacturar.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHabilitoRefacturar() {
        return habilitoRefacturar;
    }

    /**
     * Define el valor de la propiedad habilitoRefacturar.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHabilitoRefacturar(String value) {
        this.habilitoRefacturar = value;
    }

}
