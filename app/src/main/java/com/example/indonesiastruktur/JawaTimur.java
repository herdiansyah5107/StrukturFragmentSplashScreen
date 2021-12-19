package com.example.indonesiastruktur;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public class JawaTimur{
        private String name;
        private String description;

        public static final JawaTimur[] JTI = {
                new JawaTimur("Struktur Jawa Timur",
                        " Gubernur :Khofifah Indar Parawansa \n" +
                                "Luas : 47.803,49 km2"),
                new JawaTimur("Kota Surabaya",
                        "Wali kota : Eri Cahyadi, S.T., M.T.\n" +
                                "Luas : 350,54 km2"),
                new JawaTimur("Kabupaten Banyuwangi",
                        "Bupati : Ipuk Fiestiandani\n" +
                                "Luas : 5.782,50 km2 "),
                new JawaTimur("Kabupaten Blitar",
                        "Bupati : Rini Syarifah\n" +
                                "Luas : 1.588,79 km2")
        };
}
