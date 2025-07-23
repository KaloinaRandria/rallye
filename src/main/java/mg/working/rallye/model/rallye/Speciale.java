package mg.working.rallye.model.rallye;

import jakarta.persistence.*;
import mg.working.rallye.service.util.IdGenerator;

@Entity
@Table(name = "speciale")
public class Speciale {
    @Id
    @Column(name = "id_speciale")
    String id;
    @ManyToOne @JoinColumn(name = "id_rallye" , referencedColumnName = "id_rallye")
    Rallye rallye;
    @Column(name = "distance")
    double distance;

    public Speciale(String id, Rallye rallye, double distance) {
        this.id = id;
        this.rallye = rallye;
        this.distance = distance;
    }

    public Speciale() {
    }

    public String getId() {
        return id;
    }

    public void setId(IdGenerator idGenerator) {
        this.id = idGenerator.generateId("SPE" , "speciale_id_seq");
    }

    public Rallye getRallye() {
        return rallye;
    }

    public void setRallye(Rallye rallye) {
        this.rallye = rallye;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }
}
