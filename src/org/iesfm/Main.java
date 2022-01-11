package org.iesfm;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static String askOperation(){
        System.out.println("¿Qué operacion desea realizar?");
        System.out.println("1.Media");
        System.out.println("2.Dividir");
        System.out.println("3.Terminar");

        return scanner.nextLine();
    }
    static Integer askInt (){
        System.out.println("¿cuantos numeros vas a introducir?");
        Integer num = null;
        while (num==null){
            try{
                num = scanner.nextInt();
                scanner.nextLine();
            }catch (InputMismatchException e){
                scanner.nextLine();
                System.out.println("Debe introducir un numero");
            }
        }
        return num;
    }

    static Double askDouble(String msg){
        System.out.println(msg);
        Double num = null;
        while(num==null){
            try{
                num = scanner.nextDouble();
                scanner.nextLine();
            }catch (InputMismatchException e){
                scanner.nextLine();
                System.out.println("Debe introducir un numero.");
            }
        }
        return num;
    }
    static double division(){
       Double num1 = askDouble("Introduce el primer numero");
       Double num2 = askDouble("Introduce el segundo numero");
       Double division = num1/num2;
      while (division==0){
          try{

          }
      }

       return num1/num2;
    }
    static double media(){
        int size = askInt();
        double[] array = new double[size];
        double media = 0;
        for (int i = 0; i < array.length; i++) {
            double num = askDouble("Introduce un numero");
            media = num + media;
        }
        return media/array.length;
    }

    public static void main(String[] args) {
        String operation = askOperation();
        while(!operation.equals("3")){
            if(operation.equals("1")){

                double media = media();
                System.out.println(media);
                operation = askOperation();

            }else if(operation.equals("2")){

                double division = division();
                System.out.println(division);
                operation = askOperation();

            }else{
                System.out.println("Debe ser 1, 2 o 3. Intentalo de nuevo");
                operation = scanner.nextLine();
            }
        }
        System.out.println("Terminado.");

    }


}
