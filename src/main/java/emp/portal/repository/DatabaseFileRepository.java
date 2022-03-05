package emp.portal.repository;

import emp.portal.entity.DatabaseFile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DatabaseFileRepository extends JpaRepository<DatabaseFile, String> {

}