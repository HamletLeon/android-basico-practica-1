public class Main {
    public static void main(String ...args) {
        Estudiante[] estudiantes = {
            new Estudiante("Juan", 24),
            new Estudiante("Erica", 20),
            new Estudiante("Emilio", 23),
            new Estudiante("Karina", 21),
            new Estudiante("Eduardo", 24),
            new Estudiante("Tomas", 25),
        };
        int totalEstudiantes = estudiantes.length;
        System.out.println("Total de estudiante: " + totalEstudiantes);
        int minEdad = 0;
        int maxEdad = 0;
        int avgEdad = 0;
        String allEstudiantes = "";
        for (Estudiante estudiante : estudiantes) {
            int edad = estudiante.getEdad();
            if (minEdad == 0) minEdad = edad;
            if (maxEdad == 0) maxEdad = edad;
            if (minEdad > edad) minEdad = edad;
            if (maxEdad < edad) maxEdad = edad;
            avgEdad += edad;
            allEstudiantes += "\n   " + estudiante.getNombre();
        }
        if (totalEstudiantes > 0) avgEdad = avgEdad / totalEstudiantes;
        System.out.println("Edad minima: " + minEdad);
        System.out.println("Edad maxima: " + maxEdad);
        System.out.println("Edad promedio: " + avgEdad);
        System.out.println("Listado de estudiantes: " + allEstudiantes);
    }
}