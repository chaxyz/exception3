
public class Lab6 {
    public static void main(String[] args) {
        int[] list = new int[10];
        try {
            System.out.println("List[10] is " + list[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            e.printStackTrace();
            StackTraceElement[] s = e.getStackTrace();
            System.out.println(s.length);
            for(var el : s){
                System.out.print(el.getClassName() + " / ");
                System.out.print(el.getMethodName() +" / ");
                System.out.print(el.getFileName() + " / ");
                System.out.println(el.getLineNumber());
            }
        }
    }
}
