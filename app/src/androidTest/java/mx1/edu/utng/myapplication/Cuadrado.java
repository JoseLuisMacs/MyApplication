package mx1.edu.utng.myapplication;

/**
 * Created by Jose on 22/1/2016.
 */
public class Cuadrado extends Figura{
    private float lado;
    @Override
    public float calcularArea() {
        return (lado * lado);
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado=lado;
    }
}
