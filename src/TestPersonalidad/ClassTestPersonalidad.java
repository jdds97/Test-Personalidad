
package TestPersonalidad;

import javax.swing.JOptionPane;

/**
 * Aquí declaramos las arrays y variables de estas para el recopilador
 */
public class ClassTestPersonalidad {
	
//Declaramos las variables de manera estática para poder utilizarlas en ambos metodos 
//y no tener que declararlas otra vez
	
//Para el metodo menu
		static String eleccionUsuario;
		
//Para el metodo test y recopilador
		
//-Array para las 10 preguntas del test
		static String[] pregunta = new String[10];
	
//-Array para las respuestas de las preguntas 
		static int redesSociales[] = { 0, 0, 0, 0 };
	
//-Variables para array redesSociales[] para entender lo que estamos sumando
		static int instagram = 0;
		static int twitter = 1;
		static int tikTok = 2;
		static int twitch = 3;
	
	
//-Variable boolean para las preguntas para que condicione el que siga los bucles o no
		static boolean acertado = false;
		
//-Strings para el recopilador
		static String primerValor;
		static String ultimoValor;
		static String mensajeUsual;
		static String mensajeInusual;
		
	
	

	/**
	 * Este es el metodo principal del Proyecto
	 *
	 * @param args
	 */
	public static void main(String[] args) {
	
// Llamada al método menu
		menu();
		}

	/**
	 * Este metodo inicia el menu
	 */
	static void menu() {
// Declaracion de variable para la elecccion del usuario para su posterior respuesta
		
		eleccionUsuario = JOptionPane.showInputDialog(
				"Bienvenido al menu de Inicio\n " + "1.Realizar Test,PULSE 1\n " + "2.Ver creditos,PULSE 2\n "
						+ "3. Salir del programa,PULSE 3\n\n" + "Indique aquí a continuacin la opcion deseada");
		switch (eleccionUsuario) {
		case "1":
		case "test": {
			test();
		}
			break;
		case "2":
		case "créditos": {
			creditos();
		}
			break;
		case "3":
		case "salir": {
			JOptionPane.showMessageDialog(null, "Fin del programa");

			break;
		}

		default: {
			JOptionPane.showMessageDialog(null, "Respuesta Incorrecta responda de nuevo");
			menu();
		}
		}
	}

	/**
	 * Este metodo inicia los creditos de nuestro grupo
	 */
	static void creditos() {
// Resultado de los creditos
		JOptionPane.showMessageDialog(null,
				"Test de Personalidad\n " + "\t\t\t Asignatura:Programacion\n\n " + "\t\t\t Eduardo Romero Otero \n "
						+ "\t\t\t Alberto Asuaje Nunes \n " + "\t\t\t Jesus De Dios Sanchez \n ");
		JOptionPane.showMessageDialog(null, "Gracias por tu atencion");

// Vuelta hacia el menu
		menu();
	}

	/**
	 * Este metodo inicia el test de personalidad
	 * 
	 * 
	 */
	static void test() {
//Mensaje bienvenida test
		
		JOptionPane.showMessageDialog(null,
				"Para empezar vamos a hacerte una serie de cuestiones para analizar el tipo de red social con la cual mas te asemejas y la que mas utilizes\n"
						+ "Para responder necesitamos que respondas con las letras a,b,c y d para un correcto resultado\n"
						+ "Si hay faltas de ortografía es para evitar que este ejemplo de tilde no nos pase en el test\n"
						+ "¡Que lo disfrutes!\n " 
						+ "	Pulsa ENTER o la tecla OK para continuar");

		do {

// Nos metemos dentro del método para las preguntas
// Si la condicion dentro del metodo no se cumple al terminar las preguntas este pasa al recopilador		
			preguntas(acertado);
			
// Cuando se han recopilado todos los datos en base a las preguntas y respuestas
// llamamos al metodo recopilador con los datos ya obtenidos.
			
			recopilador(redesSociales);
			
		} while (!acertado);
//Cuando la condicion acertado termine en el recopilador salta al menu para preguntar de nuevo que queremos hacer con el test
		menu();
		

	}

	/**
	 * Este metodo hace la condicion de cada pregunta en funcion de su valor asigna
	 * un valor a las variables instagram,twitter,tikTok y twitch para su posterior
	 * resultado del test.
	 *
	 * @param respuesta
	 * @param pregunta
	 * @param acertado
	 * @return acertado
	 */
	static boolean preguntas(boolean acertado) {
//Declaramos las preguntas para saber su contenido mas adelante
		
		pregunta[0] = "1.¿Para que utilizas las redes sociales?\n "
						+ "a. Las utilizo para mantener el contacto con mis amigos que no veo desde hace rato.\n "
						+ "b.Las uso para inspirarme cuando quiero tomarme fotos, maquillarme, hacer un peinado o comprar un outfit nuevo.\n "
						+ "c.Más que todo para entretenerme y reír, pero también soy fan de hacer tutoriales que veo en redes.\n"
						+ "d.Ver vídeos de eventos en directo\n\n"
						+"Indique aqui su respuesta";
		pregunta[1] = "2.Cuando haces un video con cancion para compartirlo en las redes sociales¿Que prefieres hacer con el?\n "
						+ "a.Editarlo con una buena cancion y un buen efecto\n "
						+ "b.Compartirlo sin mas para que se vea al instante \n "
						+ "c.Enviarlo a tus amigos para que lo imiten \n"
						+ "d.Lo compartes en directo reaccionando a el\n\n"
						+"Indique aqui su respuesta";
		pregunta[2] = "3.¿Que te gusta compartir con tus amigos atraves de redes sociales?\n "
						+ "a.Fotos de paisajes o de las veces que sales con tus amigos\n "
						+ "b.Noticias de actualidad o memes \n " 
						+ "c.Bailes virales de canciones famosas\n"
						+ "d.Reacciones de videos o videojuegos en directo\n\n"
						+"Indique aqui su respuesta";
		pregunta[3] = "4.Cuando sales de viaje y quieres publicar contenido ¿Que prefieres hacer?\n "
						+ "a.Hacer fotos a los sitios mas emblematicos \n "
						+ "b.Hacer una recopilacion detallada de los lugares mas interesantes \n "
						+ "c.Te diviertes grabandote un video bailando con tus amigos \n"
						+ "d.Retransmites en directo cuando quieres que los demas comenten donde estes\n\n"
						+ "Indique aqui su respuesta";
		pregunta[4] = "5.Cuando quieres saber de una noticia importante ¿A que red social acudes?\n "
						+ "a.Instagram\n " 
						+ "b.Twitter\n " 
						+ "c.TikTok\n" 
						+ "d.Twitch\n\n"
						+"Indique aqui su respuesta";
		pregunta[5] ="6.Cuando quieres ver un video en directo ¿Que red social prefieres abrir?\n "
						+ "a.Instagram\n " 
						+ "b.Twitter\n " 
						+ "c.TikTok\n" 
						+ "d.Twitch\n\n"
						+"Indique aqui su respuesta";
		pregunta[6] = "7.¿Cuando utilizas mas la camara de tu movil?\n "
						+ "a.Cuando me he arreglado y quiero tomarme unas cuantas fotos \n "
						+ "b.Cuando estoy de viaje y necesito documentar todo lo que hago\n "
						+ "c.Cuando estoy con mis amigos y hacemos cosas graciosas o divertidas.\n" 
						+ "d.Cuando estoy en un evento importante que quiero compartir al instante\n\n"
						+ "Indique aqui su respuesta";
		pregunta[7] = "8.Si pudieras escoger un plan perfecto, ¿como seria?\n "
						+ "a.Mi plan perfecto sería un roadtrip con mis amigos, donde viajamos a distintas ciudades, exploramos lugares unicos, salimos de fiesta en la noche y disfrutamos de la piscina en la mañana. \n " 
						+ "b.Mi pareja me invita a una cita sorpresa, cocina mi comida favorita desde cero, tiene preparado velas, musica romántica, flores y un regalo esperando en la mesa. \n " 
						+ "c.Hacer una fiesta con mis amigos y con todos los de los alrededor \n" 
						+ "d. Estar en casa viendo una pelicula, con mis snacks favoritos y una cobija calientita mientras cae la lluvia afuera.\n\n"
						+"Indique aqui su respuesta";
		pregunta[8] = "9.¿Si fueras influencer, sobre que temas hablarias?\n "
						+ "a.Me considero una persona que sabe de moda, entonces haria tutoriales de maquillaje y recomendaria marcas nuevas, estaria tomando fotos de mis outfits, ¡no puede faltar subir fotos de los lugares cool a los que voy!\n " 
						+ "b.Seguramente subiria contenido sobre peliculas, series, libros que me gustan, o hacer reseñas, recomendaciones, hablar de bloopers, escenas ineditas y todo sobre el mundo del arte. \n " 
						+ "c.Mis amigos siempre se rien con las locuras que hago, entonces compartiria videos graciosos, bromas, chistes y haría parodias de canciones y películas famosas. \n" 
						+ "d.Sobre los videos mas virales,reaccionaria a ellos y tambien expondria mis temas con las preguntas de los que me quieran preguntar\n\n"
						+"Indique aqui su respuesta";
		pregunta[9] = "10.Si ves un post que te gusta en las redes sociales, ¿que haces con el?\n "
						+ "a.Solamente le doy like, y si me gusta mucho, comento una carita riendo.\n " 
						+ "b.Lo descargo, le tomo pantallazo o lo guardo en alguna parte, para que no se me pierda y pueda volver a verlo unos dias despues.\n " 
						+ "c.Inmediatamente etiqueto a mis amigos ¡ellos tambien tienen que verlo!\n" 
						+ "d.Quiero compartir en el momento mi reaccion y expresarme sobre ello\n\n"
						+"Indique aqui su respuesta";
//Se comprueba la condicion en base a la variable respuesta que se almacena en la variable cuestion de la variable static pregunta[]
//con la variable redesSociales[] para instagram,twitter,tiktok y twitch declaradas arriba
		
//Con el bucle for comprobamos una a una la pregunta si cumple la condicion pasa la pregunta almacenada en cuestion
//si no la cumple se repite el bucle do while.

		
			for (String cuestion : pregunta) {
				do {
				String respuesta = JOptionPane
				.showInputDialog(cuestion).toLowerCase();
				switch (respuesta) {
				
				case "a": {
					redesSociales[instagram]++;
					acertado = true;
					;
					break;
				}
				case "b": {
					redesSociales[twitter]++;
					acertado = true;
					break;
				}
				case "c": {
					redesSociales[tikTok]++;
					acertado = true;
					break;
				}
				case "d": {
					redesSociales[twitch]++;
					acertado = true;
					break;
				}
				default:
					JOptionPane.showMessageDialog(null,"Respuesta Incorrecta,responda solo con a,b,c y d");
					acertado = false;
				}
			} while (!acertado);
		};
		return acertado;

//Se devuelve un valor para que el bucle en función de como se haya elegido
//devuelve true o false
		
//Si es acertado=false se repite la pregunta ultima que se ha preguntado a través de la variable cuestion
		
//Si es acertado=true al finalizar la ultima pregunta en el bucle for //pasa a la siguiente función que 
//es la del recopilador

	}
	
	/**
	 * Este método coge las variables de arriba declaradas y las recopila para
	 * mostrar el resultado del test.
	 *
	 * @param redesSociales[instagram]
	 * @param redesSociales[twitter]
	 * @param redesSociales[tikTok]
	 * @param redesSociales[twitch]
	 */
	static boolean recopilador(int[] redesSociales) {
// Se declaran los mensajes que vamos a utilizar

		
		mensajeUsual = "Tras analizar la informacion del test podriamos decir que la red social que mas utilizas es\n";
		mensajeInusual = "Y la red social que menos utilizas es\n";

// Se comprueban las condiciones con los datos obtenidos de las variables
// por medio de las respuestas[].

//Se comprueba el valor mas dado en el test
		if (redesSociales[instagram] > redesSociales[twitter] && redesSociales[instagram] > redesSociales[twitter]
				&& redesSociales[instagram] > redesSociales[tikTok]
				&& redesSociales[instagram] > redesSociales[twitch]) {
			primerValor = "Instagram";

		} else if (redesSociales[twitter] > redesSociales[instagram] && redesSociales[twitter] > redesSociales[tikTok]
				&& redesSociales[twitter] > redesSociales[tikTok]) {
			primerValor = "Twitter";

		} else if (redesSociales[tikTok] > redesSociales[instagram] && redesSociales[tikTok] > redesSociales[twitter]
				&& redesSociales[tikTok] > redesSociales[twitch]) {
			primerValor = "TikTok";
		} else if (redesSociales[twitch] > redesSociales[instagram] && redesSociales[twitch] > redesSociales[twitter]
				&& redesSociales[twitch] > redesSociales[tikTok]) {
			primerValor = "Twitch";
		}
//Se comprueba el valor menos dado en el test
		if (redesSociales[instagram] < redesSociales[twitter] && redesSociales[instagram] < redesSociales[tikTok]
				&& redesSociales[instagram] < redesSociales[tikTok]) {
			ultimoValor = "Instagram";
		} else if (redesSociales[twitter] < redesSociales[instagram] && redesSociales[twitter] < redesSociales[2]
				&& redesSociales[twitter] < redesSociales[twitch]) {
			ultimoValor = "Twitter";
		} else if (redesSociales[tikTok] < redesSociales[instagram] && redesSociales[tikTok] < redesSociales[twitch]
				&& redesSociales[tikTok] < redesSociales[twitter]) {
			ultimoValor = "TikTok";
		} else if (redesSociales[twitch] < redesSociales[instagram] && redesSociales[twitch] < redesSociales[tikTok]
				&& redesSociales[twitch] < redesSociales[twitter]) {
			ultimoValor = "Twitch";
		} else {
			ultimoValor = "Y podemos decir que eres un obseso de " + primerValor + " y las demas apenas las utilizas";
			mensajeInusual = "";
			
		}
//Se comprueba la condicion si todas las redes sociales son iguales
		if (redesSociales[instagram] == redesSociales[twitter] && redesSociales[instagram] == redesSociales[twitter]
				&& redesSociales[instagram] == redesSociales[tikTok]
				&& redesSociales[instagram] == redesSociales[twitch]) {
			mensajeUsual="Tras analizar la informacion del test podriamos decir que utilizas todas las redes por igual\n";
			mensajeInusual = "";
			primerValor="";
			ultimoValor="";
		} else if (redesSociales[twitter] == redesSociales[instagram] && redesSociales[twitter] == redesSociales[tikTok]
				&& redesSociales[twitter] == redesSociales[tikTok]) {
			mensajeUsual="Tras analizar la informacion del test podriamos decir que utilizas todas las redes por igual\n";
			mensajeInusual = "";
			primerValor="";
			ultimoValor="";
		} else if (redesSociales[tikTok] == redesSociales[instagram] && redesSociales[tikTok] == redesSociales[twitter]
				&& redesSociales[tikTok] == redesSociales[twitch]) {
			mensajeUsual="Tras analizar la informacion del test podriamos decir que utilizas todas las redes por igual\n";
			mensajeInusual = "";
			primerValor="";
			ultimoValor="";
		} else if (redesSociales[twitch] == redesSociales[instagram] && redesSociales[twitch] == redesSociales[twitter]
				&& redesSociales[twitch] == redesSociales[tikTok]) {
			mensajeUsual="Tras analizar la informacion del test podriamos decir que utilizas todas las redes por igual\n";
			mensajeInusual = "";
			primerValor="";
			ultimoValor="";
		}
		else {
			JOptionPane.showMessageDialog(null, "Repite el test ,has tenido un resultado erroneo");
			preguntas(acertado);
		}
		

// Se muestran los mensajes con las condiciones ya determinadas
// añadiendoles un mensaje con los valores predeterminados

		JOptionPane.showMessageDialog(null, mensajeUsual + primerValor + "\n" + mensajeInusual + ultimoValor);
		JOptionPane.showMessageDialog(null, "Gracias por tu atencion");
		acertado = true;
		return acertado;

	}
}
