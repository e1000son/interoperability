package mz.gov.inage.dnrn.repos;

import mz.gov.inage.dnrn.entities.BirthCertificate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IBirthCertificateRepository extends JpaRepository<BirthCertificate, Long> {
    @Query("SELECT n from BirthCertificate n WHERE n.nuic = :reference")
    BirthCertificate findCertificateByNuic(@Param("reference") String reference);
}
