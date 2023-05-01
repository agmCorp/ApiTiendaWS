
package uy.com.bse.persistence.proxy.mibse;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para datosCliente complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="datosCliente">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="apellido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codProfesion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="codSexo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codTipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="comunicaciones" type="{http://ws.mibse.bse.com.uy/}datosComunicacion" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="descProfesion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descSexo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descTipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaNacimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numCI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numPersona" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="razonSocial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rut" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "datosCliente", propOrder = {
    "apellido",
    "codProfesion",
    "codSexo",
    "codTipoDocumento",
    "comunicaciones",
    "descProfesion",
    "descSexo",
    "descTipoDocumento",
    "fechaNacimiento",
    "nombre",
    "numCI",
    "numDocumento",
    "numPersona",
    "razonSocial",
    "rut"
})
public class DatosCliente {

    protected String apellido;
    protected Integer codProfesion;
    protected String codSexo;
    protected String codTipoDocumento;
    @XmlElement(nillable = true)
    protected List<DatosComunicacion> comunicaciones;
    protected String descProfesion;
    protected String descSexo;
    protected String descTipoDocumento;
    protected String fechaNacimiento;
    protected String nombre;
    protected String numCI;
    protected String numDocumento;
    protected Integer numPersona;
    protected String razonSocial;
    protected String rut;

    /**
     * Obtiene el valor de la propiedad apellido.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Define el valor de la propiedad apellido.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApellido(String value) {
        this.apellido = value;
    }

    /**
     * Obtiene el valor de la propiedad codProfesion.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodProfesion() {
        return codProfesion;
    }

    /**
     * Define el valor de la propiedad codProfesion.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodProfesion(Integer value) {
        this.codProfesion = value;
    }

    /**
     * Obtiene el valor de la propiedad codSexo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodSexo() {
        return codSexo;
    }

    /**
     * Define el valor de la propiedad codSexo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodSexo(String value) {
        this.codSexo = value;
    }

    /**
     * Obtiene el valor de la propiedad codTipoDocumento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodTipoDocumento() {
        return codTipoDocumento;
    }

    /**
     * Define el valor de la propiedad codTipoDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodTipoDocumento(String value) {
        this.codTipoDocumento = value;
    }

    /**
     * Gets the value of the comunicaciones property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the comunicaciones property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComunicaciones().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DatosComunicacion }
     * 
     * 
     */
    public List<DatosComunicacion> getComunicaciones() {
        if (comunicaciones == null) {
            comunicaciones = new ArrayList<DatosComunicacion>();
        }
        return this.comunicaciones;
    }

    /**
     * Obtiene el valor de la propiedad descProfesion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescProfesion() {
        return descProfesion;
    }

    /**
     * Define el valor de la propiedad descProfesion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescProfesion(String value) {
        this.descProfesion = value;
    }

    /**
     * Obtiene el valor de la propiedad descSexo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescSexo() {
        return descSexo;
    }

    /**
     * Define el valor de la propiedad descSexo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescSexo(String value) {
        this.descSexo = value;
    }

    /**
     * Obtiene el valor de la propiedad descTipoDocumento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescTipoDocumento() {
        return descTipoDocumento;
    }

    /**
     * Define el valor de la propiedad descTipoDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescTipoDocumento(String value) {
        this.descTipoDocumento = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaNacimiento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * Define el valor de la propiedad fechaNacimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaNacimiento(String value) {
        this.fechaNacimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Obtiene el valor de la propiedad numCI.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumCI() {
        return numCI;
    }

    /**
     * Define el valor de la propiedad numCI.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumCI(String value) {
        this.numCI = value;
    }

    /**
     * Obtiene el valor de la propiedad numDocumento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumDocumento() {
        return numDocumento;
    }

    /**
     * Define el valor de la propiedad numDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumDocumento(String value) {
        this.numDocumento = value;
    }

    /**
     * Obtiene el valor de la propiedad numPersona.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumPersona() {
        return numPersona;
    }

    /**
     * Define el valor de la propiedad numPersona.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumPersona(Integer value) {
        this.numPersona = value;
    }

    /**
     * Obtiene el valor de la propiedad razonSocial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRazonSocial() {
        return razonSocial;
    }

    /**
     * Define el valor de la propiedad razonSocial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRazonSocial(String value) {
        this.razonSocial = value;
    }

    /**
     * Obtiene el valor de la propiedad rut.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRut() {
        return rut;
    }

    /**
     * Define el valor de la propiedad rut.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRut(String value) {
        this.rut = value;
    }

}
