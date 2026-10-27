public class Main {

    public static void main(String[] args) {

        try {
            Estudiante pedro = new  Estudiante("Pedro", "Lopez", new Carrera("2026", "Programacion 2"));

            System.out.println("Objeto original:");
            System.out.println("Nombre: " + pedro.nombre);
            System.out.println("Apellido: " + pedro.apellido);
            System.out.println("Año cursado: " + pedro.carrera.anio);
            System.out.println("Clase cursada: " + pedro.carrera.clase);
            System.out.println(" ");

            //Clonacion
            Estudiante clon =  (Estudiante) pedro.clone();

            System.out.println("Objeto clon:");
            System.out.println("Nombre: " + clon.nombre);
            System.out.println("Apellido: " + clon.apellido);
            System.out.println("Año cursado: " + clon.carrera.anio);
            System.out.println("Clase cursada: " + clon.carrera.clase);

        } catch (CloneNotSupportedException e) {
            System.out.println("Clone not supported");
        }

    }

}
