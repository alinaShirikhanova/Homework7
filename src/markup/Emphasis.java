package markup;

import java.util.List;

public class Emphasis extends MarkDownElement {


    public Emphasis(List<MarkDown> elements) {
        super(elements);
    }

    public void toMarkdown(StringBuilder sb) {
        sb.append("*");
        super.toMarkdown(sb);
        sb.append("*");
    }
}
