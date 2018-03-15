import io.ipfs.api.IPFS;
import java.io.IOException;

public class IpfsCore
{
    protected void connect() throws IOException
    {
        IpfsFirewall firewall = new IpfsFirewall("","");
        if (firewall.getPlainIP().equals("h187.net2.klient.str.site.aau.dk/172.24.24.187"))
        {
            IPFS ipfs = new IPFS("/ip4/127.0.0.1/tcp/5001");
            ipfs.refs.local();
            System.out.println("Connected to the network");
        }

    }

}
