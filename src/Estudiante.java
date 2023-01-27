import java.util.Arrays;

public class Estudiante implements Comparable<Estudiante> {
    private String nombre;
    private int edad;
    private int altura;

    public Estudiante(String nombre, int edad, int altura){
        this.nombre=nombre;
        this.altura=altura;
        this.edad=edad;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }
    public int getAltura() {
        return altura;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", altura=" + altura +
                '}';
    }

    @Override
    public int compareTo(Estudiante o) {
        int resus;
        if(this.altura<o.altura){
            resus=1;
        }else if(this.altura>o.altura){
            resus=-1;
        }else {
            if(this.edad<o.edad){
                resus=1;
            }
            else if(this.edad>o.edad){
                resus=-1;
            } else{
                resus=0;
            }
        }
        return resus;
    }

    public static void main(String[] args) {
        Estudiante es1=new Estudiante("Patri",18,170);
        Estudiante es2=new Estudiante("Miguel",53,175);
        Estudiante es3=new Estudiante("Javi",19,150);
        Estudiante es4=new Estudiante("Angela",17,168);
        Estudiante es5=new Estudiante("Jose",92,170);
        System.out.println(es1.toString());
        System.out.println(es2.toString());
        System.out.println(es3.toString());
        System.out.println(es4.toString());
        System.out.println(es5.toString());
        System.out.println();


        Estudiante[] suici=new Estudiante[5];

        suici[0]=es1;
        suici[1]=es2;
        suici[2]=es3;
        suici[3]=es4;
        suici[4]=es5;

        Arrays.sort(suici);

        for(int j=0; j< suici.length;j++){
            System.out.println(suici[j]);
        }



    }
}
