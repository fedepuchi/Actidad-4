import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


    
public class Main{
    public static void main(String[] args) {
        int cantidad_total = 0;
        List<String> semana = new ArrayList<>();
        int horas_totales = 0;
        semana.add("Lunes");
        semana.add("Martes");
        semana.add("Miercoles");
        semana.add("Jueves");
        semana.add("Viernes");
        semana.add("Sabado");
        semana.add("Domingo");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nombre del visitante: ");
        String Nombre  = scanner.nextLine();

        System.out.print("Edad del visitante: ");
        byte Edad = scanner.nextByte();

        System.out.print("Id del visitante: ");
        long IDSistema = scanner.nextLong();

        System.out.print("Cedula o DNI: ");
        long DNI = scanner.nextLong();
        
        System.out.print("\nSe encuentra registrado : False");

        System.out.print("\nTorre.Apartamento: ");
        double Torre_y_Piso = scanner.nextFloat();

        for (int i = 0; i < semana.size(); i++) {
         
            System.out.print("Tiempo de estadia del dia " + semana.get(i)+ " : " );
            int horas = scanner.nextInt();
            
            horas_totales = horas_totales + horas;
            System.out.print("Cantidad de entradas y salidas del dia " + semana.get(i)+ " : " );
            int Cantidad = scanner.nextInt();
                   
            cantidad_total = cantidad_total + Cantidad;
                
        }

        System.out.print("\nVisitante: " + Nombre );

        if (Edad < 18) {
            System.out.println("\nEl visitante es menor de edad");
        } else {
            System.out.println("\nEl visitante es mayor de edad");
        }

        System.out.print("IDSistema: " + IDSistema  );
        System.out.print("\nTorre.Apartamento: " + Torre_y_Piso);
        System.out.print("\nRegistrado: True");
        System.out.print("\nCedula: " + DNI);
        System.out.print("\nVisitas en la semana : " + cantidad_total);
        System.out.print("\nHoras de visita en la semana : " + horas_totales);




        
    }
}

