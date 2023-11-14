package Controlador;

import db.Conexion;
import Modelo.Employee;
import java.sql.*;

public class Registro {
    
    public static boolean agregarEmployee(Employee dto){
        try{
            Connection connection = Conexion.open();
            String query = "INSERT INTO employee( nombre_completo, departamento, fecha_contratacion, sueldo_mensual, posicion) VALUES (?,?,?,?,?)";
            PreparedStatement insertar = connection.prepareStatement(query);
            
            insertar.setString(1, dto.getNombre_completo());
            insertar.setString(2, dto.getDepartamento());
            insertar.setString(3, dto.getFecha_contratacion());
            insertar.setDouble(4, dto.getSueldo_mensual());
            insertar.setString(5, dto.getPosicion());
            insertar.execute();
            insertar.close();
            connection.close();
            return true;
            
        }catch(SQLException s){
            System.out.println("Error SQL al agregar usuario "+s.getMessage());
            return false;
            
        }catch(Exception e){
            System.out.println("Error al agregar usuario "+e.getMessage());
            return false;
        }
    }
    
}
