package umg.edu;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Geordie&Roberto
 */
public class Login  extends Application{
    public static void main(String []args ){
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
       Parent root = FXMLLoader.load(getClass().getResource("vista/login.fxml"));
       Scene login = new Scene(root);
       stage.setTitle("Inicio de sesion");
       stage.setScene(login);
       stage.show();
       
    }

}
