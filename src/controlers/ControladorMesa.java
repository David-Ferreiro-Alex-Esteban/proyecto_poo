package controlers;

import SQLConnection.SQL;
import classes.Comensal;
import classes.Mesa;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class ControladorMesa {

    private SQL sql;
    private Connection con;
    private Mesa mesa;

    public ControladorMesa() {
        sql = new SQL();
        mesa = new Mesa();
    }

    public void insertar(String codigoMesa, String nombre, Integer tamano){
        PreparedStatement ps;
        String query;
        mesa.setCodigoMesa(codigoMesa);
        mesa.setNombre(nombre);
        mesa.setTamano(tamano);
        try {
            con = sql.getConexion();
            query = "insert into comensal(id_comensal,nombre,apellidos,edad,menu_especial,invitado) values (?,?,?,?,?,?)";
            ps = con.prepareStatement(query);
            ps.setString(1,mesa.getCodigoMesa());
            ps.setString(2,mesa.getNombre());
            ps.setInt(3,mesa.getTamano());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se ha insertado correctamente");
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Error de conexión: " + e.getMessage());
        }
    }
}
