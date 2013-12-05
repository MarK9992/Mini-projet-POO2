package config;

public enum Model {
    IPAD3("Ipad3"),
    VENGEANCE2100("Vengeance2100"),
    XPERIAZ("XperiaZ"),
    UNKWOWN("Unkwown");
    
    private String name;
    
    private Model(String name)
    {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
}