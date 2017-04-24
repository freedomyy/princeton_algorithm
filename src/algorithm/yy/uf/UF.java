package algorithm.yy.uf;

/**
 * Created by yanyan on 4/22/17.
 */
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import java.lang.*;


public class UF {
    private int count; //number of components

    public UF(int n) {
        if(n<0) throw new IllegalArgumentException();
        count = n;


    }


    public static void main(String[] args) {
        int n = StdIn.readInt();
        UF uf = new UF(n);
        while(!StdIn.isEmpty()) {
            int p = StdIn.readInt();
            int q = StdIn.readInt();
            if (uf.connected(p,q))continue;
            uf.union(p,q);
            StdOut.println(p + " " + q);
        }
        StdOut.println(uf.count() + " components");


    }
}
