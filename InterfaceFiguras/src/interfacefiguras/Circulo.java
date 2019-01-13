
package interfacefiguras;


public class Circulo implements Figura {
    
    private float diametro;
    
    public Circulo(float diametro){
        this.diametro = diametro;
    
    }

    @Override
    public float area() {              
        return (PI*diametro*diametro/4f);       
    }
}
