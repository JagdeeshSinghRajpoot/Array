public class String_list_short {

    public static int Stringfind(String list[], String key) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String list[] = { "sunday", "monday", "tuesday", "wednasday", "thursday", "friday", "suterday" };
        String key = "friday";
        System.out.println(Stringfind(list, key));

    }

}
