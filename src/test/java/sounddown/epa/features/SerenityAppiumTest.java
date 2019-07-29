package sounddown.epa.features;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import sounddown.epa.steps.SoundDownSteps;




@RunWith(SerenityRunner.class)
public class SerenityAppiumTest {
	
	
	@Managed(driver = "appium")
	WebDriver driver;
	
	@Steps
	SoundDownSteps SoundDown;
	
	

	@Test
	public void verNotificacion() {
			SoundDown.seleccionarNotificacion();
			SoundDown.presionarEnElBotonDeVerUbicacion();
			SoundDown.presionarEnElBotonDeMapaPredeterminado();
	}
	
	
	
	@Test
	public void configurarBarrio() {
			SoundDown.seleccionarConfiguracion();
			SoundDown.seleccionarBarraDeBuscador();
			SoundDown.ingresarNombreDeBarrioABuscar("chambacu");
			SoundDown.seleccionarBarrio();
			SoundDown.seleccionarMenuDeZonas();
			SoundDown.seleccionarZonaComercial();
			SoundDown.guardarConfiguracion();
			SoundDown.confirmarLaConfiguracion();
			SoundDown.salirDeConfiguracionDespuesDeMensajeDeExito();
	}
	
	
	@Test
	
	public void configurarBarrioSinInternet() {
			SoundDown.mensajeDeProblemadeAccesoAInternet();
			SoundDown.aceptarMensajeDeProblemadeAccesoAInternet();
			SoundDown.seleccionarConfiguracion();
			SoundDown.mensajeDeErrorDeCargar();
			SoundDown.aceptarMensajeDeErrorDeCargar();
	}


	
	  

}
