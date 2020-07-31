///n,x are not 0!!!! otherwise m. should deal with exception division by 0!!

public class NOK {

    public int NOK(int n, int x) {
        int j;
        if (x<n) j=n;
        else j=x;
        boolean t=true;
        if (x<n) j=n;
        else j=x;
        while (t)
        {
            if ((j%x == 0) && (j%n == 0)) break;
            else j+=1;
        }
        return j;
    }
}

