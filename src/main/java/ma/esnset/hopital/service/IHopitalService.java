package ma.esnset.hopital.service;

import ma.esnset.hopital.entities.Consultation;
import ma.esnset.hopital.entities.Medecin;
import ma.esnset.hopital.entities.Patient;
import ma.esnset.hopital.entities.RendezVous;

public interface IHopitalService {
    public Patient savePatient(Patient patient);
    Medecin saveMedecin(Medecin medecin);
    RendezVous saveRDV(RendezVous rendezVous);
    Consultation saveConsultation(Consultation consultation);
}
