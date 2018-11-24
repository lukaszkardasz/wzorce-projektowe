package pl.sda.gofpatterns.creational.abstractFactory02;

class WindowsButton implements  Button {
    public void click() {
        System.out.println("Nie dotykaj");
    }

    public void show() {
        System.out.println("Jestem przyciskiem z Windy");
    }
}
