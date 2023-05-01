
package uy.com.bse.persistence.proxy.polizasservicios;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para resultObtenerAnexosPoliza complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="resultObtenerAnexosPoliza">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.polizas.bse.com.uy/}resultGenerico">
 *       &lt;sequence>
 *         &lt;element name="anexos" type="{http://ws.polizas.bse.com.uy/}anexo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="encabezadoDetallePoliza" type="{http://ws.polizas.bse.com.uy/}encabezadoDetallePoliza" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resultObtenerAnexosPoliza", propOrder = {
    "anexos",
    "encabezadoDetallePoliza"
})
public class ResultObtenerAnexosPoliza
    extends ResultGenerico
{

    @XmlElement(nillable = true)
    protected List<Anexo> anexos;
    protected EncabezadoDetallePoliza encabezadoDetallePoliza;

    /**
     * Gets the value of the anexos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the anexos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnexos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Anexo }
     * 
     * 
     */
    public List<Anexo> getAnexos() {
        if (anexos == null) {
            anexos = new ArrayList<Anexo>();
        }
        return this.anexos;
    }

    /**
     * Obtiene el valor de la propiedad encabezadoDetallePoliza.
     * 
     * @return
     *     possible object is
     *     {@link EncabezadoDetallePoliza }
     *     
     */
    public EncabezadoDetallePoliza getEncabezadoDetallePoliza() {
        return encabezadoDetallePoliza;
    }

    /**
     * Define el valor de la propiedad encabezadoDetallePoliza.
     * 
     * @param value
     *     allowed object is
     *     {@link EncabezadoDetallePoliza }
     *     
     */
    public void setEncabezadoDetallePoliza(EncabezadoDetallePoliza value) {
        this.encabezadoDetallePoliza = value;
    }

}
