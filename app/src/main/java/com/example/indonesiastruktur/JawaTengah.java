package com.example.indonesiastruktur;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JawaTengah {
    private String name;
    private String description;
    public static final JawaTengah[] JTE = {
            new JawaTengah("Struktur Jawa Tengah",
                    "Gubernur : Ganjar Pranowo \n" +
                            "Luas : 2.800,69 km2"),
            new JawaTengah("Kabupaten Kebumen",
                    "Bupati : H. Arif Sugiyanto, S.H. \n" +
                            "Luas : 1.211,74 km2"),
            new JawaTengah ("Kabupaten : Berebes",
                    "Bupati: Hj.Idza Priyanti.SE.\n" +
                            "Luas : 1.769,62 km2"),
            new JawaTengah ("Kabupaten Tegal",
                    " Bupati :Dra. Hj Umi Azizah\n " +
                            "Luas : 876,10 km2")
    };

}
