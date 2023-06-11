package Networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ClientTest {
    String Host;
    Socket soc;

    public ClientTest(String phost) throws IOException {
        this.Host = phost;
    }

    public void getDate() throws IOException {
        soc = new Socket(Host, 13);
        BufferedReader br = new BufferedReader(new InputStreamReader(soc.getInputStream()));
        System.out.println(br.readLine());
        br.close();
        soc.close();
    }

    public static void main(String[] args) throws IOException {
        ClientTest ct = new ClientTest(args[0]);
        ct.getDate();
    }
}