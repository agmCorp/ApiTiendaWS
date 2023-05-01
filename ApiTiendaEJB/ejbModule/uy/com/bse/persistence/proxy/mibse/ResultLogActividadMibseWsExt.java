
package uy.com.bse.persistence.proxy.mibse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para resultLogActividadMibseWsExt complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="resultLogActividadMibseWsExt">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.mibse.bse.com.uy/}resultGenerico">
 *       &lt;sequence>
 *         &lt;element name="codError" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="descError" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sqlError" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resultLogActividadMibseWsExt", propOrder = {
    "codError",
    "descError",
    "sqlError"
})
public class ResultLogActividadMibseWsExt
    extends ResultGenerico
{

    protected Integer codError;
    protected String descError;
    protected String sqlError;

    /**
     * Obtiene el valor de la propiedad codError.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodError() {
        return codError;
    }

    /**
     * Define el valor de la propiedad codError.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodError(Integer value) {
        this.codError = value;
    }

    /**
     * Obtiene el valor de la propiedad descError.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescError() {
        return descError;
    }

    /**
     * Define el valor de la propiedad descError.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescError(String value) {
        this.descError = value;
    }

    /**
     * Obtiene el valor de la propiedad sqlError.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSqlError() {
        return sqlError;
    }

    /**
     * Define el valor de la propiedad sqlError.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSqlError(String value) {
        this.sqlError = value;
    }

}
