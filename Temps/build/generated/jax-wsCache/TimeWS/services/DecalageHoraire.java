
package services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour decalageHoraire complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="decalageHoraire">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="heure1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="minute1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="heure2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="minute2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "decalageHoraire", propOrder = {
    "heure1",
    "minute1",
    "heure2",
    "minute2"
})
public class DecalageHoraire {

    protected int heure1;
    protected int minute1;
    protected int heure2;
    protected int minute2;

    /**
     * Obtient la valeur de la propriété heure1.
     * 
     */
    public int getHeure1() {
        return heure1;
    }

    /**
     * Définit la valeur de la propriété heure1.
     * 
     */
    public void setHeure1(int value) {
        this.heure1 = value;
    }

    /**
     * Obtient la valeur de la propriété minute1.
     * 
     */
    public int getMinute1() {
        return minute1;
    }

    /**
     * Définit la valeur de la propriété minute1.
     * 
     */
    public void setMinute1(int value) {
        this.minute1 = value;
    }

    /**
     * Obtient la valeur de la propriété heure2.
     * 
     */
    public int getHeure2() {
        return heure2;
    }

    /**
     * Définit la valeur de la propriété heure2.
     * 
     */
    public void setHeure2(int value) {
        this.heure2 = value;
    }

    /**
     * Obtient la valeur de la propriété minute2.
     * 
     */
    public int getMinute2() {
        return minute2;
    }

    /**
     * Définit la valeur de la propriété minute2.
     * 
     */
    public void setMinute2(int value) {
        this.minute2 = value;
    }

}
