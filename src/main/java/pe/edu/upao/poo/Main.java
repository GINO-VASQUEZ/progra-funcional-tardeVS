package pe.edu.upao.poo;

import pe.edu.upao.poo.Boton;
import pe.edu.upao.poo.Combobox;
import pe.edu.upao.poo.Componete;
import pe.edu.upao.poo.Input;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Componete> interfaz = new ArrayList<>();

        interfaz.add(new Input());
        interfaz.add(new Input());
        interfaz.add(new Combobox());
        interfaz.add(new Boton());

        for(Componete componete: interfaz){
            componete.pintar();
        }
    }


}