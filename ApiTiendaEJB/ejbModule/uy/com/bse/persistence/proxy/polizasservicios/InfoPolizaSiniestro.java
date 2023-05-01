
package uy.com.bse.persistence.proxy.polizasservicios;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para infoPolizaSiniestro complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="infoPolizaSiniestro">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="datosPoliza" type="{http://ws.polizas.bse.com.uy/}encabezadoPoliza" minOccurs="0"/>
 *         &lt;element name="siniestros" type="{http://ws.polizas.bse.com.uy/}datosBasicosSiniestro" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "infoPolizaSiniestro", propOrder = {
    "datosPoliza",
    "siniestros"
})
public class InfoPolizaSiniestro {

    protected EncabezadoPoliza datosPoliza;
    @XmlElement(nillable = true)
    protected List<DatosBasicosSiniestro> siniestros;

    /**
     * Obtiene el valor de la propiedad datosPoliza.
     * 
     * @return
     *     possible object is
     *     {@link EncabezadoPoliza }
     *     
     */
    public EncabezadoPoliza getDatosPoliza() {
        return datosPoliza;
    }

    /**
     * Define el valor de la propiedad datosPoliza.
     * 
     * @param value
     *     allowed object is
     *     {@link EncabezadoPoliza }
     *     
     */
    public void setDatosPoliza(EncabezadoPoliza value) {
        this.datosPoliza = value;
    }

    /**
     * Gets the value of the siniestros property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the siniestros property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSiniestros().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DatosBasicosSiniestro }
     * 
     * 
     */
    public List<DatosBasicosSiniestro> getSiniestros() {
        if (siniestros == null) {
            siniestros = new ArrayList<DatosBasicosSiniestro>();
        }
        return this.siniestros;
    }

}
