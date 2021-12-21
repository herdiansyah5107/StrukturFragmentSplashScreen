package com.example.indonesiastruktur;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Provinsi {
    private String name;
    private Kabupaten[] kabupatens;

    public static Kabupaten[] jabar ={
            new Kabupaten( "Struktur Jawa Barat", "Gubernur : Ridwan kamil\n" + "Wakil Gubernur : Uu Ruzhanul Ulum\n" + "Luas Wilayah : 35.377,76 km2"),
            new Kabupaten("Kota Bandung","Wali Kota : Yana Mulyana \n" + "Luas : 167,31 km2" ),
            new Kabupaten("Kabupaten Karawang", "Bupati : dr. Cellica Nurrachadiana\n" + "Luas : 1.652,00 km2"),
            new Kabupaten ("Kota Bekasi","Wali kota : Rahmat Effendi \n" + "Luas : 207,00 km2")};
    public static Kabupaten[] jateng={
            new Kabupaten("Struktur Jawa Tengah", "Gubernur : Ganjar Pranowo \n Luas : 2.800,69 km2"),
            new Kabupaten("Kabupaten Kebumen", "Bupati : H. Arif Sugiyanto, S.H. \n" +"Luas : 1.211,74 km2"),
            new Kabupaten ("Kabupaten  Berebes", "Bupati: Hj.Idza Priyanti.SE.\n" + "Luas : 1.769,62 km2"),
            new Kabupaten("Kabupaten Tegal", " Bupati :Dra. Hj Umi Azizah\n " + "Luas : 876,10 km2")};
    public static Kabupaten[] Jatim = {
            new Kabupaten("Struktur Jawa Timur", " Gubernur :Khofifah Indar Parawansa \n" + "Luas : 47.803,49 km2"),
            new Kabupaten("Kota Surabaya", "Wali kota : Eri Cahyadi, S.T., M.T.\n" + "Luas : 350,54 km2"),
            new Kabupaten("Kabupaten Banyuwangi", "Bupati : Ipuk Fiestiandani\n" + "Luas : 5.782,50 km2 "),
            new Kabupaten("Kabupaten Blitar", "Bupati : Rini Syarifah\n" + "Luas : 1.588,79 km2")};
    public static Provinsi[] provinsis ={
            new Provinsi("Jawa Barat", jabar),
            new Provinsi("Jawa Tengah", jateng),
            new Provinsi("Jawa Timur", Jatim)};
}
