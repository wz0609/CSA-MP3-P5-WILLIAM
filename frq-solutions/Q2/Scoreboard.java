public class Scoreboard {

    private String nameT1;
    private String nameT2;
    private int scoreT1 = 0;
    private int scoreT2 = 0;
    private boolean isActive = true;

    public Scoreboard(String t1, String t2) {
        nameT1=t1;
        nameT2=t2;
    }


    public void recordPlay(int point) {
        if(point==0){
            isActive = !isActive;
        } else {
            if(isActive) {
                scoreT1+=point;
            } else {
                scoreT2+=point;
            }
        }
    }

    public String getScore() {
        String str = scoreT1+"-"+scoreT2+"-";
        if(isActive) {
            return str+nameT1;
        }
        return str+nameT2;
    }
}
