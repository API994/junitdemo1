package com.junitdemo;

public class MatrixMultiplication {
	public boolean getMatrix(int a[][],int b[][])
	{
    int r1, c1, r2, c2;     
        boolean x=false;     
      r1 = a.length;    
    c1 = a[0].length;    
      r2 = b.length;    
    c2 = b[0].length;    
            
    if(c1 != r2){    
        System.out.println("Matrices cannot be multiplied");  
    }    
    else{       
        int d[][] = new int[r1][c2];    
            
        for(int i = 0; i < r1; i++){    
            for(int j = 0; j < c2; j++){    
                for(int k = 0; k < r2; k++){    
                   d[i][j] = d[i][j] + a[i][k] * b[k][j];     
                }    
            }    
        }    
            
        System.out.println("Multiplication of two matrices: ");    
        for(int i = 0; i < r1; i++){    
            for(int j = 0; j < c2; j++){    
               System.out.print(d[i][j] + " ");    
            }    
            System.out.println();  
        }   
        x=true;
    }   
    return x;
}    
}