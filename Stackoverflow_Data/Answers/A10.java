
public class A10 {
	public static  <T extends Comparable< ? super T>>
    T[] sort(T [] a){
    T tmp;
    for(int i=0;i<a.length-1;i++){
        if(a[i].compareTo(a[i+1])>0){
            tmp = a[i];
            a[i]=a[i+1];
            a[i+1]=tmp;
            sort(a);
        }
        System.out.println("i:"+i+" "+a[i]);

    }
    return a;
}
}
