package ma.emsi.patientsmvc;

import ma.emsi.patientsmvc.entities.Patient;
import ma.emsi.patientsmvc.repositories.PatientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
@SpringBootApplication
public class PatientsMvcApplication {
    public static void main(String[] args) {
        SpringApplication.run(PatientsMvcApplication.class, args);
    }
    @Bean
    CommandLineRunner commandLineRunner(PatientRepository patientRepository){
        return args -> {
            patientRepository.save(new Patient(null, "Soulaimane", new Date(), false, 12));
            patientRepository.save(new Patient(null, "Mouad", new Date(), true, 321));
            patientRepository.save(new Patient(null, "Hifdi", new Date(), true, 65));
            patientRepository.save(new Patient(null, "Mustapha", new Date(), true, 32));

            patientRepository.findAll().forEach(p->{
                System.out.println(p.getNom());
            });

        };
    }
}
