package ma.esnset.hopital.repositories;

import ma.esnset.hopital.entities.Consultation;
import ma.esnset.hopital.entities.RendezVous;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsultationRepository extends JpaRepository <Consultation,Long> {
}
