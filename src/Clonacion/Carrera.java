public class Carrera implements Cloneable{

    public String anio;
    public String clase;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Carrera(String anio, String clase) {
        this.anio = anio;
        this.clase = clase;
    }

    //Getters
    public String getAnio() {
        return anio;
    }
    public String getClase() {
        return clase;
    }

    //Setters
    public void setAnio(String anio) {
        this.anio = anio;
    }
    public void setClase(String clase) {
        this.clase = clase;
    }

}
