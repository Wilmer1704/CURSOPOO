public class main { 
    public static void main(String[] args) {
        Perfume perfume = new Perfume (" BLACK XS", " PACO RABANNE ", 100,  150000 );
        System.out.println(" INFORMACION DEL PERFUME: ");

        perfume.aplicarPerfume(30);

        System.out.println(" CANTIDAD RESTANTE DEL PERFUME: ");
        System.out.println( perfume.consultarCantidadRestante() + " ml ");

        perfume.ajustarPrecio(200000);
        System.out.println( " PRECIO AJUSTADO: " + perfume);
    }
} 
