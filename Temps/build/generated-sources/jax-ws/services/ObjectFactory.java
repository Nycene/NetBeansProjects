
package services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the services package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DecalageHoraire_QNAME = new QName("http://services/", "decalageHoraire");
    private final static QName _TempsEnMinutes_QNAME = new QName("http://services/", "temps_en_minutes");
    private final static QName _TempsEnMinutesResponse_QNAME = new QName("http://services/", "temps_en_minutesResponse");
    private final static QName _AfficherHeureFormatResponse_QNAME = new QName("http://services/", "afficher_heure_formatResponse");
    private final static QName _DecalageHoraireResponse_QNAME = new QName("http://services/", "decalageHoraireResponse");
    private final static QName _AfficherHeureFormat_QNAME = new QName("http://services/", "afficher_heure_format");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DecalageHoraireResponse }
     * 
     */
    public DecalageHoraireResponse createDecalageHoraireResponse() {
        return new DecalageHoraireResponse();
    }

    /**
     * Create an instance of {@link AfficherHeureFormatResponse }
     * 
     */
    public AfficherHeureFormatResponse createAfficherHeureFormatResponse() {
        return new AfficherHeureFormatResponse();
    }

    /**
     * Create an instance of {@link AfficherHeureFormat }
     * 
     */
    public AfficherHeureFormat createAfficherHeureFormat() {
        return new AfficherHeureFormat();
    }

    /**
     * Create an instance of {@link TempsEnMinutes }
     * 
     */
    public TempsEnMinutes createTempsEnMinutes() {
        return new TempsEnMinutes();
    }

    /**
     * Create an instance of {@link DecalageHoraire }
     * 
     */
    public DecalageHoraire createDecalageHoraire() {
        return new DecalageHoraire();
    }

    /**
     * Create an instance of {@link TempsEnMinutesResponse }
     * 
     */
    public TempsEnMinutesResponse createTempsEnMinutesResponse() {
        return new TempsEnMinutesResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DecalageHoraire }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "decalageHoraire")
    public JAXBElement<DecalageHoraire> createDecalageHoraire(DecalageHoraire value) {
        return new JAXBElement<DecalageHoraire>(_DecalageHoraire_QNAME, DecalageHoraire.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TempsEnMinutes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "temps_en_minutes")
    public JAXBElement<TempsEnMinutes> createTempsEnMinutes(TempsEnMinutes value) {
        return new JAXBElement<TempsEnMinutes>(_TempsEnMinutes_QNAME, TempsEnMinutes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TempsEnMinutesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "temps_en_minutesResponse")
    public JAXBElement<TempsEnMinutesResponse> createTempsEnMinutesResponse(TempsEnMinutesResponse value) {
        return new JAXBElement<TempsEnMinutesResponse>(_TempsEnMinutesResponse_QNAME, TempsEnMinutesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AfficherHeureFormatResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "afficher_heure_formatResponse")
    public JAXBElement<AfficherHeureFormatResponse> createAfficherHeureFormatResponse(AfficherHeureFormatResponse value) {
        return new JAXBElement<AfficherHeureFormatResponse>(_AfficherHeureFormatResponse_QNAME, AfficherHeureFormatResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DecalageHoraireResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "decalageHoraireResponse")
    public JAXBElement<DecalageHoraireResponse> createDecalageHoraireResponse(DecalageHoraireResponse value) {
        return new JAXBElement<DecalageHoraireResponse>(_DecalageHoraireResponse_QNAME, DecalageHoraireResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AfficherHeureFormat }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "afficher_heure_format")
    public JAXBElement<AfficherHeureFormat> createAfficherHeureFormat(AfficherHeureFormat value) {
        return new JAXBElement<AfficherHeureFormat>(_AfficherHeureFormat_QNAME, AfficherHeureFormat.class, null, value);
    }

}
