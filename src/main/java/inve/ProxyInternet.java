package inve;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet{
    private Internet internet = new InternetReal();
    private static List<String> sitiosBaneados;
      
    static
    {
        sitiosBaneados = new ArrayList<String>();
        sitiosBaneados.add("abc.com");
        sitiosBaneados.add("def.com");
        sitiosBaneados.add("ijk.com");
        sitiosBaneados.add("lnm.com");
    }
      
    @Override
    public void conectarse(String hostServer) throws Exception   
    {
        if(sitiosBaneados.contains(hostServer.toLowerCase()))       //para que detecte el sitio sin importar si tiene minusculas o mayusculas
        {
            throw new Exception("Acceso denegado");     //saca error si se intenta conectar a uno baneado
        }
          
        internet.conectarse(hostServer);
    }
}
