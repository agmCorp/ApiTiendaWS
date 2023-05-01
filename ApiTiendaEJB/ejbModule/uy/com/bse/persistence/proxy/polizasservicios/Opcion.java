
package uy.com.bse.persistence.proxy.polizasservicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para opcion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="opcion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="impresionDorso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="seleccionada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "opcion", propOrder = {
    "codigo",
    "descripcion",
    "impresionDorso",
    "seleccionada"
})
public class Opcion {

    protected String codigo;
    protected String descripcion;
    protected String impresionDorso;
    protected String seleccionada;

    /**
     * Obtiene el valor de la propiedad codigo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Define el valor de la propiedad codigo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigo(String value) {
        this.codigo = value;
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
     * Obtiene el valor de la propiedad impresionDorso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImpresionDorso() {
        return impresionDorso;
    }

    /**
     * Define el valor de la propiedad impresionDorso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImpresionDorso(String value) {
        this.impresionDorso = value;
    }

    /**
     * Obtiene el valor de la propiedad seleccionada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeleccionada() {
        return seleccionada;
    }

    /**
     * Define el valor de la propiedad seleccionada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeleccionada(String value) {
        this.seleccionada = value;
    }

}
