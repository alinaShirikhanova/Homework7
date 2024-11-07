package markup;

import java.util.List;

public class Strikeout extends MarkDownElement {
    public Strikeout(List<MarkDown> elements) {
        super(elements);
    }

    @Override
    protected String getMarkdownSymbol() {
        return "~";
    }

    @Override
    protected String[] getTypst() {
        return new String[]{"#strike[", "]"};
    }
}
