package fils;


/**
 * Classe que crea dos fils i els executa. S'executen concurrentment, 
 * però a cada iteració donen la oportunitat d'executar-se a l'altra fil
 * bloquejant-se mitjançant el mètode yield
 *  
 * @author sergi grau
 * @version 1.0, 28.01.2010
 * 
 */


public class ExerciciFils4 {

	private static Runnable runnable1= new Fil("fil1");
	private static Runnable runnable2= new Fil("fil2");
	
	public static void main(String[] args) {

		
		Thread fil1= new Thread(runnable1);
		Thread fil2= new Thread(runnable2);
		fil1.start(); //no run()
		fil2.start(); //no run()
	}

	/**
	 * Classe interna estàtica que implementa la interfície Runnable
	 * Representa un fil que escriu 1000 digits i
	 * acaba. utilitza el mètode de classe yield per bloquejar un Fil
	 * i permetre que el planificador de fils seleccioni l'altre
	 * 
	 * @author sergi grau
	 * @version 1.0, 28.01.2010
	 */
	public static class Fil implements Runnable {

		private String nom;
		/**
		 * Constructor amb 1 paràmetre
		 * @param nom nom del fil
		 */
		public Fil(String nom){
			this.nom= nom;
		}
		/* (non-Javadoc)
		 * @see java.lang.Runnable#run()
		 */
		@Override
		public void run() {
			for (int i = 0; i < 1000; i++) {
				System.out.println(i + "-" + nom);
				Thread.yield();
			}
			System.out.println("final" + nom);

			
		}

	}
}
