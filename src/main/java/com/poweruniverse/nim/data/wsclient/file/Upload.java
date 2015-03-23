
package com.poweruniverse.nim.data.wsclient.file;

import javax.activation.DataHandler;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlMimeType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for upload complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="upload">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fuJianLXDH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fileHandler" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "upload", propOrder = {
    "fuJianLXDH",
    "fileName",
    "fileHandler"
})
public class Upload {

    protected String fuJianLXDH;
    protected String fileName;
    @XmlMimeType("*/*")
    protected DataHandler fileHandler;

    /**
     * Gets the value of the fuJianLXDH property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFuJianLXDH() {
        return fuJianLXDH;
    }

    /**
     * Sets the value of the fuJianLXDH property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFuJianLXDH(String value) {
        this.fuJianLXDH = value;
    }

    /**
     * Gets the value of the fileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Sets the value of the fileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileName(String value) {
        this.fileName = value;
    }

    /**
     * Gets the value of the fileHandler property.
     * 
     * @return
     *     possible object is
     *     {@link DataHandler }
     *     
     */
    public DataHandler getFileHandler() {
        return fileHandler;
    }

    /**
     * Sets the value of the fileHandler property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataHandler }
     *     
     */
    public void setFileHandler(DataHandler value) {
        this.fileHandler = value;
    }

}
