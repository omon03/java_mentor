public class TooLongTextAnalyzer implements TextAnalyzer {

    private int maxLength;

    public TooLongTextAnalyzer(int maxLength) {
        this.maxLength = maxLength;
    }

    @Override
    public Label processText(String text) {
        return (this.maxLength >= text.length())
                ? Label.OK
                : Label.TOO_LONG;
    }
}
