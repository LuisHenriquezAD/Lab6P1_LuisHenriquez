package lab6p1_luishenriquez;

import java.util.Random;
import java.util.Scanner;

public class Lab6P1_LuisHenriquez {

static Scanner lea = new Scanner (System.in);//ESTO ES PARA LEER DATOS INGRESADOS

static Scanner leer = new Scanner (System.in);

static Random ran = new Random();//ESTO DA DATOS RANDOMW


           public static void main(String[] args) {
    
    int Respuesta = 1;
    int opcion = 0;
    
        while (Respuesta == 1) {
        
            
          Menu ();
          opcion = lea.nextInt();
          
          
          
      
            switch (opcion) {
                
              
               
                case 1:
                  
 
                    System.out.println("Ingrese tamano de la cadena a generar");
                    int size = lea.nextInt();
                        while (size <= 1){
                            System.out.println("Ingrese tamano de la cadena a generar");
                            size = lea.nextInt();
                        }
                    int [] tam = new int [size];
                    
               
                    
                    
                    
                    System.out.println("Ingrese un limite");
                    int Mayor = lea.nextInt();
                    
                    
                    System.out.println("Ingrese un limite");
                    int Menor = lea.nextInt();
                     
                    
                    
                    if (Mayor < Menor){
                        int [] M = new int [Menor];
                        int [] m = new int [Mayor];
                    }
                    else{
                        int [] M = new int [Mayor];
                        int [] m = new int [Menor];
                    }
                    
                    
                    System.out.println();
                    System.out.println("-ARREGLO GENERADO-");
                    tam = gengRandArray(size, Menor, Mayor);
                    System.out.println();
                  
                  System.out.println("-NO.Divisores primos-");
                  int[] arreglo = getTotalPrimeCount(tam);
                  for (int i =0;i<arreglo.length;i++){
                      System.out.print("["+arreglo[i]+"]");
                  }
                  System.out.println();
                  
                  
                   

                break;
                                
            
            
               case 2:  
                   
                   System.out.println("Ingrese una oracion");
                   String cadena = leer.nextLine().toLowerCase();
                   extraerFrecuencias(cadena);
                   
                   
               break;
                
               
               
               
        
               default : 
                     if (opcion != 3){
                        System.out.println("ERROR OPCION INCORRECTA");
                     }
               break;
     
            }//Fin switch
            
            
                    
            System.out.println("Si quiere continuar ingrese {1} si no ingrese cualquier otro numero:");
            Respuesta = lea.nextInt();
            
         }//fin del ciclo while para 
            
    }
    
    
    public static int  Menu(){
        
          int opcion = 0;
          
          System.out.println("1.¿Cuántos primos tienes?");
          
          System.out.println("2.Frecuencia de letras");
   
          return opcion;
    }
    
    
    
    
    
     public static int [] gengRandArray(int s, int a, int b){
    
      int [] nums = new int [s];
      System.out.println(a);
      System.out.println(b);
      for (int i = 0; i<s; i++){
          
         nums[i] = b+ran.nextInt(a);
        
      }//fin for
      
      System.out.println();
      
       for (int i = 0; i<s; i++){
          
         System.out.print("["+nums[i]+"]");
   
      }//fin for
       
      System.out.println();
      return nums;
      
    }//FIN METODO LECTURA
  
     public static boolean isPrimos(int[] nums){
        boolean Okay = false;
                            
                            int uno = 1;
                            int cero = 0;
                                
                                
                          for(int i=0;i<nums.length;i++){
                              
                             while (uno <= nums[i]) {
                          
                                 
                                 if (nums[i] % uno == 0) {
                                     
                                     cero = cero + 1;
                                 }
                                 
                                 uno = uno + 1;
                             }
                             
                             if (cero == 2) {
                                 Okay = true;
                             }
                             else{
                                 Okay = false; 
                             }
                             
                             if (Okay == true) {
                                 System.out.println("Es primo");
                             }
                             else if(Okay == false){
                                 System.out.println("No es primo");
                             }
                          }//FIN DEL FOR DE LENGTH
                             return Okay; 
                             
    }
    
    
     public static int[] getTotalPrimeCount(int[] nums){
         
          int uno = 1;
          int cero = 0;
          boolean Okay = false;
          int[] primo = new int[nums.length]; 
          int primis =0;
          
         for (int i = 1; i<nums.length;i++){
             primis = 0;
             for (int f = 1; f<=i;f++){
                  
                  if (nums[i] % f == 0) {
                                     primis = primis+1;
                                     primo[i] += primis;
                                     cero += 1;
                                 }
                  
                  
         
         
         
         
              
             }                     
                                 
   
             
         
         
         
          
          
        
         }
         
         return primo;
     }
    
     
     public static int countPrimeFactors(int primis){
    int primotes = primis;
    
    //CANTIDAD DE NUMEROS PRIMOS EN TODA LA CADENA
    return primotes;
}     
     
     public static int [] extraerFrecuencias(String frecuencia){
            int[] frec = new int[26];
            int let=0;
            
            
            char[] letras = { 'a', 'b' , 'c' , 'd', 'e' , 'f' , 'g' , 'h', 'i',
                                       'j' , 'k' , 'l' , 'm' , 'n' , 'o', 'p',              
                                       'q' , 'r' , 's' , 's' , 't' , 'v', 'u',
                                       'w' , 'x' , 'y' , 'z'};
            
            for (int i= 0; i<frecuencia.length();i++){
                for (int j = 0; j < letras.length; j++) {
                    
                    if(frecuencia.charAt(i) == letras[j]){
                                let++;
                                frec[i]+= let; 
                                let= 0;

                             }
                            else{
                                frec[i]+= let;
                            }
                }
                            
                            }
               
             
         for (int i = 0; i < frec.length; i++) {
             System.out.print("["+frec[i]+"]"); 
         }
      System.out.println();           
      System.out.print("[a][b][c][d][e][f][g][h][i][j][k][l][m][n][o][p][q][r][s][t][u][v][w][x][y][z]");
     
     
     return frec;
     }
     
}//FIN PUBLIC CLASS
