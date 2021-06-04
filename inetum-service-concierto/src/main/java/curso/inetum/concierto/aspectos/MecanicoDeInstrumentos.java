package curso.inetum.concierto.aspectos;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import curso.inetum.concierto.excepciones.InstrumentoRotoException;
import curso.inetum.concierto.instrumentos.Instrumento;
import curso.inetum.concierto.musicos.HombreOrquesta;
import curso.inetum.concierto.musicos.Solista;

@Component
@Aspect
public class MecanicoDeInstrumentos {
	
	@Pointcut("execution(@curso.inetum.concierto.anotaciones.Vigilante * *.*(..))")
	public void sujetador() {
		
	}
	
	@Around("sujetador()")
	public Object arreglarInstrumento(ProceedingJoinPoint joinPoint) throws InstrumentoRotoException
	{
		Object salida= null;
		Object musico=joinPoint.getTarget();
		
		try {
			//Before
			salida=joinPoint.proceed();
			//AfterReturning
		} catch (Throwable e) {
			//AfterThrowing
			System.out.println("SEÑORES HAY UNA AVERIA, ENSEGUIDA LO ARREGLAMOS");
			if(musico.getClass().isInstance(new Solista()))
			{
				Solista solista=(Solista) musico;
				solista.getInstrumento().setSonido("sonido arreglado de "+solista.getInstrumento().getClass().getSimpleName());
				System.out.println("SEÑORES HEMOS ARREGLADO EL PROBLEMA, CONTINUAMOS EL CONCIERTO");
				solista.tocar();
			}
			else {
				HombreOrquesta hombreOrquesta=(HombreOrquesta) musico;
				
				for (Instrumento instrumento : hombreOrquesta.getInstrumentos()) {
					if(instrumento.getSonido().equals("nada"))
						instrumento.setSonido("sonido arreglado de "+instrumento.getClass().getSimpleName());
					
				}
				System.out.println("SEÑORES HEMOS ARREGLADO EL PROBLEMA, CONTINUAMOS EL CONCIERTO");
				hombreOrquesta.tocar();
				
			}
		}
		finally {
			//After
		}
		
		
		return salida;
	}

}
