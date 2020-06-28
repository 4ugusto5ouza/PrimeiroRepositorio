/*
Tente isto 2-1
Calcule a distância da queda de um raio
cujo som leve 7,2 segundos
para alcançá-lo.
*/

public class DistRelampago {
    public static void main(String[] args) {
        double tRelampago;
        double pesSom;
        double dRelampago;

        tRelampago = 7.2;
        pesSom = 1100 ;

        dRelampago = (tRelampago * pesSom);

        System.out.println("A distância do relâmpago é: " + dRelampago + "Km");
    }    
}