package dawidkapica.pracadyplomowa.sportapp.repositories;

import dawidkapica.pracadyplomowa.sportapp.entities.AdminEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<AdminEntity, Integer>, JpaSpecificationExecutor<AdminEntity> {
}
