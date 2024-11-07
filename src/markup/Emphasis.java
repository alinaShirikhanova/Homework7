package markup;


import java.util.List;

public class Emphasis extends MarkDownElement {
    public Emphasis(List<MarkDown> elements) {
        super(elements);
    }

    @Override
    protected String getMarkdownSymbol() {
        return "*";
    }
}