package app;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
	public void start(Stage stage) throws Exception {
		Parent parent = (Parent) FXMLLoader.load(getClass().getResource("/app/view/jFX2.fxml"));
		Scene scene = new Scene(parent);
		stage.setScene(scene);
		stage.setTitle("Untitled");
		stage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
