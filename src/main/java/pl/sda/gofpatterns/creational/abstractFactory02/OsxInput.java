package pl.sda.gofpatterns.creational.abstractFactory02;

class OsxInput implements Input {
    private String text;
    public void write(String value) {
        text = value;
    }

    public String getText() {
        return text;
    }
}
