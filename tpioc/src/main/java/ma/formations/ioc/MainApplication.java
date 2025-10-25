package ma.formations.ioc;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan (basePackages = "ma.formations.ioc")
public class MainApplication {
    public static void main(String[] args) {

    }
}