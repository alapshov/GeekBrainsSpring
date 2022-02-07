package lesson_1;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component("Traumatologist")
public class Traumatologist implements IDoctor {

    @Bean("traumatologist")
    public IDoctor doctor(){
        return new Traumatologist();
    }

    public void getCabinet() {
        System.out.println("№ 141");
    }
}
