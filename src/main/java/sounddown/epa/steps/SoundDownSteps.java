package sounddown.epa.steps;



import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import net.thucydides.core.annotations.Step;
import sounddown.epa.pages.SoundDownScreen;

public class SoundDownSteps {


	
	private  SoundDownScreen onSoundDownScreen;

	@Step
	  public void seleccionarNotificacion(){
		  onSoundDownScreen.seleccionarNotificacion();
	    }
	
	@Step
	  public void presionarEnElBotonDeVerUbicacion() {
		  onSoundDownScreen.presionarEnElBotonDeVerUbicacion();
	  }
	
	@Step
	  public void presionarEnElBotonDeMapaPredeterminado() {
		  onSoundDownScreen.presionarEnElBotonDeMapaPredeterminado();
	  }	
		
	@Step
	  public void seleccionarConfiguracion() {
		onSoundDownScreen.seleccionarConfiguracion();
		}
	
	@Step
	  public void seleccionarBarraDeBuscador() {
		onSoundDownScreen.seleccionarBarraDeBuscador();
		}
	
	@Step
		public void ingresarNombreDeBarrioABuscar(String nombre) {
		onSoundDownScreen.ingresarNombreDeBarrioABuscar(nombre);
		}
	
	@Step
		public void seleccionarBarrio() {
		onSoundDownScreen.seleccionarBarrio();
		}
	
	@Step
		public void seleccionarMenuDeZonas() {
		onSoundDownScreen.seleccionarMenuDeZonas();
		}
	
	@Step
		public void seleccionarZonaComercial() {
		onSoundDownScreen.seleccionarZonaComercial();
		}
	
	@Step
		public void guardarConfiguracion(){
		onSoundDownScreen.guardarConfiguracion();
		}
	
	@Step
		public void confirmarLaConfiguracion() {
		onSoundDownScreen.confirmarLaConfiguracion();
		}
	@Step
		public void salirDeConfiguracionDespuesDeMensajeDeExito() {
		onSoundDownScreen.salirDeConfiguracionDespuesDeMensajeDeExito();
		}
	
	@Step
	public void mensajeDeProblemadeAccesoAInternet() {
		onSoundDownScreen.mensajeDeProblemadeAccesoAInternet();
	}
	
	@Step
	public void aceptarMensajeDeProblemadeAccesoAInternet() {
		onSoundDownScreen.aceptarMensajeDeProblemadeAccesoAInternet();
	}
	
	@Step
	public void mensajeDeErrorDeCargar() {
		onSoundDownScreen.mensajeDeErrorDeCargar();
	}
	
	@Step
	public void aceptarMensajeDeErrorDeCargar() {
		onSoundDownScreen.aceptarMensajeDeErrorDeCargar();
	}
	  
	
}
