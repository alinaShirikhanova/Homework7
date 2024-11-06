package markup;

import java.util.List;

public class MarkDownElement implements MarkDown {
    List<MarkDown> elements;

    public MarkDownElement(List<MarkDown> elements) {
        this.elements = elements;
    }

    @Override
    public void toMarkdown(StringBuilder sb) {
        for (MarkDown element : elements){
            element.toMarkdown(sb);
        }
    }
}
