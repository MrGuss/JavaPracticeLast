package ru.mirea.exercise3;

public class Main {
    public static void main(String[] args){
        Authentication user = new Authentication();
        user.authorization();
        if(user.check){
            Viewing view = new Viewing();
            view.watchCatalog();
            view.watchProducts();
            Basket shop = new Basket();
            shop.toBasket();
            shop.purchase();
        }
    }
}
