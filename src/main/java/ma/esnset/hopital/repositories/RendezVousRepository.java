package ma.esnset.hopital.repositories;

import ma.esnset.hopital.entities.Medecin;
import ma.esnset.hopital.entities.RendezVous;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RendezVousRepository extends JpaRepository <RendezVous,Long> {
}
