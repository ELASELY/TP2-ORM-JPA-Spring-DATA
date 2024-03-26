package ma.esnset.hopital.repositories;

import ma.esnset.hopital.entities.Medecin;
import ma.esnset.hopital.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedecinRepository extends JpaRepository <Medecin,Long> {

    Medecin findByNom(String nom);
}
