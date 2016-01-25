package jasmin;
	
import javafx.application.Application;
import javafx.stage.Stage;


public class Main extends Application { //JavaFX Programm wird gestartet
	
	@Override
	public void start(Stage stage) {
		try {
			
			//So wird ein Zugriff auf den RootLayoutController gesetzt
			RootLayoutController root = new RootLayoutController();
			//Aus dem RootLayoutController wird die Methode Start() aufgerufen
			root.Start();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		//startet die Applikation
		launch(args);
	}
}
