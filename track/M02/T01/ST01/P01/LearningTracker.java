
public class LearningTracker {

    public static void main(String[] args) {
        int total_topics = 20;
        int hrs = 3;
        int days = 5;
        int done_topics = 17;
        int remaining_topics = total_topics - done_topics;
        int weekly_learning = days * hrs;
        float progressPercentage = (float) ((double) done_topics * 100 / total_topics);
        System.out.println("Completed Topics: " + done_topics);
        System.out.println("Remaining Topics: " + remaining_topics);
        System.out.println("Weekly Learning Hours: " + weekly_learning);
        System.out.println("Progress Percentage: " + progressPercentage);
    }
}
