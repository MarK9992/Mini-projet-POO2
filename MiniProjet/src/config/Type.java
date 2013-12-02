package config;

public enum Type {
    TABLETTE("Tablette"),
    SMARTPHONE("Smartphone"),
    HEADPHONE("Headphone"),
    UNKWOWN("Unkwown");
    
    private String name;
    
    private Type(String name)
    {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
}