//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.12 at 03:31:50 PM IST 
//


package generated;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for products complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="products">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="buyprice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="msrp" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="productcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productdescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="htmldescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="image" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productline" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productsProductlinesViaProductline" type="{}products" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="textdescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productscale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productvendor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="quantityinstock" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "products", propOrder = {
    "buyprice",
    "msrp",
    "productcode",
    "productdescription",
    "htmldescription",
    "image",
    "productline",
    "productsProductlinesViaProductline",
    "textdescription",
    "productname",
    "productscale",
    "productvendor",
    "quantityinstock"
})
public class Products {

    protected BigDecimal buyprice;
    protected BigDecimal msrp;
    protected String productcode;
    protected String productdescription;
    protected String htmldescription;
    protected String image;
    protected String productline;
    @XmlElement(nillable = true)
    protected List<Products> productsProductlinesViaProductline;
    protected String textdescription;
    protected String productname;
    protected String productscale;
    protected String productvendor;
    protected Short quantityinstock;

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
     * Gets the value of the msrp property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMsrp() {
        return msrp;
    }

    /**
     * Sets the value of the msrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMsrp(BigDecimal value) {
        this.msrp = value;
    }

    /**
     * Gets the value of the productcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductcode() {
        return productcode;
    }

    /**
     * Sets the value of the productcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductcode(String value) {
        this.productcode = value;
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
     * Gets the value of the image property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImage() {
        return image;
    }

    /**
     * Sets the value of the image property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImage(String value) {
        this.image = value;
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
     * Gets the value of the productsProductlinesViaProductline property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productsProductlinesViaProductline property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductsProductlinesViaProductline().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Products }
     * 
     * 
     */
    public List<Products> getProductsProductlinesViaProductline() {
        if (productsProductlinesViaProductline == null) {
            productsProductlinesViaProductline = new ArrayList<Products>();
        }
        return this.productsProductlinesViaProductline;
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
     * Gets the value of the productscale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductscale() {
        return productscale;
    }

    /**
     * Sets the value of the productscale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductscale(String value) {
        this.productscale = value;
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
     * Gets the value of the quantityinstock property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getQuantityinstock() {
        return quantityinstock;
    }

    /**
     * Sets the value of the quantityinstock property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setQuantityinstock(Short value) {
        this.quantityinstock = value;
    }

}
