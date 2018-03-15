import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        OSCheck.updateIPFS();
        IpfsCore ipfsCore = new IpfsCore("");
        System.out.println("Please enter file to get : ");
        ipfsCore.setFileHash(sc.nextLine());
        ipfsCore.connect();
        ipfsCore.getFile(ipfsCore.getFileHash());
    }
}
