package design.patterns;

public enum EnumSingleton {

    INSTANCE;

    String value;

    EnumSingleton() {}

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
