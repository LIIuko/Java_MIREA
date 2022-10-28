package practice_20_21;

public class CreateTextDocument implements ICreateDocument{
    @Override
    public IDocument CreateNew() {
        System.out.println("new");
        return new TextDocument();
    }

    @Override
    public IDocument CreateOpen() {
        System.out.println("open");
        return new TextDocument();
    }
}
