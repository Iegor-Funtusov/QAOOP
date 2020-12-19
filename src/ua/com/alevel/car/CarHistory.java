package ua.com.alevel.car;

/**
 * @author Iehor Funtusov, created 19/12/2020 - 1:12 PM
 */
public enum CarHistory {

    AA("ddd", 1),
    BB("ggg", 6);

    private String val;
    private int position;

    CarHistory(String val, int p) {
        this.val = val;
        this.position = p;
    }

    public String getVal() {
        return val;
    }

    public void setVal(String val) {
        this.val = val;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
