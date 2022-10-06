package views;

import controlers.ControladorComensal;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Comensal {
    private JTextField nombreField;
    private JTextField apellidosField;
    private JButton guardarButton;
    private JButton cancelarButton;
    private JPanel ComensalPanel;
    private JComboBox invitadoCombo;
    private JSpinner spnEdad;
    private JComboBox menuCombo;

    public Comensal() {
        guardarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Boolean guardar = true;
                String mensaje = "";
                String nombre = nombreField.getText();
                String apellidos = apellidosField.getText();
                int edad = Integer.parseInt(spnEdad.getValue().toString());
                String invitado = invitadoCombo.getSelectedItem().toString();
                String menuEspecial = menuCombo.getSelectedItem().toString();

                if(nombre.length() == 0){
                    guardar = false;
                    mensaje += "Escriba el nombre, por favor\n";
                }
                if(edad == 0){
                    guardar = false;
                    mensaje += "Escriba la edad, por favor\n";
                }
                if(guardar){
                    ControladorComensal control = new ControladorComensal();
                    if(invitado.equals("Novia")) invitado = "Novia";
                    if(invitado.equals("Novio")) invitado = "Novia";
                    if(menuEspecial.equals("Si")) menuEspecial = "True";
                    if(menuEspecial.equals("No")) menuEspecial = "Falsee";
                    control.insertar(nombre,apellidos,edad, Boolean.parseBoolean(menuEspecial),invitado);
                    nombreField.setText("");
                    apellidosField.setText("");
                    spnEdad.setValue(0);
                    invitadoCombo.setSelectedIndex(0);
                }
                else JOptionPane.showMessageDialog(null, mensaje);


            }
        });
    }
}
