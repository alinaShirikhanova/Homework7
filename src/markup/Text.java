package markup;

public class Text implements MarkDown {
    private String text;
// Конструктор
    public Text(String text) {
        this.text = text;
    }

    public void toMarkDown(StringBuilder sb){
        sb.append(text);
    }
}
