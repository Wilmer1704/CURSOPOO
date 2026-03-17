public class main {
   public static void main(String[] args) {
        Libro libro = new Libro ( " El Quijote ", " Miguel de Cervantes ", " 978-3-16-148410-0 ", 500, false);
        libro.mostrarInformacion();
        libro.estaDisponible();
        libro.prestar();
        libro.devolver();
        libro.estaDisponible();
        
   } 
}