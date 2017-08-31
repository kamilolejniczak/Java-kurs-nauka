package app.controller;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.input.MouseEvent;

public class InfoController {
    @FXML
    private RadioButton rb1;
    @FXML
    private ToggleGroup pyt2;
    @FXML
    private RadioButton rb2;
    @FXML
    private RadioButton rb3;
    @FXML
    private TextField tf_first;
    @FXML
    private TextField tf_last;
    @FXML
    private CheckBox cb1;
    @FXML
    private CheckBox cb2;
    @FXML
    private CheckBox cb3;
    @FXML
    private TextField tf_other;
    @FXML
    private ComboBox<String> combo;
    @FXML
    private Button btn_send;
    @FXML
    void sendAction(MouseEvent event) throws FileNotFoundException {
    	String rb_sel = "";
    	String cb_sel = "";
    	String combo_sel = "";
    	String info = "Dane ankietowanego: "+tf_first.getText()+", "+tf_last.getText()+"\n";
    	
    	if(rb1.isSelected()){
    		rb_sel = rb1.getText();
    	} else if (rb2.isSelected()){
    		rb_sel = rb2.getText();
    	} else if (rb3.isSelected()){
    		rb_sel = rb3.getText();
    	}
    	info += "Znajomo�� j�zyka angielskiego: "+rb_sel + "\n";
    	if(cb1.isSelected()){
    		cb_sel = cb1.getText() + "\n";
    	}
    	if(cb2.isSelected()){
    		cb_sel += cb2.getText() + "\n";
    	}
    	if(cb3.isSelected()){
    		cb_sel += tf_other.getText() +"\n";	
    	}
    	info += "Znajomo�� j�zyk�w programowania: "+cb_sel;	  	
    	combo_sel = "Wyb�r kursu: "+combo.getSelectionModel().getSelectedItem()+ "\n";
    	info += combo_sel;
    	
    	if(tf_first.getText().equals("") || tf_last.getText().equals("")){
    		Alert a = new Alert(AlertType.INFORMATION);
    		a.setContentText("Nie poda�e� imienia lub nazwiska");
    		a.setHeaderText("Warning!");
    		a.setTitle("B��d");
    		a.showAndWait();
    	} else {
        	PrintWriter pw = new PrintWriter("C:\\Users\\olejn\\Desktop\\"+tf_last.getText()+tf_first.getText()+".txt");
    		pw.println(info);
	    	pw.close();
	    	Alert a = new Alert(AlertType.INFORMATION);
			a.setContentText("Dane zosta�y przes�ane");
			a.setHeaderText("Dziekujemy za wype�nienie ankiety");
			a.setTitle("Dziekujemy!");
			a.showAndWait();
    	}
    }
    @FXML
    void other(MouseEvent event) {
    	tf_other.setDisable(false);
    }
    @FXML
    public void initialize(){
    	combo.getItems().add("Back-end Dev");
    	combo.getItems().add("Front-end Dev"); 
    	combo.getSelectionModel().select(0);
    }

}
