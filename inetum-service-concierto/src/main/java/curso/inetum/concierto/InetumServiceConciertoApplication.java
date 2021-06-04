package curso.inetum.concierto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy

public class InetumServiceConciertoApplication {

	public static void main(String[] args) {
		SpringApplication.run(InetumServiceConciertoApplication.class, args);
	}

}
