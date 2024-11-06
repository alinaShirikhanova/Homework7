package markup;

public class Text implements MarkDown {
    private String text;
// Конструктор
    public Text(String text) {
        this.text = text;
    }

    @Override
    public void toMarkdown(StringBuilder sb) {
        sb.append(text);
    }
}
