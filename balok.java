/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspertama;

/**
 *
 * @author Naufal Akbar
 */
public class balok extends persegipanjang implements interruang {
     
    private float tinggi; //encap
    
    public balok(float panjang, float lebar, float tinggi){
        super(panjang, lebar); //ambil parent dari segi panjang
        this.tinggi = tinggi;
    }
    
    public void setTinggi(float tinggi){
        this.tinggi = tinggi; //setter
    }
    
    public float getTinggi(){
        return tinggi; //getter
    }

    @Override
    public float itungvolume() {
        return super.getPanjang() * super.getLebar() * tinggi; //ambil interruang
    }

    @Override
    public float itungLpermukaan() {
        return 2*(super.getPanjang() + super.getLebar() + tinggi);
    }
    
}
