package kamino.ppm.ppm.repositories;

import kamino.ppm.ppm.domain.Project;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends CrudRepository<Project,Long> {

    Project findByProjectIdentifier(String projecId);

    @Override
    Iterable<Project> findAll();
}
