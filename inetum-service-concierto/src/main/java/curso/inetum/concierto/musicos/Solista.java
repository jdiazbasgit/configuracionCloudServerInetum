package curso.inetum.concierto.musicos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import curso.inetum.concierto.anotaciones.Vigilante;
import curso.inetum.concierto.excepciones.InstrumentoRotoException;
import curso.inetum.concierto.instrumentos.Instrumento;

@Component
public class Solista implements MusicoInterface {

	@Autowired
	@Qualifier("guitarra")
	private Instrumento instrumento;
	
	
	@Override
	//@Vigilante
	public void tocar() throws InstrumentoRotoException {
		System.out.println(getInstrumento().sonar());
	}


	public Instrumento getInstrumento() {
		return instrumento;
	}


	public void setInstrumento(Instrumento instrumento) {
		this.instrumento = instrumento;
	}
	
	

}
