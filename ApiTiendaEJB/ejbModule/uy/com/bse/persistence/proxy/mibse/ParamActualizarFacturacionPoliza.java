
package uy.com.bse.persistence.proxy.mibse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para paramActualizarFacturacionPoliza complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="paramActualizarFacturacionPoliza">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.mibse.bse.com.uy/}paramGenerico">
 *       &lt;sequence>
 *         &lt;element name="codMarca" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="codRamo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="numPoliza" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paramActualizarFacturacionPoliza", propOrder = {
    "codMarca",
    "codRamo",
    "numPoliza"
})
public class ParamActualizarFacturacionPoliza
    extends ParamGenerico
{

    protected Boolean codMarca;
    protected Integer codRamo;
    protected Integer numPoliza;

    /**
     * Obtiene el valor de la propiedad codMarca.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCodMarca() {
        return codMarca;
    }

    /**
     * Define el valor de la propiedad codMarca.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCodMarca(Boolean value) {
        this.codMarca = value;
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

}
