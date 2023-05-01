
package uy.com.bse.persistence.proxy.polizasservicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para paramGenerarMarcaNoRenovar complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="paramGenerarMarcaNoRenovar">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.polizas.bse.com.uy/}paramGenerico">
 *       &lt;sequence>
 *         &lt;element name="codMotAbandono" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codOrigen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codRamo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fechaDesde" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numPoliza" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="obsAbandono" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paramGenerarMarcaNoRenovar", propOrder = {
    "codMotAbandono",
    "codOrigen",
    "codRamo",
    "fechaDesde",
    "numPoliza",
    "obsAbandono"
})
public class ParamGenerarMarcaNoRenovar
    extends ParamGenerico
{

    protected String codMotAbandono;
    protected String codOrigen;
    @XmlElement(required = true, nillable = true)
    protected String codRamo;
    protected String fechaDesde;
    @XmlElement(required = true, nillable = true)
    protected String numPoliza;
    protected String obsAbandono;

    /**
     * Obtiene el valor de la propiedad codMotAbandono.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodMotAbandono() {
        return codMotAbandono;
    }

    /**
     * Define el valor de la propiedad codMotAbandono.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodMotAbandono(String value) {
        this.codMotAbandono = value;
    }

    /**
     * Obtiene el valor de la propiedad codOrigen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodOrigen() {
        return codOrigen;
    }

    /**
     * Define el valor de la propiedad codOrigen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodOrigen(String value) {
        this.codOrigen = value;
    }

    /**
     * Obtiene el valor de la propiedad codRamo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodRamo() {
        return codRamo;
    }

    /**
     * Define el valor de la propiedad codRamo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodRamo(String value) {
        this.codRamo = value;
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
     * Obtiene el valor de la propiedad obsAbandono.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObsAbandono() {
        return obsAbandono;
    }

    /**
     * Define el valor de la propiedad obsAbandono.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObsAbandono(String value) {
        this.obsAbandono = value;
    }

}
