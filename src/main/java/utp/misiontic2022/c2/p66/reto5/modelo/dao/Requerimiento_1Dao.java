package utp.misiontic2022.c2.p66.reto5.modelo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import utp.misiontic2022.c2.p66.reto5.modelo.vo.Requerimiento_1;
import utp.misiontic2022.c2.p66.reto5.util.JDBCUtilities;

public class Requerimiento_1Dao {

    public ArrayList<Requerimiento_1> requerimiento1() throws SQLException {
        ArrayList<Requerimiento_1> resultados = new ArrayList<>();
        try {
            JDBCUtilities conexion = new JDBCUtilities();
            String query = "SELECT mc.Nombre_Material, mc.Precio_Unidad, p.ID_Proyecto "
                    + "FROM MaterialConstruccion mc JOIN Compra c ON c.ID_MaterialConstruccion = mc.ID_MaterialConstruccion "
                    + "JOIN Proyecto p ON p.ID_Proyecto = c.ID_Proyecto " + "WHERE p.Constructora = 'Pegaso' "
                    + "AND mc.Importado = 'No' " + "LIMIT 100 ";
            ResultSet resultadosRequerimiento1 = conexion.ejecutarConsulta(query);
            while (resultadosRequerimiento1.next()) {
                String nombreMaterial = resultadosRequerimiento1.getString("Nombre_Material");
                String precioUnidad = resultadosRequerimiento1.getString("Precio_Unidad");
                String idProyecto = resultadosRequerimiento1.getString("ID_Proyecto");
                resultados.add(new Requerimiento_1(nombreMaterial, precioUnidad, idProyecto));
            }
        } catch (Exception e) {
            System.err.print(e);
        }
        return resultados;
    }
}
