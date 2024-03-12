package org.example;

public class MasGrande {
    public static int max(int [] a){
        int i,m = 0;
        for (i=0; i<a.length;i++){
            if (a[i]>m)
                m=a[i];
        }
        return m;
    }
}
