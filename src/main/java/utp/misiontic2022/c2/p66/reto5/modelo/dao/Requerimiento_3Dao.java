package utp.misiontic2022.c2.p66.reto5.modelo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import utp.misiontic2022.c2.p66.reto5.modelo.vo.Requerimiento_3;
import utp.misiontic2022.c2.p66.reto5.util.JDBCUtilities;

public class Requerimiento_3Dao {
    public ArrayList<Requerimiento_3> requerimiento3() throws SQLException {
        ArrayList<Requerimiento_3> resultados = new ArrayList<>();

        // Por hacer
        try {
            JDBCUtilities conexion = new JDBCUtilities();
            String query = "SELECT p.Banco_Vinculado, SUM(l.salario) AS Costo_Lideres " + "FROM Proyecto p "
                    + "JOIN Lider l ON p.ID_Lider = l.ID_Lider " + "GROUP BY p.Banco_Vinculado "
                    + "HAVING SUM (l.Salario) < 30000000 " + "LIMIT 100 ";
            ResultSet resultadosRequerimiento3 = conexion.ejecutarConsulta(query);
            while (resultadosRequerimiento3.next()) {
                String bancoVinculado = resultadosRequerimiento3.getString("Banco_Vinculado");
                String costoLideres = resultadosRequerimiento3.getString("Costo_Lideres");
                resultados.add(new Requerimiento_3(bancoVinculado, costoLideres));
            }
        } catch (Exception e) {
            System.err.print(e);
        }
        return resultados;
    }
}