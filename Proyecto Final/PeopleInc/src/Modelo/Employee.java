package Modelo;

public class Employee {
    
    private String nombre_completo; 
    private String departamento;
    private String fecha_contratacion;
    private double sueldo_mensual;
    private String posicion;

    public Employee() {
    }

    public Employee( String nombre_completo, String departamento, String fecha_contratacion, double sueldo_mensual, String posicion) {
        
        this.setNombre_completo(nombre_completo);
        this.setDepartamento(departamento);
        this.setFecha_contratacion(fecha_contratacion);
        this.setSueldo_mensual(sueldo_mensual);
        this.setPosicion(posicion);
    }

    public String getNombre_completo() {
        return nombre_completo;
    }

    public void setNombre_completo(String nombre_completo) {
        if (nombre_completo.length() <= 150) {
            this.nombre_completo = nombre_completo;
        } else {
            this.nombre_completo = null;
        }
        
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        if (departamento.length() <= 150) {
            this.departamento = departamento;
        } else {
            this.departamento = null;
        }

    }

    public String getFecha_contratacion() {
        return fecha_contratacion;
    }

    public void setFecha_contratacion(String fecha_contratacion) {
        if (fecha_contratacion.length() == 10) {
            this.fecha_contratacion = fecha_contratacion;
        } else {
            this.fecha_contratacion = null;
        }
        
    }

    public double getSueldo_mensual() {
        return sueldo_mensual;
    }

    public void setSueldo_mensual(double sueldo_mensual) {
        this.sueldo_mensual = sueldo_mensual;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        if (posicion.length() <= 100) {
            this.posicion = posicion;
        } else {
            this.posicion = null;
        }
        
    }

    @Override
    public String toString() {
        return "Employee{ nombre_completo=" + nombre_completo + ", departamento=" + departamento + ", fecha_contratacion=" + fecha_contratacion + ", sueldo_mensual=" + sueldo_mensual + ", posicion=" + posicion + '}';
    }
    
    
}
