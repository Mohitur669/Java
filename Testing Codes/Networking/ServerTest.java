package Networking;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class ServerTest {
    private ServerSocket ss;

    public ServerTest() throws IOException {
        ss = new ServerSocket(13, 5);
    }

    public void serve() throws IOException {
        Socket s = null;
        s = ss.accept();
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        out.write("Day & Time: " + new Date().toString());
        out.close();
    }

    public static void main(String[] args) throws IOException {
        ServerTest st = new ServerTest();
        for (; ; ) {
            st.serve();
        }
    }
}