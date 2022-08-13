package test;

import operaciones.Operaciones;

public class TestOperaciones {

    public static void main(String[] args) {
        //Los metodos son static por lo que no existe necesidad de crear un objeto de esa clase, se mandan directamente
        var resultado = Operaciones.sumar(3, 5);
        System.out.println("resultado = " + resultado);

        //Se busca el metodo sumar pero el que tenga el primer argumento con double
        var resultado2 = Operaciones.sumar(2.0, 3);
        System.out.println("resultado2 = " + resultado2);

        //NOTA: eL RESULTADO DEPENDE DE LA INFERENCIA DE TIPOS  
        //Aqui con el long se manda llamar el metodo con el tipo double ya que es compatible
        var resultado3 = Operaciones.sumar(3, 5L);
        System.out.println("resultado3 = " + resultado3);

    }
}
