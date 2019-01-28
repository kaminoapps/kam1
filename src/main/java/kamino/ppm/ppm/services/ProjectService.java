package kamino.ppm.ppm.services;

import kamino.ppm.ppm.domain.Project;
import kamino.ppm.ppm.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {
    @Autowired
    private ProjectRepository projectRepository;


    public Project saveOrUpdateProject(Project project) {

        return  projectRepository.save(project);
    }
}
