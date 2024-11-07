package markup;

import java.util.List;

public abstract class MarkDownElement implements MarkDown {
    protected final List<MarkDown> elements;


    protected MarkDownElement(List<MarkDown> elements) {
        this.elements = elements;
    }


    @Override
    public void toMarkdown(StringBuilder sb) {
        sb.append(getMarkdownSymbol());
        for (MarkDown element : elements) {
            element.toMarkdown(sb);
        }
        sb.append(getMarkdownSymbol());
    }

    protected abstract String getMarkdownSymbol();
}