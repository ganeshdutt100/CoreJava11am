package Exception;

public class class3 {
    public static void main(String[] args) {
        try{
            Class.forName("Exception.class1");
//            Class.forName("");
            System.out.println("Class Found class1 ");
        }
        catch (ClassNotFoundException e){
            System.out.println(" Class not found : "+ e.getMessage());
        }

    }
}
