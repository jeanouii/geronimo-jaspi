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
import java.util.Map;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.security.auth.message.config.ServerAuthConfig;
import javax.security.auth.message.config.ServerAuthContext;
import javax.security.auth.message.AuthException;
import javax.security.auth.message.MessageInfo;
import javax.security.auth.Subject;


/**
 * <p>Java class for serverAuthConfigType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="serverAuthConfigType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="messageLayer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="appContext" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="authenticationContextID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="protected" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="serverAuthContext" type="{http://geronimo.apache.org/xml/ns/geronimo-jaspi}serverAuthContextType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "serverAuthConfigType", propOrder = {
    "messageLayer",
    "appContext",
    "authenticationContextID",
    "_protected",
    "serverAuthContext"
})
public class ServerAuthConfigType
    implements ServerAuthConfig, Serializable
{

    private final static long serialVersionUID = 12343L;
    protected String messageLayer;
    protected String appContext;
    protected String authenticationContextID;
    @XmlElement(name = "protected")
    protected boolean _protected;
    protected List<ServerAuthContextType> serverAuthContext;

    /**
     * Gets the value of the messageLayer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageLayer() {
        return messageLayer;
    }

    /**
     * Sets the value of the messageLayer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageLayer(String value) {
        this.messageLayer = value;
    }

    /**
     * Gets the value of the appContext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppContext() {
        return appContext;
    }

    public String getAuthContextID(MessageInfo messageInfo) throws IllegalArgumentException {
        if (authenticationContextID != null) {
            return authenticationContextID;
        }
        for (ServerAuthContextType serverAuthContextType: serverAuthContext) {
            String authContextID = serverAuthContextType.getAuthenticationContextID(messageInfo);
            if (authContextID != null) {
                return authContextID;
            }
        }
        return null;
    }

    /**
     * Sets the value of the appContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppContext(String value) {
        this.appContext = value;
    }

    /**
     * Gets the value of the authenticationContextID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthenticationContextID() {
        return authenticationContextID;
    }

    /**
     * Sets the value of the authenticationContextID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthenticationContextID(String value) {
        this.authenticationContextID = value;
    }

    /**
     * Gets the value of the protected property.
     * 
     */
    public boolean isProtected() {
        return _protected;
    }

    public void refresh() throws AuthException, SecurityException {
    }

    /**
     * Sets the value of the protected property.
     * 
     */
    public void setProtected(boolean value) {
        this._protected = value;
    }

    /**
     * Gets the value of the serverAuthContext property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serverAuthContext property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServerAuthContext().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServerAuthContextType }
     * 
     * 
     */
    public List<ServerAuthContextType> getServerAuthContext() {
        if (serverAuthContext == null) {
            serverAuthContext = new ArrayList<ServerAuthContextType>();
        }
        return this.serverAuthContext;
    }

    public ServerAuthContext getAuthContext(String authContextID, Subject serviceSubject, Map properties) throws AuthException {
        return null;
    }
}
