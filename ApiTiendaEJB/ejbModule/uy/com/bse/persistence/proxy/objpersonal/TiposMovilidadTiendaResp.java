
package uy.com.bse.persistence.proxy.objpersonal;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tiposMovilidadTiendaResp complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tiposMovilidadTiendaResp">
 *   &lt;complexContent>
 *     &lt;extension base="{http://opersonal.ws.servicios.bse.com/}errorTiendaResp">
 *       &lt;sequence>
 *         &lt;element name="tiposMovilidadList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="tipoMovilidad" type="{http://opersonal.ws.servicios.bse.com/}itemCodiguera" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tiposMovilidadTiendaResp", propOrder = {
    "tiposMovilidadList"
})
public class TiposMovilidadTiendaResp
    extends ErrorTiendaResp
{

    protected TiposMovilidadTiendaResp.TiposMovilidadList tiposMovilidadList;

    /**
     * Obtiene el valor de la propiedad tiposMovilidadList.
     * 
     * @return
     *     possible object is
     *     {@link TiposMovilidadTiendaResp.TiposMovilidadList }
     *     
     */
    public TiposMovilidadTiendaResp.TiposMovilidadList getTiposMovilidadList() {
        return tiposMovilidadList;
    }

    /**
     * Define el valor de la propiedad tiposMovilidadList.
     * 
     * @param value
     *     allowed object is
     *     {@link TiposMovilidadTiendaResp.TiposMovilidadList }
     *     
     */
    public void setTiposMovilidadList(TiposMovilidadTiendaResp.TiposMovilidadList value) {
        this.tiposMovilidadList = value;
    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="tipoMovilidad" type="{http://opersonal.ws.servicios.bse.com/}itemCodiguera" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "tipoMovilidad"
    })
    public static class TiposMovilidadList {

        protected List<ItemCodiguera> tipoMovilidad;

        /**
         * Gets the value of the tipoMovilidad property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the tipoMovilidad property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTipoMovilidad().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ItemCodiguera }
         * 
         * 
         */
        public List<ItemCodiguera> getTipoMovilidad() {
            if (tipoMovilidad == null) {
                tipoMovilidad = new ArrayList<ItemCodiguera>();
            }
            return this.tipoMovilidad;
        }

    }

}
