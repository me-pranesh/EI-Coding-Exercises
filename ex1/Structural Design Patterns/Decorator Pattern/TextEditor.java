public class TextEditor {
    public static void main(String[] args) {
        Text text = new PlainText("Hello, World!");
        System.out.println(text.format());

        Text boldText = new BoldTextDecorator(new PlainText("Hello, World!"));
        System.out.println(boldText.format());

        Text italicText = new ItalicTextDecorator(new PlainText("Hello, World!"));
        System.out.println(italicText.format());

        Text boldItalicText = new ItalicTextDecorator(new BoldTextDecorator(new PlainText("Hello, World!")));
        System.out.println(boldItalicText.format());
    }
}
