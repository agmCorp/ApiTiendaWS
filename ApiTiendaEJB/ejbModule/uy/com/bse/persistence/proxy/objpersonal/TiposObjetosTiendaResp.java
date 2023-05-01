
package uy.com.bse.persistence.proxy.objpersonal;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tiposObjetosTiendaResp complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tiposObjetosTiendaResp">
 *   &lt;complexContent>
 *     &lt;extension base="{http://opersonal.ws.servicios.bse.com/}errorTiendaResp">
 *       &lt;sequence>
 *         &lt;element name="tiposObjetosList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="tipoObjeto" type="{http://opersonal.ws.servicios.bse.com/}itemCodiguera" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "tiposObjetosTiendaResp", propOrder = {
    "tiposObjetosList"
})
public class TiposObjetosTiendaResp
    extends ErrorTiendaResp
{

    protected TiposObjetosTiendaResp.TiposObjetosList tiposObjetosList;

    /**
     * Obtiene el valor de la propiedad tiposObjetosList.
     * 
     * @return
     *     possible object is
     *     {@link TiposObjetosTiendaResp.TiposObjetosList }
     *     
     */
    public TiposObjetosTiendaResp.TiposObjetosList getTiposObjetosList() {
        return tiposObjetosList;
    }

    /**
     * Define el valor de la propiedad tiposObjetosList.
     * 
     * @param value
     *     allowed object is
     *     {@link TiposObjetosTiendaResp.TiposObjetosList }
     *     
     */
    public void setTiposObjetosList(TiposObjetosTiendaResp.TiposObjetosList value) {
        this.tiposObjetosList = value;
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
     *         &lt;element name="tipoObjeto" type="{http://opersonal.ws.servicios.bse.com/}itemCodiguera" maxOccurs="unbounded" minOccurs="0"/>
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
        "tipoObjeto"
    })
    public static class TiposObjetosList {

        protected List<ItemCodiguera> tipoObjeto;

        /**
         * Gets the value of the tipoObjeto property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the tipoObjeto property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTipoObjeto().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ItemCodiguera }
         * 
         * 
         */
        public List<ItemCodiguera> getTipoObjeto() {
            if (tipoObjeto == null) {
                tipoObjeto = new ArrayList<ItemCodiguera>();
            }
            return this.tipoObjeto;
        }

    }

}
