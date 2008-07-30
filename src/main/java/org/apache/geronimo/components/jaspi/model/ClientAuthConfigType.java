/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.5-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2008.07.15 at 04:13:34 PM PDT 
//


package org.apache.geronimo.components.jaspi.model;

import java.io.Serializable;
import java.util.Map;
import java.util.HashMap;
import java.util.Collections;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.security.auth.message.config.ClientAuthConfig;
import javax.security.auth.message.config.ClientAuthContext;
import javax.security.auth.message.AuthException;
import javax.security.auth.message.MessageInfo;
import javax.security.auth.Subject;
import javax.security.auth.callback.CallbackHandler;

import org.apache.geronimo.components.jaspi.ClassLoaderLookup;


/**
 * <p>Java class for clientAuthConfigType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="clientAuthConfigType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="messageLayer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="appContext" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="authenticationContextID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="protected" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="clientAuthContext" type="{http://geronimo.apache.org/xml/ns/geronimo-jaspi}clientAuthContextType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 * @version $Rev$ $Date$
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clientAuthConfigType", propOrder = {
    "messageLayer",
    "appContext",
    "authenticationContextID",
    "_protected",
    "clientAuthContext"
})
public class ClientAuthConfigType
    implements Serializable, KeyedObject
{

    private final static long serialVersionUID = 12343L;
    protected String messageLayer;
    protected String appContext;
    protected String authenticationContextID;
    @XmlElement(name = "protected")
    protected boolean _protected;
    //TODO go back to a map
    @XmlJavaTypeAdapter(KeyedObjectMapAdapter.class)
    protected Map<String, ClientAuthContextType> clientAuthContext;


    public ClientAuthConfigType() {
    }

    public ClientAuthConfigType(ClientAuthContextType clientAuthContextType, boolean _protected) {
        this.messageLayer = clientAuthContextType.getMessageLayer();
        this.appContext = clientAuthContextType.getAppContext();
        this.authenticationContextID = clientAuthContextType.getAuthenticationContextID();
        this.clientAuthContext = Collections.singletonMap(clientAuthContextType.getKey(), clientAuthContextType);
        this._protected = _protected;
    }

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
     * Gets the value of the clientAuthContext property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clientAuthContext property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClientAuthContext().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClientAuthContextType }
     * 
     * 
     */
    public Map<String, ClientAuthContextType> getClientAuthContext() {
        if (clientAuthContext == null) {
            clientAuthContext = new HashMap<String, ClientAuthContextType>();
        }
        return this.clientAuthContext;
    }


    //TODO move to ClientAuthContextImpl
    public String getAuthContextID(MessageInfo messageInfo) throws IllegalArgumentException {
        if (authenticationContextID != null) {
            return authenticationContextID;
        }
        for (ClientAuthContextType clientAuthContextType: clientAuthContext.values()) {
            String authContextID = clientAuthContextType.getAuthenticationContextID(messageInfo);
            if (authContextID != null) {
                return authContextID;
            }
        }
        return null;
    }

    public String getKey() {
        return ConfigProviderType.getRegistrationKey(messageLayer, appContext);
    }

    public void initialize(ClassLoaderLookup classLoaderLookup, CallbackHandler callbackHandler) throws AuthException {
    }

    public boolean isPersistent() {
        return true;
    }

    public ClientAuthConfig newClientAuthConfig(String messageLayer, String appContext, ClassLoaderLookup classLoaderLookup, CallbackHandler callbackHandler) throws AuthException {
        Map<String, ClientAuthContext> authContextMap = new HashMap<String, ClientAuthContext>();
        for (ClientAuthContextType clientAuthContextType: getClientAuthContext().values()) {
            if (clientAuthContextType.match(messageLayer, appContext)) {
                ClientAuthContext clientAuthContext = clientAuthContextType.newClientAuthContext(classLoaderLookup, callbackHandler);
                String authContextID = clientAuthContextType.getAuthenticationContextID();
                if (authContextID == null) {
                    authContextID = getAuthenticationContextID();
                }
                if (!authContextMap.containsKey(authContextID)) {
                    authContextMap.put(authContextID,  clientAuthContext);
                }
            }
        }
        return new ClientAuthConfigImpl(this, authContextMap);
    }

    public static class ClientAuthConfigImpl implements ClientAuthConfig {

        private final ClientAuthConfigType clientAuthConfigType;
        private final Map<String, ClientAuthContext> clientAuthContextMap;

        public ClientAuthConfigImpl(ClientAuthConfigType clientAuthConfigType, Map<String, ClientAuthContext> clientAuthContextMap) {
            this.clientAuthConfigType = clientAuthConfigType;
            this.clientAuthContextMap = clientAuthContextMap;
        }

        public ClientAuthContext getAuthContext(String authContextID, Subject clientSubject, Map properties) throws AuthException {
            return clientAuthContextMap.get(authContextID);
        }

        public String getAppContext() {
            return clientAuthConfigType.getAppContext();
        }

        public String getAuthContextID(MessageInfo messageInfo) throws IllegalArgumentException {
            return clientAuthConfigType.getAuthContextID(messageInfo);
        }

        public String getMessageLayer() {
            return clientAuthConfigType.getMessageLayer();
        }

        public boolean isProtected() {
            return clientAuthConfigType.isProtected();
        }

        public void refresh() throws AuthException, SecurityException {
        }
    }
}
