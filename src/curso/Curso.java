
package curso;

public class Curso {
    private double [] notas;
    private double promedio;
    private int studiantesEncimaPromedio;
    
    public Curso(){
        notas = new double [12];
    }
    
    public void setNotas(double notas[]){
        this.notas=notas;
    }
    
    public void mostrarNotas(double notas[]){
        for(int i=0;i<12;i++){
            System.out.println((i+1)+". Estudiante: "+this.notas[i]);
        }
    }
    public void setPromedio(double[] notas){
        double promedio = 0;
        double sum=0;
        for(int i=0;i<12;i++){
            double almacenamiento = notas [i];
            sum = almacenamiento + sum; // se sumaran los valores 
            //registrados de los 12 estudiantes
        }
        promedio=sum/12;
        this.promedio = promedio;
    }
    
    public void setEstudiantesEncimaPromedio(){
        int estudiantes = 0;
        double promedio=0;
        double sum=0;
        for(int i=0;i<12;i++){
            double almacenamiento = notas [i];
            sum = almacenamiento + sum; // se sumaran los valores 
            //registrados de los 12 estudiantes
        }
        promedio=sum/12;
        for (int i = 0; i < 12; i++) {
            if (notas[i]>promedio){
                estudiantes = estudiantes+1;
            }
        }
        this.studiantesEncimaPromedio=estudiantes;
    }
    
    public double getPromedio(){
        return this.promedio;
    }
    public int getnroEstudiantesEncimaPromedio(){
        return this.studiantesEncimaPromedio;
    }
}
