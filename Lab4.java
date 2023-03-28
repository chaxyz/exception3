public class Lab4 {
    public static void main(String[] args) {
        int[] list = new int[10];
        try{
            System.out.println("Statement 1 " );
            System.out.println("Statement 2 " + list[10]);
            System.out.println("Statement 3 " );
        }catch(ArithmeticException e){

        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
            throw new RuntimeException();
        }finally{
            System.out.println("Statement 4 " );
        }
        System.out.println("Statement 5 " );
    }
}
