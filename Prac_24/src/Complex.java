public class Complex {
    int real;
    int image;
    Complex(int r, int i){
        real = r;
        image = i;
    }

    public int getImage() {
        return image;
    }

    public int getReal() {
        return real;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public void setReal(int real) {
        this.real = real;
    }

    @Override
    public String toString() {
        return "Complex: " + real + " + " + image + "i;";
    }
}

