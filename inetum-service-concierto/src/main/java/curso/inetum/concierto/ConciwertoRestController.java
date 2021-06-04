package curso.inetum.concierto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import curso.inetum.concierto.musicos.HombreOrquesta;
import curso.inetum.concierto.musicos.Solista;
import lombok.Data;

@RestController
@Data
public class ConciwertoRestController {
	
	@Autowired
	private Solista solista;
	
	@Autowired
	private HombreOrquesta hombreOrquesta;
	
	@GetMapping("solista")
	public Solista solista() {
		return getSolista();
	}
	
	@GetMapping("hombreOrquesta")
	public HombreOrquesta hombreOrquesta() {
		return getHombreOrquesta();
	}

}
