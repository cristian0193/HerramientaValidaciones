package Conexion;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class ConexioSQLiteQA {

    public static Connection conectar = null;
    public static Statement sentencia;
    public static ResultSet resultado;
    public static String query = "";
    final File archivo = new File("ValidacionesSQLite.db");
    
//METODO DE CONEXION
    public void coneccionbase() {        
        
        try {            

            Class.forName("org.sqlite.JDBC");
            conectar = DriverManager.getConnection("jdbc:sqlite:"+archivo);                      
            sentencia = conectar.createStatement();
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        
    }

//METODO CONECTAR TABLAS
    public Connection Conectar() {

        try {       
            Class.forName("org.sqlite.JDBC");
            conectar = DriverManager.getConnection("jdbc:sqlite:"+archivo); 
        }  catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        return conectar;
    }

//METODOS DE DESCONEXION
    public static void cerrar() {
        try {
            conectar.close();
            System.out.println("CONEXION CERRADA ...");
        } catch (Exception e) {
            System.err.println(e.getMessage());
            System.out.println("NO SE CERRO CONEXION ...");
        }
    }

//METODO DE INSERTAR
    public boolean insert(String GCC,
            String NOMBRE,
            String TIPO,
            String LIDER,
            String PLANTA,
            String MAQUINA,
            String LOTE,
            String TURNO,
            String FECHA_PROPUESTA,
            String ESTADO,
            String OBSERVACION,
            String PRE_CAL_ESPECIFICACION_EQUIPO,
            String PRE_CAL_PROTOCOLOS,
            String PRE_CAL_RU_NO_GXP,
            String PRE_CAL_LIBRO_PARAMETROS,
            String PRE_CAL_BR_ACTUALIZADO,
            String PRE_CAL_SOP,
            String PRE_CAL_HOJA_VIDA,
            String PRE_CAL_RUTINA_MANTENIMIENTO,
            String PRE_CAL_CERTIFICADO_MATERIALES,
            String PRE_CAL_PLANOS,
            String PRE_CAL_MANUALES,
            String PRE_CAL_MATERIALES,
            String PRE_CAL_RECURSOS,
            String PRE_CAL_ENTRENAMIENTOS,
            String PRE_PRO_CALIFICACION_IQOQPQ,
            String PRE_PRO_ENTRENAMIENTO_HFM,
            String PRE_PRO_ENTRENAMIENTO_ESPECIFICACION,
            String PRE_PRO_ENTRENAMIENTO_TEST,
            String PRE_PRO_ENTRENAMIENTO_PROTOCOLO,
            String PRE_PRO_MATERIALES,
            String PRE_PRO_DP,
            String PRE_PRO_DIAGRAMA,
            String PRE_PRO_FMEA,
            String PRE_PRO_PR,
            String PRE_PRO_PF,
            String PRE_PRO_RM,
            String PRE_PRO_PC,
            String PRE_PRO_CG,
            String PRE_PRO_FP,
            String FECHA_REPROGRAMACION,
            String OBSERVACION_REPROGRAMACION,
            int SEMANA,
            String RESPUESTA,
            String AUTORIZADO,
            String  OBSERVACION_EXCEPCIONES) {

        try {

            query = "INSERT INTO PLANEACIONES_VALIDACION "
                    + "(NUMERO_REGISTRO, "
                    + "GCC_APR, "
                    + "NOMBRE_PROYECTO, "
                    + "TIPO_VALIDACION, "
                    + "LIDER_TECNICO, PLANTA, "
                    + "MAQUINA, "
                    + "LOTE, "
                    + "TURNOS, "
                    + "FECHA_PROPUESTA, "
                    + "ESTADO_PROYECTO, "
                    + "OBSERVACIONES_VALIDACION, "
                    + "PRE_CAL_ESPECIFICACION_EQUIPO, "
                    + "PRE_CAL_PROTOCOLOS, "
                    + "PRE_CAL_RU_NO_GXP, "
                    + "PRE_CAL_LIBRO_PARAMETROS, "
                    + "PRE_CAL_BR_ACTUALIZADO, "
                    + "PRE_CAL_SOP, "
                    + "PRE_CAL_HOJA_VIDA, "
                    + "PRE_CAL_RUTINA_MANTENIMIENTO, "
                    + "PRE_CAL_CERTIFICADO_MATERIALES, "
                    + "PRE_CAL_PLANOS, PRE_CAL_MANUALES, "
                    + "PRE_CAL_MATERIALES, PRE_CAL_RECURSOS, "
                    + "PRE_CAL_ENTRENAMIENTOS, "
                    + "PRE_PRO_CALIFICACION_IQOQPQ, "
                    + "PRE_PRO_ENTRENAMIENTO_HFM, "
                    + "PRE_PRO_ENTRENAMIENTO_ESPECIFICACION, "
                    + "PRE_PRO_ENTRENAMIENTO_TEST, "
                    + "PRE_PRO_ENTRENAMIENTO_PROTOCOLO, "
                    + "PRE_PRO_MATERIALES, "
                    + "PRE_PRO_DP, "
                    + "PRE_PRO_DIAGRAMA, "
                    + "PRE_PRO_FMEA, "
                    + "PRE_PRO_PR, "
                    + "PRE_PRO_PF, "
                    + "PRE_PRO_RM, "
                    + "PRE_PRO_PC, "
                    + "PRE_PRO_CG, "
                    + "PRE_PRO_FP, "
                    + "FECHA_REPROGRAMACION, "
                    + "OBSERVACION_REPROGRAMACION, "
                    + "SEMANA, "
                    + "RESPUESTA, "
                     + "AUTORIZADO, "
                     + "OBSERVACION_EXCEPCIONES ) "
                    + "VALUES "
                    + "(NULL,'" + GCC + "' ,'" + NOMBRE + "', '" + TIPO + "', '" + LIDER + "', '" + PLANTA + "', '" + MAQUINA + "',"
                    + "" + LOTE + ", " + TURNO + ",'" + FECHA_PROPUESTA + "' , '" + ESTADO + "', '" + OBSERVACION + "',"
                    + "'" + PRE_CAL_ESPECIFICACION_EQUIPO + "', '" + PRE_CAL_PROTOCOLOS + "', '" + PRE_CAL_RU_NO_GXP + "',"
                    + "'" + PRE_CAL_LIBRO_PARAMETROS + "', '" + PRE_CAL_BR_ACTUALIZADO + "', '" + PRE_CAL_SOP + "',"
                    + " '" + PRE_CAL_HOJA_VIDA + "', '" + PRE_CAL_RUTINA_MANTENIMIENTO + "', '" + PRE_CAL_CERTIFICADO_MATERIALES + "', "
                    + "'" + PRE_CAL_PLANOS + "', '" + PRE_CAL_MANUALES + "', '" + PRE_CAL_MATERIALES + "',"
                    + "'" + PRE_CAL_RECURSOS + "', '" + PRE_CAL_ENTRENAMIENTOS + "', '" + PRE_PRO_CALIFICACION_IQOQPQ + "',"
                    + "'" + PRE_PRO_ENTRENAMIENTO_HFM + "', '" + PRE_PRO_ENTRENAMIENTO_ESPECIFICACION + "', '" + PRE_PRO_ENTRENAMIENTO_TEST + "',"
                    + "'" + PRE_PRO_ENTRENAMIENTO_PROTOCOLO + "', '" + PRE_PRO_MATERIALES + "', '" + PRE_PRO_DP + "',"
                    + "'" + PRE_PRO_DIAGRAMA + "', '" + PRE_PRO_FMEA + "', '" + PRE_PRO_PR + "', '" + PRE_PRO_PF + "', "
                    + "'" + PRE_PRO_RM + "', '" + PRE_PRO_PC + "', '" + PRE_PRO_CG + "', '" + PRE_PRO_FP + "', "
                    + "'" + FECHA_REPROGRAMACION + "', '" + OBSERVACION_REPROGRAMACION + "'," + SEMANA + ", "
                    + "'" + RESPUESTA + "', '" + AUTORIZADO + "','" + OBSERVACION_EXCEPCIONES + "') ";
            System.out.println(query);

            sentencia.executeUpdate(query);
            System.out.println("INSERTADO ...");

            return true;

        } catch (SQLException e) {

            System.err.println(e.getMessage());
            System.out.println("NO INSERTADO ...");
            return false;

        }
    }

    //METODO DE INSERTAR
    public boolean insertNoprogramadas(String GCC,
            String NOMBRE,
            String TIPO,
            String LIDER,
            String PLANTA,
            String MAQUINA,
            String LOTE,
            String TURNO,
            String FECHA_PROPUESTA,
            String ESTADO,
            String OBSERVACION,
            String PRE_CAL_ESPECIFICACION_EQUIPO,
            String PRE_CAL_PROTOCOLOS,
            String PRE_CAL_RU_NO_GXP,
            String PRE_CAL_LIBRO_PARAMETROS,
            String PRE_CAL_BR_ACTUALIZADO,
            String PRE_CAL_SOP,
            String PRE_CAL_HOJA_VIDA,
            String PRE_CAL_RUTINA_MANTENIMIENTO,
            String PRE_CAL_CERTIFICADO_MATERIALES,
            String PRE_CAL_PLANOS,
            String PRE_CAL_MANUALES,
            String PRE_CAL_MATERIALES,
            String PRE_CAL_RECURSOS,
            String PRE_CAL_ENTRENAMIENTOS,
            String PRE_PRO_CALIFICACION_IQOQPQ,
            String PRE_PRO_ENTRENAMIENTO_HFM,
            String PRE_PRO_ENTRENAMIENTO_ESPECIFICACION,
            String PRE_PRO_ENTRENAMIENTO_TEST,
            String PRE_PRO_ENTRENAMIENTO_PROTOCOLO,
            String PRE_PRO_MATERIALES,
            String PRE_PRO_DP,
            String PRE_PRO_DIAGRAMA,
            String PRE_PRO_FMEA,
            String PRE_PRO_PR,
            String PRE_PRO_PF,
            String PRE_PRO_RM,
            String PRE_PRO_PC,
            String PRE_PRO_CG,
            String PRE_PRO_FP,
            String FECHA_REPROGRAMACION,
            String OBSERVACION_REPROGRAMACION,
            int SEMANA,
            String RESPUESTA,
            String AUTORIZADO,
            String  OBSERVACION_EXCEPCIONES,
            String NO_PROGRAMADAS) {

        try {

            query = "INSERT INTO PLANEACIONES_VALIDACION "
                    + "(NUMERO_REGISTRO, "
                    + "GCC_APR, "
                    + "NOMBRE_PROYECTO, "
                    + "TIPO_VALIDACION, "
                    + "LIDER_TECNICO, PLANTA, "
                    + "MAQUINA, "
                    + "LOTE, "
                    + "TURNOS, "
                    + "FECHA_PROPUESTA, "
                    + "ESTADO_PROYECTO, "
                    + "OBSERVACIONES_VALIDACION, "
                    + "PRE_CAL_ESPECIFICACION_EQUIPO, "
                    + "PRE_CAL_PROTOCOLOS, "
                    + "PRE_CAL_RU_NO_GXP, "
                    + "PRE_CAL_LIBRO_PARAMETROS, "
                    + "PRE_CAL_BR_ACTUALIZADO, "
                    + "PRE_CAL_SOP, "
                    + "PRE_CAL_HOJA_VIDA, "
                    + "PRE_CAL_RUTINA_MANTENIMIENTO, "
                    + "PRE_CAL_CERTIFICADO_MATERIALES, "
                    + "PRE_CAL_PLANOS, PRE_CAL_MANUALES, "
                    + "PRE_CAL_MATERIALES, PRE_CAL_RECURSOS, "
                    + "PRE_CAL_ENTRENAMIENTOS, "
                    + "PRE_PRO_CALIFICACION_IQOQPQ, "
                    + "PRE_PRO_ENTRENAMIENTO_HFM, "
                    + "PRE_PRO_ENTRENAMIENTO_ESPECIFICACION, "
                    + "PRE_PRO_ENTRENAMIENTO_TEST, "
                    + "PRE_PRO_ENTRENAMIENTO_PROTOCOLO, "
                    + "PRE_PRO_MATERIALES, "
                    + "PRE_PRO_DP, "
                    + "PRE_PRO_DIAGRAMA, "
                    + "PRE_PRO_FMEA, "
                    + "PRE_PRO_PR, "
                    + "PRE_PRO_PF, "
                    + "PRE_PRO_RM, "
                    + "PRE_PRO_PC, "
                    + "PRE_PRO_CG, "
                    + "PRE_PRO_FP, "
                    + "FECHA_REPROGRAMACION, "
                    + "OBSERVACION_REPROGRAMACION, "
                    + "SEMANA, "
                    + "RESPUESTA, "
                    + "AUTORIZADO, "
                    + "OBSERVACION_EXCEPCIONES,"
                    + " NO_PROGRAMADA ) "
                    + "VALUES "
                    + "(NULL,'" + GCC + "' ,'" + NOMBRE + "', '" + TIPO + "', '" + LIDER + "', '" + PLANTA + "', '" + MAQUINA + "',"
                    + "" + LOTE + ", " + TURNO + ",'" + FECHA_PROPUESTA + "' , '" + ESTADO + "', '" + OBSERVACION + "',"
                    + "'" + PRE_CAL_ESPECIFICACION_EQUIPO + "', '" + PRE_CAL_PROTOCOLOS + "', '" + PRE_CAL_RU_NO_GXP + "',"
                    + "'" + PRE_CAL_LIBRO_PARAMETROS + "', '" + PRE_CAL_BR_ACTUALIZADO + "', '" + PRE_CAL_SOP + "',"
                    + " '" + PRE_CAL_HOJA_VIDA + "', '" + PRE_CAL_RUTINA_MANTENIMIENTO + "', '" + PRE_CAL_CERTIFICADO_MATERIALES + "', "
                    + "'" + PRE_CAL_PLANOS + "', '" + PRE_CAL_MANUALES + "', '" + PRE_CAL_MATERIALES + "',"
                    + "'" + PRE_CAL_RECURSOS + "', '" + PRE_CAL_ENTRENAMIENTOS + "', '" + PRE_PRO_CALIFICACION_IQOQPQ + "',"
                    + "'" + PRE_PRO_ENTRENAMIENTO_HFM + "', '" + PRE_PRO_ENTRENAMIENTO_ESPECIFICACION + "', '" + PRE_PRO_ENTRENAMIENTO_TEST + "',"
                    + "'" + PRE_PRO_ENTRENAMIENTO_PROTOCOLO + "', '" + PRE_PRO_MATERIALES + "', '" + PRE_PRO_DP + "',"
                    + "'" + PRE_PRO_DIAGRAMA + "', '" + PRE_PRO_FMEA + "', '" + PRE_PRO_PR + "', '" + PRE_PRO_PF + "', "
                    + "'" + PRE_PRO_RM + "', '" + PRE_PRO_PC + "', '" + PRE_PRO_CG + "', '" + PRE_PRO_FP + "', "
                    + "'" + FECHA_REPROGRAMACION + "', '" + OBSERVACION_REPROGRAMACION + "'," + SEMANA + ", "
                    + "'" + RESPUESTA + "', '" + AUTORIZADO + "','" + OBSERVACION_EXCEPCIONES + "','" + NO_PROGRAMADAS + "') ";
            System.out.println(query);

            sentencia.executeUpdate(query);
            System.out.println("INSERTADO ...");

            return true;

        } catch (SQLException e) {

            System.err.println(e.getMessage());
            System.out.println("NO INSERTADO ...");
            return false;

        }
    }
    
    
    
    //METODO DE ACTUALIZAR REGISTROS
    public boolean upgrade(String REGISTRO,
            String GCC,
            String NOMBRE,
            String TIPO,
            String LIDER,
            String PLANTA,
            String MAQUINA,
            String LOTE,
            String TURNO,
            String FECHA_PROPUESTA,
            String ESTADO,
            String OBSERVACION,
            int SEMANA) {

        try {

            query = "UPDATE"
                    + " PLANEACIONES_VALIDACION"
                    + " SET "
                    + "  GCC_APR = '" + GCC + "',"
                    + "  NOMBRE_PROYECTO = '" + NOMBRE + "',"
                    + "  TIPO_VALIDACION = '" + TIPO + "',"
                    + "  LIDER_TECNICO = '" + LIDER + "',"
                    + "  PLANTA = '" + PLANTA + "',"
                    + "  MAQUINA = '" + MAQUINA + "',"
                    + "  LOTE = '" + LOTE + "',"
                    + "  TURNOS = '" + TURNO + "',"
                    + "  FECHA_PROPUESTA = '" + FECHA_PROPUESTA + "',"
                    + "  ESTADO_PROYECTO = '" + ESTADO + "',"
                    + "  OBSERVACIONES_VALIDACION = '" + OBSERVACION + "',"
                    + "  SEMANA = '" + SEMANA + "'"
                    + " WHERE"
                    + "  NUMERO_REGISTRO = " + REGISTRO + ";";

            sentencia.executeUpdate(query);
            System.out.println("ACTUALIZADO ...");

            return true;

        } catch (SQLException e) {

            System.err.println(e.getMessage());
            System.out.println("NO ACTUALIZADO ...");
            return false;

        }
    }

    //METODO DE ACTUALIZAR PREREQUISITOS CALIFICACION
    public boolean upgrade_pre_calificacion(String REGISTRO,
            String ESPECIFICACION,
            String PROTOCOLO,
            String NO_GXP,
            String LIBRO,
            String BR,
            String SOP,
            String HOJA,
            String RUTINA,
            String CERTIFICADO,
            String PLANOS,
            String MANUALES,
            String MATERIALES,
            String RECURSOS,
            String ENTRENAMIENTO) {

        try {

            query = "UPDATE"
                    + " PLANEACIONES_VALIDACION"
                    + " SET "
                    + "  PRE_CAL_ESPECIFICACION_EQUIPO = '" + ESPECIFICACION + "',"
                    + "  PRE_CAL_PROTOCOLOS = '" + PROTOCOLO + "',"
                    + "  PRE_CAL_RU_NO_GXP = '" + NO_GXP + "',"
                    + "  PRE_CAL_LIBRO_PARAMETROS = '" + LIBRO + "',"
                    + "  PRE_CAL_BR_ACTUALIZADO = '" + BR + "',"
                    + "  PRE_CAL_SOP = '" + SOP + "',"
                    + "  PRE_CAL_HOJA_VIDA = '" + HOJA + "',"
                    + "  PRE_CAL_RUTINA_MANTENIMIENTO = '" + RUTINA + "',"
                    + "  PRE_CAL_CERTIFICADO_MATERIALES = '" + CERTIFICADO + "',"
                    + "  PRE_CAL_PLANOS = '" + PLANOS + "',"
                    + "  PRE_CAL_MANUALES = '" + MANUALES + "',"
                    + "  PRE_CAL_MATERIALES = '" + MATERIALES + "',"
                    + "  PRE_CAL_RECURSOS = '" + RECURSOS + "',"
                    + "  PRE_CAL_ENTRENAMIENTOS = '" + ENTRENAMIENTO + "'"
                    + " WHERE"
                    + "  NUMERO_REGISTRO = " + REGISTRO + ";";

            System.out.println(query);

            sentencia.executeUpdate(query);
            System.out.println("ACTUALIZADO ...");

            return true;

        } catch (SQLException e) {

            System.err.println(e.getMessage());
            System.out.println("NO ACTUALIZADO ...");
            return false;

        }
    }

    //METODO DE ACTUALIZAR PREREQUISITOS PROCESO
    public boolean upgrade_pre_proceso(String REGISTRO,
            String CALIFICACION,
            String HFM,
            String ESPECIFICACION,
            String TEST,
            String PROTOCOLO,
            String MATERIALES,
            String DP,
            String DIAGRAMA,
            String FMEA,
            String PR,
            String PF,
            String RM,
            String PC,
            String CG,
            String FP) {

        try {

            query = "UPDATE"
                    + " PLANEACIONES_VALIDACION"
                    + " SET "
                    + "  PRE_PRO_CALIFICACION_IQOQPQ = '" + CALIFICACION + "',"
                    + "  PRE_PRO_ENTRENAMIENTO_HFM = '" + HFM + "',"
                    + "  PRE_PRO_ENTRENAMIENTO_ESPECIFICACION = '" + ESPECIFICACION + "',"
                    + "  PRE_PRO_ENTRENAMIENTO_TEST = '" + TEST + "',"
                    + "  PRE_PRO_ENTRENAMIENTO_PROTOCOLO = '" + PROTOCOLO + "',"
                    + "  PRE_PRO_MATERIALES = '" + MATERIALES + "',"
                    + "  PRE_PRO_DP = '" + DP + "',"
                    + "  PRE_PRO_DIAGRAMA = '" + DIAGRAMA + "',"
                    + "  PRE_PRO_FMEA = '" + FMEA + "',"
                    + "  PRE_PRO_PR = '" + PR + "',"
                    + "  PRE_PRO_PF = '" + PF + "',"
                    + "  PRE_PRO_RM = '" + RM + "',"
                    + "  PRE_PRO_PC = '" + PC + "',"
                    + "  PRE_PRO_CG = '" + CG + "',"
                    + "  PRE_PRO_FP = '" + FP + "'"
                    + " WHERE"
                    + "  NUMERO_REGISTRO = " + REGISTRO + ";";

            System.out.println(query);

            sentencia.executeUpdate(query);
            System.out.println("ACTUALIZADO ...");

            return true;

        } catch (SQLException e) {

            System.err.println(e.getMessage());
            System.out.println("NO ACTUALIZADO ...");
            return false;

        }
    }

    //METODO DE ACTUALIZAR REPROGRAMACION
    public boolean upgrade_reprogramacion(String REGISTRO,
            String FECHA,
            String OBSERVACIONES,
            String MOTIVO,
            int SEMANA) {

        try {

            query = "UPDATE"
                    + " PLANEACIONES_VALIDACION"
                    + " SET "
                    + "  FECHA_REPROGRAMACION = '" + FECHA + "',"
                    + "  MOTIVO_REPROGRAMACION = '" + MOTIVO + "',"
                    + "  ESTADO_PROYECTO = 'Reprogramado',"
                    + "  OBSERVACION_REPROGRAMACION = '" + OBSERVACIONES + "',"
                    + "  SEMANA = '" + SEMANA + "'"
                    + " WHERE"
                    + "  NUMERO_REGISTRO = " + REGISTRO + ";";

            System.out.println(query);

            sentencia.executeUpdate(query);
            System.out.println("ACTUALIZADO ...");

            return true;

        } catch (SQLException e) {

            System.err.println(e.getMessage());
            System.out.println("NO ACTUALIZADO ...");
            return false;

        }
    }

    //METODO PARA PROGRAMAR VALIDACION
    public boolean upgrade_programacion(String REGISTRO,
            String ESTADO,
            String OBSERVACION) {

        try {

            query = "UPDATE"
                    + " PLANEACIONES_VALIDACION"
                    + " SET "
                    + "  ESTADO_PROYECTO = '" + ESTADO + "',"
                    + "  OBSERVACIONES_VALIDACION = '" + OBSERVACION + "'"
                    + " WHERE"
                    + "  NUMERO_REGISTRO = " + REGISTRO + ";";

            sentencia.executeUpdate(query);
            System.out.println("ACTUALIZADO ...");

            return true;

        } catch (SQLException e) {

            System.err.println(e.getMessage());
            System.out.println("NO ACTUALIZADO ...");
            return false;

        }
    }

     //METODO PARA PROGRAMAR VALIDACION
    public boolean upgrade_reprogramacion(String REGISTRO,
            String ESTADO,
            String FECHA,
            String OBSERVACION) {

        try {

            query = "UPDATE"
                    + " PLANEACIONES_VALIDACION"
                    + " SET "
                    + "  ESTADO_PROYECTO = '" + ESTADO + "',"
                    + "  FECHA_REPROGRAMACION = '" + FECHA + "',"
                    + "  OBSERVACION_REPROGRAMACION = '" + OBSERVACION + "'"
                    + " WHERE"
                    + "  NUMERO_REGISTRO = " + REGISTRO + ";";

            sentencia.executeUpdate(query);
            System.out.println("ACTUALIZADO ...");

            return true;

        } catch (SQLException e) {

            System.err.println(e.getMessage());
            System.out.println("NO ACTUALIZADO ...");
            return false;

        }
    }
    
    //METODO PARA INSERTAR TIPO VALIDACION
    public boolean insert_tipo(
            String NOMBRE) {

        try {
            query = "INSERT INTO TIPO "
                    + "(ID_TIPO, NOMBRE_TIPO )"
                    + " VALUES "
                    + " (NULL,'" + NOMBRE.toUpperCase() + "')";

            sentencia.executeUpdate(query);
            System.out.println("INSERTADO ...");

            return true;

        } catch (SQLException e) {

            System.err.println(e.getMessage());
            System.out.println("NO INSERTADO ...");
            return false;

        }

    }
        
    //METODO PARA ACTUALIZAR TIPO VALIDACION
    public boolean upgrade_tipo(String ID,
            String NOMBRE) {

        try {
            query = "UPDATE"
                    + " TIPO "
                    + " SET "
                    + "  NOMBRE_TIPO = '" + NOMBRE + "'"
                    + " WHERE"
                    + "  ID_TIPO = " + ID + ";";

            sentencia.executeUpdate(query);
            System.out.println("INSERTADO ...");

            return true;

        } catch (SQLException e) {

            System.err.println(e.getMessage());
            System.out.println("NO INSERTADO ...");
            return false;

        }

    }
    
    //METODO PARA INSERTAR LIDER TECNICO
    public boolean insert_lider(
            String NOMBRE) {

        try {
            query = "INSERT INTO LIDER "
                    + "(ID_LIDER, NOMBRE_LIDER )"
                    + " VALUES "
                    + " (NULL,'" + NOMBRE + "')";

            sentencia.executeUpdate(query);
            System.out.println("INSERTADO ...");

            return true;

        } catch (SQLException e) {

            System.err.println(e.getMessage());
            System.out.println("NO INSERTADO ...");
            return false;

        }

    }   
    
    //METODO PARA ACTUALIZAR LIDER TECNICO
    public boolean upgrade_lider(String ID,
            String NOMBRE) {

        try {
            query = "UPDATE"
                    + " LIDER "
                    + " SET "
                    + "  NOMBRE_LIDER = '" + NOMBRE.toUpperCase() + "'"
                    + " WHERE"
                    + "  ID_LIDER = " + ID + ";";

            sentencia.executeUpdate(query);
            System.out.println("INSERTADO ...");

            return true;

        } catch (SQLException e) {

            System.err.println(e.getMessage());
            System.out.println("NO INSERTADO ...");
            return false;

        }

    }
         
    //METODO PARA INSERTAR PLANTAS
    public boolean insert_planta(
            String NOMBRE) {

        try {
            query = "INSERT INTO PLANTA "
                    + "(ID_PLANTA, NOMBRE_PLANTA )"
                    + " VALUES "
                    + " (NULL,'" + NOMBRE + "')";

            sentencia.executeUpdate(query);
            System.out.println("INSERTADO ...");

            return true;

        } catch (SQLException e) {

            System.err.println(e.getMessage());
            System.out.println("NO INSERTADO ...");
            return false;

        }

    }   
    
    //METODO PARA ACTUALIZAR PLANTAS
    public boolean upgrade_planta(String ID,
            String NOMBRE) {

        try {
            query = "UPDATE"
                    + " PLANTA "
                    + " SET "
                    + "  NOMBRE_PLANTA = '" + NOMBRE.toUpperCase() + "'"
                    + " WHERE"
                    + "  ID_PLANTA = " + ID + ";";

            sentencia.executeUpdate(query);
            System.out.println("INSERTADO ...");

            return true;

        } catch (SQLException e) {

            System.err.println(e.getMessage());
            System.out.println("NO INSERTADO ...");
            return false;

        }

    }
        
    //METODO PARA INSERTAR MAQUINA
    public boolean insert_maquina(
            String NOMBRE) {

        try {
            query = "INSERT INTO MAQUINA "
                    + "(ID_MAQUINA, NOMBRE_MAQUINA )"
                    + " VALUES "
                    + " (NULL,'" + NOMBRE + "')";

            sentencia.executeUpdate(query);
            System.out.println("INSERTADO ...");

            return true;

        } catch (SQLException e) {

            System.err.println(e.getMessage());
            System.out.println("NO INSERTADO ...");
            return false;

        }

    }   
    
    //METODO PARA ACTUALIZAR MAQUINA
    public boolean upgrade_maquina(String ID,
            String NOMBRE) {

        try {
            query = "UPDATE"
                    + " MAQUINA "
                    + " SET "
                    + "  NOMBRE_MAQUINA = '" + NOMBRE.toUpperCase() + "'"
                    + " WHERE"
                    + "  ID_MAQUINA = " + ID + ";";

            sentencia.executeUpdate(query);
            System.out.println("INSERTADO ...");

            return true;

        } catch (SQLException e) {

            System.err.println(e.getMessage());
            System.out.println("NO INSERTADO ...");
            return false;

        }

    }
    
    
      //METODO DE ACTUALIZAR ESTADOS
    public boolean upgrade_estado(
            String REGISTRO,
            String ESTADO,
            String OBSERVACION) {

        try {

            query = "UPDATE"
                    + " PLANEACIONES_VALIDACION"
                    + " SET "
                    + "  ESTADO_PROYECTO = '" + ESTADO + "',"
                    + "  OBSERVACIONES_VALIDACION = '" + OBSERVACION + "'"
                    + " WHERE"
                    + "  NUMERO_REGISTRO = " + REGISTRO + ";";

            sentencia.executeUpdate(query);
            System.out.println("ACTUALIZADO ...");

            return true;

        } catch (SQLException e) {

            System.err.println(e.getMessage());
            System.out.println("NO ACTUALIZADO ...");
            return false;

        }
    }   
    
     //METODO DE ACTUALIZAR ESTADOS
    public boolean upgrade_estado_EHS(
            String REGISTRO,
            String ESTADO,
            String OBSERVACION) {

        try {

            query = "UPDATE"
                    + " PLANEACIONES_VALIDACION"
                    + " SET "
                    + "  ESTADO_EHS = '" + ESTADO + "',"
                    + "  OBSERVACIONES_VALIDACION = '" + OBSERVACION + "'"
                    + " WHERE"
                    + "  NUMERO_REGISTRO = " + REGISTRO + ";";

            sentencia.executeUpdate(query);
            System.out.println("ACTUALIZADO ...");

            return true;

        } catch (SQLException e) {

            System.err.println(e.getMessage());
            System.out.println("NO ACTUALIZADO ...");
            return false;

        }
    }    
    
        //METODO PARA INSERTAR AUTORIZADO
    public boolean insert_autorizado(
            String NOMBRE) {

        try {
            query = "INSERT INTO AUTORIZADOS_EXCEPCIONES "
                    + "(ID_AUTORIZADO, NOMBRE_AUTORIZADO )"
                    + " VALUES "
                    + " (NULL,'" + NOMBRE + "')";

            sentencia.executeUpdate(query);
            System.out.println("INSERTADO ...");

            return true;

        } catch (SQLException e) {

            System.err.println(e.getMessage());
            System.out.println("NO INSERTADO ...");
            return false;

        }

    }   
    
    //METODO PARA ACTUALIZAR AUTORIZADO
    public boolean upgrade_autorizado(String ID,
            String NOMBRE) {

        try {
            query = "UPDATE"
                    + " AUTORIZADOS_EXCEPCIONES "
                    + " SET "
                    + "  NOMBRE_AUTORIZADO = '" + NOMBRE.toUpperCase() + "'"
                    + " WHERE"
                    + "  ID_AUTORIZADO = " + ID + ";";

            sentencia.executeUpdate(query);
            System.out.println("INSERTADO ...");

            return true;

        } catch (SQLException e) {

            System.err.println(e.getMessage());
            System.out.println("NO INSERTADO ...");
            return false;

        }

    }
    
    
    //METODO PARA ELIMINAR TIPO VALIDACION
    public boolean delete_lider(String REGISTRO) {

        try {

            query = "DELETE FROM LIDER WHERE ID_LIDER = " + REGISTRO + "";

            sentencia.executeUpdate(query);
            System.out.println("ELIMINADO ...");

            return true;

        } catch (SQLException e) {

            System.err.println(e.getMessage());
            System.out.println("NO ELIMINADO ...");
            return false;

        }
    }
        
    //METODO PARA ELIMINAR TIPO VALIDACION
    public boolean delete_maquinas(String REGISTRO) {

        try {

            query = "DELETE FROM MAQUINA WHERE ID_MAQUINA = " + REGISTRO + "";

            sentencia.executeUpdate(query);
            System.out.println("ELIMINADO ...");

            return true;

        } catch (SQLException e) {

            System.err.println(e.getMessage());
            System.out.println("NO ELIMINADO ...");
            return false;

        }
    }
    
    //METODO PARA ELIMINAR TIPO VALIDACION
    public boolean delete_planta(String REGISTRO) {

        try {

            query = "DELETE FROM PLANTA WHERE ID_PLANTA = " + REGISTRO + "";

            sentencia.executeUpdate(query);
            System.out.println("ELIMINADO ...");

            return true;

        } catch (SQLException e) {

            System.err.println(e.getMessage());
            System.out.println("NO ELIMINADO ...");
            return false;

        }
    }
    
    //METODO PARA ELIMINAR TIPO VALIDACION
    public boolean delete_tipo(String REGISTRO) {

        try {

            query = "DELETE FROM TIPO WHERE ID_TIPO = " + REGISTRO + "";

            sentencia.executeUpdate(query);
            System.out.println("ELIMINADO ...");

            return true;

        } catch (SQLException e) {

            System.err.println(e.getMessage());
            System.out.println("NO ELIMINADO ...");
            return false;

        }
    }
    
     //METODO PARA ELIMINAR AUTORIZADO
    public boolean delete_autorizado(String REGISTRO) {

        try {

            query = "DELETE FROM AUTORIZADOS_EXCEPCIONES WHERE ID_AUTORIZADO = " + REGISTRO + "";

            sentencia.executeUpdate(query);
            System.out.println("ELIMINADO ...");

            return true;

        } catch (SQLException e) {

            System.err.println(e.getMessage());
            System.out.println("NO ELIMINADO ...");
            return false;

        }
    }
    
      //METODO PARA ELIMINAR AUTORIZADO
    public boolean eliminacion_masiva(String fechaIncial, String fechaFinal) {

        try {

            query = "DELETE FROM PLANEACIONES_VALIDACION  WHERE FECHA_PROPUESTA BETWEEN '"+fechaIncial+"' AND '"+fechaFinal+"'";

            sentencia.executeUpdate(query);
            System.out.println("ELIMINADO ...");
            
            return true;

        } catch (SQLException e) {

            System.err.println(e.getMessage());
            System.out.println("NO ELIMINADO ...");
            return false;

        }
    }
    
}
