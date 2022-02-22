package lesson_1;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component("Terapist")
public class Terapist implements IDoctor {
    @Bean("terapist")
    public IDoctor doctor(){
        return new Terapist();
    }

    public void getCabinet() {
        System.out.println("№ 160");
    }
}
