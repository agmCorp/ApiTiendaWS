
package uy.com.bse.persistence.proxy.polizasservicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para cliente complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="cliente">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.polizas.bse.com.uy/}resultGenerico">
 *       &lt;sequence>
 *         &lt;element name="anulacionCorrida" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="apellidoRazon" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cel" type="{http://ws.polizas.bse.com.uy/}comunicacionEC" minOccurs="0"/>
 *         &lt;element name="codCliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codProfesion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="descTipoDoc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripPersona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripTipoDoc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="diaVencimiento" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="direccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="direccionCompleta" type="{http://ws.polizas.bse.com.uy/}direccionEC" minOccurs="0"/>
 *         &lt;element name="esCliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="esPep" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaBaja" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaPep" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mail" type="{http://ws.polizas.bse.com.uy/}comunicacionEC" minOccurs="0"/>
 *         &lt;element name="mailEnUso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mailFacturaEnUso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mailFacturas" type="{http://ws.polizas.bse.com.uy/}comunicacionEC" minOccurs="0"/>
 *         &lt;element name="mailPrincipal" type="{http://ws.polizas.bse.com.uy/}comunicacionEC" minOccurs="0"/>
 *         &lt;element name="mailPrincipalEnUso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nacionalidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="noTieneDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombreCompleto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numDoc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numPersona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="observacionPep" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="profesion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rut" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tel" type="{http://ws.polizas.bse.com.uy/}comunicacionEC" minOccurs="0"/>
 *         &lt;element name="textoFraude" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tieneDeuda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoDoc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoPersona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="validaComunicaciones" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cliente", propOrder = {
    "anulacionCorrida",
    "apellidoRazon",
    "cel",
    "codCliente",
    "codProfesion",
    "descTipoDoc",
    "descripPersona",
    "descripTipoDoc",
    "diaVencimiento",
    "direccion",
    "direccionCompleta",
    "esCliente",
    "esPep",
    "fechaBaja",
    "fechaPep",
    "mail",
    "mailEnUso",
    "mailFacturaEnUso",
    "mailFacturas",
    "mailPrincipal",
    "mailPrincipalEnUso",
    "nacionalidad",
    "noTieneDocumento",
    "nombre",
    "nombreCompleto",
    "numDoc",
    "numPersona",
    "observacionPep",
    "profesion",
    "rut",
    "tel",
    "textoFraude",
    "tieneDeuda",
    "tipoDoc",
    "tipoPersona",
    "validaComunicaciones"
})
public class Cliente
    extends ResultGenerico
{

    protected String anulacionCorrida;
    protected String apellidoRazon;
    protected ComunicacionEC cel;
    protected String codCliente;
    protected Integer codProfesion;
    protected String descTipoDoc;
    protected String descripPersona;
    protected String descripTipoDoc;
    protected Integer diaVencimiento;
    protected String direccion;
    protected DireccionEC direccionCompleta;
    protected String esCliente;
    protected String esPep;
    protected String fechaBaja;
    protected String fechaPep;
    protected ComunicacionEC mail;
    protected String mailEnUso;
    protected String mailFacturaEnUso;
    protected ComunicacionEC mailFacturas;
    protected ComunicacionEC mailPrincipal;
    protected String mailPrincipalEnUso;
    protected String nacionalidad;
    protected String noTieneDocumento;
    protected String nombre;
    protected String nombreCompleto;
    protected String numDoc;
    protected String numPersona;
    protected String observacionPep;
    protected String profesion;
    protected String rut;
    protected ComunicacionEC tel;
    protected String textoFraude;
    protected String tieneDeuda;
    protected String tipoDoc;
    protected String tipoPersona;
    protected String validaComunicaciones;

    /**
     * Obtiene el valor de la propiedad anulacionCorrida.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnulacionCorrida() {
        return anulacionCorrida;
    }

    /**
     * Define el valor de la propiedad anulacionCorrida.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnulacionCorrida(String value) {
        this.anulacionCorrida = value;
    }

    /**
     * Obtiene el valor de la propiedad apellidoRazon.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApellidoRazon() {
        return apellidoRazon;
    }

    /**
     * Define el valor de la propiedad apellidoRazon.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApellidoRazon(String value) {
        this.apellidoRazon = value;
    }

    /**
     * Obtiene el valor de la propiedad cel.
     * 
     * @return
     *     possible object is
     *     {@link ComunicacionEC }
     *     
     */
    public ComunicacionEC getCel() {
        return cel;
    }

    /**
     * Define el valor de la propiedad cel.
     * 
     * @param value
     *     allowed object is
     *     {@link ComunicacionEC }
     *     
     */
    public void setCel(ComunicacionEC value) {
        this.cel = value;
    }

    /**
     * Obtiene el valor de la propiedad codCliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodCliente() {
        return codCliente;
    }

    /**
     * Define el valor de la propiedad codCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodCliente(String value) {
        this.codCliente = value;
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
     * Obtiene el valor de la propiedad descTipoDoc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescTipoDoc() {
        return descTipoDoc;
    }

    /**
     * Define el valor de la propiedad descTipoDoc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescTipoDoc(String value) {
        this.descTipoDoc = value;
    }

    /**
     * Obtiene el valor de la propiedad descripPersona.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripPersona() {
        return descripPersona;
    }

    /**
     * Define el valor de la propiedad descripPersona.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripPersona(String value) {
        this.descripPersona = value;
    }

    /**
     * Obtiene el valor de la propiedad descripTipoDoc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripTipoDoc() {
        return descripTipoDoc;
    }

    /**
     * Define el valor de la propiedad descripTipoDoc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripTipoDoc(String value) {
        this.descripTipoDoc = value;
    }

    /**
     * Obtiene el valor de la propiedad diaVencimiento.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDiaVencimiento() {
        return diaVencimiento;
    }

    /**
     * Define el valor de la propiedad diaVencimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDiaVencimiento(Integer value) {
        this.diaVencimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad direccion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Define el valor de la propiedad direccion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDireccion(String value) {
        this.direccion = value;
    }

    /**
     * Obtiene el valor de la propiedad direccionCompleta.
     * 
     * @return
     *     possible object is
     *     {@link DireccionEC }
     *     
     */
    public DireccionEC getDireccionCompleta() {
        return direccionCompleta;
    }

    /**
     * Define el valor de la propiedad direccionCompleta.
     * 
     * @param value
     *     allowed object is
     *     {@link DireccionEC }
     *     
     */
    public void setDireccionCompleta(DireccionEC value) {
        this.direccionCompleta = value;
    }

    /**
     * Obtiene el valor de la propiedad esCliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEsCliente() {
        return esCliente;
    }

    /**
     * Define el valor de la propiedad esCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEsCliente(String value) {
        this.esCliente = value;
    }

    /**
     * Obtiene el valor de la propiedad esPep.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEsPep() {
        return esPep;
    }

    /**
     * Define el valor de la propiedad esPep.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEsPep(String value) {
        this.esPep = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaBaja.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaBaja() {
        return fechaBaja;
    }

    /**
     * Define el valor de la propiedad fechaBaja.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaBaja(String value) {
        this.fechaBaja = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaPep.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaPep() {
        return fechaPep;
    }

    /**
     * Define el valor de la propiedad fechaPep.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaPep(String value) {
        this.fechaPep = value;
    }

    /**
     * Obtiene el valor de la propiedad mail.
     * 
     * @return
     *     possible object is
     *     {@link ComunicacionEC }
     *     
     */
    public ComunicacionEC getMail() {
        return mail;
    }

    /**
     * Define el valor de la propiedad mail.
     * 
     * @param value
     *     allowed object is
     *     {@link ComunicacionEC }
     *     
     */
    public void setMail(ComunicacionEC value) {
        this.mail = value;
    }

    /**
     * Obtiene el valor de la propiedad mailEnUso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailEnUso() {
        return mailEnUso;
    }

    /**
     * Define el valor de la propiedad mailEnUso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailEnUso(String value) {
        this.mailEnUso = value;
    }

    /**
     * Obtiene el valor de la propiedad mailFacturaEnUso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailFacturaEnUso() {
        return mailFacturaEnUso;
    }

    /**
     * Define el valor de la propiedad mailFacturaEnUso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailFacturaEnUso(String value) {
        this.mailFacturaEnUso = value;
    }

    /**
     * Obtiene el valor de la propiedad mailFacturas.
     * 
     * @return
     *     possible object is
     *     {@link ComunicacionEC }
     *     
     */
    public ComunicacionEC getMailFacturas() {
        return mailFacturas;
    }

    /**
     * Define el valor de la propiedad mailFacturas.
     * 
     * @param value
     *     allowed object is
     *     {@link ComunicacionEC }
     *     
     */
    public void setMailFacturas(ComunicacionEC value) {
        this.mailFacturas = value;
    }

    /**
     * Obtiene el valor de la propiedad mailPrincipal.
     * 
     * @return
     *     possible object is
     *     {@link ComunicacionEC }
     *     
     */
    public ComunicacionEC getMailPrincipal() {
        return mailPrincipal;
    }

    /**
     * Define el valor de la propiedad mailPrincipal.
     * 
     * @param value
     *     allowed object is
     *     {@link ComunicacionEC }
     *     
     */
    public void setMailPrincipal(ComunicacionEC value) {
        this.mailPrincipal = value;
    }

    /**
     * Obtiene el valor de la propiedad mailPrincipalEnUso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailPrincipalEnUso() {
        return mailPrincipalEnUso;
    }

    /**
     * Define el valor de la propiedad mailPrincipalEnUso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailPrincipalEnUso(String value) {
        this.mailPrincipalEnUso = value;
    }

    /**
     * Obtiene el valor de la propiedad nacionalidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNacionalidad() {
        return nacionalidad;
    }

    /**
     * Define el valor de la propiedad nacionalidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNacionalidad(String value) {
        this.nacionalidad = value;
    }

    /**
     * Obtiene el valor de la propiedad noTieneDocumento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoTieneDocumento() {
        return noTieneDocumento;
    }

    /**
     * Define el valor de la propiedad noTieneDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoTieneDocumento(String value) {
        this.noTieneDocumento = value;
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
     * Obtiene el valor de la propiedad nombreCompleto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    /**
     * Define el valor de la propiedad nombreCompleto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreCompleto(String value) {
        this.nombreCompleto = value;
    }

    /**
     * Obtiene el valor de la propiedad numDoc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumDoc() {
        return numDoc;
    }

    /**
     * Define el valor de la propiedad numDoc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumDoc(String value) {
        this.numDoc = value;
    }

    /**
     * Obtiene el valor de la propiedad numPersona.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumPersona() {
        return numPersona;
    }

    /**
     * Define el valor de la propiedad numPersona.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumPersona(String value) {
        this.numPersona = value;
    }

    /**
     * Obtiene el valor de la propiedad observacionPep.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservacionPep() {
        return observacionPep;
    }

    /**
     * Define el valor de la propiedad observacionPep.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservacionPep(String value) {
        this.observacionPep = value;
    }

    /**
     * Obtiene el valor de la propiedad profesion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfesion() {
        return profesion;
    }

    /**
     * Define el valor de la propiedad profesion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfesion(String value) {
        this.profesion = value;
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

    /**
     * Obtiene el valor de la propiedad tel.
     * 
     * @return
     *     possible object is
     *     {@link ComunicacionEC }
     *     
     */
    public ComunicacionEC getTel() {
        return tel;
    }

    /**
     * Define el valor de la propiedad tel.
     * 
     * @param value
     *     allowed object is
     *     {@link ComunicacionEC }
     *     
     */
    public void setTel(ComunicacionEC value) {
        this.tel = value;
    }

    /**
     * Obtiene el valor de la propiedad textoFraude.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextoFraude() {
        return textoFraude;
    }

    /**
     * Define el valor de la propiedad textoFraude.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextoFraude(String value) {
        this.textoFraude = value;
    }

    /**
     * Obtiene el valor de la propiedad tieneDeuda.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTieneDeuda() {
        return tieneDeuda;
    }

    /**
     * Define el valor de la propiedad tieneDeuda.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTieneDeuda(String value) {
        this.tieneDeuda = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoDoc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDoc() {
        return tipoDoc;
    }

    /**
     * Define el valor de la propiedad tipoDoc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDoc(String value) {
        this.tipoDoc = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoPersona.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoPersona() {
        return tipoPersona;
    }

    /**
     * Define el valor de la propiedad tipoPersona.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoPersona(String value) {
        this.tipoPersona = value;
    }

    /**
     * Obtiene el valor de la propiedad validaComunicaciones.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidaComunicaciones() {
        return validaComunicaciones;
    }

    /**
     * Define el valor de la propiedad validaComunicaciones.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidaComunicaciones(String value) {
        this.validaComunicaciones = value;
    }

}
