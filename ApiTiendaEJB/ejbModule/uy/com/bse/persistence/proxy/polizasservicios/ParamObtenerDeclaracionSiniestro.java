
package uy.com.bse.persistence.proxy.polizasservicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para paramObtenerDeclaracionSiniestro complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="paramObtenerDeclaracionSiniestro">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.polizas.bse.com.uy/}paramGenerico">
 *       &lt;sequence>
 *         &lt;element name="anio" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codRamo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numSiniestro" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paramObtenerDeclaracionSiniestro", propOrder = {
    "anio",
    "codRamo",
    "numSiniestro"
})
public class ParamObtenerDeclaracionSiniestro
    extends ParamGenerico
{

    @XmlElement(required = true, nillable = true)
    protected String anio;
    @XmlElement(required = true, nillable = true)
    protected String codRamo;
    @XmlElement(required = true, nillable = true)
    protected String numSiniestro;

    /**
     * Obtiene el valor de la propiedad anio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnio() {
        return anio;
    }

    /**
     * Define el valor de la propiedad anio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnio(String value) {
        this.anio = value;
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
     * Obtiene el valor de la propiedad numSiniestro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumSiniestro() {
        return numSiniestro;
    }

    /**
     * Define el valor de la propiedad numSiniestro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumSiniestro(String value) {
        this.numSiniestro = value;
    }

}
