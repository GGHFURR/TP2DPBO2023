# TP2DPBO2023

Saya Muhammad Fadlan Ghafur NIM 2106923 mengerjakan TP2 dalam mata kuliah Desain dan Pemrograman Berorientasi Objek untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.

## Deskripsi Tugas
Buatlah program Java yang terkoneksi dengan database MySQL. Berikut spesifikasi program yang harus dibuat:
* Program bebas, kecuali program Mahasiswa dan Book Author
* Terdapat proses Create, Read, Update, dan Delete data
* Terdapat proses Autentikasi (Login, Register)*
* Menggunakan minimal 2 tabel pada database
* Harus terdapat minimal 1 properti gambar pada class yang dibuat (gambar akan ditampilkan pada UI)
* Terdapat pergantian screen pada UI
* Terdapat button navigasi untuk beralih screen
* List data ditampilkan menggunakan card (JPanel). Contoh card dengan JPanel link\
*Boleh login dan/atau register. Tidak perlu ada enkripsi password

## Design Program
![image](https://user-images.githubusercontent.com/100921271/231484891-7adc9625-4c72-43c1-8933-bca42cfff21e.png)

Pada program ini terdapat delapan class dengan class `Login` sebagai main class.
* `Login` : Class ini adalah Jframe yang didalam nya ada proses login user untuk masuk kedalam halaman barang toko dimana terdapat autentikasi kepada database menggunakan koneksi DB yang merupakan composite dbconnection yang berisikan perintah query
* `Register` : Class ini adalah Jframe yang didalam nya ada proses mendaftar user untuk bisa mengakses halaman barang toko,
### Pada frame login dan Register terdapat focus gain dan focus lost dimana apabila user membiarkan textfield kosong maka akan reset ke default text field seperti "Usernama" dan "Password"

* `FrameHOome` : Class ini adalah JFrame panel utama, berisi JScrollPane menampilkan data card. dan terdapat button Add Data untuk menambahkan data dan logout untuk keluar dari program utama ke halaman login

* `addDataFrame` : class ini adalah JFrame untuk menambahkan data dimana terdapat field mengisi nama barang dan jumlah barang dan harga barang,dan tak lupa terdapat upload untuk memasukkan foto barang dimana foto tersebut akan di masukkan kedalam directory local dan path nya disimpan kedalam database

* `ImageSet` : Class ini adalah class yang mengatur pengolahan gambar dimana berisi prosedur cari file yang berisikan untuk mencari dimana file yang akan di masukkan dan sekaligus meresize untuk dimasukkan kedalam card karna tidak ada perintah langsung di java untuk mengatur ukuran foto
* `Db Connection` : Class ini adalah class yang mengatur urusan database dimana dalam nya terdapat updatequery dan selectquery untuk meneruskan perintah query dari program ke database

## Design Gui


* Login
![image](https://user-images.githubusercontent.com/100921271/231485249-9c8f0a27-a222-4ab5-bc9f-8bb0d92ecbf4.png)

* Register
![image](https://user-images.githubusercontent.com/100921271/231485492-5488ec43-7dca-47a3-8465-a2cac137479a.png)

* Frame Home
![image](https://user-images.githubusercontent.com/100921271/231485652-b50893a1-c165-4277-b8f3-25f0a28fa91f.png)

* Card
![image](https://user-images.githubusercontent.com/100921271/231485746-cd00adbb-63c7-45bd-907b-77573e3ab015.png)


## Alur Program

1. User melakukan register terlebih dahulu jika belum memiliki akun, tiap field harus diisi
2. User dapat melakukan login menggunakan akun yang sebelumnya telah dibuat dan akan masuk ke main panel
3. pada main panel dapat melihat isi barang toko yang tersedia dan ada tombol add data untuk menambahkan data juga logout
4. Jika Sudah selesai menambahkan data maka user akan kembali ke halaman utama
5. Terdapat tombol edit dan delete pada card
6. Jika user telah mengedit atau mendelete maka akan kembali ke main panel

* untuk mencoba login dapat menggunakan akun berikut
username: Aku
password: 123

## Dokumentasi
* Login
![image](https://user-images.githubusercontent.com/100921271/231486984-a5fec82c-5895-406f-8a3a-ee638c41667d.png)
* Register
![image](https://user-images.githubusercontent.com/100921271/231487250-7dc24254-7642-4195-86c7-a80ecc21b9bd.png)
* Main Panel
![image](https://user-images.githubusercontent.com/100921271/231487364-57a06458-5c0e-4352-85de-ade602b73609.png)
* Add Data
![image](https://user-images.githubusercontent.com/100921271/231487903-d6366748-5b37-446f-8ad6-97ff5fd0ff72.png)
* Update Data
![image](https://user-images.githubusercontent.com/100921271/231493628-56a7b8c0-f6a8-427a-b0aa-5be3ff1c97f9.png)
* Delete Data
![image](https://user-images.githubusercontent.com/100921271/231493774-13b13439-deff-48a6-8a44-f58f655f5f8f.png)







