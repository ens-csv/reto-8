
import java.io.IOException;

public class Excepciones {

	public double ladoA;
	public double ladoB;
	public boolean esValido;

	public double getLadoA() {
		return this.ladoA;
	}

	public void setLadoA(double ladoA) {
		this.ladoA = ladoA;
	}

	public double getLadoB() {
		return this.ladoB;
	}

	public void setLadoB(double ladoB) {
		this.ladoB = ladoB;
	}

	public boolean getEsValido() {
		return this.esValido;
	}

	public void setEsValido(boolean esValido) {
		this.esValido = esValido;
	}

        public double CalculaHipotenusa(double a, double b) throws IOException {
            double c = Math.sqrt(Math.pow(a, 2)+ Math.sqrt(Math.pow(b, 2)));
            return c;
        }

        private boolean ValidaDatos(double a, double b)throws NumberFormatException {
            boolean igual=false;
                if(a==b){
                    igual=true;
                }
            return igual;
        }

}
