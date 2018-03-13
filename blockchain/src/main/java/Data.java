import io.ipfs.api.IPFS;
import java.io.IOException;

public class Data
{
    protected void connect() throws IOException
    {
        Firewall firewall = new Firewall("","");
        if (firewall.getPlainIP().equals("DESKTOP-AA5PGMG/192.168.56.1"))
        {
            IPFS ipfs = new IPFS("/ip4/127.0.0.1/tcp/5001");
            ipfs.refs.local();
            System.out.println("Connected to the network");
        }

    }

}
