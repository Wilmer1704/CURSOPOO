public class ReservaHotel {
    private String NomCliente;
    private String FechaEntrada;
    private String FechaSalida;
    private int NumHabitacion;
    private boolean ReHabitacion;

    public ReservaHotel(String NomCliente, String FechaEntrada, String FechaSalida, int NumHabitacion, boolean ReHanitacion) {
        this.NomCliente = NomCliente;
        this.FechaEntrada 
= FechaEntrada;
        this.FechaSalida = FechaSalida;
        this.NumHabitacion = NumHabitacion;
        this.ReHabitacion = true;
    }

    public void nuevaReserva() {
        System.out.println(" RESERVAS HOTEL LA LUNA ");
        System.out.println("Nombre del cliente: " + NomCliente);
        System.out.println("Fecha de entrada: " + FechaEntrada);
        System.out.println("Fecha de salida: " + FechaSalida);
        System.out.println("Número de habitación: " + NumHabitacion);
        System.out.println( " RESERVA EXITOSA ");
    }

    public void cancelarReserva() {
        if (ReHabitacion= true){
            System.out.println(" RESERVA ACTIVA ");
        } else {
            System.out.println(" RESERVA CANCELADA. ");
        }
        System.out.println(" RESERVAS HOTEL LA LUNA ");
        System.out.println("Nombre del cliente: " + NomCliente);
        System.out.println("Fecha de entrada: " + FechaEntrada);
        System.out.println("Fecha de salida: " + FechaSalida);
        System.out.println("Número de habitación: " + NumHabitacion);
        System.out.println( " RESERVA CANCELADA ");
    }
    
    public void consultarReserva (){
        System.out.println( " HOTEL LA LUNA: INFORMACION RESERVA ");
        System.out.println("Nombre del cliente: " + NomCliente);
        System.out.println("Fecha de entrada: " + FechaEntrada);
        System.out.println("Fecha de salida: " + FechaSalida);
        System.out.println("Número de habitación: " + NumHabitacion);
         

}
 
}