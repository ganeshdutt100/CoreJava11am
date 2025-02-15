package StringFile;

public class code2 {
    public static void main(String[] args) {
        String str = "hello world";
//       String capitalFirstLetter =  str.substring(0,1).toUpperCase() + str.substring(1);
//        System.out.println(capitalFirstLetter);

        String [] words = str.split(" ");

        String result ="";
//
        for(String word : words){
            result += word.substring(0,1).toUpperCase() + word.substring(1) + " ";
        }
        System.out.println(result);
    }
}
