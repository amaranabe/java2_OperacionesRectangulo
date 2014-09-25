/*
 * Clase para obtener resultados del per�metro y �rea de un rectangulo.
 */
public class Rectangulo {

		private double base = -1;
		private double altura = -1;
				
				public double getBase() 
				{
								return base;
				} 
				public double getAltura() 
				{
								return altura;
				} 
				public void setBase (double _base) 
				 {
								base=_base;
				 } 
				public void setAltura (double _altura) 
				{
								altura=_altura;
				}
				//Metodo que calcula el per�metro (.
				 public double perimetro () 
				 {
								double result;
								result = 2 *(this.getBase() + this.getAltura());
								return result;
				 }
				 
				//Metodo que calcula el area (base*altura).
				 public double area () 
				 {
								double result;
								result	= this.getBase() * this.getAltura();
								return result;
				 }

}

