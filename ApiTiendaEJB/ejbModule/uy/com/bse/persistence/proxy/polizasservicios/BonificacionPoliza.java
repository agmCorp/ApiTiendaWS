
package uy.com.bse.persistence.proxy.polizasservicios;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para bonificacionPoliza complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="bonificacionPoliza">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="clausula" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numCertificado" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="polizasConSiniestros" type="{http://ws.polizas.bse.com.uy/}infoPolizaSiniestro" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bonificacionPoliza", propOrder = {
    "clausula",
    "numCertificado",
    "polizasConSiniestros"
})
public class BonificacionPoliza {

    protected String clausula;
    protected Integer numCertificado;
    @XmlElement(nillable = true)
    protected List<InfoPolizaSiniestro> polizasConSiniestros;

    /**
     * Obtiene el valor de la propiedad clausula.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClausula() {
        return clausula;
    }

    /**
     * Define el valor de la propiedad clausula.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClausula(String value) {
        this.clausula = value;
    }

    /**
     * Obtiene el valor de la propiedad numCertificado.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumCertificado() {
        return numCertificado;
    }

    /**
     * Define el valor de la propiedad numCertificado.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumCertificado(Integer value) {
        this.numCertificado = value;
    }

    /**
     * Gets the value of the polizasConSiniestros property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the polizasConSiniestros property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPolizasConSiniestros().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InfoPolizaSiniestro }
     * 
     * 
     */
    public List<InfoPolizaSiniestro> getPolizasConSiniestros() {
        if (polizasConSiniestros == null) {
            polizasConSiniestros = new ArrayList<InfoPolizaSiniestro>();
        }
        return this.polizasConSiniestros;
    }

}
