import java.io.IOException;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        OSCheck oscheck = new OSCheck();
        Firewall firewall = new Firewall("", "" );
        Data data = new Data();

        oscheck.updateIPFS();

        System.out.println("Adding you to the whitelisted network... - Your ID is : " + firewall.getPlainIP());
        firewall.getHostname();
        data.connect();
    }
}
