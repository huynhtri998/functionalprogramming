//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Thread thread = new Thread(new TraditionalTread());
    thread.start();

    Runnable runnable =
            new Runnable() {
                @Override
                public void run() {
                    System.out.println("Anonymous Thread is running");
                }
    };

    Thread thread1 = new Thread(runnable);
    thread1.start();

    Runnable runnable1 = () -> System.out.println("Lamda Expression Thread is running");
    Thread thread2 = new Thread(runnable1);
    thread2.start();

    IAnimal i = () -> System.out.println("ABC");
    System.out.println(i);
}

static class TraditionalTread implements Runnable {

    @Override
    public void run() {
        System.out.println("Traditional Tread is running");
    }
}