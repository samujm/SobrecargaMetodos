package operaciones;

public class Operaciones {

    //SOBRECARGA DE METODOS: definir dos o mas veces el metodo a utilizar pero poniendo el mismo nombre, su diferencia es la cantidad de argumentos
    //DEBEN EXISTIR DOS O MAS METODOS CON EL MISMO NOMBRE
    public static int sumar(int a, int b) { //Metodo Static para no instanciar objetos de esa clase si no poder utilizarlos directamente
        System.out.println("sumar(int a, int b)");
        return a + b; //No estamos definiendo atributos, simplemente se regresa el resultado de la suma, por eso no se utiliza this ya que no puede acceder a este operador debido a que el contexto statico no accede al contexto dinamico
    }

    //EL TIPO DE RETORNO PUEDE VARIAR, NO NECESARIAMENTE DEBE SER IGUAL
    //EL MODIFICADOR DE ACCESO NO PUEDE SER MAS RESTRICTIVO, SI ES PUBLIC NO PUEDE SER OTRO
    public static double sumar(double a, double b) {
        System.out.println("sumar(double a, double b)");
        return a + b;
    }

//1) El nombre del método debe ser igual al método que se desea sobrecargar.
//2) Los argumentos del método deben ser distintos al método que se desea sobrecargar, únicamente se revisa el tipo y el orden en que se
//agregan, no se revisa el nombre del argumento.
//3) El tipo de retorno no afecta si es igual o distinto al del método a sobrecargar.
//4) El método a sobrecargar puede estar definido en nuestra clase o en alguna clase superior.
//5) Los argumentos pueden ser de tipo primitivo o de tipo Object
    
    
   /*En caso de aplicar alguna conversión de los tipos a utilizar, se aplicará la conversión automática superior que aplique, por ejemplo si hacemos
uso de dos variables de tipo long, y hacemos una llamada al método sumar, no se llamará al método con argumentos de tipo int, sino al
método sumar con argumentos de tipo double, ya que el tipo long se convertirá al tipo superior de manera automática, es decir al tipo
double, y quedará descartado el tipo int por ser un tipo de menores bits y menos capacitad para almacenar un dato de tipo long. Lo mismo
aplica para el concepto de objetos, aunque este tema lo veremos en el siguiente curso, en el tema de conversión de objetos.*/

}
