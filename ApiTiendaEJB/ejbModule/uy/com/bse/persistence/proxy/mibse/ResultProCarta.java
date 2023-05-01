
package uy.com.bse.persistence.proxy.mibse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para resultProCarta complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="resultProCarta">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.mibse.bse.com.uy/}resultGenerico">
 *       &lt;sequence>
 *         &lt;element name="nomReporte" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nuCarta" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resultProCarta", propOrder = {
    "nomReporte",
    "nuCarta"
})
public class ResultProCarta
    extends ResultGenerico
{

    protected String nomReporte;
    protected int nuCarta;

    /**
     * Obtiene el valor de la propiedad nomReporte.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomReporte() {
        return nomReporte;
    }

    /**
     * Define el valor de la propiedad nomReporte.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomReporte(String value) {
        this.nomReporte = value;
    }

    /**
     * Obtiene el valor de la propiedad nuCarta.
     * 
     */
    public int getNuCarta() {
        return nuCarta;
    }

    /**
     * Define el valor de la propiedad nuCarta.
     * 
     */
    public void setNuCarta(int value) {
        this.nuCarta = value;
    }

}
