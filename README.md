# Tutorial 2
Pada sesi `tutorial-1` kemarin, kamu sudah menerapkan dua buah *design pattern*, yaitu `Strategy Pattern` dan `Observer Pattern`. Pada sesi `tutorial-2` ini, kamu akan menerapkan *design pattern* yang sudah kamu pelajari minggu ini, yaitu `Command Pattern` dan `Template Method`.

## Command Pattern
Kesuksesanmu dalam menyelesaikan permasalahan yang dihadapi oleh berbagai pelaku usaha tersebar ke penjuru negeri. Kali ini, perusahaan bioskop ternama, PT Citra Gagah Visual, memintamu untuk membuat sebuah program yang dapat mengontrol perangkat-perangkat yang ada dalam suatu cinema.

Dalam satu cinema, terdapat beberapa perangkat yang dapat dikontrol. Perangkat-perangkat tersebut adalah:
1. Pendingin ruangan
2. Layar
3. Lampu

Pendingin ruangan dapat dinyalakan dengan mode LOW, MEDIUM, dan HIGH, serta dimatikan. Layar bisa dinyalakan untuk menampilkan iklan dan juga film serta dimatikan. Sedangkan untuk lampu hanya bisa dinyalakan atau dimatikan saja.

Aplikasi ini terdiri dari dua halaman. Halaman pertama adalah `/cinema-admin/enable-device`. Halaman ini digunakan untuk *enable* perangkat-perangkat yang ada dalam cinema.
![Enable Device Page](/Command-enable-device-page.png)

Halaman kedua adalah `/cinema-admin/control-panel`. Halaman ini digunakan untuk mengontrol perangkat dan menampilkan riwayat penggunaannya. Perangkat yang tampil di halaman ini hanya perangkat yang sudah di-*enable* sebelumnya.
![Control Panel Page](/Command-control-panel-page.png)

Kamu diharapkan untuk membuat program yang dapat mengontrol perangkat-perangkat tersebut dengan mengimplementasikan `Command Pattern`.

### UML Diagram
![Diagram UML Command Pattern](/Command-UML.png)

## Template Method
PT Citra Gagah Visual cukup puas dengan hasil kerjamu. Kamu kemudian direkomendasikan untuk mengerjakan sistem baru yang ingin dibuat oleh perusahaan bioskop lain, yaitu PT XIXIXI.

Bioskop PT XIXIXI menyediakan tiga jenis cinema, yaitu Reguler, Deluxe, dan Premium. Sistem yang sudah ada saat ini terbagi menjadi tiga untuk masing-masing jenis cinema tersebut. Padahal, langkah yang perlu dilakukan untuk mengoperasikan ketiganya sama saja.

Langkah-langkah yang perlu dilakukan untuk mengoperasikan cinema adalah sebagai berikut:
1. Menyalakan pendingin ruangan
2. Menghidupkan lampu
3. Menghidupkan layar
4. Menyalakan sound system
5. Menampilkan iklan
6. Mematikan lampu
7. Menampilkan film
8. Menghidupkan lampu
9. Mematikan sound system
10. Mematikan layar
11. Mematikan lampu
12. Mematikan pendingin ruangan

Tentu saja ada alasan mengapa terdapat tiga jenis cinema, yaitu pengaturan perangkat yang ada di dalam cinema berbeda-beda.

Pada cinema reguler, pendingin ruangan diatur pada pengaturan paling rendah (LOW) demi menghemat biaya tiket. Pada cinema Deluxe, pendingin diatur pada pengaturan standar (MEDIUM). Lalu pada cinema Premium, pendingin ruangan diatur pada pengaturan paling tinggi (HIGH) untuk memaksimalkan kenyamanan penonton.

Durasi iklan yang ditampilkan juga berbeda. Iklan pada cinema Reguler durasinya 10 detik, pada cinema Deluxe 3 detik, dan pada cinema Premiere sama sekali tidak menampikan iklan.

Format film yang ditampilkan pun berbeda. Cinema Reguler dan Deluxe menampilkan film dengan format QHD, sedangkan cinema Premium menampilkan film dengan format UHD.

Aplikasi ini terdiri dari dua halaman. Halaman pertama adalah `/template/cinema`. Halaman ini digunakan untuk memilih jenis cinema.
![Pick Cinema Page](/Template-pick-cinema-page.png)

Halaman kedua adalah `/template/cinema/<jenis-cinema>`. Halaman ini  digunakan untuk melihat keluaran dari aplikasi per jenis cinema.
![Running  Cinema Page](/Template-running-cinema-page.png)

Kamu diminta untuk membuat sebuah sistem yang dapat "mengontrol" operasi ketiga jenis cinema tersebut dengan pengaturan yang berbeda-beda hanya dari satu program saja dengan mengimplementasikan `Template Method`

### UML Diagram
![Diagram UML Template Method](/Template-UML.png)
