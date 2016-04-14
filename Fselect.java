public class FSelect{
    public static int Select(int k, int[] a, int hi, int low){
	if (low >= hi){
	    return a[k];
	    
	}
	else{
	    
	    int rand = (int)(Math.random() * (hi -low));
	    int post = a[rand];
	    int savPos = low;
	    a = swap(a,rand,hi);
	  //  System.out.println("post is " + post);
	    	System.out.println(ArrayPrinter(a));
	    for (int i = low; i < hi; i++){
		if(a[i] < post){
		    a = swap(a, savPos, i);
		    savPos ++;
		}
		System.out.println(ArrayPrinter(a));
		//System.out.println(savPos);
	    }
	    
	    a = swap(a,hi,savPos);
	    	System.out.println(ArrayPrinter(a));
	    if (k == savPos){
		return a[k];
	    }else if ( k < savPos){
		hi = savPos;
	    }else{
		low = savPos;
	    }
	    return Select(k,a,hi,low);
	}
    }
		

    public static int[] swap(int[] a, int b, int c){
	int temp1 = a[b];
	int temp2 = a[c];
	a[b] = temp2;
	a[c] = temp1;
	return a;
    }
    public static String ArrayPrinter(int[] a){
	String ret = "";
	for(int i = 0; i < a.length; i++){
	    ret += a[i] + ",";
		}
	return ret;
    }
    public static void main(String[] args){
	int[] a = {8,6,7,5,3,0,9};
	System.out.println(Select(0,a, 6,0));
	System.out.println(Select(1,a, 6,0));
	System.out.println(Select(2,a, 6,0));
	System.out.println(Select(3,a, 6,0));
	System.out.println(Select(4,a, 6,0));
	System.out.println(Select(5,a, 6,0));
	System.out.println(Select(6,a, 6,0));
	System.out.println("should be 0356789");
	
	
			   }
} 
