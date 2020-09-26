/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

/**
 *
 * @author quanh
 */
public class hangdao {
    public ArrayList<hang> gethang(String tf) throws Exception{
        ArrayList<hang> ds = new ArrayList<hang>();
    // Mở file
        FileReader f = new FileReader(tf);
        BufferedReader g = new BufferedReader(f);
    // Duyệt file
        while(true){
            String st = g.readLine(); // st = "xang;20000"
            if(st == null || st == "") break;
            String [] t = st.split("[;]");// t[0] = "Xang", t[1] = "20000"
            hang h = new hang(t[0],Long.parseLong(t[1]));
            ds.add(h);
        }
        // Đóng file
        g.close();
        return ds;
    }
}
