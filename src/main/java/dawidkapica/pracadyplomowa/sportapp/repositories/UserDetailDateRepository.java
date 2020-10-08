package dawidkapica.pracadyplomowa.sportapp.repositories;

import dawidkapica.pracadyplomowa.sportapp.entities.UserDetailDateEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDetailDateRepository extends JpaRepository<UserDetailDateEntity, Integer>, JpaSpecificationExecutor<UserDetailDateEntity> {
}
