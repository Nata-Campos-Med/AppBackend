package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import util.Constantes;

public class Conexion {

    private Connection connetion;

    public Conexion() {
        conectar();

    }

    public Conexion(String crearDB) throws ClassNotFoundException {
        try {
            Class.forName("com.mysql.jdvc.Driver");
            this.connetion = DriverManager.getConnection(Constantes.URL, Constantes.USUARIO, Constantes.CONTRASENHA);
            PreparedStatement pstm = this.connetion.prepareStatement(crearDB);
            pstm.execute();
            this.connetion.close();
        } catch (SQLException exception) {

        }
    }

    public void conectar() {
        try {
            this.connetion = DriverManager.getConnection(Constantes.URL, Constantes.USUARIO, Constantes.CONTRASENHA);
        } catch (SQLException exception) {
        }
    }

    public void desconectar() {
        try {
            this.connetion.close();
        } catch (SQLException sqlException) {
            System.err.println(sqlException);
        }
    }

    public int ejecutarSentenciaSQL(String sentencia) {
        try {
            PreparedStatement pst = this.connetion.prepareStatement(sentencia);
            return pst.executeUpdate();
        } catch (SQLException sqlException) {
            return 0;
        }

    }

    public ResultSet consultarRegistros(String sentencia) {
        try {
            PreparedStatement pst = this.connetion.prepareStatement(sentencia);
            ResultSet respuesta = pst.executeQuery();
            return respuesta;
        } catch (SQLException sqlException) {
            return null;
        }
    }
}


