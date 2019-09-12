/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegoguerritas;

/**
 *
 * @author Carlos
 */
public class Guerrita {
    private int [][] tablero1=new int[10][10];
    private int [][] tablero2=new int[10][10];
    int turno;
    int estado;
    
 public void iniciarpartida()
 {
     for (int i=0;i<10;i++)
     {
         for (int j=0;j<10;j++)
         {
             tablero1[i][j]=0;
             tablero2[i][j]=0;
         }
     }

 }
 public boolean ponerfichas(int jugador,int [][] posiciones)
 {
   int filas=posiciones.length;
   int columnas=posiciones[0].length;
   boolean correcto=true;
           
     for (int i=0;i<filas;i++)
     {
         if (jugador==1)
             if (tablero1[posiciones[i][0]][posiciones[i][1]]==0)
                tablero1[posiciones[i][0]][posiciones[i][1]]=1;
             else
                 correcto=false;
         else
             if (tablero2[posiciones[i][0]][posiciones[i][1]]==0)
             tablero2[posiciones[i][0]][posiciones[i][1]]=1;
            else
                  correcto=false;
     }    
   
 return correcto;    
 }
 public boolean disparar (int jugador,int i,int j)
 {
 if (turno==jugador)    
  if (jugador==1)
        switch (tablero1[i][j])
        {
            case 0: // vacio
                break;
            case 1: // con posicion
                break;        
            case 2: // vacio disparado
                break;
            case 3: // con posicion disparado
                break;                 
        }
  else
        switch (tablero2[i][j])
        {
            case 0: // vacio
                break;
            case 1: // con posicion
                break;        
            case 2: // vacio disparado
                break;
            case 3: // con posicion disparado
                break;                 
        }
          
  return true;   
 }    
}
