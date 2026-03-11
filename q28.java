public class q28 {

    public static int countValleys(String path) {
        int level = 0;
        int valleys = 0;

        for (char step : path.toCharArray()) {

            if (step == 'U') {
                level++;

                if (level == 0) {
                    valleys++;
                }

            } else if (step == 'D') {
                level--;
            }
        }

        return valleys;
    }

    public static void main(String[] args) {
        String path = "UDDDUDUU";
        System.out.println("Number of Valleys: " + countValleys(path));
    }
}
    

