package lesson_1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        IDoctor doctor = context.getBean("cardiologist", IDoctor.class);
        doctor.getCabinet();
    }
}
