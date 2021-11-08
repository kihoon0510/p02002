package ioStream;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class DataOutputStreamEx {
	public static void main(String[] args) {
		ByteArrayOutputStream bos = null;
		DataOutputStream dos = null;
		
		byte[] result = null;
		
		try {
			bos = new ByteArrayOutputStream();
			dos = new DataOutputStream(bos);
			
			dos.writeInt(10);
			dos.writeFloat(20.0f);
			dos.writeBoolean(true);
			
			result = bos.toByteArray();
			
			String[] hex = new String[result.length];
			
			for(int i=0;i<result.length;i++) {
				if(result[i] < 0) {
					hex[i] = String.format("%02x", result[i]+256);
				}else {
					hex[i] = String.format("%02x", result[i]);
				}
			}
			
			System.out.println("10진수 :"+Arrays.toString(result));
			System.out.println("16진수 :"+Arrays.toString(hex));
			
			FileInputStream fis = new FileInputStream("sample.dat");
			DataInputStream dis = new DataInputStream(fis);
			
			System.out.println(dis.readInt());
			System.out.println(dis.readFloat());
			System.out.println(dis.readBoolean());
			dis.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		int[] score = {100, 90, 95, 85, 50};
		
		try {
			FileOutputStream fos = new FileOutputStream("score.dat");
			dos = new DataOutputStream(fos);
			
			for(int i=0; i<score.length;i++) {
				dos.writeInt(score[i]);
			}
			dos.close();
			
			FileInputStream fis2 = new FileInputStream("score.dat");
			DataInputStream dis2 = new DataInputStream(fis2);
			
			for(int i=0; i<score.length;i++) {
				System.out.println(dis2.readInt());
			}
			dis2.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
