package model.data_structures;

/**
 * 2019-01-23
 * Estructura de Datos Arreglo Dinamico de Strings.
 * El arreglo al llenarse (llegar a su maxima capacidad) debe aumentar su capacidad.
 * @author Fernando De la Rosa
 *
 */
public class ArregloDinamico implements IArregloDinamico {
		/**
		 * Capacidad maxima del arreglo
		 */
        private int tamanoMax;
		/**
		 * Numero de elementos presentes en el arreglo (de forma compacta desde la posicion 0)
		 */
        private int tamanoAct;
        /**
         * Arreglo de elementos de tamaNo maximo
         */
        private String elementos[ ];

        /**
         * Construir un arreglo con la capacidad maxima inicial.
         * @param max Capacidad maxima inicial
         */
		public ArregloDinamico( int max )
        {
               elementos = new String[max];
               tamanoMax = max;
               tamanoAct = 0;
        }
        
		public void agregar( String dato )
        {
               if ( tamanoAct == tamanoMax )
               {  // caso de arreglo lleno (aumentar tamaNo)
                    tamanoMax = 2 * tamanoMax;
                    String [ ] copia = elementos;
                    elementos = new String[tamanoMax];
                    for ( int i = 0; i < tamanoAct; i++)
                    {
                     	 elementos[i] = copia[i];
                    } 
            	    System.out.println("Arreglo lleno: " + tamanoAct + " - Arreglo duplicado: " + tamanoMax);
               }	
               elementos[tamanoAct] = dato;
               tamanoAct++;
       }

		public int darCapacidad() {
			return tamanoMax;
		}

		public int darTamano() {
			return tamanoAct;
		}

		public String darElemento(int i) {
			// TODO implementar
			String respuesta = null;
			if (i<elementos.length)
			{
				respuesta = elementos [i];
			}
			return respuesta;
		}

		public String buscar(String dato) {
			// TODO implementar
			// Recomendacion: Usar el criterio de comparacion natural (metodo compareTo()) definido en Strings.
			for (int i = 0;i<elementos.length;i++)
			{
				if (elementos [i].compareTo(dato)==0)
				{
					return elementos [i];
				}
			}
			
			return null;
		}

		public String eliminar(String dato) {
			// TODO implementar
			// Recomendacion: Usar el criterio de comparacion natural (metodo compareTo()) definido en Strings.
			int pos=-1;
			boolean centinela = false;
			for (int i=0;i<elementos.length && centinela == false;i++)
			{
				if (elementos [i].compareTo(dato)==0)
				{
					elementos[i]=null;
					pos = i;
					centinela = true;
				}
			}
			
			if (pos == -1)
				return null;
			
			for (int i = pos; i < elementos.length-1;i++)
			{
				elementos [i] = elementos [i+1];
			}
			return dato;
		}

}
