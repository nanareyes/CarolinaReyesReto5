package utp.misiontic2022.c2.p66.reto5.modelo.vo;

public class Requerimiento_2 {

    String proveedor;
    String cantidadTotal;

    public Requerimiento_2(String proveedor, String cantidadTotal) {
        this.proveedor = proveedor;
        this.cantidadTotal = cantidadTotal;
    }

    public String getProveedor() {
        return proveedor;
    }

    public String getCantidadTotal() {
        return cantidadTotal;
    }
}
