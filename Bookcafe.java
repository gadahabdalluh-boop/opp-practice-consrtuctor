/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package aaaa.bookcafe;

/**
 *
 * @author gadah
 */
public class Bookcafe {
     public String drinkNane;
     public int cupsold;
     public double price;
     
     public Bookcafe(String drinkNane, int cupsold,double price) {
     this.drinkNane = drinkNane;
     this.cupsold = cupsold;
     this.price = price;
     }
     public void showDetails(){
        System.out.println("DrinkNane:" + drinkNane);  
         System.out.println("Cupsold:" +  cupsold);   
         System.out.println("Price:" +  price);   
         
     }
    public static void main(String[] args) {
       Bookcafe c1 = new Bookcafe("latte", 100,23);
       Bookcafe c2 = new Bookcafe("black coofee",200,15);
       
        c1.showDetails();
        System.out.println();
        c2.showDetails();
    }
}
