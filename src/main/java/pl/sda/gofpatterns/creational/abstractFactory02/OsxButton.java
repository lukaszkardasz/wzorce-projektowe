package pl.sda.gofpatterns.creational.abstractFactory02;

class OsxButton implements Button {
    public void click() {
        System.out.println("Jestes bogaty i klinales w ladny przycisk");
    }

    public void show() {
        System.out.println("Jestem adnym przyciskiem");
    }
}
