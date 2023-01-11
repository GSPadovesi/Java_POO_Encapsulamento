package f1;

public class Correr {
	public static void main(String[] args) {
		Corredor c[] = new Corredor[11];
		c[0] = new Corredor("Lewis Hamilton", "Reino Unido", 38, "Mercedes-AMG Petronas Formula One Team", 20, 2, 5);
		c[1] = new Corredor("George Russell", "Reino Unido", 24, "Mercedes-AMG Petronas Formula One Team", 10, 5, 9);
		c[2] = new Corredor("Valtteri Bottas", "Finlandia", 33, "Alfa Romeo F1 Team Orlen", 8, 3, 3);
		c[3] = new Corredor("Nyck de Vries", "Holanda", 27, "Scuderia AlphaTauri", 9, 0, 6);
		c[4] = new Corredor("Pierre Gasly", "Franca", 26, "BWT Alpine F1 Team", 5, 5, 0);
		c[5] = new Corredor("Fernando Alonso", "Espanha", 41, "Aston Martin Aramco Cognizant Formula One Team", 3, 6, 3);
		c[6] = new Corredor("Charles Leclerc", "Monaco", 25, "Scuderia Ferrari", 8, 2, 3);
		c[7] = new Corredor("Kevin Magnussen", "Dinamarca", 30, "Haas F1 Team", 7, 7, 0);
		c[8] = new Corredor("Lando Norris", "Reino Unido", 23, "McLaren F1 Team", 9, 2, 5);
		c[9] = new Corredor("Max Verstappen", "Holanda", 25, "Oracle Red Bull Racing", 10, 5, 0);
		c[10] = new Corredor("Logan Sargeant", "Estados Unidos", 22, "Williams Racing", 3, 4, 8);
		
		Corrida f1 = new Corrida();
		
		f1.marcarCorrida(c[0], c[4]);
		f1.correr();
		
	}
	
}
