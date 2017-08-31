package app;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	
	public Main(){
		System.out.println("Wywo�uj� konstruktor");
	}
	@Override
	public void init() throws Exception{
		System.out.println("Wywo�uj� metod� init");
	}
	@Override
	public void stop() throws Exception{
		System.out.println("Wywo�uj� metod� stop");
	}
	@Override
	public void start(Stage stage) throws Exception {
		Parent parent = (Parent) FXMLLoader.load(getClass().getResource("/app/view/MainView.fxml"));
		Scene scene = new Scene(parent);
		stage.setScene(scene);
		stage.setTitle("First JavaFX app");
		stage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
