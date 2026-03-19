 package persona.viajero;
import java.util.Scanner;
public class Viajero {
    // Campo estático para contar instancias
    private static int numObjetos = 0;
    // Atributos de instancia
    private String dni;
    private String nombre;
    private String apellidos;
    private String nacionalidad;
    private String direccion;
    // Constructor
    public Viajero(String dni, String nombre, String apellidos, String nacionalidad, String direccion) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nacionalidad = nacionalidad;
        this.direccion = direccion;
        numObjetos++;
    }
    public Viajero(){
        this.dni = "";
        this.nombre = "";
        this.apellidos = "";
        this.nacionalidad = "";
        this.direccion = "";
        numObjetos++;
    }
    // Getters y setters
    public String getDni() { return dni; }
    public void setDni(String dni) { this.dni = dni; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getApellidos() { return apellidos; }
    public void setApellidos(String apellidos) { this.apellidos = apellidos; }
    public String getNacionalidad() { return nacionalidad; }
    public void setNacionalidad(String nacionalidad) { this.nacionalidad = nacionalidad; }
    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }
    public static int getNumObjetos() {        return numObjetos;    }

    // Método getInfo con formato "normal" o "pausado"
    public void getInfo(String formato) {
        if (formato.equalsIgnoreCase("normal")) {
            System.out.println("DNI: " + dni);
            System.out.println("Nombre: " + nombre);
            System.out.println("Apellidos: " + apellidos);
            System.out.println("Nacionalidad: " + nacionalidad);
            System.out.println("Dirección: " + direccion);
             System.out.println("-------------------------");
        }         else if (formato.equalsIgnoreCase("pausado")) {
            Scanner sc = new Scanner(System.in);
            System.out.println("DNI: " + dni);
            sc.nextLine();
            System.out.println("Nombre: " + nombre);
            sc.nextLine();
            System.out.println("Apellidos: " + apellidos);
            sc.nextLine();
            System.out.println("Nacionalidad: " + nacionalidad);
            sc.nextLine();
            System.out.println("Dirección: " + direccion);
            sc.nextLine();
            System.out.println("-------------------------");
        }         else {
            System.out.println("Formato no reconocido. Use 'normal' o 'pausado'.");
        }
    }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);  
      // SOLICITAR NUMERO DE VIAJEROS 
      System.out.println("Dame NUMERO DE VIAJEROS DEL VUELO A PARIS");
      
      // SOLICITAR DATOS DE CADA VIAJERO 
      
      // MOSTRAR DATOS DE LOS VIAJEROS SEGÚN FORMATO INDICADO 
      
        Viajero v2 = new Viajero("12345678A", "Ana", "Lago Sol", "Española", "Calle Mayor 10");
       Viajero v1 = new Viajero();
       System.out.println("Dame DNI");v1.setDni(sc.nextLine());
       System.out.println("Dame NOMBRE");v1.setNombre(sc.nextLine());
       System.out.println("Dame APELLIDOS");v1.setApellidos(sc.nextLine()); 
       System.out.println("Dame NACIONALIDAD");v1.setNacionalidad(sc.nextLine());
       System.out.println("Dame DIRECCION");v1.setDireccion(sc.nextLine());
        
       System.out.println("**** Num objetos creados\t"+Viajero.getNumObjetos());
        
        System.out.println("    \nMOSTRAR DATOS DE VIAJERos");
        System.out.println("QUIERES VERLO EN FORMATO:\n 1.PAUSADO(pulsar INTRO)\n 2.NORMAL ");  
        switch(sc.nextInt()){
            case 1: v1.getInfo("pausado");
                       v2.getInfo("pausado");
                        break;// Modo pausado
            case 2: v1.getInfo("normal");
                        v2.getInfo("normal");
                        break;// Modo normal
            default: System.out.println("No es posible visualizar esa opción.");
        }        
    }
}
 
