
package com.poweruniverse.nim.data.wsclient.file;

import javax.activation.DataHandler;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlMimeType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for reUpload complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="reUpload">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fileId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "reUpload", propOrder = {
    "fileId",
    "fileHandler"
})
public class ReUpload {

    protected String fileId;
    @XmlMimeType("*/*")
    protected DataHandler fileHandler;

    /**
     * Gets the value of the fileId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileId() {
        return fileId;
    }

    /**
     * Sets the value of the fileId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileId(String value) {
        this.fileId = value;
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
