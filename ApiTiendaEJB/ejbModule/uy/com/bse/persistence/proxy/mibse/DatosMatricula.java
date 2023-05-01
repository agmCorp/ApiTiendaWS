
package uy.com.bse.persistence.proxy.mibse;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para datosMatricula complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="datosMatricula">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="coberturasRestantes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="listaAuxilios" type="{http://ws.mibse.bse.com.uy/}datoAuxilioOtorgado" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="marca" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="matricula" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="modelo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nroCertificado" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="tieneCertificadoMercosur" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "datosMatricula", propOrder = {
    "coberturasRestantes",
    "listaAuxilios",
    "marca",
    "matricula",
    "modelo",
    "nroCertificado",
    "tieneCertificadoMercosur"
})
public class DatosMatricula {

    protected int coberturasRestantes;
    @XmlElement(nillable = true)
    protected List<DatoAuxilioOtorgado> listaAuxilios;
    protected String marca;
    protected String matricula;
    protected String modelo;
    protected int nroCertificado;
    protected boolean tieneCertificadoMercosur;

    /**
     * Obtiene el valor de la propiedad coberturasRestantes.
     * 
     */
    public int getCoberturasRestantes() {
        return coberturasRestantes;
    }

    /**
     * Define el valor de la propiedad coberturasRestantes.
     * 
     */
    public void setCoberturasRestantes(int value) {
        this.coberturasRestantes = value;
    }

    /**
     * Gets the value of the listaAuxilios property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listaAuxilios property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListaAuxilios().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DatoAuxilioOtorgado }
     * 
     * 
     */
    public List<DatoAuxilioOtorgado> getListaAuxilios() {
        if (listaAuxilios == null) {
            listaAuxilios = new ArrayList<DatoAuxilioOtorgado>();
        }
        return this.listaAuxilios;
    }

    /**
     * Obtiene el valor de la propiedad marca.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Define el valor de la propiedad marca.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarca(String value) {
        this.marca = value;
    }

    /**
     * Obtiene el valor de la propiedad matricula.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * Define el valor de la propiedad matricula.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatricula(String value) {
        this.matricula = value;
    }

    /**
     * Obtiene el valor de la propiedad modelo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Define el valor de la propiedad modelo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelo(String value) {
        this.modelo = value;
    }

    /**
     * Obtiene el valor de la propiedad nroCertificado.
     * 
     */
    public int getNroCertificado() {
        return nroCertificado;
    }

    /**
     * Define el valor de la propiedad nroCertificado.
     * 
     */
    public void setNroCertificado(int value) {
        this.nroCertificado = value;
    }

    /**
     * Obtiene el valor de la propiedad tieneCertificadoMercosur.
     * 
     */
    public boolean isTieneCertificadoMercosur() {
        return tieneCertificadoMercosur;
    }

    /**
     * Define el valor de la propiedad tieneCertificadoMercosur.
     * 
     */
    public void setTieneCertificadoMercosur(boolean value) {
        this.tieneCertificadoMercosur = value;
    }

}
