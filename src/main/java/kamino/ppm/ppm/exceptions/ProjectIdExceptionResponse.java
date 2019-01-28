package kamino.ppm.ppm.exceptions;

public class ProjectIdExceptionResponse {

    private String projectIdentifier;

    public ProjectIdExceptionResponse(String projectIdentifier){
        this.projectIdentifier=projectIdentifier;
    }
    public String getProjectIdentifier(){
        return projectIdentifier;
    }
    public void setProjectIdentifier(){
        this.projectIdentifier= projectIdentifier;
    }
}
