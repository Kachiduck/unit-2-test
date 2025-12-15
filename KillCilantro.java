public class KillCilantro {

    public static String killCilantro(String str) {
        String a = "";
        String b = "";

        while (str.indexOf("cilantro") != -1) {
            a = str.substring(0, str.indexOf("cilantro"));
            b = str.substring(str.indexOf("cilantro") + 8);
            str = a + "parsley" + b;
        }

        return str;
    }

    public static void main(String[] args) {
        System.out.print(killCilantro("I love cilantro so much"));
    }
}