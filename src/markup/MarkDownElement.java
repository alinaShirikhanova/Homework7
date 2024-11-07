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

    public void toTypst(StringBuilder sb) {
        String[] typstWrapper = getTypst();
        sb.append(typstWrapper[0]);
        for (MarkDown element : elements) {
            element.toTypst(sb);
        }
        sb.append(typstWrapper[1]);
    }

    protected abstract String getMarkdownSymbol();

    protected abstract String[] getTypst();
}