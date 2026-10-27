public class Estudiante implements Cloneable {

    public String nombre;
    public String apellido;
    public Carrera carrera;

    @Override
    public Object clone() throws CloneNotSupportedException {
         Estudiante temp = (Estudiante) super.clone();
         temp.carrera = (Carrera) carrera.clone();

         return temp;
    }

    public Estudiante(String nombre, String apellido,  Carrera carrera) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.carrera = carrera;
    }

    //Getters
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public Carrera getCarrera() {
        return carrera;
    }

    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }
}
