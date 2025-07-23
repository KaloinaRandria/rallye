package mg.working.rallye.model.vivant;

import jakarta.persistence.*;
import mg.working.rallye.model.rallye.Ecurie;
import mg.working.rallye.service.util.IdGenerator;

@Entity
@Table(name = "personne")
public class Personne {
    @Id @Column(name = "id_personne")
    String id;
    @Column(name = "nom")
    String nom;
    @Enumerated(EnumType.STRING)
    RolePersonne role;
    @ManyToOne @JoinColumn(name = "id_ecurie" , referencedColumnName = "id_ecurie")
    Ecurie ecurie;


    public enum RolePersonne {
        PILOTE,
        COPILOTE
    }

    public Personne(String id, String nom, RolePersonne role, Ecurie ecurie) {
        this.id = id;
        this.nom = nom;
        this.role = role;
        this.ecurie = ecurie;
    }

    public Personne() {}

    public String getId() {
        return id;
    }

    public void setId(IdGenerator idGenerator) {
        this.id = idGenerator.generateId("PER" , "personne_id_seq");
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public RolePersonne getRole() {
        return role;
    }

    public void setRole(RolePersonne role) {
        this.role = role;
    }

    public Ecurie getEcurie() {
        return ecurie;
    }

    public void setEcurie(Ecurie ecurie) {
        this.ecurie = ecurie;
    }
}
