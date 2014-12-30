public class Q65 {

public static int[] sort (int [] arrayName){
    int temp;
    for (int i = 0; i < arrayName.length; i++)
    {
        if(arrayName[i] > arrayName[i+1])
        {
            temp=arrayName[i];
            arrayName[i]=arrayName[i+1];
            arrayName[i+1]=temp;
            i=-1;
        }
    }
    return arrayName;
}

public static void main(String[] args) {
    int [] arrayName = new int[10]; 
    for (int i = 0; i < arrayName.length; i++) { 
      arrayName[i] = (int)(Math.random()*100); 
    } 

    
}
}