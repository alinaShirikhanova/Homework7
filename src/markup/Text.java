package markup;

public class Text implements MarkDown {
    private String text;


    public Text(String text) {
        this.text = text;
    }

    @Override
    public void toMarkdown(StringBuilder sb) {
        sb.append(text);
    }

    @Override
    public void toTypst(StringBuilder sb) {
        sb.append(text);
    }
}
