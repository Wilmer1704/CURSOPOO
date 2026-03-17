public class main {
    public static void main(String[] args) {
        ReservaHotel Reserva = new ReservaHotel( "Wilmer Astudillo", "16-03-2026", "20-03-2016", 206, false);
    
        Reserva.nuevaReserva();

        Reserva.cancelarReserva();

        Reserva.consultarReserva();
        
    
    }
}