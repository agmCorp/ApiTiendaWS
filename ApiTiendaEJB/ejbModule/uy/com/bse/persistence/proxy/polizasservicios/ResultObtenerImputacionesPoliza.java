
package uy.com.bse.persistence.proxy.polizasservicios;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para resultObtenerImputacionesPoliza complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="resultObtenerImputacionesPoliza">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.polizas.bse.com.uy/}resultGenerico">
 *       &lt;sequence>
 *         &lt;element name="encabezado" type="{http://ws.polizas.bse.com.uy/}encabezadoCuota" minOccurs="0"/>
 *         &lt;element name="imputaciones" type="{http://ws.polizas.bse.com.uy/}imputacion" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resultObtenerImputacionesPoliza", propOrder = {
    "encabezado",
    "imputaciones"
})
public class ResultObtenerImputacionesPoliza
    extends ResultGenerico
{

    protected EncabezadoCuota encabezado;
    @XmlElement(nillable = true)
    protected List<Imputacion> imputaciones;

    /**
     * Obtiene el valor de la propiedad encabezado.
     * 
     * @return
     *     possible object is
     *     {@link EncabezadoCuota }
     *     
     */
    public EncabezadoCuota getEncabezado() {
        return encabezado;
    }

    /**
     * Define el valor de la propiedad encabezado.
     * 
     * @param value
     *     allowed object is
     *     {@link EncabezadoCuota }
     *     
     */
    public void setEncabezado(EncabezadoCuota value) {
        this.encabezado = value;
    }

    /**
     * Gets the value of the imputaciones property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the imputaciones property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImputaciones().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Imputacion }
     * 
     * 
     */
    public List<Imputacion> getImputaciones() {
        if (imputaciones == null) {
            imputaciones = new ArrayList<Imputacion>();
        }
        return this.imputaciones;
    }

}
