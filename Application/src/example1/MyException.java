package example1;
	class MyException1 extends Exception{
		void MycustomException1()
		{
		int num=2;
		int temp=num;
		int r=0,k=0;
		int i=0,s=0;
		int a[]=new int[10];
		
		while(num>0)
		{
			r=num%10;
			a[k++]=r;
			num=num/10;
		}
		//	for(int i=0;i<k;i++)
		//	{
		//	System.out.println(a[i]);
		//	}
		//System.out.println(k);
		for(int j=0;j<k;j++)
		{
			s=(int) (s+Math.pow(a[j], k));
		}
		System.out.println(s);
		if(s==temp)
		{
			System.out.println("armstrong");
		}
		else
		{
			System.out.println("not armstrong");
		}

	}
	}

