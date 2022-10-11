package c5.SocialConsiousness;

public class Poll {
    private String[] topics = {"Spiritual issues","Gender Inequality","Breakfast","Sex wahala","Poltical goons"};
    private int[][] responses = new int[5][10];

    public int calculateAverage(int[] pollNum) {
        int totalOfRatings = 0;
        for (int pollnum:pollNum){
            totalOfRatings += pollnum;
        }
        int average = totalOfRatings / pollNum.length;
        return average;
    }
}
