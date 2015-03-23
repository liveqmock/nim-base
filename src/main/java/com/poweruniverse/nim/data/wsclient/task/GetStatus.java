
package com.poweruniverse.nim.data.wsclient.task;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="gongNengDH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="caoZuoDH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="objectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getStatus", propOrder = {
    "gongNengDH",
    "caoZuoDH",
    "objectId"
})
public class GetStatus {

    protected String gongNengDH;
    protected String caoZuoDH;
    protected Integer objectId;

    /**
     * Gets the value of the gongNengDH property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGongNengDH() {
        return gongNengDH;
    }

    /**
     * Sets the value of the gongNengDH property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGongNengDH(String value) {
        this.gongNengDH = value;
    }

    /**
     * Gets the value of the caoZuoDH property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaoZuoDH() {
        return caoZuoDH;
    }

    /**
     * Sets the value of the caoZuoDH property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaoZuoDH(String value) {
        this.caoZuoDH = value;
    }

    /**
     * Gets the value of the objectId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getObjectId() {
        return objectId;
    }

    /**
     * Sets the value of the objectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setObjectId(Integer value) {
        this.objectId = value;
    }

}
