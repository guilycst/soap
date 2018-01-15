
package br.com.caelum.correios.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cObjeto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cObjeto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="servico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cepOrigem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cepDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prazoEntrega" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="dataPostagem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataPostagemCalculo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataEntrega" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataMaxEntrega" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="postagemDH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="erro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="msgErro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cObjeto", propOrder = {
    "codigo",
    "servico",
    "cepOrigem",
    "cepDestino",
    "prazoEntrega",
    "dataPostagem",
    "dataPostagemCalculo",
    "dataEntrega",
    "dataMaxEntrega",
    "postagemDH",
    "erro",
    "msgErro"
})
public class CObjeto {

    protected String codigo;
    protected String servico;
    protected String cepOrigem;
    protected String cepDestino;
    protected int prazoEntrega;
    protected String dataPostagem;
    protected String dataPostagemCalculo;
    protected String dataEntrega;
    protected String dataMaxEntrega;
    protected String postagemDH;
    protected String erro;
    protected String msgErro;

    /**
     * Gets the value of the codigo property.
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
     * Sets the value of the codigo property.
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
     * Gets the value of the servico property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServico() {
        return servico;
    }

    /**
     * Sets the value of the servico property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServico(String value) {
        this.servico = value;
    }

    /**
     * Gets the value of the cepOrigem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCepOrigem() {
        return cepOrigem;
    }

    /**
     * Sets the value of the cepOrigem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCepOrigem(String value) {
        this.cepOrigem = value;
    }

    /**
     * Gets the value of the cepDestino property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCepDestino() {
        return cepDestino;
    }

    /**
     * Sets the value of the cepDestino property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCepDestino(String value) {
        this.cepDestino = value;
    }

    /**
     * Gets the value of the prazoEntrega property.
     * 
     */
    public int getPrazoEntrega() {
        return prazoEntrega;
    }

    /**
     * Sets the value of the prazoEntrega property.
     * 
     */
    public void setPrazoEntrega(int value) {
        this.prazoEntrega = value;
    }

    /**
     * Gets the value of the dataPostagem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataPostagem() {
        return dataPostagem;
    }

    /**
     * Sets the value of the dataPostagem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataPostagem(String value) {
        this.dataPostagem = value;
    }

    /**
     * Gets the value of the dataPostagemCalculo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataPostagemCalculo() {
        return dataPostagemCalculo;
    }

    /**
     * Sets the value of the dataPostagemCalculo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataPostagemCalculo(String value) {
        this.dataPostagemCalculo = value;
    }

    /**
     * Gets the value of the dataEntrega property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataEntrega() {
        return dataEntrega;
    }

    /**
     * Sets the value of the dataEntrega property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataEntrega(String value) {
        this.dataEntrega = value;
    }

    /**
     * Gets the value of the dataMaxEntrega property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataMaxEntrega() {
        return dataMaxEntrega;
    }

    /**
     * Sets the value of the dataMaxEntrega property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataMaxEntrega(String value) {
        this.dataMaxEntrega = value;
    }

    /**
     * Gets the value of the postagemDH property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostagemDH() {
        return postagemDH;
    }

    /**
     * Sets the value of the postagemDH property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostagemDH(String value) {
        this.postagemDH = value;
    }

    /**
     * Gets the value of the erro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErro() {
        return erro;
    }

    /**
     * Sets the value of the erro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErro(String value) {
        this.erro = value;
    }

    /**
     * Gets the value of the msgErro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgErro() {
        return msgErro;
    }

    /**
     * Sets the value of the msgErro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgErro(String value) {
        this.msgErro = value;
    }

}
