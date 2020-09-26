/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author quanh
 */
public class donvibean {
    private String madv;
    private String tendv;

    public donvibean(String madv, String tendv) {
        this.madv = madv;
        this.tendv = tendv;
    }

    public donvibean() {
    }

    public String getMadv() {
        return madv;
    }

    public void setMadv(String madv) {
        this.madv = madv;
    }

    public String getTendv() {
        return tendv;
    }

    public void setTendv(String tendv) {
        this.tendv = tendv;
    }
    
}
