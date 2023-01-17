package inve;

public class InternetReal implements Internet{
    @Override
    public void conectarse(String serverhost)
    {
        System.out.println("Conectandose a "+ serverhost);
    }
}
