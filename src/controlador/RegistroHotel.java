package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Hotel;
import sql.Conexion;

public class RegistroHotel {
    
    public boolean agregarHotel(Hotel hotel) {
        try { // Aquí está la preparación:
            Connection conexion = Conexion.getConexion();
            String query = "INSERT INTO Hotel(codigo,nombre,ciudad,estrellas,mascotas) VALUES(?,?,?,?,?)";
            PreparedStatement ins = conexion.prepareStatement(query);
            ins.setString(1, hotel.getCodigo());
            ins.setString(2, hotel.getNombre());
            ins.setString(3, hotel.getCiudad());
            ins.setInt(4, hotel.getEstrellas());
            ins.setBoolean(5, hotel.isMascotas());



            if(ins.executeUpdate()>0){ // Esto ejecuta la instrucción (preparación) de arriba, lo ejecuta en BD
                return true; // Si es mayor a 1, está bien ejecutado
            }
            conexion.close();            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error al agregar " + e.getMessage());
        }
        return false;
    }

    public Hotel buscarPorCodigo(String codigo) {
        Hotel hotel = null;
        try {
            Connection conexion = Conexion.getConexion();
            String query = "SELECT * FROM hotel WHERE CODIGO=?";
            PreparedStatement buscar = conexion.prepareStatement(query);
            buscar.setString(1, codigo);
            //OJO todo SELECT REQUIERE UN LLAMADO executeQuery
            ResultSet rs = buscar.executeQuery();
            while (rs.next()) {
                hotel = new Hotel();
                hotel.setCodigo(rs.getString("codigo"));
                hotel.setNombre(rs.getString("nombre"));
                hotel.setCiudad(rs.getString("ciudad"));
                hotel.setEstrellas(rs.getInt("estrellas"));
                hotel.setMascotas(rs.getBoolean("mascotas"));
            }
            conexion.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error al buscar por codigo " + e.getMessage());
        }
        return hotel;
    }

    public boolean eliminarHotel(String codigo) {
        try {
            Connection conexion = Conexion.getConexion();
            String query = "DELETE FROM hotel WHERE codigo = ?";
            PreparedStatement eli = conexion.prepareStatement(query);
            eli.setString(1, codigo);
            // el executeUpdate() retorna int, la cantidad de filas
            // afectadas tras la ejecución de la query
            if (eli.executeUpdate() > 0) {
                return true;
            }
            conexion.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error al eliminar " + e.getMessage());
        }
        return false;
    }
    
    public boolean modificarHotel(Hotel hotel) {
        try {
            Connection conexion = Conexion.getConexion();
//          String query="UPDATE clientes SET id= '"+ id +"' AND Nombre= '"+ Nombre +"' AND Appelido1 = '"+ Apellido1 +"' AND Apellido2 = '"+ Apellido2 +"'"

//          String query = "UPDATE hoteles SET nombre = "+nombrebd+"AND ciudad="+ciudadbd+"AND estrellas="+estrellasbd+"AND mascotas="+mascotasbd;

            String query = "UPDATE hotel SET nombre = ? , ciudad = ?, estrellas = ?, mascotas = ? WHERE codigo = ?";
            PreparedStatement mod = conexion.prepareStatement(query);
            mod.setString(1, hotel.getNombre());
            mod.setString(2, hotel.getCiudad());
            mod.setInt(3, hotel.getEstrellas());
            mod.setBoolean(4, hotel.isMascotas());
            mod.setString(5, hotel.getCodigo());
                       
            if (mod.executeUpdate() > 0) {
                return true;
            }
            conexion.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error al modificar " + e.getMessage());
        }
        return false;
    }

    public ArrayList<Hotel> mostrarTodos() {
        ArrayList<Hotel> hoteles = new ArrayList<>();
        Hotel hotel;
        try {
            Connection conexion = Conexion.getConexion();
            String query = "SELECT * FROM hotel";
            PreparedStatement seleccionar = conexion.prepareStatement(query);
            //buscar.setString(1, codigo);
            //OJO todo SELECT REQUIERE UN LLAMADO executeQuery
            ResultSet rs = seleccionar.executeQuery();
            while (rs.next()) {
                hotel = new Hotel();
                hotel.setCodigo(rs.getString("codigo"));
                hotel.setNombre(rs.getString("nombre"));
                hotel.setCiudad(rs.getString("ciudad"));
                hotel.setEstrellas(rs.getInt("estrellas"));
                hotel.setMascotas(rs.getBoolean("mascotas"));
                hoteles.add(hotel);
            }
            conexion.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error al buscar por codigo " + e.getMessage());
        }
        return hoteles;
    }
}
