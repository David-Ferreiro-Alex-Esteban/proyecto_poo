package controlers;

import SQLConnection.SQL;
import classes.Comensal;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class ControladorComensal {

    private SQL sql;
    private Connection con;
    private Comensal comensal;

    public ControladorComensal() {
        sql = new SQL();
        comensal = new Comensal();
    }

    public void insertar(String nombre, String apellidos, int edad, boolean menuEspecial, String invitado){
        PreparedStatement ps;
        String query;
        //comensal.setId_comensal(id);
        comensal.setNombre(nombre);
        comensal.setApellidos(apellidos);
        comensal.setEdad(edad);
        comensal.setMenuEspecial(menuEspecial);
        comensal.setInvitado(invitado);
        try {
            con = sql.getConexion();
            query = "insert into comensal(nombre,apellidos,edad,menu_especial,invitado) values (?,?,?,?,?)";
            ps = con.prepareStatement(query);
            //ps.setInt(1,comensal.getId_comensal());
            ps.setString(2,comensal.getNombre());
            ps.setString(3,comensal.getApellidos());
            ps.setInt(4,comensal.getEdad());
            ps.setBoolean(5,comensal.isMenuEspecial());
            ps.setString(6,comensal.getInvitado());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se ha insertado correctamente");
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Error de conexión: " + e.getMessage());
        }


    }
}
