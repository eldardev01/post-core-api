package homework9;

public class StarTriangle {
    int width;

    public StarTriangle(int width) {
        this.width = width;
    }

    public String getStar(int width) {
        String star = "*";
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < width; j++) {
                if (j <= i) {
                    System.out.print("[" + star + "]");
                }
            }
            System.out.println();
        }
        return "";
    }

    public String toString() {
        return getStar(this.width);
    }
}
