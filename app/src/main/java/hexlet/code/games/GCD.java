package hexlet.code.games;



public class GCD {

    static final int HUNDRED_MULTIPLIER = 100;
    static final int ROUNDS = 3;
    static final int Q_AND_A = 2;

    public static String[][] divisor() {

        String[][] data = new String[ROUNDS][Q_AND_A];
        String correctAnswer = "";

        for (var round : data) {
            int num1 = (int) (Math.random() * HUNDRED_MULTIPLIER);
            int num2 = (int) (Math.random() * HUNDRED_MULTIPLIER);
            int biggerNum = Math.max(num1, num2);

            for (int i = 1; i <= biggerNum; i++) {
                if (num1 % i == 0 && num2 % i == 0) {
                    correctAnswer = "" + i;
                }
            }

            round[0] = num1 + " " + num2;
            round[1] = correctAnswer;
        }

        return data;
    }
}
