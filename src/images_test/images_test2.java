/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package images_test;

/**
 *
 * @author formation_gep
 */
public class images_test2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int Matrice[][]=new int [][]{
                                {25,28,100,100,100,100},
                                {44,45,50,100,100,100},
                                {65,65,50,20,100,100},
                                {90,62,100,5,0,0},
                                {60,87,100,0,100,100}   };
        affiche(Matrice);
        ///*********Affichage de nuance inversé ***********///
         System.out.print("\n Nuance inversé :");
         int [][] matInv=Mystere(Matrice);
         affiche(matInv);
           ///////********** Affichage moyenne******************************************
         System.out.print("\n La saturation moyenne vaut : "+Moyenne(Matrice));
         ///**********Affichage de matrice avec les Contrastes diminués ******
         System.out.print("\n Contrast Diminué :");
        
         System.out.print("\n Constrat accentué : ");
         int [][] matAcc=AccentueContrast(Matrice);
         affiche(matAcc);
    }
        public static void affiche(int[][] M){
             for(int i=0;i<5;i++){
               System.out.println();
               for(int j=0;j<6;j++){
                    System.out.print(M[i][j]+"\t");
                }
            }
        }
    //////**************** fonction Mystere *************************
    public static int[][] Mystere(int [][]M){
         for(int i=0;i<5;i++){
            for(int j=0;j<6;j++){
                M[i][j]=100-M[i][j];
            }
        }
        return M;
    }
    
    
    //////***************** fonction Moyenne **********************
    public static int Moyenne(int[][]M){
     int som=0;
     int moy;
     for(int i=0;i<5;i++){
            for(int j=0;j<6;j++){
                som=som+M[i][j];
            }
    }
     moy=som/30;
     return moy;
    }
    /////////////*******************Fonction Diminuant Contrast*******************
    public static int[][] DiminuantContrast(int [][]matrice2){
        int moy=Moyenne(matrice2); int correction;
         for(int i=0;i<5;i++){
            for(int j=0;j<6;j++){
                correction=matrice2[i][j]-moy/2;
                matrice2[i][j]=matrice2[i][j]-correction;
            }
        }
        return matrice2;
    }
    //////*****************fonction Accentue Constrate *****************
     public static int[][] AccentueContrast (int [][] matrice) {
for (int i=0; i<5; i++) {
    for (int j=0; j<6; j++){
        if (matrice[i][j] > 75)
            matrice [i][j]=100;
        else if (matrice [i][j] >50)
            matrice [i][j]=75;
        else
            matrice[i][j]=matrice [i][j]/2;
    }
}
return matrice;
 }
}
