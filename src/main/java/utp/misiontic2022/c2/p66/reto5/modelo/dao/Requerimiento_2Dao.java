package utp.misiontic2022.c2.p66.reto5.modelo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import utp.misiontic2022.c2.p66.reto5.modelo.vo.Requerimiento_2;
import utp.misiontic2022.c2.p66.reto5.util.JDBCUtilities;

public class Requerimiento_2Dao {
    public ArrayList<Requerimiento_2> requerimiento2() throws SQLException {
        ArrayList<Requerimiento_2> resultados = new ArrayList<>();

        try {
            JDBCUtilities conexion = new JDBCUtilities();
            String query = "SELECT Proveedor, SUM(Cantidad) AS Cantidad_Total " + "FROM Compra " + "GROUP BY Proveedor "
                    + "ORDER BY SUM (Cantidad) " + "LIMIT 100 ";
            ResultSet resultadosRequerimiento2 = conexion.ejecutarConsulta(query);
            while (resultadosRequerimiento2.next()) {
                String proveedor = resultadosRequerimiento2.getString("Proveedor");
                String cantidadTotal = resultadosRequerimiento2.getString("Cantidad_Total");
                resultados.add(new Requerimiento_2(proveedor, cantidadTotal));
            }
        } catch (Exception e) {
            System.err.print(e);
        }
        return resultados;
    }
}
