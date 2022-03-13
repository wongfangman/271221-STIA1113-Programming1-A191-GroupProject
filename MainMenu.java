import java.util.Scanner;

public class MainMenu{

   public static void main (String[] args){
   
   Scanner input = new Scanner(System.in);
   
   int menu;
   
   /*Display Menu*/
   System.out.println("1.\t\t\tNext-Day Delivery Menu");
   System.out.println("2.\t\t\tSame-Day Delivery Menu.");
   System.out.println("3.\t\t\tPrepaid Box & Envelope Menu");
   System.out.println("4.\t\t\tPos Ekspres Menu");
   System.out.println("5.\t\t\tExit.");
   
   /*Input the number for each menu*/
   do{
   System.out.printf("Enter the menu you want\t\t\t:");
   menu = input.nextInt();
   }while(menu != 1 & menu != 2 & menu != 3 & menu != 4 & menu != 5);
   
   /*Call Method*/
   if (menu == 1){
      Poslaju.main(args);
      }else if (menu == 2){
               Samedaydelivery.main(args);
            }else if (menu == 3){
                     PrepaidBEnvelope.main(args);
                  }else if (menu == 4){
                           PosEkspres.main(args);
                        }else{
                             Exit.main(args);
                              }
                             
 }
 }