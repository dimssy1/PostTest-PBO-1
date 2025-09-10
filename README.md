# PostTest-PBO-1
MANAJEMEN EKSKUL BASKET 

Berikut adalah penjelasan singkat mengenai program ini :

Program ini adalah aplikasi menu awal sederhana yang akan dikembangkan lagi. Berbasis teks untuk mengelola daftar anggota ekstrakurikuler basket. Pengguna dapat menambahkan, melihat, mengubah, dan menghapus anggota (CRUD). Program akan terus berjalan hingga pengguna memilih opsi keluar.

Ringkasan Alur Program
1. Menampilkan menu ke user
   User memilih menu (1-5)
2. Program akan:
   Menambahkan anggota (1)
   Menampilkan daftar anggota (2)
   Mengubah nama anggota (3)
   Menghapus anggota (4)
   Keluar dari program (5)
3. Perulangan terus berlangsung selama user belum memilih opsi keluar.
   
<------------------------------------------------------------------------------->

Fitur yang digunakan:
1. Deklarasi kelas yaitu Main Class / main.java yang dimana sebagai titik awal program berisi main() yang menjalankan menu.
2. Array List digunakan untuk menyimpan daftar nama anggota basket. ArrayList dipilih karena ukurannya bisa berubah-ubah (dinamis).
3. Scanner digunakan untuk membaca input dari pengguna (keyboard).
   
<---------------------------------------------------------------------------------------------------------------------------------------------------------->

Penjelasan Logika Program
1. Menu dan Input Pengguna
   Pengguna diminta memilih salah satu dari lima menu. Input dibaca sebagai integer (nextInt()), dan program membaca newline berikutnya dengan nextLine().
2. Perulangan Menu (Agar Program Tidak Langsung Keluar)
   Program akan terus mengulang menu sampai pengguna memilih opsi 5 (Keluar).
3. Struktur Percabangan (switch)
   Program menggunakan switch-case untuk menjalankan aksi berdasarkan pilihan user.
   - Tambah Anggota
   - Lihat Daftar Anggota
   - Ubah Nama Anggota
   - Hapus Nama Anggota
   - Keluar dari perulangan do-while dan mengakhiri program.
4. Default Case
   System.out.println("Pilihan tidak valid. Silakan pilih antara 1 hingga 5.");
   untuk menangani input yang tidak valid.

<img width="875" height="944" alt="Screenshot 2025-09-09 154012" src="https://github.com/user-attachments/assets/11b2a870-2e10-4ce6-a07d-4d9702a878fa" />
<img width="1002" height="864" alt="Screenshot 2025-09-09 154029" src="https://github.com/user-attachments/assets/4fcc59e9-1c62-4c87-8159-51dc64bf41f7" />
