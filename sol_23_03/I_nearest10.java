public class I_nearest10 {
        public static void main (String [] args){
            float m = 13.33f;
            float n = 8.45f;
            float x = 10.00f;
            float m1 =0.00f;
            float n1 =0.00f;

            //float o = -10;
            if (m>=10)
                m1=m-x;
            else
                m1=x-m;
            System.out.println("дельта m: "+m1);

            if (n>=10)
                n1=n-x;
            else
                n1=x-n;
            System.out.println("дельта n: "+n1);

            if (m1>n1)
                System.out.println("n ближе к 10 ");
            else if (m1==n1)
                System.out.println("нефига не разобрать, нужны эксперименты") ;
            else
                System.out.println("m ближе к 10 ");

        }
    }



