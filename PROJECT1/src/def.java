
public class def {

	public static void main(String[] args) {
		String[] s=new String[2];
		s[0]="doog";
		s[1]="efg";
		String s1=" ";
		for(int i=0;i<s.length;i++){
			for(int j=i+1;j<s.length;j++){
				if(s[i].charAt(0)<s[j].charAt(0)){
					String t=s[i];
					s[i]=s[j];
					s[j]=t;
				}
			}
		}
		for(int i=0;i<s.length;i++){
			 s1=s1+" "+s[i];
		}
		System.out.println(s1);
		

	}

}
