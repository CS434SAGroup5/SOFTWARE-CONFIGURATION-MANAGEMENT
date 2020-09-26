  /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laptrinhSocket;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author quanh
 */
public class GuiNhan {
    DatagramSocket Sserver;
    public void MoCong(int cong) throws Exception{
       Sserver = new DatagramSocket(cong);
        System.out.println("Server đã mở cổng: "+ cong);
    }
    public String Nhan() throws Exception{
//        System.out.println("Server đang đợi client nối tới");
//       Socket s = Sserver.accept();// lặp vô hạn để đợi
//       System.out.println("Đã có 1 client nối tới");
//       //Tạo luồng để nhận thông tin client gửi lên
//       InputStreamReader is = new InputStreamReader(s.getInputStream());
//        //Tạo bộ đệm để lưu dữ liệu nhận về
//       BufferedReader r = new BufferedReader(is);
//       return r.readLine();
            byte bodem[] = new byte[256];//Tạo ra bộ đệm để nhận dữ liệu về
            DatagramPacket dr = new DatagramPacket(bodem,bodem.length);
            Sserver.receive(dr);//đợi 1 kết nối đến
            System.out.println("Dang cho");
            String st = new String(dr.getData()).trim();//lấy dư liệu về và đỏi sang chuỗi
            System.out.println(st+"Nhan tu may:oi"+dr.getAddress().getHostName()); 
            return st;
    }
    public void Gui(String data, String ip,int port) throws Exception{
//        Socket c = new Socket(ipServer,cong);
//        System.out.println("Đã nối đến Server: " + ipServer);
//        //Tạo luồng để gửi dữ liệu lên Server
//        DataOutputStream out = new DataOutputStream(c.getOutputStream()); 
//        out.writeBytes(data);// Gửi thông báo
//        out.write(13);
//        out.write(10);
//        c.close();
          try {
                DatagramSocket ds = new DatagramSocket();
                byte bodem[] = new byte[256];
                bodem = data.getBytes();
                InetAddress mc = InetAddress.getByName(ip);
                DatagramPacket dr = new DatagramPacket(bodem,bodem.length,mc,port);
                ds.send(dr);//gửi dữ liệu đi
                System.out.println("Da gui");
                ds.close();
        } catch (Exception e) {
              e.printStackTrace();
        }
  
    }
    public String N() throws Exception{
//       System.err.println("Client đang đợi server nối tới");
//       Socket s = Sserver.accept();// lặp vô hạn để đợi
//       System.out.println("Đã có 1 server nối tới");
//         InputStreamReader is = new InputStreamReader(s.getInputStream());
//        //Tạo bộ đệm để lưu dữ liệu nhận về
//       BufferedReader r = new BufferedReader(is);
//       return r.readLine();
            try {
            DatagramSocket dg = new DatagramSocket(1261);//tạo cổng 1260
            byte bodem[] = new byte[256];//Tạo ra bộ đệm để nhận dữ liệu về
            DatagramPacket dr = new DatagramPacket(bodem,bodem.length);
            while (true) {                
                dg.receive(dr);//đợi 1 kết nối đến
                System.out.println("Dang cho");
                String st = new String(dr.getData()).trim();//lấy dư liệu về và đỏi sang chuỗi
                System.out.println(st+"Nhan tu may:oi"+dr.getAddress().getHostName());
            }
        } catch (Exception e) {
            System.out.println(e);
            return "";
        }
    }
    public void G(String data, String ipClient,int c) throws Exception{
//        Socket a = new Socket(ipClient,c);
//        System.out.println("Đã nối đến Client:" + ipClient);
//        DataOutputStream out = new DataOutputStream(a.getOutputStream()); 
//        out.writeBytes(data);// Gửi thông báo
//        out.write(13);
//        out.write(10);
//        a.close();
 try {
            DatagramSocket dg = new DatagramSocket();//Tạo ra 1 Datagram Socket để gửi
               byte bodem[] = new byte[256];
               bodem = data.getBytes();
               InetAddress ip = InetAddress.getByName("thancongdat-laptop");
               DatagramPacket dr = new DatagramPacket(bodem,bodem.length,ip,1261);
               dg.send(dr);//gửi dữ liệu đi
              System.out.println("Da gui");
        } catch (Exception tt) {
              System.out.println(tt);
        }
    }
}
