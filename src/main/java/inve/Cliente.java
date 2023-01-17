package inve;

public class Cliente {
    public static void main (String[] args)
    {
        Internet internet = new ProxyInternet();
        try
        {
            internet.conectarse("facebook.com");
            internet.conectarse("abc.com"); //niega entrada porque esta en lista de baneados
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
