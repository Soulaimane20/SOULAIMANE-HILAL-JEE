package ma.enset.jpaap.repositories;

import ma.enset.jpaap.entities.Patient;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

public interface PatientRepository extends JpaRepository<Patient,Long> {

    Page<Patient> findByNomContains (String krd, Pageable pageable);

    @Query("select p from Patient p " +
            "where p.dateNaissance between :x and :y or p.nom like :z")
    public List<Patient> FindPatients(@Param("x") Date d1,
                                      @Param("y")  Date d2, @Param("z")  String nom);
}
