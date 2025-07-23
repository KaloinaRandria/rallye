package mg.working.rallye.model.rallye;

import jakarta.persistence.*;
import mg.working.rallye.model.vivant.Personne;
import mg.working.rallye.service.util.IdGenerator;

@Entity
@Table(name = "competiteur")
public class Competiteur {
    @Id @Column(name = "id_competiteur")
    String id;
    @ManyToOne @JoinColumn(name = "id_pilote" , referencedColumnName = "id_personne")
    Personne pilote;
    @ManyToOne @JoinColumn(name = "id_copilote" , referencedColumnName = "id_personne")
    Personne copilote;
    @ManyToOne @JoinColumn(name = "id_categorie" , referencedColumnName = "id_categorie")
    Categorie categorie;

    public Competiteur(String id, Personne pilote, Personne copilote, Categorie categorie) {
        this.id = id;
        this.pilote = pilote;
        this.copilote = copilote;
        this.categorie = categorie;
    }

    public Competiteur() {}

    public String getId() {
        return id;
    }

    public void setId(IdGenerator idGenerator) {
        this.id = idGenerator.generateId("COM" , "competiteur_id_seq");
    }

    public Personne getPilote() {
        return pilote;
    }

    public void setPilote(Personne pilote) {
        this.pilote = pilote;
    }

    public Personne getCopilote() {
        return copilote;
    }

    public void setCopilote(Personne copilote) {
        this.copilote = copilote;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }
}
