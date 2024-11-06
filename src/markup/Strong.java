package markup;

import java.util.List;

public class Strong extends MarkDownElement {
    public Strong(List<MarkDown> elements) {
        super(elements);
    }

    @Override
    public void toMarkdown(StringBuilder sb) {
        sb.append("__");
        super.toMarkdown(sb);
        sb.append("__");
    }
}
