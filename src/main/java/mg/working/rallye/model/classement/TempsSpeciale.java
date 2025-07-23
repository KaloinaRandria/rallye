package mg.working.rallye.model.classement;

import jakarta.persistence.*;
import mg.working.rallye.model.rallye.Competiteur;
import mg.working.rallye.model.rallye.Speciale;
import mg.working.rallye.service.util.IdGenerator;

@Entity
@Table(name = "temps_speciale")
public class TempsSpeciale {
    @Id @Column(name = "id_temps_speciale")
    String id;
    @ManyToOne @JoinColumn(name = "id_competiteur" , referencedColumnName = "id_competiteur")
    Competiteur competiteur;
    @ManyToOne @JoinColumn(name = "id_speciale" , referencedColumnName = "id_speciale")
    Speciale speciale;
    @Column(name = "minute")
    int minute;
    @Column(name = "seconde")
    double seconde;
    @Column(name = "milliseconde")
    double milliseconde;

    public TempsSpeciale(String id, Competiteur competiteur, Speciale speciale, int minute, double seconde, double milliseconde) {
        this.id = id;
        this.competiteur = competiteur;
        this.speciale = speciale;
        this.minute = minute;
        this.seconde = seconde;
        this.milliseconde = milliseconde;
    }

    public TempsSpeciale() {}

    public double getMilliseconde() {
        return milliseconde;
    }

    public void setMilliseconde(double milliseconde) {
        this.milliseconde = milliseconde;
    }

    public double getSeconde() {
        return seconde;
    }

    public void setSeconde(double seconde) {
        this.seconde = seconde;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public Speciale getSpeciale() {
        return speciale;
    }

    public void setSpeciale(Speciale speciale) {
        this.speciale = speciale;
    }

    public Competiteur getCompetiteur() {
        return competiteur;
    }

    public void setCompetiteur(Competiteur competiteur) {
        this.competiteur = competiteur;
    }

    public String getId() {
        return id;
    }

    public void setId(IdGenerator idGenerator) {
        this.id = idGenerator.generateId("TSP" , "temps_speciale_id_seq");
    }
}
