package curso.inetum.concierto.instrumentos;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Qualifier("tocameAMi")
public class Tambor extends Instrumento{
	
	
	

	@Override
	@Value("tambor")
	public void setSonido(String sonido) {
		super.setSonido(sonido);
	}

}
