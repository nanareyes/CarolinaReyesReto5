package utp.misiontic2022.c2.p66.reto5.modelo.vo;

public class Requerimiento_1 {
    String nombreMaterial;
    String precioUnidad;
    String idProyecto;

    public Requerimiento_1(String nombreMaterial, String precioUnidad, String idProyecto) {
        this.nombreMaterial = nombreMaterial;
        this.precioUnidad = precioUnidad;
        this.idProyecto = idProyecto;
    }

    public String getNombreMaterial() {
        return nombreMaterial;
    }

    public String getPrecioUnidad() {
        return precioUnidad;
    }

    public String getIdProyecto() {
        return idProyecto;
    }

}
