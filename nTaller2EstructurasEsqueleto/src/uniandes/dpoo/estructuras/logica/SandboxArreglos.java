package uniandes.dpoo.estructuras.logica;

import java.util.HashMap;

/**
 * Esta clase tiene un conjunto de métodos para practicar operaciones sobre arreglos de enteros y de cadenas.
 *
 * Todos los métodos deben operar sobre los atributos arregloEnteros y arregloCadenas.
 * 
 * No pueden agregarse nuevos atributos.
 * 
 * Implemente los métodos usando operaciones sobre arreglos (ie., no haga cosas como construir listas para evitar la manipulación de arreglos).
 */
public class SandboxArreglos
{
    /**
     * Un arreglo de enteros para realizar varias de las siguientes operaciones.
     * 
     * Ninguna posición del arreglo puede estar vacía en ningún momento.
     */
    private int[] arregloEnteros;

    /**
     * Un arreglo de cadenas para realizar varias de las siguientes operaciones
     * 
     * Ninguna posición del arreglo puede estar vacía en ningún momento.
     */
    private String[] arregloCadenas;

    /**
     * Crea una nueva instancia de la clase con los dos arreglos inicializados pero vacíos (tamaño 0)
     */
    public SandboxArreglos( )
    {
        arregloEnteros = new int[]{};
        arregloCadenas = new String[]{};
    }

    /**
     * Retorna una copia del arreglo de enteros, es decir un nuevo arreglo del mismo tamaño que contiene copias de los valores del arreglo original
     * @return Una copia del arreglo de enteros
     */
    public int[] getCopiaEnteros( )
    {
    	int[] copia = new int[arregloEnteros.length];
    	
    	for ( int i=0; i < arregloEnteros.length; i++) {
    		copia[i] = arregloEnteros[i];
    	}
        return copia;
    }

    /**
     * Retorna una copia del arreglo de cadenas, es decir un nuevo arreglo del mismo tamaño que contiene copias de los valores del arreglo original
     * @return Una copia del arreglo de cadenas
     */
    public String[] getCopiaCadenas( )
    {
    	String[] copia = new String[arregloCadenas.length];
    	
    	for ( int i=0; i < arregloCadenas.length; i++) {
    		copia[i] = arregloCadenas[i];
    	}
        return copia;
    }

    /**
     * Retorna la cantidad de valores en el arreglo de enteros
     * @return
     */
    public int getCantidadEnteros( )
    {
        return arregloEnteros.length;
    }

    /**
     * Retorna la cantidad de valores en el arreglo de cadenas
     * @return
     */
    public int getCantidadCadenas( )
    {
        return arregloCadenas.length;
    }

    /**
     * Agrega un nuevo valor al final del arreglo. Es decir que este método siempre debería aumentar en 1 la capacidad del arreglo.
     * 
     * @param entero El valor que se va a agregar.
     */
    public void agregarEntero( int entero )
    {
    	int nuevoTamaño = arregloEnteros.length +1;
    	
    	int[] nuevoArreglo = new int[nuevoTamaño];
    	
    	for (int i = 0; i < arregloEnteros.length; i++){
    		nuevoArreglo[i] = arregloEnteros[i];
    	
    	}
    	nuevoArreglo[nuevoTamaño - 1] = entero;
    	
    	arregloEnteros = nuevoArreglo;
    }

    /**
     * Agrega un nuevo valor al final del arreglo. Es decir que este método siempre debería aumentar en 1 la capacidad del arreglo.
     * 
     * @param cadena La cadena que se va a agregar.
     */
    public void agregarCadena( String cadena )
    {
    	int nuevoTamaño = arregloCadenas.length + 1;
    	
    	String[] nuevoArreglo = new String[nuevoTamaño];
    	
    	for(int i = 0; i < arregloCadenas.length; i++) {
    		nuevoArreglo[i] = arregloCadenas[i];
    	}
    	
    	nuevoArreglo[nuevoTamaño - 1] = cadena;
    	
    	arregloCadenas = nuevoArreglo;
    }

    /**
     * Elimina todas las apariciones de un determinado valor dentro del arreglo de enteros
     * @param valor El valor que se va eliminar
     */
    public void eliminarEntero( int valor )
    {
    	int apariciones = 0;
    	
    	for(int i = 0; i < arregloEnteros.length; i++) {
    		if(arregloEnteros[i] == valor) {
    			apariciones++;
    			
    		}
    	}
    	int nuevoTamaño = arregloEnteros.length - apariciones;
    	
    	int[]nuevoArreglo = new int[nuevoTamaño];
    	
    	int contador = 0;
    			
    	for(int i = 0; i < arregloEnteros.length; i++) {
    		if(arregloEnteros[i] == valor) {
    			contador++;
    		}
    		else {
    			nuevoArreglo[i-contador] = arregloEnteros[i];
    		}
    	}
    	arregloEnteros = nuevoArreglo;
    }

    /**
     * Elimina todas las apariciones de un determinado valor dentro del arreglo de cadenas
     * @param cadena La cadena que se va eliminar
     */
    public void eliminarCadena( String cadena )
    {
    	int apariciones = 0;
    	
    	for(int i = 0; i < arregloCadenas.length; i++) {
    		if(arregloCadenas[i] == cadena) {
    			apariciones++;
    			
    		}
    	}
    	int nuevoTamaño = arregloCadenas.length - apariciones;
    	
    	String[]nuevoArreglo = new String[nuevoTamaño];
    	
    	int contador = 0;
    			
    	for(int i = 0; i < arregloCadenas.length; i++) {
    		if(arregloCadenas[i] == cadena) {
    			contador++;
    		}
    		else {
    			nuevoArreglo[i-contador] = arregloCadenas[i];
    		}
    	}
    	arregloCadenas = nuevoArreglo;
    }

    /**
     * Inserta un nuevo entero en el arreglo de enteros.
     * 
     * @param entero El nuevo valor que debe agregarse
     * @param posicion La posición donde debe quedar el nuevo valor en el arreglo aumentado. Si la posición es menor a 0, se inserta el valor en la primera posición. Si la
     *        posición es mayor que el tamaño del arreglo, se inserta el valor en la última posición.
     */
    public void insertarEntero( int entero, int posicion )
    {
    	int nuevoTamaño = arregloEnteros.length +1;
    	int nuevoArreglo[] = new int[nuevoTamaño];
    	
    	int contador = 0;
    	
    	if(posicion > 0 && posicion < arregloEnteros.length) {

    	for(int i = 0; i < arregloEnteros.length; i++) {
    		if(posicion == i) {
    			nuevoArreglo[i] = entero;
    			contador = 1;
    			}
    		nuevoArreglo[i + contador] = arregloEnteros[i];
    		}
    		arregloEnteros = nuevoArreglo;
    	}
    	
    	else if (posicion <= 0){
    		nuevoArreglo[0] = entero;
        	for(int i = 1; i < nuevoTamaño; i++) {
        		nuevoArreglo[i] = arregloEnteros[i-1];
        	}
        	arregloEnteros = nuevoArreglo;
    	}
    	else if (posicion >= arregloEnteros.length) {
    		agregarEntero(entero);
    	}
    	
    }

    /**
     * Elimina un valor del arreglo de enteros dada su posición.
     * @param posicion La posición donde está el elemento que debe ser eliminado. Si el parámetro posicion no corresponde a ninguna posición del arreglo de enteros, el método
     *        no debe hacer nada.
     */
    public void eliminarEnteroPorPosicion( int posicion )
    {	
    	int nuevoTamaño = arregloEnteros.length - 1;
    	int nuevoArreglo[] = new int [nuevoTamaño];
    	int contador = 0;
    	
    	if(posicion >= 0 && posicion < arregloEnteros.length) {
	    	for(int i = 0; i < nuevoTamaño; i++) {
	    		if(posicion == i) {
	    			contador = 1;
	    		}
	    		nuevoArreglo[i] = arregloEnteros[i+contador];
	    	}
	    	arregloEnteros = nuevoArreglo;
    	}
    }

    /**
     * Reinicia el arreglo de enteros con los valores contenidos en el arreglo del parámetro 'valores' truncados.
     * 
     * Es decir que si el valor fuera 3.67, en el nuevo arreglo de enteros debería quedar el entero 3.
     * @param valores Un arreglo de valores decimales.
     */
    public void reiniciarArregloEnteros( double[] valores )
    {
        int nuevoArreglo[] = new int[valores.length]; 

        for (int i = 0; i < valores.length; i++) {
            nuevoArreglo[i] = (int) valores[i];
        }
        arregloEnteros = nuevoArreglo;
    }

    /**
     * Reinicia el arreglo de cadenas con las representaciones como Strings de los objetos contenidos en el arreglo del parámetro 'objetos'.
     * 
     * Use el método toString para convertir los objetos a cadenas.
     * @param valores Un arreglo de objetos
     */
    public void reiniciarArregloCadenas( Object[] objetos )
    {
        String nuevoArreglo[] = new String[objetos.length]; 

     for (int i = 0; i < objetos.length; i++) {
    	 nuevoArreglo[i] = objetos[i].toString();
        }
    arregloCadenas = nuevoArreglo;
    }

    /**
     * Modifica el arreglo de enteros para que todos los valores sean positivos.
     * 
     * Es decir que si en una posición había un valor negativo, después de ejecutar el método debe quedar el mismo valor muliplicado por -1.
     */
    public void volverPositivos( )
    {
    	int nuevoArreglo[] = new int[arregloEnteros.length];
    	for (int i = 0; i < arregloEnteros.length; i++) {
    		nuevoArreglo[i] = arregloEnteros[i];
    		if(arregloEnteros[i] < 0) {
    			nuevoArreglo[i] = -1*arregloEnteros[i];
    		}
    	}
    	arregloEnteros = nuevoArreglo;
    }

    /**
     * Modifica el arreglo de enteros para que todos los valores queden organizados de menor a mayor.
     */
    public void organizarEnteros( )
    {
        for (int i = 1; i < arregloEnteros.length; i++) {
            int valorActual = arregloEnteros[i];
            int j = i - 1;

            while (j >= 0 && arregloEnteros[j] > valorActual) {
                arregloEnteros[j + 1] = arregloEnteros[j];
                j--;
            }
            arregloEnteros[j + 1] = valorActual;
        }
    }

    /**
     * Modifica el arreglo de cadenas para que todos los valores queden organizados lexicográficamente.
     */
	    public void organizarCadenas( )
	    {
	        for (int i = 1; i < arregloCadenas.length; i++) {
	            String valorActual = arregloCadenas[i];
	            int j = i - 1;
	
	            while (j >= 0 && arregloCadenas[j].compareTo(valorActual) > 0) {
	                arregloCadenas[j + 1] = arregloCadenas[j];
	                j--;
	            }
	            arregloCadenas[j + 1] = valorActual;
	        }
	    }

    /**
     * Cuenta cuántas veces aparece el valor recibido por parámetro en el arreglo de enteros
     * @param valor El valor buscado
     * @return La cantidad de veces que aparece el valor
     */
    public int contarApariciones( int valor )
    {
    	int apariciones = 0;
    	for(int i = 0; i < arregloEnteros.length; i++) {
    		if(arregloEnteros[i] == valor) {
    			apariciones++;
    		}
    	}
    	return apariciones;
    }

    /**
     * Cuenta cuántas veces aparece la cadena recibida por parámetro en el arreglo de cadenas.
     * La búsqueda no debe diferenciar entre mayúsculas y minúsculas.
     * @param cadena La cadena buscada
     * @return La cantidad de veces que aparece la cadena
     */
    public int contarApariciones( String cadena )
    {
    	int apariciones = 0;
    	String cadenaMinusculas = cadena.toLowerCase();
    	
    	for(int i = 0; i < arregloCadenas.length; i++) {
    		String cadenaArregloMinusculas = arregloCadenas[i].toLowerCase();
    		if(cadenaArregloMinusculas.contains(cadenaMinusculas)) {
    			apariciones++;
    		}
    	}
    	return apariciones;
    }

    /**
     * Busca en qué posiciones del arreglo de enteros se encuentra el valor que se recibe en el parámetro
     * @param valor El valor que se debe buscar
     * @return Un arreglo con los números de las posiciones del arreglo de enteros en las que se encuentra el valor buscado. Si el valor no se encuentra, el arreglo retornado
     *         es de tamaño 0.
     */
    public int[] buscarEntero( int valor )
    {
    	int apariciones = 0;
    	for(int i = 0; i < arregloEnteros.length; i++) {
    		if(arregloEnteros[i] == valor){
    			apariciones++;
    		}
    	}
        if (apariciones == 0) {
            return new int[0];
        }
        else {
	        int[] arregloPosiciones = new int[apariciones];
	        int index = 0;
	
	        for (int i = 0; i < arregloEnteros.length; i++) {
	            if (arregloEnteros[i] == valor) {
	            	arregloPosiciones[index++] = i;
	            }
	        }
	        return arregloPosiciones;
        }
    }

    /**
     * Calcula cuál es el rango de los enteros (el valor mínimo y el máximo).
     * @return Un arreglo con dos posiciones: en la primera posición, debe estar el valor mínimo en el arreglo de enteros; en la segunda posición, debe estar el valor máximo
     *         en el arreglo de enteros. Si el arreglo está vacío, debe retornar un arreglo vacío.
     */
    public int[] calcularRangoEnteros( )
    {
    	int tamaño = arregloEnteros.length;
    	int minimo = 99999;
    	int maximo = 0;
    	if(tamaño > 0) {
        	for(int i = 0; i < tamaño; i++) {
        		if(arregloEnteros[i]<minimo) {
        			minimo = arregloEnteros[i];
        		}
        		if(arregloEnteros[i]>maximo) {
        			maximo = arregloEnteros[i];
        		}
        	}
            int[] arregloRango = {minimo, maximo};
            return arregloRango;
    	}
		return new int[0];
    }

    /**
     * Calcula un histograma de los valores del arreglo de enteros y lo devuelve como un mapa donde las llaves son los valores del arreglo y los valores son la cantidad de
     * veces que aparece cada uno en el arreglo de enteros.
     * @return Un mapa con el histograma de valores.
     */
    public HashMap<Integer, Integer> calcularHistograma( )
    {
    	HashMap<Integer, Integer> histograma = new HashMap<>();
    	
        for (int valor : arregloEnteros) {
            histograma.put(valor, histograma.getOrDefault(valor, 0) + 1);
        }
        return histograma;
    }

    /**
     * Cuenta cuántos valores dentro del arreglo de enteros están repetidos.
     * @return La cantidad de enteos diferentes que aparecen más de una vez
     */
    public int contarEnterosRepetidos( )
    {
    	int repetidos = 0;
    	HashMap<Integer, Integer> histograma = calcularHistograma();
    	
        for (int valor : histograma.keySet()) {
            if(histograma.get(valor) > 1) {
            	repetidos++;
            }
        }
    	
        return repetidos;
    }

    /**
     * Compara el arreglo de enteros con otro arreglo de enteros y verifica si son iguales, es decir que contienen los mismos elementos exactamente en el mismo orden.
     * @param otroArreglo El arreglo de enteros con el que se debe comparar
     * @return True si los arreglos son idénticos y false de lo contrario
     */
    public boolean compararArregloEnteros( int[] otroArreglo )
    {	
    	boolean llave = false;
    	int contador = 0;
    	int tamaño = arregloEnteros.length;
    	
        if (arregloEnteros.length != otroArreglo.length) {
            return llave;
        }
        
    	for(int i = 0; i < arregloEnteros.length; i++){
    		if(arregloEnteros[i] == otroArreglo[i]) {
    			contador++;
    		}
    	}
    	if(contador == tamaño) {
    		llave = true;
    	}
        return llave;
    }

    /**
     * Compara el arreglo de enteros con otro arreglo de enteros y verifica que tengan los mismos elementos, aunque podría ser en otro orden.
     * @param otroArreglo El arreglo de enteros con el que se debe comparar
     * @return True si los elementos en los dos arreglos son los mismos
     */
    public boolean mismosEnteros( int[] otroArreglo )
    {
    	boolean llave = false;
    	
    	HashMap<Integer, Integer> histogramaOtroArreglo = new HashMap<>();
    	
        for (int valor : otroArreglo) {
        	histogramaOtroArreglo.put(valor, histogramaOtroArreglo.getOrDefault(valor, 0) + 1);
        }
        HashMap<Integer, Integer> histograma = calcularHistograma();
        llave = histogramaOtroArreglo.equals(histograma);
        return llave;
    }

    /**
     * Cambia los elementos del arreglo de enteros por una nueva serie de valores generada de forma aleatoria.
     * 
     * Para generar los valores se debe partir de una distribución uniforme usando Math.random().
     * 
     * Los números en el arreglo deben quedar entre el valor mínimo y el máximo.
     * @param cantidad La cantidad de elementos que debe haber en el arreglo
     * @param minimo El valor mínimo para los números generados
     * @param maximo El valor máximo para los números generados
     */
    public void generarEnteros( int cantidad, int minimo, int maximo )
    {
    	arregloEnteros = new int[cantidad];
    	
    	int rango = maximo - minimo + 1;
        for (int i = 0; i < arregloEnteros.length; i++) {
            arregloEnteros[i] = minimo + (int) (Math.random() * rango);
        }
    }
}