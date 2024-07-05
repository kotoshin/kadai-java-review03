package baseball;

public class Review03 {

    public static void main(String[] args) {
    BaseBallTeam team1 = new BaseBallTeam();
    team1.setName("東京ヤクルトスワローズ");
    team1.setwin(80);
    team1.setlose(59);
    team1.setdraw(4);
    team1.report();
    
    BaseBallTeam team2 = new BaseBallTeam();
    team2.setName("横浜DeNAベイスターズ");
    team2.setwin(73);
    team2.setlose(68);
    team2.setdraw(2);
    team2.report();

    BaseBallTeam team3 = new BaseBallTeam();
    team3.setName("阪神タイガース");
    team3.setwin(68);
    team3.setlose(71);
    team3.setdraw(4);
    team3.report();
    
    BaseBallTeam team4 = new BaseBallTeam();
    team4.setName("読売ジャイアンツ");
    team4.setwin(68);
    team4.setlose(72);
    team4.setdraw(3);
    team4.report();
    
    BaseBallTeam team5 = new BaseBallTeam();
    team5.setName("広島東洋カープ");
    team5.setwin(66);
    team5.setlose(74);
    team5.setdraw(3);
    team5.report();
    
    BaseBallTeam team6 = new BaseBallTeam();
    team6.setName("中日ドラゴンズ");
    team6.setwin(66);
    team6.setlose(75);
    team6.setdraw(2);
    team6.report();
    }
}
