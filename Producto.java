public class Producto {
private String nombre; 
private String descripcion; 
private String categoria; 
private double precio; 
private String urlFoto; 

public Producto(String nombre, String descripcion, String categoria, String etiquetas, double precio, String urlFoto) {
       this.nombre = nombre; 
       this.descripcion = descripcion; 
       this.categoria = categoria; 
       this.precio = precio; 
       this.urlFoto = urlFoto; 
    }

public String getNombre() {
    return nombre;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}

public String getDescripcion() {
    return descripcion;
}

public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
}

public String getCategoria() {
    return categoria;
}

public void setCategoria(String categoria) {
    this.categoria = categoria;
}

public double getPrecio() {
    return precio;
}

public void setPrecio(double precio) {
    this.precio = precio;
}

public String getUrlFoto() {
    return urlFoto;
}

public void setUrlFoto(String urlFoto) {
    this.urlFoto = urlFoto;
}

public void mostrarDetalles() {
    System.out.println("+--------------+-------------------+");
    System.out.println("| Nombre       | " + nombre);
    System.out.println("| Descripción  | " + descripcion);
    System.out.println("| Categoría    | " + categoria);
    System.out.println("| Precio       | " + precio);
    System.out.println("| URL          | " + urlFoto);
    System.out.println("+--------------+-------------------+");
}

}