package PACK1;

public class Traingle {
	public static void main(String[] args){
		int[] x={5,6,7};
		int[] y={3,34,5};
		int[] z={6,7,8};
		String[] s=triangleOrNot(x,y,z);
		for(int i=0;i<s.length;i++){
		System.out.println(s[i]);
		}
		
	}
	static String[] triangleOrNot(int[] a, int[] b, int[] c){
		int len1=a.length;
		String[] str=new String[len1];
		for(int i=0;i<len1;i++){
			if(a[i]+b[i]>c[i] && a[i]+c[i]>b[i] && b[i]+c[i]>a[i]){
				str[i]="Yes";
			}
			else {
					str[i]="no";
				}
			}
			return str;
		}
		
	}


