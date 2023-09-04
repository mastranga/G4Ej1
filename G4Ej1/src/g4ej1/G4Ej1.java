
package g4ej1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.Month;
import javax.swing.JOptionPane;


public class G4Ej1 {

  
    public static void main(String[] args) {
        try {
            //Cargardon los drivers
            Class.forName("org.mariadb.jdbc.Driver");
            //Esablecemos la conexion
            Connection conexion = DriverManager.getConnection("jdbc:mariadb://localhost/universidadulp", "root", "");
            //Insertar alumno
//            String insert = "INSERT INTO alumno(dni, apellido, nombre, fechaNacimiento, estado) VALUES (11222333,'Zordetti','Carlos','"+LocalDate.of(2000,Month.AUGUST,29)+"',true);";
//            PreparedStatement ps = conexion.prepareStatement(insert);
//            int filas = ps.executeUpdate();
//            if(filas > 0){
//                JOptionPane.showMessageDialog(null, "Alumno agregado");
//            }
//            String insert2 = "INSERT INTO alumno(dni, apellido, nombre, fechaNacimiento, estado) VALUES (44555666,'Gomez','Maria','"+LocalDate.of(1987,Month.JUNE,5)+"',true);";
//            PreparedStatement ps2 = conexion.prepareStatement(insert2);
//            int filas2 = ps2.executeUpdate();
//            if(filas2 > 0){
//                JOptionPane.showMessageDialog(null, "Alumno agregado");
//            }
//            String insert = "INSERT INTO alumno(dni, apellido, nombre, fechaNacimiento, estado) VALUES (77888999,'Marinelli','Sofia','"+LocalDate.of(2015,Month.MARCH,10)+"',true);";
//            PreparedStatement ps = conexion.prepareStatement(insert);
//            int filas = ps.executeUpdate();
//            if(filas > 0){
//                JOptionPane.showMessageDialog(null, "Alumno agregado");
//            }
//              String insert = "INSERT INTO `materia`(`nombre`, `año`, `estado`) VALUES ('Analisis matematico',1,true)";
//              PreparedStatement ps = conexion.prepareStatement(insert);
//              int filas = ps.executeUpdate();
//              if(filas > 0){
//                JOptionPane.showMessageDialog(null, "Materia agregada");
//              }
//              String consul = "SELECT alumno.idAlumno, dni, apellido, alumno.nombre, fechaNacimiento FROM alumno, inscripcion WHERE alumno.idAlumno = inscripcion.idAlumno and inscripcion.nota > 8";
//              PreparedStatement ps = conexion.prepareStatement(consul);
//              ResultSet resultado = ps.executeQuery();
//              while (resultado.next()){
//                  System.out.println("Id alumno: "+resultado.getInt("idAlumno"));
//                System.out.println("DNI: "+resultado.getInt("dni"));
//                System.out.println("Apellido: "+resultado.getString("apellido"));
//                System.out.println("Nombre: "+resultado.getString("nombre"));
//                System.out.println("fecha de nacimiento: "+resultado.getDate("fechaNacimiento"));
//                System.out.println("-----------------------------------------------------------");
//                System.out.println("-----------------------------------------------------------");
//              }
              String insert = "DELETE FROM inscripcion WHERE idAlumno = 4 and idMateria =2";
              PreparedStatement ps = conexion.prepareStatement(insert);
              int filas = ps.executeUpdate();
              if(filas > 0){
                JOptionPane.showMessageDialog(null, "inscripcion borrada");
              }
            
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Debe agregar los drivers del pro ");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion");
        }
        
    }
    
}
