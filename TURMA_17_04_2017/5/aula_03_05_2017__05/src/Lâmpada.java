class Lâmpada 
  {
      short voltagem;
      
      void acender()
        {
           voltagem = 220;
        }
        
      void apagar()
        {
           voltagem = 0;
        }  
        
      void mostrarEstado()
        {
           if ( voltagem == 220 )
              System.out.println( "ACESA" );
           else
              System.out.println( "APAGADA" );
        }  
  }