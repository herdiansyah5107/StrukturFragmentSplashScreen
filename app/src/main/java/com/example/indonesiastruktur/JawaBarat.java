package com.example.indonesiastruktur;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JawaBarat{
    private String name;
    private String description;

    public static final JawaBarat[] JB = {
    new JawaBarat( "Struktur Jawa Barat", "Gubernur : Ridwan kamil\n" +
            "Wakil Gubernur : Uu Ruzhanul Ulum\n" +
            "Luas Wilayah : 35.377,76 km2"),
    new JawaBarat("Kota Bandung","Wali Kota : Yana Mulyana \n" +
            "Luas : 167,31 km2" ),
    new JawaBarat("Kabupaten Karawang", "Bupati : dr. Cellica Nurrachadiana\n" +
            "Luas : 1.652,00 km2"),
    new JawaBarat ("Kota Bekasi","Wali kota : Rahmat Effendi \n" +
            "Luas : 207,00 km2")
    };


    }
