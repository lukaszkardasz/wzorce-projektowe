package pl.sda.gofpatterns.creational.abstractFactory02;

class WindowsUiFactory implements UiAbstractFactory {
    public Button getButton() {
        return new WindowsButton();
    }

    public Input getInput() {
        return new WindowsInput();
    }
}
