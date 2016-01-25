package jasmin;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

public class RootLayoutController {

	private BorderPane rootLayout;
	
	
	public void Start() throws IOException{
		//Die Methode showRoot wird hier aufgerufen.
		showRoot();
	}
	
	public void showRoot() throws IOException{
		
		//Hier wird die .fxml Datei aufgerufen
		FXMLLoader loader = new FXMLLoader(getClass().getResource("RootLayout.fxml"));
		
		//Das zuvor bereits erstellte BorderPane namens rootLayout wird der vorhin aufgerufenen fxml Datei zugewiesen 
		rootLayout = (BorderPane)loader.load();
		
		//durch Stage erstellt man eine Platform
		Stage stage = new Stage();
		
		//Scene erstellt den Inhalt einer Platform (hier das rootLayout mit der grösse 240x310)
		Scene scene = new Scene(rootLayout, 240, 260);
		
		//durch getStylesheets() wird dem Inhalt ein Design zugefügt
		scene.getStylesheets().add("/jasmin/DarkTheme.css");
		
		//Der Platform wird nun der Inhalt begefügt
		stage.setScene(scene);
		
		//Die Platform wird angezeigt
		stage.show();
		
		//durch setTitle() wird der Platform einen Titel gegeben
		stage.setTitle("Menu");
	
		FXMLLoader load = new FXMLLoader(getClass().getResource("Main.fxml"));
		AnchorPane Main = (AnchorPane) load.load();
		
		//Die neue fxml Datei die dem Main zugewiesen wurde wird nun in das Zentrum des BorderPanes namens rootLayout gesetzt
		rootLayout.setCenter(Main);
	}
	
	public void videoPlayerClicked(ActionEvent event) throws Exception{
		
		//Die Datei Birds.mp4 wird der Media "media" zugewiesen
		Media media = new Media(getClass().getResource("Birds.mp4").toExternalForm());
		
		//Der MediaPlayer beinhaltet die Media Datei
		MediaPlayer player = new MediaPlayer(media);
		
		//Der MediaPlayer wird durch den Mediaview angezeigt
		MediaView view = new MediaView(player);
		
		BorderPane root = new BorderPane();
		root.setCenter(view);
		
		//Der MediaPlayer wird gestartet
		player.play();
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("RootLayout.fxml"));
		rootLayout = (BorderPane)loader.load();
		
		Stage stage = new Stage();
		
		Scene scene = new Scene(rootLayout);
		scene.getStylesheets().add("/jasmin/DarkTheme.css");
		stage.setScene(scene);
		stage.show();
		stage.setTitle("Birds");
		rootLayout.setCenter(root);	
		
		//wenn das Fenster geschlossen wird, soll der MediaPlayer stoppen
		stage.setOnCloseRequest(e -> player.stop());
	}
		
	public void rechnerClicked(ActionEvent event) throws Exception{
		FXMLLoader loader = new FXMLLoader(getClass().getResource("RootLayout.fxml"));
		rootLayout = (BorderPane)loader.load();
		Stage stage = new Stage();
		
		Scene scene = new Scene(rootLayout, 280, 390);
		scene.getStylesheets().add("/jasmin/DarkTheme.css");
		stage.setScene(scene);
		stage.show();
		stage.setTitle("Rechner");
	
		FXMLLoader load = new FXMLLoader(getClass().getResource("Rechner.fxml"));
		AnchorPane rechner = (AnchorPane) load.load();
		rootLayout.setCenter(rechner);
		
		
	}
	
	public void musikPlayerClicked(ActionEvent event) throws IOException { 
		
		Media media = new Media(getClass().getResource("Karibik.mp3").toExternalForm());
		MediaPlayer mediaPlayer = new MediaPlayer(media);
		MediaView mediaView = new MediaView(mediaPlayer);
		
		BorderPane root = new BorderPane();
		root.setCenter(mediaView);
		mediaPlayer.play();
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("RootLayout.fxml"));
		rootLayout = (BorderPane)loader.load();
		
		Stage stage = new Stage();
		
		Scene scene = new Scene(rootLayout, 590, 275);
		scene.getStylesheets().add("/jasmin/DarkTheme.css");
		stage.setScene(scene);
		stage.show();
		stage.setTitle("Karibik");
		rootLayout.setTop(root);
		
		final ImageView imv = new ImageView();
		final Image im = new Image(getClass().getResourceAsStream("karibik.png"));
		imv.setImage(im);
		
		rootLayout.setCenter(imv);
		
		stage.setOnCloseRequest(e -> mediaPlayer.stop());
	}
	
	
	
}
