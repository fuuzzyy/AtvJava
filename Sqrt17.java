public class Sqrt17 {
        public static void main(String[] args) {
            double numero = 0.001;

            double raizQuadrada = Math.sqrt(numero);

            double arredondado = Math.round(raizQuadrada * 1000.0) / 1000.0;

            System.out.println("A raiz quadrada de " + numero + " é aproximadamente " + arredondado);
        }
    }

