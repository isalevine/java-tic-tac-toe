public class Board {
    char[] rowOne = new char[]{ 'x', ' ', 'o' };
    char[] rowTwo = new char[]{ ' ', ' ', ' ' };
    char[] rowThree = new char[]{ ' ', ' ', ' ' };

    public String printBoard() {
        String one = "";
        String two = "";
        String three = "";
        int i;

        for (i = 0; i < rowOne.length; i++) {
            one = one + rowOne[i];
            if (i < 2) {
                one = one + " | ";
            }
        }

        System.out.println(one);

        return one;
    }
}