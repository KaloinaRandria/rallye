package mg.working.rallye.model.rallye;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import mg.working.rallye.service.util.IdGenerator;

@Entity
@Table(name = "rallye")
public class Rallye {
    @Id
    @Column(name = "id_rallye")
    String id;
    @Column(name = "edition")
    String edition;



    public Rallye(String id, String edition) {
        this.id = id;
        this.edition = edition;
    }

    public Rallye() {
    }

    public String getId() {
        return id;
    }

    public void setId(IdGenerator idGenerator) {
        this.id = idGenerator.generateId("RAL", "rallye_id_seq");
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }
}
