
public class A38 {

    int [] sort(int [] a){
    int tmp;
    for(int i=0;i<a.length;i++){
    	for(int j = 0; j < a.length; j++) {
        if(a[i] < (a[i+1])){
            tmp = a[i];
            a[i]=a[i+1];
            a[i+1]=tmp;
            sort(a);
        }
        System.out.println("i:"+i+" "+a[i]);      
    	}
    } 	
	return a;
    }
    
}

