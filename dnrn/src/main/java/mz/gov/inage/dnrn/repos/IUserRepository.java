package mz.gov.inage.dnrn.repos;

import mz.gov.inage.dnrn.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
