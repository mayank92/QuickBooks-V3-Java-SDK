//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.09.10 at 09:45:50 AM PDT 
//


package com.intuit.ipp.data;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for idDomainEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="idDomainEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BM"/&gt;
 *     &lt;enumeration value="NG"/&gt;
 *     &lt;enumeration value="PMT"/&gt;
 *     &lt;enumeration value="QB"/&gt;
 *     &lt;enumeration value="QBO"/&gt;
 *     &lt;enumeration value="QBSDK"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "idDomainEnum")
@XmlEnum
public enum IdDomainEnum {

    BM,
    NG,
    PMT,
    QB,
    QBO,
    QBSDK;

    public String value() {
        return name();
    }

    public static IdDomainEnum fromValue(String v) {
        return valueOf(v);
    }

}
