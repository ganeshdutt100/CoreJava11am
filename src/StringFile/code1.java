package StringFile;

public class code1 {
    public static void main(String[] args) {
//        String str = "Ayush";
//        String str2 = "Nautiyal";
//
//        String result = str+"  "+str2;
//        System.out.println(result);

//        String str = "Ayush Nautiyal";
//        String str1 = "ayush Nautiyal";
//        String exampleSubSting = str.substring(0,5);
//        System.out.println(exampleSubSting);
//        System.out.println(str.charAt(1));
//        System.out.println(str.indexOf('y',2));
//        System.out.println(str.toUpperCase());
//        System.out.println(str.equals(str1));
//        System.out.println(str.startsWith("ayush"));
//        System.out.println(str.endsWith("Nautiyal"));
//        System.out.println(str.replace("Ayush","Vardan"));


        String str = "Ayush , Nautiyal , Vardan , kaushik";
        String[] output = str.split(",");
        for(String x : output){
            System.out.println(x);
        }
//        System.out.println(output);
//        String output = str.trim();
//        System.out.println(str.trim());
//        System.out.println(output.length());
//        System.out.println(str.replace("a" , "o"));
//        System.out.println(str.replaceFirst("a" , "o"));

//        System.out.println(str.split(" / "));
    }
    }

