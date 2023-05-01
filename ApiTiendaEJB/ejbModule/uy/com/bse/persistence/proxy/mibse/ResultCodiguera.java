
package uy.com.bse.persistence.proxy.mibse;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para resultCodiguera complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="resultCodiguera">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.mibse.bse.com.uy/}resultGenerico">
 *       &lt;sequence>
 *         &lt;element name="items" type="{http://ws.mibse.bse.com.uy/}codiguera" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="valorDefecto" type="{http://ws.mibse.bse.com.uy/}codiguera" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resultCodiguera", propOrder = {
    "items",
    "valorDefecto"
})
public class ResultCodiguera
    extends ResultGenerico
{

    @XmlElement(nillable = true)
    protected List<Codiguera> items;
    protected Codiguera valorDefecto;

    /**
     * Gets the value of the items property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the items property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Codiguera }
     * 
     * 
     */
    public List<Codiguera> getItems() {
        if (items == null) {
            items = new ArrayList<Codiguera>();
        }
        return this.items;
    }

    /**
     * Obtiene el valor de la propiedad valorDefecto.
     * 
     * @return
     *     possible object is
     *     {@link Codiguera }
     *     
     */
    public Codiguera getValorDefecto() {
        return valorDefecto;
    }

    /**
     * Define el valor de la propiedad valorDefecto.
     * 
     * @param value
     *     allowed object is
     *     {@link Codiguera }
     *     
     */
    public void setValorDefecto(Codiguera value) {
        this.valorDefecto = value;
    }

}
