package domain;

public class Producto implements Comparable<Producto>{
    
    //Atributos
    private int codigo;
    private String descripcion;
    private double precio;
    private int stock;
    private Categoria rubro;
    
    //Constructor
    public Producto(int codigo, String descripcion, double precio, int stock, Categoria rubro) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
        this.rubro = rubro;
    }
    
    //Métodos getter y setter
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Categoria getRubro() {
        return rubro;
    }

    public void setRubro(Categoria rubro) {
        this.rubro = rubro;
    }
    
    //Métodos adicionales
    @Override
    public int compareTo(Producto p) {
        
        if(this.codigo == p.getCodigo()){
            return 0;
        }else if(this.codigo > p.getCodigo()){
            return 1;
        }else{
            return -1;
        }
    }  
}