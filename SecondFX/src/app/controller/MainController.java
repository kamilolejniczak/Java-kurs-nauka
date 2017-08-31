package app.controller;

import java.awt.Frame;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JOptionPane;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class MainController {
    @FXML
    private MenuItem miSave;
    @FXML
    private MenuItem miClose;
    @FXML
    private TextField tf;
    @FXML
    private Button btnW;
    @FXML
    private TextArea ta;
    @FXML
    private Button btnLC;
    @FXML
    private Button btnUC;
    @FXML
    void clear(MouseEvent event) {
    	ta.setText("");
    }
    @FXML
    void close(ActionEvent event) {
    	System.exit(0);
    }
    @FXML
    void lowerCase(MouseEvent event) {
    	String text = ta.getText();
    	text = text.toLowerCase();
    	ta.setText(text);
    }
    @FXML
    void save(ActionEvent event) throws FileNotFoundException {
    	Frame f = new Frame();
    	JOptionPane op = new JOptionPane();
    	if(tf.getText().equals("")){
    		op.showMessageDialog(f, "Musisz podaæ nazwê pliku!");
    	}else{
	    	File plik = new File("C:\\Users\\olejn\\Desktop\\"+tf.getText()+".txt");
	    	PrintWriter pw = new PrintWriter(plik);
	    	Scanner sc = new Scanner(ta.getText());
	    	while(sc.hasNextLine()){
	    		String line = sc.nextLine();
	    		pw.println(line);
	    }
	    op.showMessageDialog(f, "Zapisano!");
	    ta.setText("");
	    tf.setText("");
    	pw.close();
    	sc.close();
    	}
    }
    @FXML
    void upperCase(MouseEvent event) {
    	String text = ta.getText();
    	text = text.toUpperCase();
    	ta.setText(text);
    }
}
