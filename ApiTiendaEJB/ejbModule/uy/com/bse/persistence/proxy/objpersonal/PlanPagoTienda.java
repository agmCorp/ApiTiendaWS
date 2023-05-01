
package uy.com.bse.persistence.proxy.objpersonal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para planPagoTienda complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="planPagoTienda">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="cuotaMinima" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nroCuotas" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "planPagoTienda", propOrder = {
    "codigo",
    "cuotaMinima",
    "descripcion",
    "nroCuotas"
})
public class PlanPagoTienda {

    protected int codigo;
    protected double cuotaMinima;
    protected String descripcion;
    protected int nroCuotas;

    /**
     * Obtiene el valor de la propiedad codigo.
     * 
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * Define el valor de la propiedad codigo.
     * 
     */
    public void setCodigo(int value) {
        this.codigo = value;
    }

    /**
     * Obtiene el valor de la propiedad cuotaMinima.
     * 
     */
    public double getCuotaMinima() {
        return cuotaMinima;
    }

    /**
     * Define el valor de la propiedad cuotaMinima.
     * 
     */
    public void setCuotaMinima(double value) {
        this.cuotaMinima = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Define el valor de la propiedad descripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcion(String value) {
        this.descripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad nroCuotas.
     * 
     */
    public int getNroCuotas() {
        return nroCuotas;
    }

    /**
     * Define el valor de la propiedad nroCuotas.
     * 
     */
    public void setNroCuotas(int value) {
        this.nroCuotas = value;
    }

}
