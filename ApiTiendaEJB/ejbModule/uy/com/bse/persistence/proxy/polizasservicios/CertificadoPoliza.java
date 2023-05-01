
package uy.com.bse.persistence.proxy.polizasservicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para certificadoPoliza complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="certificadoPoliza">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.polizas.bse.com.uy/}certificadoPolizaBasico">
 *       &lt;sequence>
 *         &lt;element name="cantPremioTotal" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cantidadServiciosUtilizados" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="codCliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codCuenta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codDireccionCobro" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="codDireccionEnvio" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="codMedioPago" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="codNacionalidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codOrigen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codVigencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codVigenciaTecnica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripVigencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripVigenciaTecnica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="diaVencimiento" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="estadoCertificado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="facultativo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaDesdeVigenciaTecnica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaHastaVigencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaHastaVigenciaTecnica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaSuscripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numEndoso" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="numTarjeta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "certificadoPoliza", propOrder = {
    "cantPremioTotal",
    "cantidadServiciosUtilizados",
    "codCliente",
    "codCuenta",
    "codDireccionCobro",
    "codDireccionEnvio",
    "codMedioPago",
    "codNacionalidad",
    "codOrigen",
    "codVigencia",
    "codVigenciaTecnica",
    "descripVigencia",
    "descripVigenciaTecnica",
    "diaVencimiento",
    "estadoCertificado",
    "facultativo",
    "fechaDesdeVigenciaTecnica",
    "fechaHastaVigencia",
    "fechaHastaVigenciaTecnica",
    "fechaSuscripcion",
    "numEndoso",
    "numTarjeta"
})
public class CertificadoPoliza
    extends CertificadoPolizaBasico
{

    protected Double cantPremioTotal;
    protected Integer cantidadServiciosUtilizados;
    protected String codCliente;
    protected String codCuenta;
    protected Integer codDireccionCobro;
    protected Integer codDireccionEnvio;
    protected Integer codMedioPago;
    protected String codNacionalidad;
    protected String codOrigen;
    protected String codVigencia;
    protected String codVigenciaTecnica;
    protected String descripVigencia;
    protected String descripVigenciaTecnica;
    protected Integer diaVencimiento;
    protected String estadoCertificado;
    protected String facultativo;
    protected String fechaDesdeVigenciaTecnica;
    protected String fechaHastaVigencia;
    protected String fechaHastaVigenciaTecnica;
    protected String fechaSuscripcion;
    protected Integer numEndoso;
    protected String numTarjeta;

    /**
     * Obtiene el valor de la propiedad cantPremioTotal.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCantPremioTotal() {
        return cantPremioTotal;
    }

    /**
     * Define el valor de la propiedad cantPremioTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCantPremioTotal(Double value) {
        this.cantPremioTotal = value;
    }

    /**
     * Obtiene el valor de la propiedad cantidadServiciosUtilizados.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCantidadServiciosUtilizados() {
        return cantidadServiciosUtilizados;
    }

    /**
     * Define el valor de la propiedad cantidadServiciosUtilizados.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCantidadServiciosUtilizados(Integer value) {
        this.cantidadServiciosUtilizados = value;
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
     * Obtiene el valor de la propiedad codCuenta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodCuenta() {
        return codCuenta;
    }

    /**
     * Define el valor de la propiedad codCuenta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodCuenta(String value) {
        this.codCuenta = value;
    }

    /**
     * Obtiene el valor de la propiedad codDireccionCobro.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodDireccionCobro() {
        return codDireccionCobro;
    }

    /**
     * Define el valor de la propiedad codDireccionCobro.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodDireccionCobro(Integer value) {
        this.codDireccionCobro = value;
    }

    /**
     * Obtiene el valor de la propiedad codDireccionEnvio.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodDireccionEnvio() {
        return codDireccionEnvio;
    }

    /**
     * Define el valor de la propiedad codDireccionEnvio.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodDireccionEnvio(Integer value) {
        this.codDireccionEnvio = value;
    }

    /**
     * Obtiene el valor de la propiedad codMedioPago.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodMedioPago() {
        return codMedioPago;
    }

    /**
     * Define el valor de la propiedad codMedioPago.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodMedioPago(Integer value) {
        this.codMedioPago = value;
    }

    /**
     * Obtiene el valor de la propiedad codNacionalidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodNacionalidad() {
        return codNacionalidad;
    }

    /**
     * Define el valor de la propiedad codNacionalidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodNacionalidad(String value) {
        this.codNacionalidad = value;
    }

    /**
     * Obtiene el valor de la propiedad codOrigen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodOrigen() {
        return codOrigen;
    }

    /**
     * Define el valor de la propiedad codOrigen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodOrigen(String value) {
        this.codOrigen = value;
    }

    /**
     * Obtiene el valor de la propiedad codVigencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodVigencia() {
        return codVigencia;
    }

    /**
     * Define el valor de la propiedad codVigencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodVigencia(String value) {
        this.codVigencia = value;
    }

    /**
     * Obtiene el valor de la propiedad codVigenciaTecnica.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodVigenciaTecnica() {
        return codVigenciaTecnica;
    }

    /**
     * Define el valor de la propiedad codVigenciaTecnica.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodVigenciaTecnica(String value) {
        this.codVigenciaTecnica = value;
    }

    /**
     * Obtiene el valor de la propiedad descripVigencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripVigencia() {
        return descripVigencia;
    }

    /**
     * Define el valor de la propiedad descripVigencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripVigencia(String value) {
        this.descripVigencia = value;
    }

    /**
     * Obtiene el valor de la propiedad descripVigenciaTecnica.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripVigenciaTecnica() {
        return descripVigenciaTecnica;
    }

    /**
     * Define el valor de la propiedad descripVigenciaTecnica.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripVigenciaTecnica(String value) {
        this.descripVigenciaTecnica = value;
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
     * Obtiene el valor de la propiedad estadoCertificado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstadoCertificado() {
        return estadoCertificado;
    }

    /**
     * Define el valor de la propiedad estadoCertificado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstadoCertificado(String value) {
        this.estadoCertificado = value;
    }

    /**
     * Obtiene el valor de la propiedad facultativo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacultativo() {
        return facultativo;
    }

    /**
     * Define el valor de la propiedad facultativo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacultativo(String value) {
        this.facultativo = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaDesdeVigenciaTecnica.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaDesdeVigenciaTecnica() {
        return fechaDesdeVigenciaTecnica;
    }

    /**
     * Define el valor de la propiedad fechaDesdeVigenciaTecnica.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaDesdeVigenciaTecnica(String value) {
        this.fechaDesdeVigenciaTecnica = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaHastaVigencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaHastaVigencia() {
        return fechaHastaVigencia;
    }

    /**
     * Define el valor de la propiedad fechaHastaVigencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaHastaVigencia(String value) {
        this.fechaHastaVigencia = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaHastaVigenciaTecnica.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaHastaVigenciaTecnica() {
        return fechaHastaVigenciaTecnica;
    }

    /**
     * Define el valor de la propiedad fechaHastaVigenciaTecnica.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaHastaVigenciaTecnica(String value) {
        this.fechaHastaVigenciaTecnica = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaSuscripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaSuscripcion() {
        return fechaSuscripcion;
    }

    /**
     * Define el valor de la propiedad fechaSuscripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaSuscripcion(String value) {
        this.fechaSuscripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad numEndoso.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumEndoso() {
        return numEndoso;
    }

    /**
     * Define el valor de la propiedad numEndoso.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumEndoso(Integer value) {
        this.numEndoso = value;
    }

    /**
     * Obtiene el valor de la propiedad numTarjeta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumTarjeta() {
        return numTarjeta;
    }

    /**
     * Define el valor de la propiedad numTarjeta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumTarjeta(String value) {
        this.numTarjeta = value;
    }

}
