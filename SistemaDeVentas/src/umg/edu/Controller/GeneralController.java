/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umg.edu.Controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Modality;
import javafx.stage.Stage;
import umg.edu.Modelo.Cliente;
import umg.edu.Modelo.Individual;

import java.net.URL;
import java.util.ResourceBundle;

/**
 *
 * @author Roberto&Jordy
 */
public class GeneralController implements Initializable{
    //loginXML
    @FXML public TextField txtUsuario;
    @FXML public PasswordField txtContrasena;
    @FXML public Button btnIngresar;
   //MenuPrincipalXML
    @FXML public MenuItem VerClientes;
    @FXML public MenuItem mItemAgregarCliente;
    @FXML public MenuItem mItemBorrarCliente;
    @FXML public MenuItem mItemVerProductos;
    @FXML public MenuItem mItemAgregarProducto;
    @FXML public MenuItem mItemBorrarProducto;
    @FXML public MenuItem mItemVerOrden;
    @FXML public MenuItem mItemGeneraOrden;
    @FXML public MenuItem mItemCancelarOrden;
    //ShowClienteXML
    @FXML public TableView<Individual> tblClientes;
    @FXML public TableColumn colId;
    @FXML public TableColumn colTipo;
    @FXML public TableColumn colNombre;
    @FXML ObservableList<Individual> clientesIndividuales;
    @FXML public int posicion;
    //RegistrarClienteXML
    @FXML public TextField txtTipo;
    @FXML public TextField txtId;
    @FXML public TextField txtNombre;
    @FXML public Button btnAgregar;

    //Manejador de login
    public void btnIngresar (ActionEvent btnIngresar){

        if(txtUsuario.getText().equals("admin")&&  txtContrasena.getText().equals("123456")){

            try{
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../vista/MenuPrincipal.fxml"));
                Parent  root = fxmlLoader.load();
                Scene scene = new Scene(root);
                Stage stage = new Stage();
                stage.initModality(Modality.APPLICATION_MODAL);
                stage.setScene(scene);
                stage.show();

                ( (Node) (btnIngresar.getSource() ) ).getScene().getWindow().hide();
            }
            catch (Exception e){
                System.out.println("Error " + e);
            }

        }else{
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setHeaderText("Usuario o contraseña incorrectos");
            alerta.setTitle("Alerta de intruso");
            alerta.setContentText("Intentelo de nuevo");
            alerta.show();
        }
    }

    //Manejador de ver clientes
    public void verClientes(ActionEvent mItemVerClientes) {

        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../vista/ShowClientes.fxml"));
            Parent root = fxmlLoader.load();
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            stage.show();

        }
        catch (Exception e){
            System.out.println("Error " + e);
        }
    }

    //Manejador para agregar clientes
    public void agregarCliente(ActionEvent actionEvent) {
         try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../vista/RegistrarCliente.fxml"));
            Parent  root = fxmlLoader.load();
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            stage.showAndWait();

        }
        catch (Exception e){
            System.out.println("Error " + e);
        }

    }

    //Manejador para borrar clientes
    public void borrarCliente(ActionEvent actionEvent) {

        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../vista/EliminarCliente.fxml"));
            Parent  root = fxmlLoader.load();

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            stage.showAndWait();
            stage.close();
        }
        catch (Exception e){
            System.out.println("Error " + e);
        }

    }

    //Manejador ver productos
    public void verProductos(ActionEvent actionEvent) {

        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../vista/ShowProductos.fxml"));
            Parent  root = fxmlLoader.load();

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            stage.showAndWait();
            stage.close();
        }
        catch (Exception e){
            System.out.println("Error " + e);
        }
    }
//manejador para agregar producto
    public void agregarProducto(ActionEvent actionEvent) {

        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../vista/RegistrarProducto.fxml"));
            Parent  root = fxmlLoader.load();

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            stage.showAndWait();
            stage.close();
        }
        catch (Exception e){
            System.out.println("Error " + e);
        }
    }
//manejador para borrar productos
    public void borrarProducto(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../vista/EliminarProducto.fxml"));
            Parent  root = fxmlLoader.load();

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            stage.showAndWait();
            stage.close();
        }
        catch (Exception e){
            System.out.println("Error " + e);
        }
    }

    //manejador de ver orden
    public void verOrden(ActionEvent actionEvent) {

        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../vista/ShowOrdenes.fxml"));
            Parent  root = fxmlLoader.load();

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            stage.showAndWait();
            stage.close();
        }
        catch (Exception e){
            System.out.println("Error " + e);
        }

    }

//Manejador de generar orden
    public void generarOrden(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../vista/CrearOrden.fxml"));
            Parent  root = fxmlLoader.load();

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            stage.showAndWait();
            stage.close();
        }
        catch (Exception e){
            System.out.println("Error " + e);
        }

    }
//manejador de cancelar orden
    public void cancelarOrden(ActionEvent actionEvent) {

        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../vista/EliminarOrden.fxml"));
            Parent root1 = fxmlLoader.load();
            Scene scene = new Scene(root1);
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            stage.showAndWait();
            stage.close();


        }catch (Exception e){
            System.out.println("Error: " +e);
        }


    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        /*
    */}


}