public class pyramid{
	
	public static void main(String[] args){
		
		int i,m=9,j,n;
		
	    for(i=1;i<=m;++i){
			
			for(j=1;j<=m-i;j++){
				System.out.print(" ");
			for(n=1;n<=2*i-1;n++);
			    System.out.print("$");
			
			System.out.println();
			}
		}
	}
}