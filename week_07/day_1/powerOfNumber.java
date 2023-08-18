class HelloWorld {
    public static int powerOfNumber(int num, int pow)
    {
        if( pow == 0)
        {
            return 1;
        }else{
             return num * powerOfNumber(num,pow -1);
        }
    }
    public static void main(String[] args) {
        int num = 2;
        int pow = 5;
        System.out.println(powerOfNumber(num,pow));
    }
}
