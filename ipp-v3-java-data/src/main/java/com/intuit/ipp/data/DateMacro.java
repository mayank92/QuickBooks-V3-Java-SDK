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
 * <p>Java class for DateMacro.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DateMacro"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="All"/&gt;
 *     &lt;enumeration value="Today"/&gt;
 *     &lt;enumeration value="This Week"/&gt;
 *     &lt;enumeration value="This Week-to-date"/&gt;
 *     &lt;enumeration value="This Month"/&gt;
 *     &lt;enumeration value="This Month-to-date"/&gt;
 *     &lt;enumeration value="This Fiscal Quarter"/&gt;
 *     &lt;enumeration value="This Fiscal Quarter-to-date"/&gt;
 *     &lt;enumeration value="This Fiscal Year"/&gt;
 *     &lt;enumeration value="This Fiscal Year-to-date"/&gt;
 *     &lt;enumeration value="This Calendar Quarter"/&gt;
 *     &lt;enumeration value="This Calendar Quarter-to-date"/&gt;
 *     &lt;enumeration value="This Calendar Year"/&gt;
 *     &lt;enumeration value="This Calendar Year-to-date"/&gt;
 *     &lt;enumeration value="Yesterday"/&gt;
 *     &lt;enumeration value="Last Week"/&gt;
 *     &lt;enumeration value="Last Week-to-date"/&gt;
 *     &lt;enumeration value="Last Month"/&gt;
 *     &lt;enumeration value="Last Month-to-date"/&gt;
 *     &lt;enumeration value="Last Fiscal Quarter"/&gt;
 *     &lt;enumeration value="Last Fiscal Quarter-to-date"/&gt;
 *     &lt;enumeration value="Last Fiscal Year"/&gt;
 *     &lt;enumeration value="Last Fiscal Year-to-date"/&gt;
 *     &lt;enumeration value="Last Calendar Quarter"/&gt;
 *     &lt;enumeration value="Last Calendar Quarter-to-date"/&gt;
 *     &lt;enumeration value="Last Calendar Year"/&gt;
 *     &lt;enumeration value="Last Calendar Year-to-date"/&gt;
 *     &lt;enumeration value="Next Week"/&gt;
 *     &lt;enumeration value="Next 4 Weeks"/&gt;
 *     &lt;enumeration value="Next Month"/&gt;
 *     &lt;enumeration value="Next Fiscal Quarter"/&gt;
 *     &lt;enumeration value="Next Fiscal Year"/&gt;
 *     &lt;enumeration value="Next Calendar Quarter"/&gt;
 *     &lt;enumeration value="Next Calendar Year"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DateMacro")
@XmlEnum
public enum DateMacro {

    @XmlEnumValue("All")
    ALL("All"),
    @XmlEnumValue("Today")
    TODAY("Today"),
    @XmlEnumValue("This Week")
    THIS_WEEK("This Week"),
    @XmlEnumValue("This Week-to-date")
    THIS_WEEK_TO_DATE("This Week-to-date"),
    @XmlEnumValue("This Month")
    THIS_MONTH("This Month"),
    @XmlEnumValue("This Month-to-date")
    THIS_MONTH_TO_DATE("This Month-to-date"),
    @XmlEnumValue("This Fiscal Quarter")
    THIS_FISCAL_QUARTER("This Fiscal Quarter"),
    @XmlEnumValue("This Fiscal Quarter-to-date")
    THIS_FISCAL_QUARTER_TO_DATE("This Fiscal Quarter-to-date"),
    @XmlEnumValue("This Fiscal Year")
    THIS_FISCAL_YEAR("This Fiscal Year"),
    @XmlEnumValue("This Fiscal Year-to-date")
    THIS_FISCAL_YEAR_TO_DATE("This Fiscal Year-to-date"),
    @XmlEnumValue("This Calendar Quarter")
    THIS_CALENDAR_QUARTER("This Calendar Quarter"),
    @XmlEnumValue("This Calendar Quarter-to-date")
    THIS_CALENDAR_QUARTER_TO_DATE("This Calendar Quarter-to-date"),
    @XmlEnumValue("This Calendar Year")
    THIS_CALENDAR_YEAR("This Calendar Year"),
    @XmlEnumValue("This Calendar Year-to-date")
    THIS_CALENDAR_YEAR_TO_DATE("This Calendar Year-to-date"),
    @XmlEnumValue("Yesterday")
    YESTERDAY("Yesterday"),
    @XmlEnumValue("Last Week")
    LAST_WEEK("Last Week"),
    @XmlEnumValue("Last Week-to-date")
    LAST_WEEK_TO_DATE("Last Week-to-date"),
    @XmlEnumValue("Last Month")
    LAST_MONTH("Last Month"),
    @XmlEnumValue("Last Month-to-date")
    LAST_MONTH_TO_DATE("Last Month-to-date"),
    @XmlEnumValue("Last Fiscal Quarter")
    LAST_FISCAL_QUARTER("Last Fiscal Quarter"),
    @XmlEnumValue("Last Fiscal Quarter-to-date")
    LAST_FISCAL_QUARTER_TO_DATE("Last Fiscal Quarter-to-date"),
    @XmlEnumValue("Last Fiscal Year")
    LAST_FISCAL_YEAR("Last Fiscal Year"),
    @XmlEnumValue("Last Fiscal Year-to-date")
    LAST_FISCAL_YEAR_TO_DATE("Last Fiscal Year-to-date"),
    @XmlEnumValue("Last Calendar Quarter")
    LAST_CALENDAR_QUARTER("Last Calendar Quarter"),
    @XmlEnumValue("Last Calendar Quarter-to-date")
    LAST_CALENDAR_QUARTER_TO_DATE("Last Calendar Quarter-to-date"),
    @XmlEnumValue("Last Calendar Year")
    LAST_CALENDAR_YEAR("Last Calendar Year"),
    @XmlEnumValue("Last Calendar Year-to-date")
    LAST_CALENDAR_YEAR_TO_DATE("Last Calendar Year-to-date"),
    @XmlEnumValue("Next Week")
    NEXT_WEEK("Next Week"),
    @XmlEnumValue("Next 4 Weeks")
    NEXT_4_WEEKS("Next 4 Weeks"),
    @XmlEnumValue("Next Month")
    NEXT_MONTH("Next Month"),
    @XmlEnumValue("Next Fiscal Quarter")
    NEXT_FISCAL_QUARTER("Next Fiscal Quarter"),
    @XmlEnumValue("Next Fiscal Year")
    NEXT_FISCAL_YEAR("Next Fiscal Year"),
    @XmlEnumValue("Next Calendar Quarter")
    NEXT_CALENDAR_QUARTER("Next Calendar Quarter"),
    @XmlEnumValue("Next Calendar Year")
    NEXT_CALENDAR_YEAR("Next Calendar Year");
    private final String value;

    DateMacro(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DateMacro fromValue(String v) {
        for (DateMacro c: DateMacro.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
