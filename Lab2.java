public class Lab2 {
    public static void main(String[] args) {
        int[] list = new int[10];
        try{        
            System.out.println("List[10] is " + list[10]);
        }catch(ArithmeticException e){
            System.out.println("ArithmeticException");
        }catch(RuntimeException e){
            System.out.println("RuntimeException");
        }catch(Exception e){
            System.out.println("Exception");
        }
    }
}
