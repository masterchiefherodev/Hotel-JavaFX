package fes.aragon.local;

import fes.aragon.modelo.Hotel;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class ObjetoControlador {
  private static ObjetoControlador instancia = new ObjetoControlador();
  private ObservableList<Hotel> arrayHotel = FXCollections.observableArrayList();
  ObservableList<String> tipos = FXCollections.observableArrayList();
  private int indiceHotel = -1;
  private int indiceHabitacion = -1;

  private ObjetoControlador() {

  }

  public ObservableList<String> getTipos() {
    return tipos;
  }

  public void setTipos(ObservableList<String> tipos) {
    this.tipos = tipos;
  }

  public static ObjetoControlador getInstancia() {
    return instancia;
  }

  public int getIndiceHotel() {
    return indiceHotel;
  }

  public void setIndiceHotel(int indiceHotel) {
    this.indiceHotel = indiceHotel;
  }

  public int getIndiceHabitacion() {
    return indiceHabitacion;
  }

  public void setIndiceHabitacion(int indiceHabitacion) {
    this.indiceHabitacion = indiceHabitacion;
  }

  public ObservableList<Hotel> getArrayHotel() {
    return arrayHotel;
  }

  public void setArrayHotel(ObservableList<Hotel> arrayHotel) {
    this.arrayHotel = arrayHotel;
  }

}