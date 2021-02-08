public abstract class KeywordAnalyzer implements TextAnalyzer {
    protected abstract String[] getKeywords();

    protected abstract Label getLabel();

    @Override
    public Label processText(String text) {

        for (String keyword : getKeywords()) {

            if (-1 != text.lastIndexOf(keyword)) {
                return getLabel();
            }
        }

        return Label.OK;
    }
}
