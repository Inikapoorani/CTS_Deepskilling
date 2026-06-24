package BuilderPatternExample;
class Computer {
    private String cpu;
    private String ram;
    private String storage;
    private Computer(BuilderClass builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.storage = builder.storage;
    }
    public void showConfiguration() {
        System.out.println("CPU: " + cpu);
        System.out.println("RAM: " + ram);
        System.out.println("Storage: " + storage);
    }
    static class BuilderClass {
        private String cpu;
        private String ram;
        private String storage;
        public BuilderClass setCPU(String cpu) {
            this.cpu = cpu;
            return this;
        }
        public BuilderClass setRAM(String ram) {
            this.ram = ram;
            return this;
        }
        public BuilderClass setStorage(String storage) {
            this.storage = storage;
            return this;
        }
        public Computer build() {
            return new Computer(this);
        }
    }
}
public class BuilderTest {
    public static void main(String args[]) {
        Computer computer1 = new Computer.BuilderClass().setCPU("Intel i7").setRAM("16GB").setStorage("1TB SSD").build();
        Computer computer2 = new Computer.BuilderClass().setCPU("AMD Ryzen 7").setRAM("32GB").setStorage("2TB SSD").build();
        System.out.println("Computer 1 Configuration:");
        computer1.showConfiguration();
        System.out.println();
        System.out.println("Computer 2 Configuration:");
        computer2.showConfiguration();
    }
}