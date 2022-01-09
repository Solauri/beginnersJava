package beginnersJavaChapter5;

/*

    Isaac J. Mejia
    7/24/21

 */

class BubbleString {
    public static void main(String args[]) {
        String babyNames[] = {
                "Jonah",
                "Josiah",
                "Ada",
                "Ezra",
                "Jazmine",
                "Anna",
                "Naomi",
                "Elijah",
                "Simon",
                "Dinah"
        };

        System.out.println("Unsorted baby names: ");
        for (String e: babyNames) {
            System.out.println(e);
        }

        for (int a = 1; a < babyNames.length; a++)
            for (int b = babyNames.length-1; b >= a; b--) {
                if (babyNames[b-1].charAt(0) > babyNames[b].charAt(0)) {
                    String t = babyNames[b-1];
                    babyNames[b-1] = babyNames[b];
                    babyNames[b] = t;
                }
            }

        System.out.println("\nSorted baby names: ");
        for (String e: babyNames) {
            System.out.println(e);
        }
    }
}
