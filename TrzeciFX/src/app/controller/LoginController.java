package app.controller;


import java.io.IOException;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import app.database.DBConnector;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class LoginController {
	private static final AlertType Warning = null;
    @FXML
    private TextField login;
    @FXML
    private PasswordField password;
    @FXML
    private TextField passview;
    @FXML
    private Button loguj;
    @FXML
    private Button logujBD;
    public DBConnector db;
    String logowanie;
    @FXML
    private Button loginClose;
    @FXML
    private Button viewP;
    @FXML
    void close(ActionEvent event) {
    	System.exit(0);
    }
    @FXML
    void action(MouseEvent event) throws IOException {
    	if((login.getText().equals("admin") && (passview.getText().equals("admin")) || 
    			(login.getText().equals("admin") &&  password.getText().equals("admin")))){
    		
    		Stage stageInfo = new Stage();
    		Parent parent = (Parent) FXMLLoader.load(getClass().getResource("/app/view/InfoView.fxml"));
    		Scene sceneInfo = new Scene(parent);
    		stageInfo.setScene(sceneInfo);
    		stageInfo.setTitle("Info");
    		stageInfo.show();
    	
    	} else {
    		Alert a = new Alert(AlertType.INFORMATION);
    		a.setContentText("Poda³eœ b³êdny login lub has³o");
    		a.setHeaderText("Warning!");
    		a.setTitle("B³¹d");
    		a.showAndWait();
    	}
    	
    }
    @FXML
    void showAction(MouseEvent event) {
    	password.setVisible(false);
    	passview.setVisible(true);
    	String pass = password.getText();
    	passview.setText(pass);
    	password.setText("");
    }

    @FXML
    void hideAction(MouseEvent event) {
    	password.setVisible(true);
    	passview.setVisible(false);
    	String pass = passview.getText();
    	password.setText(pass);
    	passview.setText("");
    }
    @FXML
    void loginDbAction(MouseEvent event) throws ClassNotFoundException, SQLException, IOException {
    	Connection conn1 = db.Connection();
    	Statement stat = conn1.createStatement();
    	ResultSet rs = stat.executeQuery("Select * from users where login = '"+login.getText()+"' and pass = '"+password.getText()+"';");
    	
    	if(rs.next()){
    		Stage stageTable = new Stage();
    		Parent parent = (Parent) FXMLLoader.load(getClass().getResource("/app/view/DbView.fxml"));
    		Scene sceneInfo = new Scene(parent);
    		stageTable.setScene(sceneInfo);
    		stageTable.setTitle("Info");
    		stageTable.show();
    	}else{
    		Alert a = new Alert(AlertType.INFORMATION);
    		a.setContentText("Poda³eœ b³êdny login lub has³o");
    		a.setHeaderText("Warning!");
    		a.setTitle("B³¹d");
    		a.showAndWait();
    	}
    }
    public void initialize(){
    	db = new DBConnector();
    }
}
