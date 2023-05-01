
package uy.com.bse.persistence.proxy.mibse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para paramGenerico complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="paramGenerico">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="clave" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="usuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paramGenerico", propOrder = {
    "clave",
    "usuario"
})
@XmlSeeAlso({
    ParamSubirArchivo.class,
    ParamAltaMailCliente.class,
    ParamLogActividadMibseWsExt.class,
    ParamRegistrarCliente.class,
    ParamObtenerDatosValidadosCliente.class,
    ParamActualizarFacturacionPoliza.class,
    ParamActualizarFacturacionPolizaTodo.class,
    ParamObtenerDatosCliente.class,
    ParamValidacionCartaVerde.class,
    ParamExisteCliente.class,
    ParamListaTipoDocumentos.class,
    ParamValidacionSOA.class,
    ParamValidarCertificadoLibreDeudaADT.class,
    ParamObtenerPolizasFacturasPagasCliente.class,
    ParamOlvidoClave.class,
    ParamAdherirFacturaDigital.class,
    ParamObtenerComunicacionesCliente.class,
    ParamModificarMailCliente.class,
    ParamListaProfesiones.class,
    ParamObtenerMapaMsgSiniestro.class,
    ParamBorrarMailCliente.class,
    ParamInformarPagoTienda.class,
    ParamObtenerMaximoEndoso.class,
    ParamObtenerPolizasCliente.class,
    ParamObtenerMailCliente.class,
    ParamProCarta.class,
    ParamObtenerMailsEnvioFacturaCliente.class,
    ParamValidarCodigoAdhesion.class,
    ParamObtenerNumeroCliente.class,
    ParamActualizarComunicacionesCliente.class,
    ParamActualizarDatosCliente.class
})
public class ParamGenerico {

    @XmlElement(required = true, nillable = true)
    protected String clave;
    protected String usuario;

    /**
     * Obtiene el valor de la propiedad clave.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClave() {
        return clave;
    }

    /**
     * Define el valor de la propiedad clave.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClave(String value) {
        this.clave = value;
    }

    /**
     * Obtiene el valor de la propiedad usuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * Define el valor de la propiedad usuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuario(String value) {
        this.usuario = value;
    }

}
