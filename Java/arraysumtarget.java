

class Sumarraytarget
 {
    public static void main(String args[])
      {

          int arr[] = {2,7,11,15};
          int flag=0,ind1=0,ind2=0; 
 
          int target=9;

          int arr[] = {2,7,11,15};

         for(int i=0; i<arr.length-1; ++i)
           {
             for(int j=(i+1); i<arr.length;++j)
                {
                   if(arr[i]+arr[j]==target)
                     {
                       ind1 = i; ind2=j;
                       flag =1;
                       break;
                     }
                }

               if(flag)
                break;
           }

       if(flag)
    
           System.out.println("Target possible\nIndices are: " + ind1 + " and "+ ind2);
               
         
      else
          System.out.println("Target not possible from the given array");  

 


}

}








              
           }
          
      }

 }