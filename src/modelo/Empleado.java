
package modelo;

public class Empleado extends Persona{
    private String codigoEmpleado, puestoEmpleado;
    
    public Empleado() {
        
    }

    public Empleado(String codigoEmpleado, String puestoEmpleado, String nombres, String apellidos, String direccion, String telefono, String fechaNacimiento) {
        super(nombres, apellidos, direccion, telefono, fechaNacimiento);
        this.codigoEmpleado = codigoEmpleado;
        this.puestoEmpleado = puestoEmpleado;
    }

    public String getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(String codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    public String getPuestoEmpleado() {
        return puestoEmpleado;
    }

    public void setPuestoEmpleado(String puestoEmpleado) {
        this.puestoEmpleado = puestoEmpleado;
    }
    
    public void agregar() {
        System.out.println("Codigo Empleado: " + getCodigoEmpleado());
        System.out.println("Puesto Empleado: " + getPuestoEmpleado());
        System.out.println("Nombres: " + getNombres());
        System.out.println("Apellidos: " + getApellidos());
        System.out.println("Dirección: " + getDireccion());
        System.out.println("Teléfono: " + getTelefono());
        System.out.println("Fecha Nacimiento: " + getFechaNacimiento());
        System.out.println("______________________");
    }

}
