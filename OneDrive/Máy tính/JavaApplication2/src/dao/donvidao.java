/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.donvibean;
import java.util.ArrayList;

/**
 *
 * @author quanh
 */
public class donvidao {
    public ArrayList<donvibean> getdv(){
        ArrayList<donvibean> ds = new ArrayList<donvibean>();
        donvibean dv = new donvibean("01","cntt");
        ds.add(dv);
        dv = new donvibean("02","toan");
        ds.add(dv);
        return ds;
    }
}
