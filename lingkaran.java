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
public class lingkaran implements interbidang { //ambil interface interbidang
    
    private float jari2; //encap
    
    public lingkaran(float jari2){
        this.jari2 = jari2; //untuk akses dan manipulasi kelas boss ternyata. also to improve security 
    }                       //and clarity of the program
    
    public void setJari2(float jari2){
        this.jari2 = jari2; //setter
    }
    
    public float getJari2(){
        return jari2; //getter
    }
    

    @Override
    public float itungluas() {
        return (float) (Math.PI*jari2*jari2); //ambil interface interbidang
    }

    @Override
    public float itungkeliling() {
        return (float) (2*Math.PI*jari2);
    }
    
}
