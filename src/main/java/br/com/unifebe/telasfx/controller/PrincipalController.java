package br.com.unifebe.telasfx.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class PrincipalController {
    private Scene scene;
    private Stage stage;
    private Parent root;
    @FXML
    private TextField user;
    @FXML
    private TextField pwd;


    private boolean validaLogin(String login, String senha){
        if(login.equals("admin")){
            if(senha.equals("admin")){
                return true;
            }
        }
        return false;
    }
    @FXML
    protected void proximaTela(ActionEvent event) throws IOException {

        String login = user.getText();
        String senha = pwd.getText();
        if(validaLogin(login,senha)) {
            URL url = new File("src/main/java/br/com/unifebe/telasfx/view/telabd-view.fxml").toURI().toURL();
            this.root = FXMLLoader.load(url);
            scene = new Scene(root);
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setTitle("Tela de Clientes");
            stage.setScene(scene);
            stage.show();
        }else{
            // criar alerta
            Alert a = new Alert(Alert.AlertType.NONE);
            a.setAlertType(Alert.AlertType.ERROR);
            a.setContentText("LOGIN INVÁLIDO!");
            a.show();
        }
    }
}