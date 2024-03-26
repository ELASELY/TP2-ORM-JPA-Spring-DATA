package ma.esnset.hopital;

import ma.esnset.hopital.entities.*;
import ma.esnset.hopital.repositories.ConsultationRepository;
import ma.esnset.hopital.repositories.MedecinRepository;
import ma.esnset.hopital.repositories.PatientRepository;
import ma.esnset.hopital.repositories.RendezVousRepository;
import ma.esnset.hopital.service.IHopitalService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.stream.Stream;

@SpringBootApplication
public class HopitalApplication {

    public static void main(String[] args) {
        SpringApplication.run(HopitalApplication.class, args);
    }

    @Bean
    CommandLineRunner start(IHopitalService hopitalService, PatientRepository patientRepository, RendezVousRepository rendezVousRepository,ConsultationRepository consultationRepository, MedecinRepository medecinRepository){
     return args -> {
         Stream.of("Mohammed","yassin","Hassan")
                 .forEach(name->{
                     Patient patient=new Patient();
                     patient.setNom(name);
                     patient.setMalade(false);
                     hopitalService.savePatient(patient);
                 });
         Stream.of("karim","souad","hanane")
                 .forEach(name->{
                     Medecin medecin=new Medecin();
                     medecin.setNom(name);
                     medecin.setEmail(name+"@gmailcom");
                     medecin.setSpecialite(Math.random()>0.5?"Cardio":"Dentiste");
                     hopitalService.saveMedecin(medecin);
                 });
         Patient patient=patientRepository.findById(1L).orElse(null);
         Patient patient1=patientRepository.findByNom("Hassan");
Medecin medecin=medecinRepository.findByNom("hanane");
         RendezVous rendezVous=new RendezVous();
         rendezVous.setDate(new Date());
         rendezVous.setStatus(StatusRDV.PENDING);
         rendezVous.setMedecin(medecin);
         rendezVous.setPatient(patient);
         rendezVousRepository.save(rendezVous);

         RendezVous rendezVous1=rendezVousRepository.findById(1L).orElse(null);
Consultation consultation=new Consultation();
consultation.setDateConsultation(new Date());
consultation.setRendezVous(rendezVous);
consultation.setRapport("Rapport de la consulttaion");
hopitalService.saveConsultation(consultation);
     };
    }
}
