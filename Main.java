public class Main {

    public static void main(String[] args) {
        
        Ave pato = new Pato();
        AveVoadora pato2 = new Pato();
        AveVoadora patoVoador = (AveVoadora) pato;
        Ave pinguin = new Pinguin();
        Pato pato3 = new Pato();

        // Comportamento de todas as aves. Lembrando que elas foram instanciadas como "Ave", entao soh terao comportamento que herdaram de "Ave"
        pato.comer();
        pato.dormir();

        pinguin.comer();
        pinguin.dormir();

        // Comportamentos Especificos de uma ave que voa (EX: Pato instanciado de varias formas)
        pato2.comer();  /* == */ patoVoador.comer();
        pato2.dormir(); /* == */ patoVoador.dormir();
        pato2.voar();   /* == */ patoVoador.voar();
        pato3.comer();
        pato3.dormir();
        pato3.voar();
        
    }
}