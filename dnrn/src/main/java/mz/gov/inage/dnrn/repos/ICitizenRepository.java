package mz.gov.inage.dnrn.repos;

import mz.gov.inage.dnrn.entities.Citizen;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICitizenRepository extends JpaRepository<Citizen, Long> {
}
