//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.08.17 at 11:12:09 AM GMT+08:00 
//


package org.geektimes.enterprise.beans.xml.bind;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element ref="{http://xmlns.jcp.org/xml/ns/javaee}interceptors" minOccurs="0"/>
 *         &lt;element ref="{http://xmlns.jcp.org/xml/ns/javaee}decorators" minOccurs="0"/>
 *         &lt;element ref="{http://xmlns.jcp.org/xml/ns/javaee}alternatives" minOccurs="0"/>
 *         &lt;element ref="{http://xmlns.jcp.org/xml/ns/javaee}scan" minOccurs="0"/>
 *         &lt;element ref="{http://xmlns.jcp.org/xml/ns/javaee}trim" minOccurs="0"/>
 *       &lt;/all>
 *       &lt;attribute name="version" default="2.0">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;pattern value="\.?[0-9]+(\.[0-9]+)*"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="bean-discovery-mode" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="annotated"/>
 *             &lt;enumeration value="all"/>
 *             &lt;enumeration value="none"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "beans")
public class Beans {

    protected Interceptors interceptors;
    protected Decorators decorators;
    protected Alternatives alternatives;
    protected Scan scan;
    protected String trim;
    @XmlAttribute(name = "version")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String version;
    @XmlAttribute(name = "bean-discovery-mode", required = true)
    protected String beanDiscoveryMode;

    /**
     * Gets the value of the interceptors property.
     * 
     * @return
     *     possible object is
     *     {@link Interceptors }
     *     
     */
    public Interceptors getInterceptors() {
        return interceptors;
    }

    /**
     * Sets the value of the interceptors property.
     * 
     * @param value
     *     allowed object is
     *     {@link Interceptors }
     *     
     */
    public void setInterceptors(Interceptors value) {
        this.interceptors = value;
    }

    /**
     * Gets the value of the decorators property.
     * 
     * @return
     *     possible object is
     *     {@link Decorators }
     *     
     */
    public Decorators getDecorators() {
        return decorators;
    }

    /**
     * Sets the value of the decorators property.
     * 
     * @param value
     *     allowed object is
     *     {@link Decorators }
     *     
     */
    public void setDecorators(Decorators value) {
        this.decorators = value;
    }

    /**
     * Gets the value of the alternatives property.
     * 
     * @return
     *     possible object is
     *     {@link Alternatives }
     *     
     */
    public Alternatives getAlternatives() {
        return alternatives;
    }

    /**
     * Sets the value of the alternatives property.
     * 
     * @param value
     *     allowed object is
     *     {@link Alternatives }
     *     
     */
    public void setAlternatives(Alternatives value) {
        this.alternatives = value;
    }

    /**
     * Gets the value of the scan property.
     * 
     * @return
     *     possible object is
     *     {@link Scan }
     *     
     */
    public Scan getScan() {
        return scan;
    }

    /**
     * Sets the value of the scan property.
     * 
     * @param value
     *     allowed object is
     *     {@link Scan }
     *     
     */
    public void setScan(Scan value) {
        this.scan = value;
    }

    /**
     * Gets the value of the trim property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrim() {
        return trim;
    }

    /**
     * Sets the value of the trim property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrim(String value) {
        this.trim = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        if (version == null) {
            return "2.0";
        } else {
            return version;
        }
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the beanDiscoveryMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeanDiscoveryMode() {
        return beanDiscoveryMode;
    }

    /**
     * Sets the value of the beanDiscoveryMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeanDiscoveryMode(String value) {
        this.beanDiscoveryMode = value;
    }

}