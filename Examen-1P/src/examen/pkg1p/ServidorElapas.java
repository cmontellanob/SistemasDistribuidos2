package examen.pkg1p;
import java.io.*;
import java.net.*;


public class ServidorElapas {
    
        public static String pendientes(int idcliente)  {
        String aux="";    
            switch (idcliente){
            case 1:
            aux="2256-36,3516-26,4547-44";
            
            break;
            case 2:
            aux="1354-5,3252-17";
                
                break;
        }
        return aux;
    }
    
    public static void main(String[] args) throws InterruptedException{
        int port =5001; // puerto en el que escuchara el socket
        
        try {
            ServerSocket server = new ServerSocket(port); //instanciamos un servidor socket
            System.out.println("El servidor esta listo\n");
            
            Socket client;      
            BufferedReader fromClient;  // buffer de lectura
            PrintStream toClient;       // stream para escritura
            while(true){   // ciclo al infinito para elfuncionamiento del server
                client = server.accept(); // el servidorse queda esperando establecer conexion 
                fromClient = new BufferedReader(new InputStreamReader(client.getInputStream())); // el lector
                String cadena;
                cadena = fromClient.readLine(); //cadena obtenida desde el lector
                String[] cadenas=cadena.split("-");
                String respuesta="";
                if (cadenas[1].equals("fac"))
                {
                int idcliente=Integer.parseInt(cadenas[1]);
                respuesta=pendientes(idcliente);
                }
                else
                {
                 respuesta="Pagado";
                }
                toClient = new PrintStream(client.getOutputStream()); //prepara el objetopara devolver
                System.out.println(cadena+client.getInetAddress());
                toClient.flush(); // 
                toClient.println(respuesta);
                
            }
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
