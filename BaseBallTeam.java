package baseball;

public class BaseBallTeam {
    private String name;
    private int win;//勝利
    private int lose;//敗戦
    private int draw;//引き分け

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWin() {
        return win;
    }

    public void setwin(int win) {
        this.win = win;
    }

    public int getlose() {
        return lose;
    }

    public void setlose(int lose) {
        this.lose = lose;
    }

    public int getdraw() {
        return draw;
    }

    public void setdraw(int draw) {
        this.draw = draw;
    }

    public double getRate() {
        return (double) this.win / (this.win + this.lose);
    }

    public void report() {
        System.out.println(name + "　の2022年の成績は" + win + "勝　" + lose + "敗　" + draw + "分、勝率は　" + getRate() + "です。");
    }
}
