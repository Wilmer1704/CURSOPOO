public class Libro {

    private String Titulo;
    private String Autor;
    private String ISBN;
    private int Npaginas;
    private boolean Disponible;

    public Libro (String Titulo, String Autor, String ISBN, int Npaginas, boolean Disponible){
        
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.ISBN = ISBN;
        this.Npaginas = Npaginas;
        this.Disponible = Disponible;
    
    }
        public void prestar(){
            if (Disponible){
                Disponible = true;
                System.out.println(" EL LIBRO " + Titulo + " SE PUEDE PRESTAR. ");
            }else{
                System.out.println(" EL LIBRO NO ESTA DISPONIBLE PARA PRESTAR. ");
            }
        }
        
        public void devolver(){
            if (Disponible){
                Disponible = true;
                System.out.println(" EL LIBRO " + Titulo + " SE HA DEVUELTO.");
            }else{
                System.out.println(" EL LIBRO NO SE HA DEVUELTO. ");
            }
        }
        
        public void estaDisponible(){
            if (Disponible){
                System.out.println(" EL LIBRO " + Titulo + " ESTA DISPONIBLE.");
            }else{
                System.out.println(" EL LIBRO NO ESTA DISPONIBLE. ");
            }
        }
        public void mostrarInformacion(){
            System.out.println("Titulo: " + Titulo);
            System.out.println("Autor: " + Autor);
            System.out.println("ISBN: " + ISBN);
            System.out.println("Numero de paginas: " + Npaginas);
            System.out.println("Disponible: " + Disponible);
        }

}