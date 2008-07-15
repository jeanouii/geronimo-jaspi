//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.5-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2008.07.15 at 04:13:34 PM PDT 
//


package org.apache.geronimo.components.jaspi.model;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for authModuleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="authModuleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="className" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="requestPolicy" type="{http://geronimo.apache.org/xml/ns/geronimo-jaspi}messagePolicyType"/>
 *         &lt;element name="responsePolicy" type="{http://geronimo.apache.org/xml/ns/geronimo-jaspi}messagePolicyType"/>
 *         &lt;element name="options" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "authModuleType", propOrder = {
    "className",
    "requestPolicy",
    "responsePolicy",
    "options"
})
public class AuthModuleType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(required = true)
    protected String className;
    @XmlElement(required = true)
    protected MessagePolicyType requestPolicy;
    @XmlElement(required = true)
    protected MessagePolicyType responsePolicy;
    protected String options;

    /**
     * Gets the value of the className property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassName() {
        return className;
    }

    /**
     * Sets the value of the className property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassName(String value) {
        this.className = value;
    }

    /**
     * Gets the value of the requestPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link MessagePolicyType }
     *     
     */
    public MessagePolicyType getRequestPolicy() {
        return requestPolicy;
    }

    /**
     * Sets the value of the requestPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessagePolicyType }
     *     
     */
    public void setRequestPolicy(MessagePolicyType value) {
        this.requestPolicy = value;
    }

    /**
     * Gets the value of the responsePolicy property.
     * 
     * @return
     *     possible object is
     *     {@link MessagePolicyType }
     *     
     */
    public MessagePolicyType getResponsePolicy() {
        return responsePolicy;
    }

    /**
     * Sets the value of the responsePolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessagePolicyType }
     *     
     */
    public void setResponsePolicy(MessagePolicyType value) {
        this.responsePolicy = value;
    }

    /**
     * Gets the value of the options property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptions() {
        return options;
    }

    /**
     * Sets the value of the options property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptions(String value) {
        this.options = value;
    }

}