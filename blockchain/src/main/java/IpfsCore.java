import io.ipfs.api.IPFS;
import io.ipfs.multihash.Multihash;

import java.io.IOException;

public class IpfsCore
{
    private String fileHash;
    private IPFS ipfs = new IPFS("/ip4/127.0.0.1/tcp/5001");

    protected IpfsCore(String fileHash) {
        this.fileHash = fileHash;
    }

    protected void setFileHash(String fileHash) {
        this.fileHash = fileHash;
    }

    protected String getFileHash() {
        return fileHash;
    }

    protected void connect()
    {
        try {
            ipfs.refs.local();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Connected to the network");
    }

    protected void getFile(String fileHash)
    {
        Multihash filePointer = Multihash.fromBase58(fileHash);
        try {
            byte[] fileContents = ipfs.cat(filePointer);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    protected void addFile()
    {

    }



}
