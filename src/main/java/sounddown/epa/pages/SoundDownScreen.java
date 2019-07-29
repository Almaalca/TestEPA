package sounddown.epa.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;

public class SoundDownScreen extends PageObject {

	final static String groupIdApp = "com.example.aldis.sounddownepa:id/";
	WebDriverWait wait;
	WebDriver driver;
	
	
	public SoundDownScreen(WebDriver driver) {
		 this.driver = driver;
		 wait = new WebDriverWait(driver, 30);

	}
	
	
	@AndroidFindBy(xpath="//*[@id='fondo_notificacion']")
	private WebElement notificacion;
	
	@AndroidFindBy(xpath="//*[@id='imageButton']")
	private WebElement buttonUbicacion;
	
	@AndroidFindBy(xpath="//*[@id='icon' and ./parent::*[(./preceding-sibling::* | ./following-sibling::*)[@text='Maps']]]")
	private WebElement buttonMapa;
	
	@AndroidFindBy(xpath="//*[@text='Configuración']")
	private WebElement menuConfiguraciones;
	
	@AndroidFindBy(xpath="//*[@id='search_button']")
	private WebElement buttonBuscador;
	
	@AndroidFindBy(xpath="//*[@id='search_src_text']")
	private WebElement editextBuscador;

	@AndroidFindBy(xpath="//*[@class='android.widget.RelativeLayout' and ./*[@id='imageView3']]")
	private WebElement barrio;
	
	
	@AndroidFindBy(xpath="//*[@id='spinner']")
	private WebElement spinner;
	
	
	@AndroidFindBy(xpath="//*[@text='Comercial']")
	private WebElement zonaComercial;
	
	
	@AndroidFindBy(xpath="//*[@text='GUARDAR']")
	private WebElement buttonGuardar;
	
	
	@AndroidFindBy(xpath="//*[@text='SÍ']")
	private WebElement buttonSi;
	
	@AndroidFindBy(xpath="//*[@text='ACEPTAR']")
	private WebElement buttonAceptar;
	
	public void seleccionarNotificacion(){
	  notificacion.click();
    }
	
	public void presionarEnElBotonDeVerUbicacion() {
		buttonUbicacion.click();
	}
	
	public void presionarEnElBotonDeMapaPredeterminado() {
		buttonMapa.click();
	}
	  
	public void seleccionarConfiguracion() {
		menuConfiguraciones.click();
	}
	
	public void seleccionarBarraDeBuscador() {
		buttonBuscador.click();
	}
	
	public void ingresarNombreDeBarrioABuscar(String nombre) {
		editextBuscador.sendKeys(nombre);
	}
  
	public void seleccionarBarrio() {
		barrio.click();
	}
	
	public void seleccionarMenuDeZonas() {
		spinner.click();
	}
	
	public void seleccionarZonaComercial() {
		zonaComercial.click();
	}
	
	public void guardarConfiguracion(){
		buttonGuardar.click();
	}
	
	public void confirmarLaConfiguracion() {
		buttonSi.click();
	}
	
	public void salirDeConfiguracionDespuesDeMensajeDeExito() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Exito']")));
		buttonSi.click();
	}
	
	public void mensajeDeProblemadeAccesoAInternet() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Acceso a Internet']")));
	}
	
	public void aceptarMensajeDeProblemadeAccesoAInternet() {
		buttonAceptar.click();
	}
	
	public void mensajeDeErrorDeCargar() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Error de Carga']")));
	}
	
	public void aceptarMensajeDeErrorDeCargar() {
		buttonAceptar.click();
	}
	
	
	
		
}
