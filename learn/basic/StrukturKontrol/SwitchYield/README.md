# Switch Case Yield

Switch case yield hampir sama seperti switch case biasa.

Switch case yield digunakan untuk **meng-return nilai** ke sebuah variable.
    
Namun switch yield hanya dapat **meng-return 1 nilai saja**.

Switch case yield setidaknya bisa mendukung **Java versi 14 ke atas**.

Sintaks dasar dari switch case yield adalah sebagai berikut.

```
tipeData var1 = switch (var2) {
    case nilai1: 
        yield nilaiVariable1;

    case nilai2, nilai3: 
        yield nilaiVariable2;

    case nilai4:
        yield nilaiVariable3;
    
    default: 
        yield nilaiVariable4;
}

System.out.println(var1);
```

Switch case yield tidak memerlukan _keyword_ **_break_**.

Switch case lamba hanya dengan menggunakan _keyword_ **_yield_** untuk meng-return value ke variable.

Namun tiap case hanya dapat meng-return 1 nilai yield saja.

Source code dapat Anda lihat di `SwitchYield.java`.