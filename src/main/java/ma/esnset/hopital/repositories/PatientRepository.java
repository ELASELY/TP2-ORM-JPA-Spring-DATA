package ma.esnset.hopital.repositories;

import ma.esnset.hopital.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository <Patient,Long> {
    Patient findByNom(String name);
}
