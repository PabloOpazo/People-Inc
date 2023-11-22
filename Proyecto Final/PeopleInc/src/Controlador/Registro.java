package Controlador;

import db.Conexion;
import Modelo.Employee;
import java.sql.*;
import java.util.ArrayList;

public class Registro {

    public static boolean agregarEmployee(Employee dto) {
        try {
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

            System.out.println("Empleado agregado exitosamente.");
            return true;

        } catch (SQLException s) {
            System.out.println("Error SQL al agregar usuario " + s.getMessage());
            return false;

        } catch (Exception e) {
            System.out.println("Error al agregar usuario " + e.getMessage());
            return false;
        }
    }

    public static ArrayList<Employee> mostrarTodos() {
        ArrayList<Employee> listaEmpleados = new ArrayList<Employee>();
        try{
            Connection conexion = Conexion.open();
            String query = "SELECT * FROM employee";
            PreparedStatement listarTodos = conexion.prepareStatement(query);
            ResultSet rs = listarTodos.executeQuery();
            while(rs.next()){
                Employee dto = new Employee();
                dto.setId(rs.getInt("id"));
                dto.setNombre_completo(rs.getString("nombre_completo"));
                dto.setDepartamento(rs.getString("departamento"));
                dto.setFecha_contratacion(rs.getString("fecha_contratacion"));
                dto.setSueldo_mensual(rs.getInt("sueldo_mensual"));
                dto.setPosicion(rs.getString("posicion"));
                listaEmpleados.add(dto);
            }
        }catch(SQLException s){
            System.out.println("Error SQL al listar usuario: "+s.getMessage());
        }catch(Exception e){
            System.out.println("Error al listar usuario: "+e.getMessage());
        }
        return listaEmpleados;
    }
    
    public static void eliminarEmployee(int idEliminar){
        try{
            Connection conexion = Conexion.open();
            String query = "DELETE FROM employee WHERE id=?";
            PreparedStatement eliminar = conexion.prepareStatement(query);
            eliminar.setInt(1, idEliminar);
            eliminar.execute();
            eliminar.close();
            conexion.close();
        }catch(SQLException s){
            System.out.println("Error SQL al eliminar usuario: " +s.getMessage());
        }catch(Exception e){
            System.out.println("Error al eliminar usuario: " +e.getMessage());
        }
    }
    
    public static Employee buscarPorUsuario(int rutBuscado){
        ArrayList<Employee> listaUsuarios = new ArrayList<Employee>();
        Employee usuarioBuscado = null;
        try{
            Connection conexion = Conexion.open();
            String query = "SELECT id, nombre,apellido,numdepto,montoGastos,tipo FROM usuarios WHERE id=?";
            PreparedStatement buscarPorUsuario = conexion.prepareStatement(query);
            buscarPorUsuario.setInt(1, rutBuscado);
            ResultSet rs = buscarPorUsuario.executeQuery();
            while(rs.next()){
                Employee usuEncontrado = new Employee();
                usuEncontrado.setId(rs.getInt("id"));
                usuEncontrado.setNombre_completo(rs.getString("nombre_completo"));
                usuEncontrado.setDepartamento(rs.getString("departamento"));
                usuEncontrado.setFecha_contratacion(rs.getString("fecha_contratacion"));
                usuEncontrado.setSueldo_mensual(rs.getInt("sueldo_mensual"));
                usuEncontrado.setPosicion(rs.getString("posicion"));
                usuarioBuscado = usuEncontrado;
                return usuarioBuscado;
            }
        }catch(SQLException s){
            System.out.println("Error SQL al listar usuario"+s.getMessage());
        }catch(Exception e){
            System.out.println("Error al listar usuario"+e.getMessage());
        }
        return null;
    }
    

}
