package _p100_Articulo;

public class Articulo {
    private String id;
    private String desc;
    private int cant;
    private double precio;
    private double total;

    public Articulo () {
        
    }
    public Articulo (String id, String desc, int cant, double precio, double total) {
        this.id = id;
        this.desc = desc;
        this.cant = cant;
        this.precio = precio;
        this.total = total;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getCant() {
        return cant;
    }
    public void setCant(int cant) {
        this.cant = cant;
    }

    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getTotal() {
        return cant * precio;
    }
    public void setTotal(double total) {
        this.total = total;
    }
    @Override
    public String toString() {
        return "Articulo [id=" + id + ", desc=" + desc + ", cant=" + cant + ", precio=" + precio + ", total=" + total
                + "]";
    }


    
}
