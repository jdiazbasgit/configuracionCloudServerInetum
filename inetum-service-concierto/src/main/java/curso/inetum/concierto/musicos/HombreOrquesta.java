package curso.inetum.concierto.musicos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import curso.inetum.concierto.anotaciones.Vigilante;
import curso.inetum.concierto.excepciones.InstrumentoRotoException;
import curso.inetum.concierto.instrumentos.Instrumento;

@Component
public class HombreOrquesta implements MusicoInterface {
	
	@Autowired
	@Qualifier("tocameAMi")
	private List<Instrumento> instrumentos;

	@Override
	//@Vigilante
	public void tocar() throws InstrumentoRotoException {
		for (Instrumento instrumento : getInstrumentos()) {
			System.out.println(instrumento.sonar());
		}

	}

	public List<Instrumento> getInstrumentos() {
		return instrumentos;
	}

	public void setInstrumentos(List<Instrumento> instrumentos) {
		this.instrumentos = instrumentos;
	}

}
