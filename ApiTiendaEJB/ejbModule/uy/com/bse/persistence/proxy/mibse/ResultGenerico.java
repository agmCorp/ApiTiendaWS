
package uy.com.bse.persistence.proxy.mibse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para resultGenerico complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="resultGenerico">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="error" type="{http://ws.mibse.bse.com.uy/}serviciosError" minOccurs="0"/>
 *         &lt;element name="hayError" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resultGenerico", propOrder = {
    "error",
    "hayError"
})
@XmlSeeAlso({
    ResultObtenerDatosValidadosCliente.class,
    ResultValidacionCartaVerde.class,
    ResultAdherirFacturaDigital.class,
    ResultInformarPagoRedes.class,
    ResultSubirArchivo.class,
    ResultObtenerMapaMsgSiniestro.class,
    ResultValidarCodigoAdhesion.class,
    ResultObtenerPolizasCliente.class,
    ResultProCarta.class,
    ResultValidacionSOA.class,
    ResultObtenerComunicacionesCliente.class,
    ResultCodiguera.class,
    ResultObtenerMaximoEndoso.class,
    ResultObtenerMailsEnvioFacturaCliente.class,
    ResultObtenerDatosCliente.class,
    ResultObtenerPolizasFacturasPagasCliente.class,
    ResultRegistrarCliente.class,
    ResultObtenerMailCliente.class,
    ResultExisteCliente.class,
    ResultLogActividadMibseWsExt.class,
    ResultCorrespondeCartaPoliza.class,
    ResultInformarPagoBancario.class,
    ResultObtenerNumeroCliente.class,
    ResultValidarCertificadoLibreDeudaADT.class
})
public class ResultGenerico {

    protected ServiciosError error;
    protected Boolean hayError;

    /**
     * Obtiene el valor de la propiedad error.
     * 
     * @return
     *     possible object is
     *     {@link ServiciosError }
     *     
     */
    public ServiciosError getError() {
        return error;
    }

    /**
     * Define el valor de la propiedad error.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiciosError }
     *     
     */
    public void setError(ServiciosError value) {
        this.error = value;
    }

    /**
     * Obtiene el valor de la propiedad hayError.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHayError() {
        return hayError;
    }

    /**
     * Define el valor de la propiedad hayError.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHayError(Boolean value) {
        this.hayError = value;
    }

}
