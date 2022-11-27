# Test-Personalidad
Test de personalidad realizado por Jesús de Dios Sánchez,Alberto Asuaje Nunes y Eduardo Romero Otero .

El test está sin tildes y sin caracteres raros para que se puedea ejecutar correctamente sin caracteres alterados.

En este test tendremos los siguientes métodos:

public class ClassTestPersonalidad 
- Aquí declaramos las arrays y variables de estas para el recopilador.

public static void main(String[] args) 
- Este es el metodo principal del Proyecto.

static void menu()
- Este metodo inicia el menu del test.

static void creditos()
- Este metodo inicia los creditos de nuestro grupo.

static void test()
- Este metodo inicia el test de personalidad.

static boolean preguntas()
- Este metodo hace la condicion de cada pregunta en funcion de su valor asigna un valor a las variables instagram,twitter,tikTok y twitch para su posterior 
resultado del test.

static boolean recopilador(int[] redesSociales)
- Este método coge las variables de arriba declaradas y las recopila para mostrar el resultado del test.

Y tendremos las siguientes variables:

Para el metodo menu
- static String eleccionUsuario
		
Para el metodo test y recopilador
		
- Array para las 10 preguntas del test
		static String[] pregunta = new String[10]
	
- Array para las respuestas de las preguntas 
		static int redesSociales[] = { 0, 0, 0, 0 }
	
- Variables para array redesSociales[] para entender lo que estamos sumando
		static int instagram = 0
		static int twitter = 1
		static int tikTok = 2
		static int twitch = 3
	
	
- Variable boolean para las preguntas para que condicione el que siga los bucles o no
		static boolean acertado = false
		
- Strings para el recopilador
		static String primerValor
		static String ultimoValor
		static String mensajeUsual
		static String mensajeInusual
