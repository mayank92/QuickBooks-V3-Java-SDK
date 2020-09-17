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
 * <p>Java class for EmployeeTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EmployeeTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Officer"/&gt;
 *     &lt;enumeration value="Owner"/&gt;
 *     &lt;enumeration value="Regular"/&gt;
 *     &lt;enumeration value="Statutory"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EmployeeTypeEnum")
@XmlEnum
public enum EmployeeTypeEnum {

    @XmlEnumValue("Officer")
    OFFICER("Officer"),
    @XmlEnumValue("Owner")
    OWNER("Owner"),
    @XmlEnumValue("Regular")
    REGULAR("Regular"),
    @XmlEnumValue("Statutory")
    STATUTORY("Statutory");
    private final String value;

    EmployeeTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EmployeeTypeEnum fromValue(String v) {
        for (EmployeeTypeEnum c: EmployeeTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
