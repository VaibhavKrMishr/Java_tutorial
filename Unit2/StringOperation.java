class StringOperation {
    public static void main(String[] args) {
        String str1="Hello";
        String str2=" World";

        String str3 =str1.concat(str2);
        System.out.println(str3);
        System.out.println(str1+str2);

        System.out.println(str3.replace("l", "i"));
        System.out.println(str3.replace("i", "l"));
        System.out.println(str3.charAt(2));
        System.out.println(str3.charAt(6));
        System.out.println(str3.charAt(10));

        System.out.println(str3.toUpperCase());
        System.out.println(str3.toLowerCase());

        String sen ="Java is Cool in it own way";
        System.out.println(sen.contains("is"));
        System.out.println(sen.contains("b"));


        System.out.println(sen.substring(4));
        System.out.println(sen.substring(5, sen.length()));
        System.out.println(sen.substring(4,18));
    }
}