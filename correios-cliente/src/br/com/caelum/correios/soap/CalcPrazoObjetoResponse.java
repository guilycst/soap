
package br.com.caelum.correios.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CalcPrazoObjetoResult" type="{http://tempuri.org/}cResultadoObjeto"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "calcPrazoObjetoResult"
})
@XmlRootElement(name = "CalcPrazoObjetoResponse")
public class CalcPrazoObjetoResponse {

    @XmlElement(name = "CalcPrazoObjetoResult", required = true)
    protected CResultadoObjeto calcPrazoObjetoResult;

    /**
     * Gets the value of the calcPrazoObjetoResult property.
     * 
     * @return
     *     possible object is
     *     {@link CResultadoObjeto }
     *     
     */
    public CResultadoObjeto getCalcPrazoObjetoResult() {
        return calcPrazoObjetoResult;
    }

    /**
     * Sets the value of the calcPrazoObjetoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CResultadoObjeto }
     *     
     */
    public void setCalcPrazoObjetoResult(CResultadoObjeto value) {
        this.calcPrazoObjetoResult = value;
    }

}
