package curso.inetum.concierto.instrumentos;

import curso.inetum.concierto.excepciones.InstrumentoRotoException;

public interface InstrumentoInterface {
	
	public String sonar() throws InstrumentoRotoException; 

}
