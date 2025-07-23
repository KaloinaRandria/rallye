package mg.working.rallye.model.rallye;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import mg.working.rallye.service.util.IdGenerator;

@Entity
@Table(name = "ecurie")
public class Ecurie {
    @Id @Column(name = "id_ecurie")
    String id;
    @Column(name = "nom")
    String nom;

    public Ecurie(String id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public Ecurie() {}

    public String getId() {
        return id;
    }

    public void setId(IdGenerator idGenerator) {
        this.id = idGenerator.generateId("ECO" , "ecurie_id_seq");
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
