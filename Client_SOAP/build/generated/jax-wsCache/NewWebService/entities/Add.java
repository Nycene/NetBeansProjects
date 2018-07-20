
package entities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour add complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="add">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="parameter" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="parameter1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "add", propOrder = {
    "parameter",
    "parameter1"
})
public class Add {

    protected int parameter;
    protected int parameter1;

    /**
     * Obtient la valeur de la propriété parameter.
     * 
     */
    public int getParameter() {
        return parameter;
    }

    /**
     * Définit la valeur de la propriété parameter.
     * 
     */
    public void setParameter(int value) {
        this.parameter = value;
    }

    /**
     * Obtient la valeur de la propriété parameter1.
     * 
     */
    public int getParameter1() {
        return parameter1;
    }

    /**
     * Définit la valeur de la propriété parameter1.
     * 
     */
    public void setParameter1(int value) {
        this.parameter1 = value;
    }

}
