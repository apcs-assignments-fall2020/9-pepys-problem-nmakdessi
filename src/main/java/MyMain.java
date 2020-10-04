public class MyMain {

    // Calculate the probability of rolling at least one 6 when rolling 
    // six dice. Uses 10000 trials.
    // Returns in the answer as a double corresponding to the percentage
    // For example, 75.5% would be 75.5
    public static double probabilityOneSix() {
        int probability = 0;
        for (int i = 0; i < 10000; i++){
            for (int x = 0; x < 6; x++){
                int numb = (int)((Math.random() * 6) + 1);
                if (numb == 6){
                    probability += 1;
                    break;
                }
            }
        }
        double a = (float)probability / (float)10000* 100;
        return (a);
    }

    // Calculate the probability of rolling at least two 6's when rolling 
    // twelve dice. Uses 10000 trials.
    public static double probabilityTwoSixes() {
        int a = 0;
        for (int i = 0; i < 10000; i++){
            int num = 0;
            for (int x = 0; x < 12; x++){
                int numb = (int)((Math.random() * 6) +1);
                if((numb == 6) && (num == 1)){
                    a += 1;
                    break;
                }
                else if (numb == 6){
                    num += 1;
                }
            }
        }
        double c = (float)a / (float) 10000 * 100;
        return (c);
    }

    // Calculate the probability of rolling at least three 6's when rolling 
    // eighteen dice. Uses 10000 trials.
    public static double probabilityThreeSixes() {
        int num = 0;
        for (int i = 0; i < 10000; i++){
            int t = 0;
            for (int x = 0 ; x < 18; x++){
                int numb = (int)((Math.random() * 6) +1);
                if ((numb == 6) && (t == 2)){
                    num += 1;
                    break;
                }
                else if(numb == 6){
                    t += 1;
                }
            }
        }
        double c = (float)num / (float)10000* 100;
        return (c);
    }


    public static void main(String[] args) {
        System.out.println(probabilityOneSix());
        System.out.println(probabilityTwoSixes());
        System.out.println(probabilityThreeSixes());
    }
}
