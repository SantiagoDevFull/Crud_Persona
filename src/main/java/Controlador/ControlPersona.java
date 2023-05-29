package Controlador;

import Interfaces.Ipersona;
import Modelo.Persona;
import config.SQLConexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControlPersona implements Ipersona {

    private Connection cn = null;
    private PreparedStatement st = null;
    private ResultSet rs = null;

    @Override
    public ArrayList<Persona> ListarPersona() {

        ArrayList<Persona> lista = new ArrayList();

        cn = SQLConexion.getConexion();
        String consulta = "SELECT id,dni,nombre,apellido,sueldo FROM persona";
        try {

            st = cn.prepareStatement(consulta);
            rs = st.executeQuery();

            while (rs.next()) {
                Persona obj = new Persona();
                obj.setId(rs.getInt(1));
                obj.setDni(rs.getString(2));
                obj.setNombre(rs.getString(3));
                obj.setApellido(rs.getString(4));
                obj.setSueldo(rs.getDouble(5));
                lista.add(obj);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (cn != null) {
                    cn.close();
                }
                if (st != null) {
                    st.close();
                }
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return lista;
    }

    @Override
    public int AgregarPersona(Persona p) {

        int res = 0;

        cn = SQLConexion.getConexion();
        String consulta = "INSERT INTO persona(dni,nombre,apellido,sueldo) VALUES (?,?,?,?);";
        try {
            st = cn.prepareStatement(consulta);

            st.setString(1, p.getDni());
            st.setString(2, p.getNombre());
            st.setString(3, p.getApellido());
            st.setDouble(4, p.getSueldo());
            res = st.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (cn != null) {
                    cn.close();
                }
                if (st != null) {
                    st.close();
                }
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return res;
    }

    @Override
    public int ActualizarPersona(Persona p) {

        int res = 0;

        cn = SQLConexion.getConexion();
        String consulta = "UPDATE PERSONA SET dni=?,nombre=?,apellido=?,sueldo=? WHERE id=?";
        try {

            st = cn.prepareStatement(consulta);
            st.setString(1, p.getDni());
            st.setString(2, p.getNombre());
            st.setString(3, p.getApellido());
            st.setDouble(4, p.getSueldo());
            st.setInt(5, p.getId());
            res = st.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (cn != null) {
                    cn.close();
                }
                if (st != null) {
                    st.close();
                }
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return res;
    }

    @Override
    public int EliminarPersona(int id) {

        int res = 0;

        cn = SQLConexion.getConexion();
        String consulta = "DELETE FROM persona WHERE id=?";
        try {

            st = cn.prepareStatement(consulta);
            st.setInt(1, id);
            res = st.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (cn != null) {
                    cn.close();
                }
                if (st != null) {
                    st.close();
                }
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return res;
    }

    @Override
    public int RetornarCodigoPersona() {

        int res = 0;

        cn = SQLConexion.getConexion();
        String consulta = "SELECT IDENT_CURRENT('persona') + IDENT_INCR('persona') AS NextID";
        try {

            st = cn.prepareStatement(consulta);
            rs = st.executeQuery();

            if (rs.next()) {
                res = rs.getInt(1);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (cn != null) {
                    cn.close();
                }
                if (st != null) {
                    st.close();
                }
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return res;

    }

    @Override
    public int ExisteDNI(String dni) {

        int res = 0;

        cn = SQLConexion.getConexion();
        String consulta = "SELECT*FROM persona WHERE dni=?;";
        try {

            st = cn.prepareStatement(consulta);
            st.setString(1, dni);
            rs = st.executeQuery();

            if (rs.next()) {
                res = 1;
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (cn != null) {
                    cn.close();
                }
                if (st != null) {
                    st.close();
                }
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return res;
    }

}
