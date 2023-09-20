package com.mx.antonioguerrero.aluraverso.view;

import com.mx.antonioguerrero.aluraverso.controller.usersController;
import com.mx.antonioguerrero.aluraverso.model.Users;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

public class AppController {
private usersController userscontroller;

    @FXML
    private VBox form;
    @FXML
    private Button enterButton;
    @FXML
    private Button loginButton;
    @FXML
    private ImageView logo;
    @FXML
    private ImageView user_icon;

    @FXML
    private TextField userName;
    @FXML
    private PasswordField userPassword;

    public AppController(){
        this.userscontroller = new usersController();
    }
    @FXML
    public void initialize(){
        form.managedProperty().bind(form.visibleProperty());
        form.setVisible(false);
        enterButton.managedProperty().bind(form.visibleProperty());
        enterButton.setVisible(false);
    }
    @FXML
    protected void DeployMenu() {
        form.setVisible(true);
        enterButton.setVisible(true);
        Insets newInsets = new Insets(0, 0, 0, 0);
        VBox.setMargin(logo, newInsets);
        user_icon.setFitWidth(150);
        loginButton.setVisible(false);
    }
    @FXML
    private void login(){
        if (userName.getText().isBlank() || userPassword.getText().isBlank()){

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Campos Vacíos");
            alert.setHeaderText(null);
            alert.setContentText("Por favor, ingresa el nombre de usuario y la contraseña.");

            DialogPane dialogPane = alert.getDialogPane();
            dialogPane.getStylesheets().add(
                    getClass().getResource("/css/styles.css").toExternalForm());
            dialogPane.getStyleClass().add("dialog-pane");

            alert.showAndWait();
        }else{
        var loggeduser = new Users(userName.getText(), userPassword.getText());
        var validate = this.userscontroller.compareInfo(loggeduser);
        if (validate){
            System.out.println("hola buenos días hijo de tu puta madre");
        }else{
            System.out.println("noooo pinche idiota mierda, no se te permite entrar");
        }

        }

    }
}