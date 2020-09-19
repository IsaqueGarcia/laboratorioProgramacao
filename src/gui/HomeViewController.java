package gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import input.ColaboradorInput;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class HomeViewController implements Initializable{
		
	@FXML
	private Button btCadastrar;
	
	@FXML
	private Button btSair;
	
	@FXML 
	private Button btCadastrarPrestador;
	
	@FXML
	private Button btCadastrarMorador;
	
	@FXML
	private Label nomeColaborador;
	
	@FXML
	private Label atividade;
	
	@FXML
	private Label localTrabalho;
	
	ColaboradorInput colaborador;
	
	@FXML
	public void onBtCadastrarAction(ActionEvent event){
        try {
			Parent parent = FXMLLoader.load(getClass().getResource("Cadastro.fxml"));
			Scene scene = new Scene(parent);
			Stage stage = new Stage();
			stage.setScene(scene);
			stage.show();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
	}
	
	@FXML
	public void onBtCadastrarPrestador(ActionEvent event){
        try {
			Parent parent = FXMLLoader.load(getClass().getResource("CadastroPrestador.fxml"));
			Scene scene = new Scene(parent);
			Stage stage = new Stage();
			stage.setScene(scene);
			stage.show();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
	}
	
	@FXML
	public void onBtCadastrarMoradores(ActionEvent event){
        try {
			Parent parent = FXMLLoader.load(getClass().getResource("Moradores.fxml"));
			Scene scene = new Scene(parent);
			Stage stage = new Stage();
			stage.setScene(scene);
			stage.show();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
	}
	
	@FXML
	public void onBtSairAction(){
		Platform.exit();
	}
	
	public void carregarInformacoes(String nome,String atividade, String localTrabalho){
		try{
			this.nomeColaborador.setText(nome);
			this.atividade.setText(atividade);
			this.localTrabalho.setText(localTrabalho);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}

	@SuppressWarnings("static-access")
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		LoginViewController login = new LoginViewController();
		this.carregarInformacoes(login.retornaColaborador(), login.retornaAtividade(), login.retornaLocal());
	}

	
}
