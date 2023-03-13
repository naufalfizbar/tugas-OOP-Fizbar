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
public class persegipanjang implements interbidang{ //implements ambil dari interface bidang
    private float panjang; //encapsulation
    private float lebar;
    
    public persegipanjang(float panjang, float lebar){
        this.panjang = panjang; //this buat mengubah nilai atribut panjang
        this.lebar = lebar;     // biar apa dirubah? saya masih kurang paham. tapi biar enak kali
    }
    
    public void setPanjang(float panjang){
        this.panjang = panjang; //setter
    }
    
    public void setLebar(float lebar){
        this.lebar = lebar; 
    }
    
    public float getPanjang(){
        return panjang; //getter
        
    }
    
    public float getLebar(){
        return lebar;
    }
    

    @Override //ambil interface interbidang
    public float itungluas() {
        return panjang * lebar;
    }

    @Override
    public float itungkeliling() {
        return 2*(panjang + lebar);
    }
    
}
