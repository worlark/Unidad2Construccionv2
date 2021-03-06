package ControladorBaseDeDatos;

import ModuloGestionPropiedades.Propiedad;
import ModuloGestionPropiedades.Sector;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 */
public class ControladorBDDePropiedades {

    ConexionBD conexion;

    public ControladorBDDePropiedades() {
        this.conexion = new ConexionBD();
        
        iniciarlizarBD();
    }
    
    public void iniciarlizarBD(){
        this.conexion.crearConexion();
        Connection miConexion = this.conexion.getConexion();
        this.conexion.crearTablas(miConexion);
    }

    /**
     * Obtiene una lista con todas las propiedades de un propietario.
     *
     * @param rut: rut del propietario
     * @return lista de propiedades
     * @throws java.sql.SQLException
     */
    public ArrayList<Propiedad> obtenerInformacionDePropiedades(String rut) throws SQLException {
         this.conexion.crearConexion();
        Connection miConexion = this.conexion.getConexion();

        ArrayList<Propiedad> propiedades = new ArrayList<>();
        if (miConexion != null)// si hay conexion.
        {

            try {
                java.sql.Statement st = miConexion.createStatement();

                String sql = "select * from propiedad where propiedad.refpropietario='" + rut + "'";

                ResultSet resultado = st.executeQuery(sql);
                while (resultado.next()) {
                    int idPropiedad = Integer.parseInt(resultado.getString("id"));
                    String nombre = resultado.getString("nombre");
                    String ubicacion = resultado.getString("ubicacion");
                    int capacidadtotal = Integer.parseInt(resultado.getString("capacidadtotal"));
                    int valorArriendo = Integer.parseInt(resultado.getString("valorarriendo"));
                    String descripcion = resultado.getString("descripcion");
                    //int numeroSectores = Integer.parseInt(resultado.getString("numerodesectores"));
                    //String refPropietario = resultado.getString("refpropietario");
                    Date fechaPublicacion = resultado.getDate("fechapublicacion");
                    ArrayList<Sector>sectores=obtenerInformacionDeSectores(idPropiedad);

                    Propiedad propiedad = new Propiedad(idPropiedad, nombre, descripcion, fechaPublicacion, ubicacion, capacidadtotal, valorArriendo);
                    propiedad.setListaSectores(sectores);
                    propiedades.add(propiedad);
                }
                resultado.close();
                st.close();
                return propiedades;

            } catch (SQLException e) {
                //System.out.println("ERROR DE CONEXION: mostrarIndormacionCliente()");
                return null;
            } finally {
                this.conexion.cerrarBaseDeDatos(miConexion);
            }

        }
        return null;
    }

    /**
     * Entrega una propiedad, a traves del identificador de la propiedad y rut del propietario.
     *
     * @param rut; rut del dueño de la propiedad.
     * @param id: identificador de la propiedad.
     * @return propiedad si encuentra la propiedad de la que se quiere obtener informacion,
     * null de lo contrario.
     * @throws java.sql.SQLException
     */
    public Propiedad obtenerInformacionDeUnaPropiedad(String rut, int id) throws SQLException {
         this.conexion.crearConexion();
        Connection miConexion = this.conexion.getConexion();

        ArrayList<String> informacion = new ArrayList<>();
        if (miConexion != null)// si hay conexion.
        {

            try {
                java.sql.Statement st = miConexion.createStatement();

                String sql = "select * from propiedad where propiedad.id=" + id + " and propiedad.refpropietario='" + rut + "'";

                ResultSet resultado = st.executeQuery(sql);
                while (resultado.next()) {
                    // obtengo la informacion del cliente.
                    int idPropiedad = Integer.parseInt(resultado.getString("id"));
                    String nombre = resultado.getString("nombre");
                    String ubicacion = resultado.getString("ubicacion");
                    int capacidadtotal = Integer.parseInt(resultado.getString("capacidadtotal"));
                    int valorArriendo = Integer.parseInt(resultado.getString("valorarriendo"));
                    String descripcion = resultado.getString("descripcion");
                    //int numeroSectores = Integer.parseInt(resultado.getString("numerodesectores"));
                    //String refPropietario = resultado.getString("refpropietario");
                    Date fechaPublicacion = resultado.getDate("fechapublicacion");
                    ArrayList<Sector>sectores=obtenerInformacionDeSectores(idPropiedad);
                    Propiedad propiedad = new Propiedad(idPropiedad, nombre, descripcion, fechaPublicacion, ubicacion, capacidadtotal, valorArriendo);
                    propiedad.setListaSectores(sectores);
                    return propiedad;
                }
                resultado.close();
                st.close();

            } catch (SQLException e) {
                //System.out.println("ERROR DE CONEXION: mostrarIndormacionCliente()");
                return null;
            } finally {
                this.conexion.cerrarBaseDeDatos(miConexion);
            }

        }
        return null;

    }

    /**
     * Registra una propiedad en la base de datos, para que el registro sea
     * exitoso se debe haber creado anteriormente un propietario con el rut al
     * cual se le hara la referencia.
     *
     * @param rut: rut del propietario
     * @param nombre :nombre de la propiedad
     * @param descripcion :descripcion de la propiedad
     * @param fechaDePublicacion : fecha de publicacion de la propiedad.
     * @param capacidadTotal: numero de personas que puede contener la
     * propiedad.
     * @param ubicacion :ubicacion de la propiedad
     * @param valorDeArriendo: valor del arriendo de la propiedad
     * @return id de la propiedad creada, 0 si no crea la propiedad
     * @throws java.sql.SQLException
     */
    public int registrarPropiedad(String rut, String nombre, String ubicacion, Date fechaDePublicacion, int capacidadTotal, int valorDeArriendo, String descripcion) throws SQLException {
         this.conexion.crearConexion();
        boolean aceptado;
        Connection miConexion = this.conexion.getConexion();
        if (miConexion != null) {

            try {

                java.sql.Statement st = miConexion.createStatement();
                String sql = "insert into propiedad values(DEFAULT,'" + nombre + "','" + ubicacion + "','" + fechaDePublicacion + "','"+capacidadTotal+"','" + valorDeArriendo + "','" + descripcion + "','0','" + rut + "')"
                        + " RETURNING id";

                ResultSet resultado = st.executeQuery(sql);
                while (resultado.next()) {
                    int idPropiedad = Integer.parseInt(resultado.getString("id"));
                    return idPropiedad;
                }
                st.close();

            } catch (SQLException e) {
                //System.out.println("ERROR DE CONEXION: añadirCliente" + e);
                return 0;
            } finally {
                this.conexion.cerrarBaseDeDatos(miConexion);

            }

        }
        //System.out.println("wololoooo");
        return 0;
    }
    
    /**
     * Modifica la informacion de una propiedad.
     * @param id: identificador de la propiedad.
     * @param nuevoNombre: nuevo nombre de la propiedad.
     * @param NuevaUbicacion: nueva ubicacion de la propiedad.
     * @param fechaDePublicacion: nueva fecha publicacion de la propiedad.
     * @param nuevaCapacidadTotal: nueva capacidad de la propiedad.
     * @param nuevoValorDeArriendo: nuevo valor de arriendo de la propiedad.
     * @param nuevaDescripcion: nueva descripcion de la propiedad.
     * @return true si modifica la informacion de la propiedad, false de lo contrario.
     * @throws SQLException 
     */
    public boolean modifcarPropiedad(int id, String nuevoNombre, String NuevaUbicacion, Date fechaDePublicacion, int nuevaCapacidadTotal, int nuevoValorDeArriendo, String nuevaDescripcion) throws SQLException {

         this.conexion.crearConexion();
        boolean aceptado;
        Connection miConexion = this.conexion.getConexion();
        if (miConexion != null) {

            try {

                java.sql.Statement st = miConexion.createStatement();
                String sql = " UPDATE propiedad SET nombre='"+nuevoNombre+"', ubicacion='"+NuevaUbicacion+"',fechapublicacion='"+fechaDePublicacion+"',capacidadtotal='"+nuevaCapacidadTotal+"',\n"
                        + "valorarriendo='"+nuevoValorDeArriendo+"',descripcion='"+nuevaDescripcion+"'"
                        + "where propiedad.id="+id+" ";
                st.executeUpdate(sql);
                //System.out.println(sql);
                st.close();
                return true;

            } catch (SQLException e) {
                System.out.println("ERROR AL MODIFICAR LA INFORMACION DE UNA PROPIEDAD" + e);
                return false;
            } finally {
                this.conexion.cerrarBaseDeDatos(miConexion);

            }

        }
        return false;
    }

    /**
     * Elimina una propiedad de la base de datos.
     * @param idPropiedad: identificador de la propiedad.
     * @return true si se elimina la propiedad, false de lo contrario.
     * @throws SQLException 
     */
    public boolean eliminarPropiedad( int idPropiedad) throws SQLException {
         this.conexion.crearConexion();
        Connection miConexion = this.conexion.getConexion();

        if (miConexion != null) {
            try {
                java.sql.Statement st = miConexion.createStatement();
                String sql = "delete from propiedad where propiedad.id="+idPropiedad+"";
                st.executeUpdate(sql);

                st.close();
                return true;
            } catch (SQLException e) {
                //System.out.println("ERROR DE CONEXION: eliminar cliente (desde la tabla de usuario)" + e);
                return false;
            } finally {
                this.conexion.cerrarBaseDeDatos(miConexion);
            }

        }
        return false;
    }
    
    
    
    
    /**
     * Registra un sector en la base de datos, anexo a una propiedad.
     *
     * @param nombreSector:nombre del sector.
     * @param capacidad: capacidad del sector.
     * @param idPropiedad: identificador de la propiedad a la cual pertenece el
     * sector.
     * @return true si registra el sector satisfactoriamente ,false de lo
     * contrario
     * @throws SQLException
     */
    public boolean registrarSector(String nombreSector, int capacidad, int idPropiedad) throws SQLException {

         this.conexion.crearConexion();
        Connection miConexion = this.conexion.getConexion();

        if (miConexion != null) {
            try {

                java.sql.Statement st = miConexion.createStatement();
                String sql = "insert into sector values('" + nombreSector + "'," + capacidad + "," + idPropiedad + ")";
                st.executeUpdate(sql);
                st.close();
                return true;

            } catch (SQLException e) {
                System.out.println("Error al añadir un sector.");
                return false;
            } finally {
                this.conexion.cerrarBaseDeDatos(miConexion);
            }
        }
        return false;
    }

    /**
     * Elimina un sector de la base de datos, a traves de nombre y el
     * identificador de propiedad del sector
     *
     * @param nombreSector: nombre del sector
     * @param idPropiedad: identificador de la propiedad a la cual pertenece el
     * sector
     * @return
     * @return: true si borra el sector, false de lo contrario.
     * @throws SQLException
     */
    public boolean eliminarSector(String nombreSector, int idPropiedad) throws SQLException {
         this.conexion.crearConexion();
        Connection miConexion = this.conexion.getConexion();

        if (miConexion != null) {
            try {
                java.sql.Statement st = miConexion.createStatement();
                String sql = "delete from sector where nombre='" + nombreSector + "' and sector.refpropiedad=" + idPropiedad + "";
                st.executeUpdate(sql);

                st.close();
                return true;
            } catch (SQLException e) {
                System.out.println("ERROR AL ELIMINAR UN SECTOR: )" + e);
                return false;
            } finally {
                this.conexion.cerrarBaseDeDatos(miConexion);
            }

        }
        return false;
    }
    /**
     * Modifca la informacion de un sector.
     * @param nombreSector
     * @param idPropiedad
     * @param nuevoNombre
     * @param nuevaCapacidad
     * @return
     * @throws SQLException 
     */
    public boolean modificarSector(String nombreSector, int idPropiedad, String nuevoNombre, int nuevaCapacidad) throws SQLException {

         this.conexion.crearConexion();
        boolean aceptado;
        Connection miConexion = this.conexion.getConexion();
        if (miConexion != null) {

            try {

                java.sql.Statement st = miConexion.createStatement();
                String sql = " UPDATE sector SET nombre='" + nuevoNombre + "',capacidad=" + nuevaCapacidad + " \n"
                        + "where nombre ='" + nombreSector + "' and sector.refpropiedad=" + idPropiedad + " ";
                st.executeUpdate(sql);
                st.close();
                return true;

            } catch (SQLException e) {
                System.out.println("ERROR MODIFICAR SECTOR" + e);
                return false;
            } finally {
                this.conexion.cerrarBaseDeDatos(miConexion);

            }

        }
        return false;
    }

    /**
     * Obtiene un sector a traves del nombre del sector y el identificador de
     * propidad.
     *
     * @param nombreSector: nombre del sector.
     * @param idPropiedad: identificador de una propidad.
     * @return 
     * @throws SQLException
     */
    public Sector obtenerInformacionDeUnSector(String nombreSector, int idPropiedad) throws SQLException {
         this.conexion.crearConexion();
        Connection miConexion = this.conexion.getConexion();

        ArrayList<String> informacion = new ArrayList<>();
        if (miConexion != null)// si hay conexion.
        {

            try {
                java.sql.Statement st = miConexion.createStatement();

                String sql = "select * from sector where nombre='" + nombreSector + "' and sector.refpropiedad=" + idPropiedad + "";

                ResultSet resultado = st.executeQuery(sql);
                while (resultado.next()) {
                    String nombre = resultado.getString("nombre");
                    int capacidad = Integer.parseInt(resultado.getString("capacidad"));
                    int refPropiedad = Integer.parseInt(resultado.getString("refpropiedad"));

                    Sector sector = new Sector(refPropiedad, nombre, capacidad);
                    return sector;
                }
                resultado.close();
                st.close();

            } catch (SQLException e) {
                System.out.println("ERROR AL OBTENER INFORMACION DE UN SECTOR");
                return null;
            } finally {
                this.conexion.cerrarBaseDeDatos(miConexion);
            }

        }
        return null;
        
    }

    /**
     * Obtiene todos los sectores anexos a una propiedad.
     *
     * @param idPropiedad: identificador de una propiedad.
     * @return 
     * @throws SQLException
     */
    public ArrayList<Sector> obtenerInformacionDeSectores(int idPropiedad) throws SQLException {
         this.conexion.crearConexion();
        Connection miConexion = this.conexion.getConexion();

        ArrayList<Sector> sectores = new ArrayList<>();
        if (miConexion != null)// si hay conexion.
        {

            try {
                java.sql.Statement st = miConexion.createStatement();

                String sql = "select * from sector where sector.refpropiedad=" + idPropiedad + "";
                ResultSet resultado = st.executeQuery(sql);
                while (resultado.next()) {
                    String nombre = resultado.getString("nombre");
                    int capacidad = Integer.parseInt(resultado.getString("capacidad"));
                    int refPropiedad = Integer.parseInt(resultado.getString("refpropiedad"));

                    Sector sector = new Sector(refPropiedad, nombre, capacidad);
                    sectores.add(sector);
                }
                resultado.close();
                st.close();

            } catch (SQLException e) {
                System.out.println("ERROR AL OBTENER INFORMACION DE SECTORES.");
                return null;
            } finally {
                this.conexion.cerrarBaseDeDatos(miConexion);
            }

        }
        return sectores;
    }

    
    
    
    
    
}
