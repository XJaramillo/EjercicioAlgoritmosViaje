/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package debergrupal;

/**
 *
 * @author hp
 */
public class DeberGRUPAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double distJuan, distAmigo, distSepara, ptoEncuentro, cont;
    double distanVía = 335;

    distJuan = 70;
    distAmigo =150;
    distSepara = distanVía - (distJuan + distAmigo);
    ptoEncuentro = (distSepara/2);
    System.out.println("PuntoEncuentro:"+ptoEncuentro);

    for (cont = 0; cont < ptoEncuentro; ++cont) {
      distJuan = distJuan+1; 
      distAmigo = distAmigo+1;
      System.out.println("Juan está en el "+distJuan+" km Quito-Atacames ");
      System.out.println("Amigo de Juan está en el "+distAmigo+" km Atacames-Quito ");
      pausa();
    }
    
    System.out.println("\n  Juan viajando de Quito-Atacames se encontró con su amigo en el "+distJuan+" km");
    System.out.println("\n  Amigo de Juan viajando de Atacames-Quito se encontró con Juan en el "+distAmigo+" km");
  
  }

  public static void pausa(){ 
    try { 
        Thread.sleep(800); 
    } catch (Exception ignored) {} 
  
   
  


    }
    
}
