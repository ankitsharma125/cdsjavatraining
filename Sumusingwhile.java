class SumUsingWhile {
    public static void main(String[] args) {
        int i =1;
        int sum = 0;
        while(i<=10){
            System.out.println(i);
            i++;
            sum=sum+i;
        }
        System.out.println(sum);
    }
}