## Janji

Saya Ayesha Ali Firdaus (NIM 2101990) mengerjakan evaluasi LATIHAN 12 dalam mata kuliah Desain Pemrograman Berorientasi Objekuntuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.

## Alasan Menggunakan MVVM
Karena menurut saya dengan manggunakan mvvm model dan view tidak boleh langsung berhubungan.

## Perbedaan Dengan Program TMD
Pada program TMD yang saya buat, saya masih menggunakan mvvm dalam pembuatan program. Alasannya karena lebih mudah di bangun menggunakan model seperti itu. Kemdudian yang menjadi perbedaan dengan yang TMD adalah terletak pada `Handler` yang ada di objek, seharusnya `Handler` tersebut masih ke dalam View Model, karena itu merupakan bukan sebuah objek, melainkan sebuah kode untuk menangani suatu objek. Selain itu juga menurut saya seharusnya `Game Interface` harusnya masuk ke dalam view, karena ini merupakan bukan sebuah objek dan hanya berfungsi untuk menampilkan obejk.

## Desain Program

![image](https://user-images.githubusercontent.com/87317233/233579840-b56ac73a-8816-470d-a9fe-274aae921bcb.png)

## Alur Program

- User dapat menggunakan WASD/←→↓↑ (Arrow Key) untuk menjalankan ikan yang berada di dalam program.
- Pada saat ikan bergerak maka poin akan menambah skor dari user sebanyak dia bergerak, namun poin bertambah jika ikan bergerak berbelok arah. Jumlah poin bertambah adalah 1 poin.
- Ketika ikan berhasil memakan lingkaran merah(makanan) maka poin berhasil makan (eat) akan bertambah. `note`: namun fitur ini masih mengalami kendala (error) ketika di jalankan.

# Dokumentasi

![image](https://user-images.githubusercontent.com/87317233/233337731-15407812-95a0-4c46-8c13-4c99e5244247.png)
