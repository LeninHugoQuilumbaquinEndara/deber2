
package test;
import curso.Curso;
public class TestCurso {
public static void main(String[] args){
    Curso cursoA = new Curso();
    double [] notas = new double[12];
    
    llenaNotas(notas);
    cursoA.setNotas(notas);
    cursoA.mostrarNotas(notas);
    cursoA.setPromedio(notas);
    cursoA.setEstudiantesEncimaPromedio();

    System.out.println();
    System.out.println("Promedio del curso = "+cursoA.getPromedio());
    System.out.println("Nro de estudiantes encima del promedio = "+
            cursoA.getnroEstudiantesEncimaPromedio());
}
public static void llenaNotas(double[] notas){
           // llenado de notas 
    for (int i=0;i<12;i++){
        notas[i]=Math.random()*6;
    } 
}
}

