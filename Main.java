public class Main {
    public static void main(String[] args) {
        Producto producto1 = new Producto("Telefono Samsung", "Samsung S24+", "Telefonía", "Portátil,Telefono", 4000.00, "urlFoto1.jpg");
        producto1.mostrarDetalles();

        Producto producto2 = new Producto("Telefono iPhone", "iPhone 14", "Telefonía", "Portátil,Telefono", 5000.00, "urlFoto2.jpg");
        producto2.mostrarDetalles();

        Producto producto3 = new Producto("Laptop Hp", "Laptop con iCore i7", "Electrónica", "Portátil,Computadora", 6200.00, "urlFoto3.jpg");
        producto3.mostrarDetalles();

        Producto producto4 = new Producto("Telefono Samsung", "Samsung Fold", "Telefonía", "Portátil,Telefono", 3200.00, "urlFoto4.jpg");
        producto4.mostrarDetalles();

        Producto producto5 = new Producto("Laptop Dell", "Laptop con Core i5", "Electrónica", "Portátil,Computadora", 2200.00, "urlFoto5.jpg");
        producto5.mostrarDetalles();
    }
}
