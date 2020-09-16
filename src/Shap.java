public class Shap {
    private String color;
    private String filled;

    public Shap() {
    }

    public Shap(String color, String filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFilled() {
        return filled;
    }

    public void setFilled(String filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Shap{" +
                "color='" + color + '\'' +
                ", filled='" + filled + '\'' +
                '}';
    }
}
