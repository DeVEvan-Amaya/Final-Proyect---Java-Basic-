//Programa Final -Introductorio a Java: 


import java.util.Scanner;
import java.util.Random;

void main() {
    Scanner teclado = new Scanner(System.in);
    Random generador = new Random();
    
    int numeroSecreto = generador.nextInt(100) + 1;
    
    int intentos = 5;
    int numeroUsuario = 0;

    System.out.println("¡Bienvenido a ADIVINA EL NÚMERO!");
    System.out.println("He pensado un número del 1 al 100. Tienes " + intentos + " intentos para adivinarlo.");

    for (int i = 1; i <= intentos; i++){
        
        System.out.print("\nIntento #" + i + ". Ingresa tu número: ");
        int numero = teclado.nextInt();

        if (numeroUsuario == numeroSecreto){
            System.out.print("Ganaste!");{
                break;
            }
        }

        if (numeroUsuario > numeroSecreto){
            System.out.println("El número secreto es MENOR");
        }

        if (numeroUsuario < numeroSecreto){
            System.out.println("El número secreto es MAYOR");
        }
    }
    // 6. FINAL DEL JUEGO (Fuera del bucle)
    // ---> AQUÍ: Un último 'if' para revisar si el usuario gastó sus intentos y no adivinó, 
    // para imprimir "Game Over, el número era: " + numeroSecreto
}