package markup;


import java.util.List;

public class Strong extends MarkDownElement {
    public Strong(List<MarkDown> elements) {
        super(elements);
    }

    @Override
    protected String getMarkdownSymbol() {
        return "__";
    }
}