
package com.poweruniverse.nim.data.wsclient.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getGnList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getGnList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="gongNengDH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="caoZuoDH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="start" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="limit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="fields" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="filters" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sorts" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getGnList", propOrder = {
    "gongNengDH",
    "caoZuoDH",
    "start",
    "limit",
    "fields",
    "filters",
    "sorts"
})
public class GetGnList {

    protected String gongNengDH;
    protected String caoZuoDH;
    protected Integer start;
    protected Integer limit;
    protected String fields;
    protected String filters;
    protected String sorts;

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
     * Gets the value of the start property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStart() {
        return start;
    }

    /**
     * Sets the value of the start property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStart(Integer value) {
        this.start = value;
    }

    /**
     * Gets the value of the limit property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLimit() {
        return limit;
    }

    /**
     * Sets the value of the limit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLimit(Integer value) {
        this.limit = value;
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

    /**
     * Gets the value of the filters property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilters() {
        return filters;
    }

    /**
     * Sets the value of the filters property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilters(String value) {
        this.filters = value;
    }

    /**
     * Gets the value of the sorts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSorts() {
        return sorts;
    }

    /**
     * Sets the value of the sorts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSorts(String value) {
        this.sorts = value;
    }

}
