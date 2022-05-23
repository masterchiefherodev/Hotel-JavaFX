package fes.aragon.controlador;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class NuevoHotelController extends BaseController {

  @FXML
  private Button btnCrear;

  @FXML
  private Button btnDescartar;

  @FXML
  private Button btnGerente;

  @FXML
  private Button btnHabitacion;

  @FXML
  private TextField txtCorreo;

  @FXML
  private TextField txtDireccion;

  @FXML
  private TextField txtNombre;

  @FXML
  private TextField txtTelefono;

  @FXML
  void crearHotel(ActionEvent event) {
  }

  @FXML
  void descartar(ActionEvent event) {
    cambiarFXML(event, "Inicio");
  }

  @FXML
  void nuevaHabitacion(ActionEvent event) {

  }

  @FXML
  void nuevoGerente(ActionEvent event) {

  }

}
