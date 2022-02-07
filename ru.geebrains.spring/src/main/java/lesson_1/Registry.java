package lesson_1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("Registry")
public class Registry {
    private IDoctor doctor;

    public IDoctor getDoctor() {
        return doctor;
    }

    @Autowired
    @Qualifier("cardiologist")
    public void setDoctor(IDoctor doctor){
        this.doctor = doctor;
    }

    public void getCabinet(){
        doctor.getCabinet();
    }
}
