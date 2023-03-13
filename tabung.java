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
public class tabung extends lingkaran implements interruang {
    
    private float tinggiTabung; //encapsulasi
    
    public tabung(float jari2, float tinggiTabung){ 
        super(jari2); //ambil parent dari lingkaran
        this.tinggiTabung = tinggiTabung;
        
    }
    
    public void setTinggiTabung(float tinggiTabung){ //setter
        this.tinggiTabung = tinggiTabung;
    }
    
    public float getTinggiTabung(){ //getter
        return tinggiTabung;
    }
    
    
    
    

    @Override // ambil interface ruang interruang
    public float itungvolume() {
       return (float) (Math.PI * super.getJari2() * super.getJari2() * tinggiTabung);
    }

    @Override
    public float itungLpermukaan() {
       return (float) (2 * Math.PI * super.getJari2() * (super.getJari2() + tinggiTabung));
    }
    
}
