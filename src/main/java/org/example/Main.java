class SampleArrayPrograms {
    public static void main(String[] args) {
        int a[]  = {1, 2, 3, 4, 5};
        System.out.println(" 1st loop....." );
        for(int i = 0; i <= a.length-1; i++) {
            System.out.println(a[i]);
        }

        System.out.println( "2nd loop....." );
        int b[] = new int[5];
        b[0] = 1;
        b[1] = 2;
        b[2] = 3;
        b[3] = 4;
        b[4] = 5;

        for(int i = 0; i <= b.length-1; i++) {
            System.out.println(b[i]);
        }
    }

}
