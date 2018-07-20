
package services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour temps_en_minutes complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="temps_en_minutes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="heures" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="minutes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "temps_en_minutes", propOrder = {
    "heures",
    "minutes"
})
public class TempsEnMinutes {

    protected int heures;
    protected int minutes;

    /**
     * Obtient la valeur de la propriété heures.
     * 
     */
    public int getHeures() {
        return heures;
    }

    /**
     * Définit la valeur de la propriété heures.
     * 
     */
    public void setHeures(int value) {
        this.heures = value;
    }

    /**
     * Obtient la valeur de la propriété minutes.
     * 
     */
    public int getMinutes() {
        return minutes;
    }

    /**
     * Définit la valeur de la propriété minutes.
     * 
     */
    public void setMinutes(int value) {
        this.minutes = value;
    }

}
