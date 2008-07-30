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
import javax.security.auth.message.config.ServerAuthConfig;
import javax.security.auth.message.config.ServerAuthContext;
import javax.security.auth.message.AuthException;
import javax.security.auth.message.MessageInfo;
import javax.security.auth.Subject;
import javax.security.auth.callback.CallbackHandler;

import org.apache.geronimo.components.jaspi.ClassLoaderLookup;


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
 * @version $Rev$ $Date$
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
    implements Serializable, KeyedObject
{

    private final static long serialVersionUID = 12343L;
    protected String messageLayer;
    protected String appContext;
    protected String authenticationContextID;
    @XmlElement(name = "protected")
    protected boolean _protected;
    @XmlJavaTypeAdapter(KeyedObjectMapAdapter.class)
    protected Map<String, ServerAuthContextType> serverAuthContext;

    public ServerAuthConfigType() {
    }

    public ServerAuthConfigType(ServerAuthContextType serverAuthContextType, boolean _protected) {
        this.messageLayer = serverAuthContextType.getMessageLayer();
        this.appContext = serverAuthContextType.getAppContext();
        this.authenticationContextID = serverAuthContextType.getAuthenticationContextID();
        this.serverAuthContext = Collections.singletonMap(serverAuthContextType.getKey(), serverAuthContextType);
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

    public String getAuthContextID(MessageInfo messageInfo) throws IllegalArgumentException {
        if (authenticationContextID != null) {
            return authenticationContextID;
        }
        for (ServerAuthContextType serverAuthContextType: serverAuthContext.values()) {
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
    public Map<String, ServerAuthContextType> getServerAuthContext() {
        if (serverAuthContext == null) {
            serverAuthContext = new HashMap<String, ServerAuthContextType>();
        }
        return this.serverAuthContext;
    }

    public ServerAuthContext getAuthContext(String authContextID, Subject serviceSubject, Map properties) throws AuthException {
        //see page 136  We are going to ignore the clientSubject and properties for now.
        for (ServerAuthContextType serverAuthContext: getServerAuthContext().values()) {
            if (serverAuthContext.getAuthenticationContextID().equals(authContextID)) {
                return serverAuthContext.getServerAuthContext();
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

    public ServerAuthConfig newServerAuthConfig(String messageLayer, String appContext, ClassLoaderLookup classLoaderLookup, CallbackHandler callbackHandler) throws AuthException {
        Map<String, ServerAuthContext> authContextMap = new HashMap<String, ServerAuthContext>();
        for (ServerAuthContextType serverAuthContextType: getServerAuthContext().values()) {
            if (serverAuthContextType.match(messageLayer, appContext)) {
                ServerAuthContext serverAuthContext = serverAuthContextType.newServerAuthContext(classLoaderLookup, callbackHandler);
                String authContextID = serverAuthContextType.getAuthenticationContextID();
                if (authContextID == null) {
                    authContextID = getAuthenticationContextID();
                }
                if (!authContextMap.containsKey(authContextID)) {
                    authContextMap.put(authContextID,  serverAuthContext);
                }
            }
        }
        return new ServerAuthConfigImpl(this, authContextMap);
    }

    public static class ServerAuthConfigImpl implements ServerAuthConfig {

        private final ServerAuthConfigType serverAuthConfigType;
        private final Map<String, ServerAuthContext> serverAuthContextMap;

        public ServerAuthConfigImpl(ServerAuthConfigType serverAuthConfigType, Map<String, ServerAuthContext> serverAuthContextMap) {
            this.serverAuthConfigType = serverAuthConfigType;
            this.serverAuthContextMap = serverAuthContextMap;
        }

        public ServerAuthContext getAuthContext(String authContextID, Subject serverSubject, Map properties) throws AuthException {
            return serverAuthContextMap.get(authContextID);
        }

        public String getAppContext() {
            return serverAuthConfigType.getAppContext();
        }

        public String getAuthContextID(MessageInfo messageInfo) throws IllegalArgumentException {
            return serverAuthConfigType.getAuthContextID(messageInfo);
        }

        public String getMessageLayer() {
            return serverAuthConfigType.getMessageLayer();
        }

        public boolean isProtected() {
            return serverAuthConfigType.isProtected();
        }

        public void refresh() throws AuthException, SecurityException {
        }
    }
}
