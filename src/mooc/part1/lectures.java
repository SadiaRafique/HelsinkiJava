package mooc.part1;

public class lectures {
    public static void main(String[] args) {
        //String functions
        String name="sadia";
        System.out.println(name);

        String str= new String("hi");
        System.out.println(str);

        System.out.println(name.length());

       String a= name.toUpperCase();
        System.out.println(a);

        String b= name.toLowerCase();
        System.out.println(b);

        String untrimmed= "      you";
        System.out.println(untrimmed.trim());

        System.out.println(name.substring(1));

        System.out.println(name.substring(0,5));

        System.out.println(name.replace('a','r'));
        System.out.println(name.replace("sad","abc"));

        System.out.println(name.startsWith("sad"));
        System.out.println(name.endsWith("sad"));

        System.out.println(name.charAt(0));
        System.out.println(name.indexOf("a"));
        System.out.println(name.indexOf("a",2));

        System.out.println(name.lastIndexOf("a"));
        System.out.println(name.lastIndexOf("a",3));

        System.out.println(name.equals("sAdia"));
        System.out.println(name.equalsIgnoreCase("sAdia"));

        System.out.println("sadia ia a very good\nprogrammer ");
    }
}
