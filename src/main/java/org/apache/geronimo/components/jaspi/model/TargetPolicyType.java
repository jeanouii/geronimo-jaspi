//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.5-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2008.07.15 at 04:13:34 PM PDT 
//


package org.apache.geronimo.components.jaspi.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for targetPolicyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="targetPolicyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="protectionPolicy" type="{http://geronimo.apache.org/xml/ns/geronimo-jaspi}protectionPolicyType"/>
 *         &lt;element name="target" type="{http://geronimo.apache.org/xml/ns/geronimo-jaspi}targetType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "targetPolicyType", propOrder = {
    "protectionPolicy",
    "target"
})
public class TargetPolicyType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(required = true)
    protected ProtectionPolicyType protectionPolicy;
    protected List<TargetType> target;

    /**
     * Gets the value of the protectionPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link ProtectionPolicyType }
     *     
     */
    public ProtectionPolicyType getProtectionPolicy() {
        return protectionPolicy;
    }

    /**
     * Sets the value of the protectionPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtectionPolicyType }
     *     
     */
    public void setProtectionPolicy(ProtectionPolicyType value) {
        this.protectionPolicy = value;
    }

    /**
     * Gets the value of the target property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the target property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTarget().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TargetType }
     * 
     * 
     */
    public List<TargetType> getTarget() {
        if (target == null) {
            target = new ArrayList<TargetType>();
        }
        return this.target;
    }

}