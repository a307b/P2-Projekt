import java.io.IOException;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        //OSCheck oscheck = new OSCheck();
        IpfsFirewall firewall = new IpfsFirewall("", "" );
        IpfsCore ipfsCore = new IpfsCore();

        OSCheck.updateIPFS();

        System.out.println("Adding you to the whitelisted network... - Your ID is : " + firewall.getPlainIP());
        firewall.getHostname();
        //ipfsCore.connect();
    }
}
