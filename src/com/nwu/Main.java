package com.nwu;

import java.io.FileInputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
	// write your code here
        try {
            // 创建文件输入流对象
            FileInputStream is = new FileInputStream("src/test.dex");
            // 设定读取的字节数
            int n = 4;
            byte buffer[] = new byte[n];
            // 读取输入流
            is.read(buffer, 0, n);
            System.out.print(new String(buffer));
//            while ((is.read(buffer, 0, n) != -1) && (n > 0)) {
//                System.out.print(new String(buffer));
//            }
//            System.out.println();
            // 关闭输入流
            is.close();
        } catch (IOException ioe) {
            System.out.println(ioe);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
