
package uy.com.bse.persistence.proxy.polizasservicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para paramObtenerValoresXDatoParametrico complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="paramObtenerValoresXDatoParametrico">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.polizas.bse.com.uy/}paramGenerico">
 *       &lt;sequence>
 *         &lt;element name="codTabla" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="filtro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paramObtenerValoresXDatoParametrico", propOrder = {
    "codTabla",
    "filtro"
})
public class ParamObtenerValoresXDatoParametrico
    extends ParamGenerico
{

    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer codTabla;
    protected String filtro;

    /**
     * Obtiene el valor de la propiedad codTabla.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodTabla() {
        return codTabla;
    }

    /**
     * Define el valor de la propiedad codTabla.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodTabla(Integer value) {
        this.codTabla = value;
    }

    /**
     * Obtiene el valor de la propiedad filtro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFiltro() {
        return filtro;
    }

    /**
     * Define el valor de la propiedad filtro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFiltro(String value) {
        this.filtro = value;
    }

}
