class centerdigit{
    public static void main(String[] args) {
        int num=1342425;
        String str = String.valueOf(num);
        int len =str.length();
        if(len%2==0)
        System.out.println(-1);
        int mid = len/2;
        System.out.println(str.charAt(mid)-'0');
    }}