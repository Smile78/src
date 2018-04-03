public class VIII_Mssv_smmr_II_arr {
    public static void main(String[] args) {
        //int arr1[] = new int[9];
        //int arr2[] = new int[9];
        int mn1 = 0;
        int l = 0;
        int v = 0;
        int bk=0;
        int bv=0;

        int[] RanArr=new int[15];


        String Arr1viraj[] = new String[36];
        int Arr2znch[] = new int[36];

        int k = -1;

        for (int i = 2; i < 10; i++) {
            for (int j = 2; j < 10; j++) {
                {
                    {
                        if (j >= i) {
                            String str1mn = Integer.toString(i);
                            String str2mn = Integer.toString(j);
                            String str3mno = str1mn.concat("*").concat(str2mn);  //.concat("=")
                            k = k + 1;
                            Arr1viraj[k] = str3mno;
                            Arr2znch[k] = i * j;

                        }
                    }
                }
            }
        }

        for (int c = 0; c < RanArr.length; c++){
            RanArr[c] = (int) (Math.random() * 10);
            }

        for (int x = 0; x < RanArr.length; x++){
            bv= RanArr[x];
            System.out.println("знач"+bv+"поз"+x);
                for (int n = 0; n < RanArr.length; n++){
                    bk= RanArr[n];
                    System.out.println(bk+"bk"+n+"n");
                      if (bk==bv&&x!=n)
                          RanArr[n]=(int)(Math.random() * 10);
                             System.out.println(RanArr[n]+"RanArr[n]");
                }}


        for (int f = 0; f < RanArr.length; f++){
              System.out.println(f+" знач  "+RanArr[f]);
        }
    }
    }