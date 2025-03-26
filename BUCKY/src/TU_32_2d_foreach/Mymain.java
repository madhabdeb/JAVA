package TU_32_2d_foreach;
import java.util.*;

public class Mymain {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int[][] arr=new int[3][3];
		int a,b,c,num;
		
		for(a=0;a<3;a++){
			for(b=0;b<3;b++)
			{
				num=scan.nextInt();
				arr[a][b]=num;
			}
		}
		
		show(arr); 
	}
	
	public static void show(int x[][]){
//		for(int p[]:x){
//			for(int q:p){
//				System.out.println(q);
//			}
//			System.out.println();
//		}
		
		for(int a=0;a<x.length;a++){
			for(int b=0;b<x[a].length;b++){
				System.out.println(x[a][b]);
			}
			System.out.println();
		}
	}

}
