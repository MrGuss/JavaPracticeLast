package ru.mirea.exercise3;

public enum Products {
    XIAOMI_8_128GB_GLOBAL(Catalog.SMARTPHONES, 38440, "purple"),
    POCO_M5_4_128GB(Catalog.SMARTPHONES, 14999, "black"),
    SAMSUNG_GALAXY_A23_6_128GB(Catalog.SMARTPHONES, 15990, "blue"),
    APPLE_AIRPODS_PRO_2(Catalog.HEADPHONES, 17550, "white"),
    XIAOMI_BUDS_3(Catalog.HEADPHONES, 6173, "black"),
    HONOR_EARBUDS_X3_LITE(Catalog.HEADPHONES, 2298, "white"),
    MAGSAFE_10000_MAH(Catalog.POWERBANKS, 1990, "silver"),
    LUAZON_PB_01_7200_MAH(Catalog.POWERBANKS, 1200, "white"),
    XIAOMI_REDMI_10000_MAH(Catalog.POWERBANKS, 1377, "white");
    private final Catalog catalog;
    private final int price;
    private final String colour;
    Products(Catalog catalog, int price, String colour){
        this.catalog = catalog;
        this.price = price;
        this.colour = colour;
    }
    public Catalog getCatalog(){
        return catalog;
    }
    public int getPrice(){
        return price;
    }
    public String getColour(){
        return colour;
    }
    public int getNumber(){
        return (this.ordinal() + 1);
    }
    @Override
    public String toString() {
        return this.name() + ":" +
                "\n Category: " + getCatalog() +
                "\n Price: " + getPrice() + " rubles" +
                "\n Colour: " + getColour() +
                "\n Code: " + getNumber();
    }
}
