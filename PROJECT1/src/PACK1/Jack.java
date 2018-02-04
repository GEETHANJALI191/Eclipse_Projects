package PACK1;

public class Jack {

	public static void main(String[] args) {
		int res=maxStep(2,2);
		System.out.println(res);

	}
	static int maxStep(int n, int k){
		int i=0;
		int maxstep=0;
		for(i=0;i<=n;i++){
		if(maxstep+i!=k)
		{
			maxstep=maxstep+i;
		}
		else
		{
			maxstep=maxstep+i-1;
		}
		}
		return maxstep;
	}

}
