/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Krista
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        int number, n;
        
        Scanner myInput = new Scanner(System.in);
        
        System.out.println("Selamat datang di program bilangan genap!\n");
        
        System.out.println("Masukkan batas angka");
        n = myInput.nextInt();
        
        System.out.println("Dibawah ini merupakan deret bilangan genap:");
        
        for(number = 0; number < n; number++)
        {   
            if(number % 2 == 0 && number != 0){
                System.out.print(number);
                System.out.print(" ");
            }
        }
    }
}
