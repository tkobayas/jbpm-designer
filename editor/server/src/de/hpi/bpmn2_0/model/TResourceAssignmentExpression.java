//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.08.07 at 02:01:49 PM CEST 
//


package de.hpi.bpmn2_0.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tResourceAssignmentExpression complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tResourceAssignmentExpression">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.omg.org/spec/BPMN/2.0}tBaseElement">
 *       &lt;sequence>
 *         &lt;element ref="{http://schema.omg.org/spec/BPMN/2.0}expression"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tResourceAssignmentExpression", propOrder = {
    "expression"
})
public class TResourceAssignmentExpression
    extends TBaseElement
{

    @XmlElementRef(name = "expression", namespace = "http://schema.omg.org/spec/BPMN/2.0", type = JAXBElement.class)
    protected JAXBElement<?> expression;

    /**
     * Gets the value of the expression property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TFormalExpression }{@code >}
     *     {@link JAXBElement }{@code <}{@link TExpression }{@code >}
     *     
     */
    public JAXBElement<?> getExpression() {
        return expression;
    }

    /**
     * Sets the value of the expression property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TFormalExpression }{@code >}
     *     {@link JAXBElement }{@code <}{@link TExpression }{@code >}
     *     
     */
    public void setExpression(JAXBElement<?> value) {
        this.expression = ((JAXBElement<?> ) value);
    }

}