import java.net.*;  
import java.io.*;  

class DemoClient{  
    public static void main(String args[])throws Exception{ 

        //Socket(String hostName, int port)
        Socket socket = new Socket("localhost",10009);
        
        DataInputStream din = new DataInputStream(socket.getInputStream());

        DataOutputStream dout = new DataOutputStream(socket.getOutputStream());
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = "";
        String str2 = "";

        while(!str.equals("stop")){
            str = br.readLine();
            dout.writeUTF(str);
            dout.flush();
            str2 = din.readUTF();
            System.out.println("Server says: " + str2);

        }

        din.close();
        dout.close();
        socket.close();
    }
}