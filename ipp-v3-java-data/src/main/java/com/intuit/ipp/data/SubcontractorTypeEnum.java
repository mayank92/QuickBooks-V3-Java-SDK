//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.09.10 at 09:45:50 AM PDT 
//


package com.intuit.ipp.data;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubcontractorTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SubcontractorTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Individual"/&gt;
 *     &lt;enumeration value="Company"/&gt;
 *     &lt;enumeration value="Partnership"/&gt;
 *     &lt;enumeration value="Trust"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SubcontractorTypeEnum")
@XmlEnum
public enum SubcontractorTypeEnum {

    @XmlEnumValue("Individual")
    INDIVIDUAL("Individual"),
    @XmlEnumValue("Company")
    COMPANY("Company"),
    @XmlEnumValue("Partnership")
    PARTNERSHIP("Partnership"),
    @XmlEnumValue("Trust")
    TRUST("Trust");
    private final String value;

    SubcontractorTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SubcontractorTypeEnum fromValue(String v) {
        for (SubcontractorTypeEnum c: SubcontractorTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
