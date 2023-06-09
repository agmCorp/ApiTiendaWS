
package uy.com.bse.persistence.proxy.pagoelectronico;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "PagosElectronicos", targetNamespace = "http://epagos.ws.servicios.bse.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface PagosElectronicos {


    /**
     * 
     * @param rubro
     * @param usuario
     * @param contrasena
     * @return
     *     returns uy.com.bse.persistence.proxy.pagoelectronico.EntidadesBancariasResp
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "consultaEntidadesBancariasPorRubro", targetNamespace = "http://epagos.ws.servicios.bse.com/", className = "uy.com.bse.persistence.proxy.pagoelectronico.ConsultaEntidadesBancariasPorRubro")
    @ResponseWrapper(localName = "consultaEntidadesBancariasPorRubroResponse", targetNamespace = "http://epagos.ws.servicios.bse.com/", className = "uy.com.bse.persistence.proxy.pagoelectronico.ConsultaEntidadesBancariasPorRubroResponse")
    public EntidadesBancariasResp consultaEntidadesBancariasPorRubro(
        @WebParam(name = "usuario", targetNamespace = "")
        String usuario,
        @WebParam(name = "contrasena", targetNamespace = "")
        String contrasena,
        @WebParam(name = "rubro", targetNamespace = "")
        String rubro);

    /**
     * 
     * @param usuario
     * @param contrasena
     * @return
     *     returns uy.com.bse.persistence.proxy.pagoelectronico.MediosPagoResp
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "consultaMediosPago", targetNamespace = "http://epagos.ws.servicios.bse.com/", className = "uy.com.bse.persistence.proxy.pagoelectronico.ConsultaMediosPago")
    @ResponseWrapper(localName = "consultaMediosPagoResponse", targetNamespace = "http://epagos.ws.servicios.bse.com/", className = "uy.com.bse.persistence.proxy.pagoelectronico.ConsultaMediosPagoResponse")
    public MediosPagoResp consultaMediosPago(
        @WebParam(name = "usuario", targetNamespace = "")
        String usuario,
        @WebParam(name = "contrasena", targetNamespace = "")
        String contrasena);

    /**
     * 
     * @param usuario
     * @param contrasena
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "ping", targetNamespace = "http://epagos.ws.servicios.bse.com/", className = "uy.com.bse.persistence.proxy.pagoelectronico.Ping")
    @ResponseWrapper(localName = "pingResponse", targetNamespace = "http://epagos.ws.servicios.bse.com/", className = "uy.com.bse.persistence.proxy.pagoelectronico.PingResponse")
    public String ping(
        @WebParam(name = "usuario", targetNamespace = "")
        String usuario,
        @WebParam(name = "contrasena", targetNamespace = "")
        String contrasena);

    /**
     * 
     * @param idTransaccion
     * @param usuario
     * @param contrasena
     * @return
     *     returns uy.com.bse.persistence.proxy.pagoelectronico.EstadoTransaccionResp
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "consultaEstadoTransaccion", targetNamespace = "http://epagos.ws.servicios.bse.com/", className = "uy.com.bse.persistence.proxy.pagoelectronico.ConsultaEstadoTransaccion")
    @ResponseWrapper(localName = "consultaEstadoTransaccionResponse", targetNamespace = "http://epagos.ws.servicios.bse.com/", className = "uy.com.bse.persistence.proxy.pagoelectronico.ConsultaEstadoTransaccionResponse")
    public EstadoTransaccionResp consultaEstadoTransaccion(
        @WebParam(name = "usuario", targetNamespace = "")
        String usuario,
        @WebParam(name = "contrasena", targetNamespace = "")
        String contrasena,
        @WebParam(name = "idTransaccion", targetNamespace = "")
        String idTransaccion);

    /**
     * 
     * @param usuario
     * @param contrasena
     * @return
     *     returns uy.com.bse.persistence.proxy.pagoelectronico.EntidadesBancariasResp
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "consultaEntidadesBancarias", targetNamespace = "http://epagos.ws.servicios.bse.com/", className = "uy.com.bse.persistence.proxy.pagoelectronico.ConsultaEntidadesBancarias")
    @ResponseWrapper(localName = "consultaEntidadesBancariasResponse", targetNamespace = "http://epagos.ws.servicios.bse.com/", className = "uy.com.bse.persistence.proxy.pagoelectronico.ConsultaEntidadesBancariasResponse")
    public EntidadesBancariasResp consultaEntidadesBancarias(
        @WebParam(name = "usuario", targetNamespace = "")
        String usuario,
        @WebParam(name = "contrasena", targetNamespace = "")
        String contrasena);

    /**
     * 
     * @param codAdhesion
     * @param usuario
     * @param contrasena
     * @return
     *     returns uy.com.bse.persistence.proxy.pagoelectronico.FacturasImpagasResp
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "consultaFacturasImpagasAdhesion", targetNamespace = "http://epagos.ws.servicios.bse.com/", className = "uy.com.bse.persistence.proxy.pagoelectronico.ConsultaFacturasImpagasAdhesion")
    @ResponseWrapper(localName = "consultaFacturasImpagasAdhesionResponse", targetNamespace = "http://epagos.ws.servicios.bse.com/", className = "uy.com.bse.persistence.proxy.pagoelectronico.ConsultaFacturasImpagasAdhesionResponse")
    public FacturasImpagasResp consultaFacturasImpagasAdhesion(
        @WebParam(name = "usuario", targetNamespace = "")
        String usuario,
        @WebParam(name = "contrasena", targetNamespace = "")
        String contrasena,
        @WebParam(name = "codAdhesion", targetNamespace = "")
        String codAdhesion);

    /**
     * 
     * @param usuario
     * @param contrasena
     * @param numeroFactura
     * @return
     *     returns uy.com.bse.persistence.proxy.pagoelectronico.FacturaResp
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "consultaFactura", targetNamespace = "http://epagos.ws.servicios.bse.com/", className = "uy.com.bse.persistence.proxy.pagoelectronico.ConsultaFactura")
    @ResponseWrapper(localName = "consultaFacturaResponse", targetNamespace = "http://epagos.ws.servicios.bse.com/", className = "uy.com.bse.persistence.proxy.pagoelectronico.ConsultaFacturaResponse")
    public FacturaResp consultaFactura(
        @WebParam(name = "usuario", targetNamespace = "")
        String usuario,
        @WebParam(name = "contrasena", targetNamespace = "")
        String contrasena,
        @WebParam(name = "numeroFactura", targetNamespace = "")
        Long numeroFactura);

    /**
     * 
     * @param tipoDocumento
     * @param documento
     * @param usuario
     * @param contrasena
     * @return
     *     returns uy.com.bse.persistence.proxy.pagoelectronico.FacturasImpagasResp
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "consultaFacturasImpagas", targetNamespace = "http://epagos.ws.servicios.bse.com/", className = "uy.com.bse.persistence.proxy.pagoelectronico.ConsultaFacturasImpagas")
    @ResponseWrapper(localName = "consultaFacturasImpagasResponse", targetNamespace = "http://epagos.ws.servicios.bse.com/", className = "uy.com.bse.persistence.proxy.pagoelectronico.ConsultaFacturasImpagasResponse")
    public FacturasImpagasResp consultaFacturasImpagas(
        @WebParam(name = "usuario", targetNamespace = "")
        String usuario,
        @WebParam(name = "contrasena", targetNamespace = "")
        String contrasena,
        @WebParam(name = "tipoDocumento", targetNamespace = "")
        String tipoDocumento,
        @WebParam(name = "documento", targetNamespace = "")
        String documento);

    /**
     * 
     * @param idTransaccion
     * @param codigoDeRespuesta
     * @param importeDevolucion
     * @param codigoAutorizacion
     * @param moneda
     * @param usuario
     * @param contrasena
     * @param importe
     * @return
     *     returns uy.com.bse.persistence.proxy.pagoelectronico.RegistroPago
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "informarPagoBancario", targetNamespace = "http://epagos.ws.servicios.bse.com/", className = "uy.com.bse.persistence.proxy.pagoelectronico.InformarPagoBancario")
    @ResponseWrapper(localName = "informarPagoBancarioResponse", targetNamespace = "http://epagos.ws.servicios.bse.com/", className = "uy.com.bse.persistence.proxy.pagoelectronico.InformarPagoBancarioResponse")
    public RegistroPago informarPagoBancario(
        @WebParam(name = "usuario", targetNamespace = "")
        String usuario,
        @WebParam(name = "contrasena", targetNamespace = "")
        String contrasena,
        @WebParam(name = "idTransaccion", targetNamespace = "")
        String idTransaccion,
        @WebParam(name = "codigoDeRespuesta", targetNamespace = "")
        String codigoDeRespuesta,
        @WebParam(name = "codigoAutorizacion", targetNamespace = "")
        String codigoAutorizacion,
        @WebParam(name = "moneda", targetNamespace = "")
        String moneda,
        @WebParam(name = "importe", targetNamespace = "")
        Double importe,
        @WebParam(name = "importeDevolucion", targetNamespace = "")
        Double importeDevolucion);

}
