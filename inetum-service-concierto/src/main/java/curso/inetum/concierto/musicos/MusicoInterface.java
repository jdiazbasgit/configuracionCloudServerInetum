package curso.inetum.concierto.musicos;

import curso.inetum.concierto.excepciones.InstrumentoRotoException;

public interface MusicoInterface {
	
	public void tocar() throws InstrumentoRotoException;

}
