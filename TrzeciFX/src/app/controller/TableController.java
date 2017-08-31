package app.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import app.database.DBConnector;
import app.model.TableModel;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

public class TableController {

    @FXML
    private Button select;

    @FXML
    private Button delete;

    @FXML
    private Button update;

    @FXML
    private Button insert;

    @FXML
    private TableView<TableModel> TabelTwo;
    
    @FXML
    private TableColumn<TableModel, Integer> col_id;

    @FXML
    private TableColumn<TableModel, String> col_name;

    @FXML
    private TableColumn<TableModel, String> col_last;

    @FXML
    private TableColumn<TableModel, Double> col_salary;

    @FXML
    private TextField tf_name;

    @FXML
    private TextField tf_last;

    @FXML
    private TextField tf_salary;

    @FXML
    private Button btn_update;

    @FXML
    private Button btn_insert;

    @FXML
    private Label lbl_insert;
    
    public DBConnector db;
    public ObservableList<TableModel> data = FXCollections.observableArrayList();

    @FXML
    void actionDelete(MouseEvent event) {

    }

    @FXML
    void actionInsert(MouseEvent event) {

    }

    @FXML
    void actionSelect(MouseEvent event) {

    }

    @FXML
    void actionUpdate(MouseEvent event) {

    }

    @FXML
    void btnDeleteAction(ActionEvent event) throws ClassNotFoundException, SQLException {
    	
    	Connection conn = db.Connection();
    	try{
	    	int id_del = TabelTwo.getSelectionModel().getSelectedItem().getId();
	    	String sql = "delete from employee where id="+id_del+";";
	    	PreparedStatement ps = conn.prepareStatement(sql);
	    	ps.executeUpdate();
	    	btnSelectAction(event);
    	}catch(NullPointerException e){
    		Alert a = new Alert(AlertType.INFORMATION);
    		a.setContentText("Musisz zaznaczyæ rekord, który chcesz usun¹æ!");
    		a.setHeaderText("Error!");
    		a.setTitle("Error");
    		a.showAndWait();
    	}
    }

    @FXML
    void btnInsertAction(ActionEvent event){
    	
    	tf_name.setDisable(false);
    	tf_last.setDisable(false);
    	tf_salary.setDisable(false);
    	btn_update.setDisable(true);
    	btn_insert.setDisable(false);
    }
    @FXML
    void btnInsertCommitAction(ActionEvent event) throws SQLException, ClassNotFoundException {
    	Connection conn = db.Connection();
    	if(tf_name.getText().equals(null) || tf_last.getText().equals(null) || tf_salary.getText().equals(null)){
    		Alert a = new Alert(AlertType.INFORMATION);
    		a.setContentText("Musisz zaznaczyæ rekord, który chcesz usun¹æ!");
    		a.setHeaderText("Error!");
    		a.setTitle("Error");
    		a.showAndWait();
    	}else{
    		String sql = "insert into employee (name,last,salary) values ('"+tf_name.getText()+"','"+tf_last.getText()+"', "+tf_salary.getText()+")";
	    	PreparedStatement ps = conn.prepareStatement(sql);
	    	ps.executeUpdate();
	    	btnSelectAction(event);
	    	btn_insert.setDisable(true);
	    	tf_name.setDisable(true);
	    	tf_last.setDisable(true);
	    	tf_salary.setDisable(true);
    	}
    }
    @FXML
    void btnSelectAction(ActionEvent event) throws ClassNotFoundException, SQLException {
    	Connection conn = db.Connection();
    	data = FXCollections.observableArrayList();
    	ResultSet rs = conn.createStatement().executeQuery("select * from employee");
    	
    	while(rs.next()){
    		data.add(new TableModel(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDouble(4)));
    	}
    	col_id.setCellValueFactory(new PropertyValueFactory<TableModel, Integer>("id"));
    	col_name.setCellValueFactory(new PropertyValueFactory<TableModel, String>("name"));
    	col_last.setCellValueFactory(new PropertyValueFactory<TableModel, String>("last"));
    	col_salary.setCellValueFactory(new PropertyValueFactory<TableModel, Double>("salary"));
    	
    	TabelTwo.setItems(null);
    	TabelTwo.setItems(data);
    }

    @FXML
    void btnUpdateAction(ActionEvent event) {
    	
    	try{
    	tf_name.setText(TabelTwo.getSelectionModel().getSelectedItem().getName());
    	tf_last.setText(TabelTwo.getSelectionModel().getSelectedItem().getLast());
    	tf_salary.setText(String.valueOf(TabelTwo.getSelectionModel().getSelectedItem().getSalary()));
    	tf_name.setDisable(false);
    	tf_last.setDisable(false);
    	tf_salary.setDisable(false);
    	btn_insert.setDisable(true);
    	btn_update.setDisable(false);
    	}catch(NullPointerException e){
    		Alert a = new Alert(AlertType.INFORMATION);
    		a.setContentText("Musisz zaznaczyæ rekord, który chcesz zmodyfikowaæ!");
    		a.setHeaderText("Error!");
    		a.setTitle("Error");
    		a.showAndWait();
    	}
   	}

    @FXML
    void btnUpdateCommitAction(ActionEvent event) throws SQLException, ClassNotFoundException {
    	Connection conn = db.Connection();
    	int id_update = TabelTwo.getSelectionModel().getSelectedItem().getId();
    	String sql = "update employee set name = '"+tf_name.getText()+"', last = '"+tf_last.getText()+"', salary ="+tf_salary.getText()+" where id = "+id_update+";";
    	PreparedStatement ps = conn.prepareStatement(sql);
    	
    	ps.executeUpdate();
    	btnSelectAction(event);
    }
    public void initialize(){
	db = new DBConnector();
}
}

