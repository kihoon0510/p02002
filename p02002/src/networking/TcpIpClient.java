package networking;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ConnectException;
import java.net.Socket;

public class TcpIpClient {
	public static void main(String[] args) {
		try {
			String serverIp = "192.168.0.2";
			System.out.println("서버에 연결중. 서버IP: " +serverIp);
			
			Socket socket = new Socket(serverIp, 7777);
			
			InputStream in = socket.getInputStream();
			DataInputStream dis = new DataInputStream(in);
			
			System.out.println("서버로부터 받은 메시지: "+dis.readUTF());
			System.out.println("연결을 종료합니다");
			dis.close();
			socket.close();
			System.out.println("연결 종료.");
		}catch(ConnectException ce) {
			ce.printStackTrace();
			System.out.println("연결 실패.");
		}catch(IOException ie) {
			ie.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
