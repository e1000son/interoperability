package mz.gov.inage.dnrn.repos;

import mz.gov.inage.dnrn.entities.BirthCertificate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBirthCertificateRepository extends JpaRepository<BirthCertificate, Long> {
}
