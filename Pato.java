public class Pato implements AveVoadora {

    @Override
    public void comer() {
        System.out.println("O pato esta comendo...");
    }

    @Override
    public void dormir() {
        System.out.println("O pato esta dormindo...");
    }

    @Override
    public void voar() {
        System.out.println("O pato esta voando...");
    }
}
