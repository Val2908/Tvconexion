package PConexiones;



/**
 * Class Wifi
 */
public class ConexionWifi extends Conexion{
String SSID;
String clave;
String usuario;
  //
  // Fields
  //

 /*
  
  Ver super clase Conexion 
    
  private String SSID;
  private String clave;
  private String usuario;*/
  
  //
  // Constructors
  //
  //Herrera improvement public Wifi () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

    public ConexionWifi(String SSID, String clave, String usuario) {
        this.SSID = SSID;
        this.clave = clave;
        this.usuario = usuario;
    }

  

}
