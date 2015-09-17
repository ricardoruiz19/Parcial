package parcial;

public class Circulo {

    Double radio;
    Double arearadio;
    Double pi = 3.1415;
    Double resultado;

    
    public Circulo() {
        
    }
    public Circulo(Double radio) {
        this.radio = radio;
    }

    /**
     * 
     * @return Double retorna el area del circulo
     */
    public Double calculararea() {
        arearadio = pi * radio * radio;
        return arearadio;

    }

}
