public class Perfume {

    private String Nombre;
    private String Marca;
    private double Capacidad;
    private double Precio;
    
    public Perfume(String Nombre, String Marca, double Capacidad, double Precio) {
        this.Nombre = Nombre;
        this.Marca = Marca;
        this.Capacidad = Capacidad;
        this.Precio = Precio;
    }
    
    public void aplicarPerfume(double cantidad) {
    if (cantidad <= Capacidad){   
        Capacidad -= cantidad;
        System.out.println(" SE UTILIZO " + cantidad + " DE PERFUME EN MILILITROS ");
    }else{
        System.out.println(" NO HAY SUFICIENTE PERFUME PARA APLICAR ");
    }
}

    public double consultarCantidadRestante (){
        return Capacidad;
    }
    public void ajustarPrecio (double nuevoPrecio){
        Precio = nuevoPrecio;
    }

    public void INF() {
        System.out.println(" PERFUME: " + Nombre);
        System.out.println(" MARCA: " + Marca);
        System.out.println(" CAPACIDAD: " + Capacidad + " MILILITROS ");
        System.out.println(" PRECIO: " + Precio);
    }
}