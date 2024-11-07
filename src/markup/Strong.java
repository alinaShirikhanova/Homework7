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
    @Override
    protected String[] getTypst() {
        return new String[]{"#strong[", "]"};
    }
}