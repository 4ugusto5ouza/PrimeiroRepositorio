public class GalToLit {
    public static void main(String[] args) {
        double galao, litro;
        int cont;

        cont = 0;
        for (galao = 1; galao <= 100; galao++) {
            litro = galao * 3.7854;
            System.out.println(galao + " galões equivale a " + litro + " litros.");

            cont++;
            if (cont == 10) {
                System.out.println();
                cont = 0;
            }
        }
    }    
}