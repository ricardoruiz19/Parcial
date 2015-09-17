package parcial;

public class Hipotenusa {
    double cateto1, cateto2, hipotenusa;
    public double hipotenusa(double cateto1,double cateto2){
    hipotenusa = Math.sqrt(Math.pow(cateto1,2) + Math.pow(cateto2,2));
    return hipotenusa;
    }
    
}
