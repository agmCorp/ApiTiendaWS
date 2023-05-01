
package uy.com.bse.persistence.proxy.polizasservicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para endoso complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="endoso">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.polizas.bse.com.uy/}datosBasicosEndoso">
 *       &lt;sequence>
 *         &lt;element name="cantidadCuotas" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="cantidadDias" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="cliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codImpresion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codMotivoAbandono" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="codOrigen" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="codPlanPago" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="codTipoCalculo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codTransaccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codUsuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codVigencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripAclaracion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripMotivoAbandono" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripOrigen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripPlanPago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripTipoCalculo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripTransaccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripUsuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripVigencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaDesdeVigencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaHastaVigencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaOperacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="impreso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numCertificado" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "endoso", propOrder = {
    "cantidadCuotas",
    "cantidadDias",
    "cliente",
    "codImpresion",
    "codMotivoAbandono",
    "codOrigen",
    "codPlanPago",
    "codTipoCalculo",
    "codTransaccion",
    "codUsuario",
    "codVigencia",
    "descripAclaracion",
    "descripMotivoAbandono",
    "descripOrigen",
    "descripPlanPago",
    "descripTipoCalculo",
    "descripTransaccion",
    "descripUsuario",
    "descripVigencia",
    "fechaDesdeVigencia",
    "fechaHastaVigencia",
    "fechaOperacion",
    "impreso",
    "numCertificado"
})
public class Endoso
    extends DatosBasicosEndoso
{

    protected Integer cantidadCuotas;
    protected Integer cantidadDias;
    protected String cliente;
    protected String codImpresion;
    protected Integer codMotivoAbandono;
    protected Integer codOrigen;
    protected Integer codPlanPago;
    protected String codTipoCalculo;
    protected String codTransaccion;
    protected String codUsuario;
    protected String codVigencia;
    protected String descripAclaracion;
    protected String descripMotivoAbandono;
    protected String descripOrigen;
    protected String descripPlanPago;
    protected String descripTipoCalculo;
    protected String descripTransaccion;
    protected String descripUsuario;
    protected String descripVigencia;
    protected String fechaDesdeVigencia;
    protected String fechaHastaVigencia;
    protected String fechaOperacion;
    protected String impreso;
    protected Integer numCertificado;

    /**
     * Obtiene el valor de la propiedad cantidadCuotas.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCantidadCuotas() {
        return cantidadCuotas;
    }

    /**
     * Define el valor de la propiedad cantidadCuotas.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCantidadCuotas(Integer value) {
        this.cantidadCuotas = value;
    }

    /**
     * Obtiene el valor de la propiedad cantidadDias.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCantidadDias() {
        return cantidadDias;
    }

    /**
     * Define el valor de la propiedad cantidadDias.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCantidadDias(Integer value) {
        this.cantidadDias = value;
    }

    /**
     * Obtiene el valor de la propiedad cliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCliente() {
        return cliente;
    }

    /**
     * Define el valor de la propiedad cliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCliente(String value) {
        this.cliente = value;
    }

    /**
     * Obtiene el valor de la propiedad codImpresion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodImpresion() {
        return codImpresion;
    }

    /**
     * Define el valor de la propiedad codImpresion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodImpresion(String value) {
        this.codImpresion = value;
    }

    /**
     * Obtiene el valor de la propiedad codMotivoAbandono.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodMotivoAbandono() {
        return codMotivoAbandono;
    }

    /**
     * Define el valor de la propiedad codMotivoAbandono.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodMotivoAbandono(Integer value) {
        this.codMotivoAbandono = value;
    }

    /**
     * Obtiene el valor de la propiedad codOrigen.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodOrigen() {
        return codOrigen;
    }

    /**
     * Define el valor de la propiedad codOrigen.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodOrigen(Integer value) {
        this.codOrigen = value;
    }

    /**
     * Obtiene el valor de la propiedad codPlanPago.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodPlanPago() {
        return codPlanPago;
    }

    /**
     * Define el valor de la propiedad codPlanPago.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodPlanPago(Integer value) {
        this.codPlanPago = value;
    }

    /**
     * Obtiene el valor de la propiedad codTipoCalculo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodTipoCalculo() {
        return codTipoCalculo;
    }

    /**
     * Define el valor de la propiedad codTipoCalculo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodTipoCalculo(String value) {
        this.codTipoCalculo = value;
    }

    /**
     * Obtiene el valor de la propiedad codTransaccion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodTransaccion() {
        return codTransaccion;
    }

    /**
     * Define el valor de la propiedad codTransaccion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodTransaccion(String value) {
        this.codTransaccion = value;
    }

    /**
     * Obtiene el valor de la propiedad codUsuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodUsuario() {
        return codUsuario;
    }

    /**
     * Define el valor de la propiedad codUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodUsuario(String value) {
        this.codUsuario = value;
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
     * Obtiene el valor de la propiedad descripAclaracion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripAclaracion() {
        return descripAclaracion;
    }

    /**
     * Define el valor de la propiedad descripAclaracion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripAclaracion(String value) {
        this.descripAclaracion = value;
    }

    /**
     * Obtiene el valor de la propiedad descripMotivoAbandono.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripMotivoAbandono() {
        return descripMotivoAbandono;
    }

    /**
     * Define el valor de la propiedad descripMotivoAbandono.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripMotivoAbandono(String value) {
        this.descripMotivoAbandono = value;
    }

    /**
     * Obtiene el valor de la propiedad descripOrigen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripOrigen() {
        return descripOrigen;
    }

    /**
     * Define el valor de la propiedad descripOrigen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripOrigen(String value) {
        this.descripOrigen = value;
    }

    /**
     * Obtiene el valor de la propiedad descripPlanPago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripPlanPago() {
        return descripPlanPago;
    }

    /**
     * Define el valor de la propiedad descripPlanPago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripPlanPago(String value) {
        this.descripPlanPago = value;
    }

    /**
     * Obtiene el valor de la propiedad descripTipoCalculo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripTipoCalculo() {
        return descripTipoCalculo;
    }

    /**
     * Define el valor de la propiedad descripTipoCalculo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripTipoCalculo(String value) {
        this.descripTipoCalculo = value;
    }

    /**
     * Obtiene el valor de la propiedad descripTransaccion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripTransaccion() {
        return descripTransaccion;
    }

    /**
     * Define el valor de la propiedad descripTransaccion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripTransaccion(String value) {
        this.descripTransaccion = value;
    }

    /**
     * Obtiene el valor de la propiedad descripUsuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripUsuario() {
        return descripUsuario;
    }

    /**
     * Define el valor de la propiedad descripUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripUsuario(String value) {
        this.descripUsuario = value;
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
     * Obtiene el valor de la propiedad fechaDesdeVigencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaDesdeVigencia() {
        return fechaDesdeVigencia;
    }

    /**
     * Define el valor de la propiedad fechaDesdeVigencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaDesdeVigencia(String value) {
        this.fechaDesdeVigencia = value;
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
     * Obtiene el valor de la propiedad fechaOperacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaOperacion() {
        return fechaOperacion;
    }

    /**
     * Define el valor de la propiedad fechaOperacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaOperacion(String value) {
        this.fechaOperacion = value;
    }

    /**
     * Obtiene el valor de la propiedad impreso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImpreso() {
        return impreso;
    }

    /**
     * Define el valor de la propiedad impreso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImpreso(String value) {
        this.impreso = value;
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

}
