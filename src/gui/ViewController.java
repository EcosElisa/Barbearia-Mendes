package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

public class ViewController implements Initializable {

	@FXML
	private Label label;

	@FXML
	private MenuItem menuItemClientes;

	@FXML
	private Button btn_CadastrarCliente;

	@FXML
	private void onCadastrarClienteAction(ActionEvent event) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("/gui/Clientes.fxml"));
			Stage stage = new Stage();
			stage.setTitle("Cadastro de Clientes");
			stage.setScene(new Scene(root));
			stage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub

	}

}
