/*
 * To change this license header, choose License Headers in Project Properties.
 * Autor: Aurelio Hernandez Valdes
 * and open the template in the editor.
 */
package CONTROLADOR;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Consulta extends Conexion {

    public boolean autenticacion(String usuario, String contraseña) {
        PreparedStatement pst = null;
        ResultSet rs = null;

        try {
            String consulta = "select * from usuario where usuario = ? and password = ?";
            pst = getConexion().prepareStatement(consulta, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            pst.setString(1, usuario);
            pst.setString(2, contraseña);
            rs = pst.executeQuery();

            if (!rs.next()) {
            } else {
                return true;
            }

        } catch (SQLException e) {
            System.err.println("ERROR " + e);
        } finally {
            try {
                if (getConexion() != null) {
                    getConexion().close();
                }
                if (pst != null) {
                    pst.close();
                }
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException e) {
                System.err.println("ERROR " + e);
            }

        }

        return false;
    }

    public boolean registrar(String usuario, String contraseña) {

        PreparedStatement pst = null;

        try{
            String consulta = "insert into usuario (usuario, password) values(?,?)";
            pst = getConexion().prepareStatement(consulta);
            pst.setString(1, usuario);
            pst.setString(2, contraseña);
            
            if(pst.executeUpdate() == 1){
                return true;
            }
        }catch(SQLException ex){
            System.err.println("ERROR " + ex );
        }finally{
           try{
               if(getConexion() != null) getConexion().close();
               if(pst != null) pst.close();
           }catch(SQLException e){
               System.err.println("ERROR " + e );
           }
            
        }
        
        return false;
    }
    
}