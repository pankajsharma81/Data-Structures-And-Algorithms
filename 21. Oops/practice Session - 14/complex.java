class complex {
  int real;
  int img;
  complex(){ // default constructor

  }

  complex(int r, int i) { //parameterized constructor
    real = r;
    img = i;
  }

  public static complex add(complex a, complex b) {
    complex c = new complex(0, 0);
    c.real = a.real + b.real;
    c.img = a.img + b.img;
    return c;
  }
  public static complex subtract(complex a, complex b) {
    complex c = new complex(0, 0);
    c.real = a.real - b.real;
    c.img = a.img - b.img;
    return c;
  }
  
  public static complex multiply(complex a, complex b) {
    complex c = new complex(0, 0);
    c.real = a.real - b.real;
    c.img = a.img - b.img;
    return c;
  }
  
}