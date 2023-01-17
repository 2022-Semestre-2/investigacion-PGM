package inve;

public class RealInternet implements Internet{
    @Override
    public void conectarse(String serverhost)
    {
        System.out.println("Conectandose a "+ serverhost);
    }
}
