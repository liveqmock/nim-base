
package com.poweruniverse.nim.data.wsclient.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getZdList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getZdList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="gongNengDH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shiTiLeiDH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="property" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fields" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getZdList", propOrder = {
    "gongNengDH",
    "shiTiLeiDH",
    "property",
    "fields"
})
public class GetZdList {

    protected String gongNengDH;
    protected String shiTiLeiDH;
    protected String property;
    protected String fields;

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
     * Gets the value of the shiTiLeiDH property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShiTiLeiDH() {
        return shiTiLeiDH;
    }

    /**
     * Sets the value of the shiTiLeiDH property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShiTiLeiDH(String value) {
        this.shiTiLeiDH = value;
    }

    /**
     * Gets the value of the property property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProperty() {
        return property;
    }

    /**
     * Sets the value of the property property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProperty(String value) {
        this.property = value;
    }

    /**
     * Gets the value of the fields property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFields() {
        return fields;
    }

    /**
     * Sets the value of the fields property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFields(String value) {
        this.fields = value;
    }

}
