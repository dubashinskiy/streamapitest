package sort;

public class Model {
    private String column1;
    private String column2;
    private String column3;
    private String column4;

    public Model(String[] columns) {
        this.column1 = columns[0];
        this.column2 = columns[1];
        this.column3 = columns[2];
        this.column4 = columns[3];
    }

    public String getColumn1() {
        return column1;
    }

    public void setColumn1(String column1) {
        this.column1 = column1;
    }

    public String getColumn2() {
        return column2;
    }

    public void setColumn2(String column2) {
        this.column2 = column2;
    }

    public String getColumn3() {
        return column3;
    }

    public void setColumn3(String column3) {
        this.column3 = column3;
    }

    public String getColumn4() {
        return column4;
    }

    public void setColumn4(String column4) {
        this.column4 = column4;
    }

    @Override
    public String toString() {
        return column1 + ' ' + column2 + ' ' + column3 + ' ' + column4;
    }
}
