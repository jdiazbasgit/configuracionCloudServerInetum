package curso.inetum.concierto.instrumentos;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class Guitarra extends Instrumento{
	
	

	@Override
	@Value("${guitarra}")
	public void setSonido(String sonido) {
		super.setSonido(sonido);
	}

}
