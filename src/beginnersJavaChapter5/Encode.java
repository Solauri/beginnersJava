package beginnersJavaChapter5;

/*

    Isaac J. Mejia
    7/25/21

 */

class Encode {
    public static void main(String args[]) {
        String msg = "We are what we repeatedly do.",
                encmsg = "",
                decmsg = "";
        int key = 89;

        System.out.print("Original message: ");
        System.out.println(msg);

        // encode the message
        for (int i = 0; i < msg.length(); i++)
            encmsg += (char)(msg.charAt(i) ^ key);

        System.out.println("Encoded message: " + encmsg);

        // decode the message
        for (int i = 0; i < msg.length(); i++)
            decmsg += (char)(encmsg.charAt(i) ^ key);

        System.out.print("Decoded message: ");
        System.out.println(decmsg);
    }
}
