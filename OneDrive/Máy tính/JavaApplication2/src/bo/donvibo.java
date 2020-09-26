/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo;

import bean.donvibean;
import dao.donvidao;
import java.util.ArrayList;

/**
 *
 * @author quanh
 */
public class donvibo {
    donvidao dvdao = new donvidao();
    public ArrayList<donvibean> getdv(){
    return dvdao.getdv();
    }
}
