package lesson_1;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component("Cardiologist")
public class Cardiologist implements IDoctor {

    @Bean("cardiologist")
    public IDoctor doctor(){
        return new Cardiologist();
    }

    public void getCabinet() {
        System.out.println("№ 153");
    }
}
