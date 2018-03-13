import java.io.IOException;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        Firewall firewall = new Firewall("", "" );
        Data data = new Data();

        System.out.println("Adding you to the whitelisted network... - Your ID is : ");
        System.out.println(firewall.getPlainIP());
        firewall.getHostname();
        data.connect();
    }
}
