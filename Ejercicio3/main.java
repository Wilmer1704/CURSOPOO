public class main {

    public static void main (String[] args) {

        Producto producto = new Producto("Cuadernos", 101, 10, 1500);
        System.out.println(producto);
        
        producto.agregarStock(5);
        System.out.println(" Después de agregar stock: " + producto);
        
        producto.reducirStock(3);
        System.out.println(" Después de reducir stock: " + producto);
        
        double valorInventario = producto.calcularValorInventario();
        System.out.println(" Valor total del inventario: $" + valorInventario);
    }
}