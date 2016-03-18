
public class hello {
public static void main(String[] args){
	int[] a = {1};
	hello t = new hello();
	t.increment(a);
	System.out.println(a[a.length-1]);
}
void increment(int[] i) {
	i[i.length-1]++;
}
 
}