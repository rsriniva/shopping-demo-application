//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.12 at 07:47:59 AM IST 
//


package generated;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for productsTwitterData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="productsTwitterData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="buyprice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="htmldescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productdescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productline" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productvendor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="textdescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "productsTwitterData", propOrder = {
    "buyprice",
    "htmldescription",
    "productdescription",
    "productline",
    "productname",
    "productvendor",
    "textdescription"
})
public class ProductsTwitterData {

    protected BigDecimal buyprice;
    protected String htmldescription;
    protected String productdescription;
    protected String productline;
    protected String productname;
    protected String productvendor;
    protected String textdescription;

    /**
     * Gets the value of the buyprice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBuyprice() {
        return buyprice;
    }

    /**
     * Sets the value of the buyprice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBuyprice(BigDecimal value) {
        this.buyprice = value;
    }

    /**
     * Gets the value of the htmldescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHtmldescription() {
        return htmldescription;
    }

    /**
     * Sets the value of the htmldescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHtmldescription(String value) {
        this.htmldescription = value;
    }

    /**
     * Gets the value of the productdescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductdescription() {
        return productdescription;
    }

    /**
     * Sets the value of the productdescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductdescription(String value) {
        this.productdescription = value;
    }

    /**
     * Gets the value of the productline property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductline() {
        return productline;
    }

    /**
     * Sets the value of the productline property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductline(String value) {
        this.productline = value;
    }

    /**
     * Gets the value of the productname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductname() {
        return productname;
    }

    /**
     * Sets the value of the productname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductname(String value) {
        this.productname = value;
    }

    /**
     * Gets the value of the productvendor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductvendor() {
        return productvendor;
    }

    /**
     * Sets the value of the productvendor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductvendor(String value) {
        this.productvendor = value;
    }

    /**
     * Gets the value of the textdescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextdescription() {
        return textdescription;
    }

    /**
     * Sets the value of the textdescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextdescription(String value) {
        this.textdescription = value;
    }

}
