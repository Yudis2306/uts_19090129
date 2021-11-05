package com.example.uts_budaya

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var data: ArrayList<DataModel>? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Inisialisasi Array
        data = ArrayList()


        //Simpan data

        data?.add(DataModel(R.drawable.brekecek,"makanan khas cilacap","Brekecek","brekecek adalah masakan tradisional berbahan dasar kepala ikan khas dari Cilacap, Jawa tengah. Makanan ini sangat unik dan memiliki cita rasa khas sehingga digemari oleh masyarakat Cilacap dan para wisatawan yang datang ke sana. " +
                "Namanya terdengar aneh, asing dan unik. Namanya \"brekecek\", makanan khas Kota Cilacap, Jawa Tengah. Mengusung tema melestarikan kuliner khas daerah Kota Cilacap, brekecek hadir dan dikemas begitu apik di Hotel Dafam Cilacap"
        ))

        data?.add(DataModel(R.drawable.lumpia,"makanan khas semarang","Lumpia", "Lumpia menjadi makanan khas Semarang bermula dari perkawinan kuliner Tiongkok dan Jawa sejak ratusan lalu. Sajian bercitarasa manis nan gurih berisi rebung, ayam, udang dan digulung kulit tipis berbahan dasar terigu ini menghiasi di setiap sudut ibu kota Provinsi Jawa Tengah, Semarang" +
                "Lumpia hadir pertama kali pada abad ke 19 dan merupakan salah satu contoh perpaduan budaya asli Tiong Hoa – Jawa yang serasi dalam cita rasa. Makanan ini pertama kali dibuat oleh seorang keturunan Tionghoa yang menikah dengan orang Indonesia dan menetap di Semarang, Jawa Tengah."

        ))

        data?.add(DataModel(R.drawable.dawetireng,"makanan khas Purworejo","Dawet Ireng", "Dawet Ireng adalah es cendol yang berasal dari daerah Butuh, Purworejo, Jawa Tengah. Kata ireng dari bahasa Jawa berarti hitam. Butiran dawet berwarna hitam, karena diperoleh dari abu bakar jerami yang dicampur dengan air sehingga menghasilkan air berwarna hitam. Air ini kemudian digunakan sebagai pewarna dawet "
        ))

        data?.add(DataModel(R.drawable.mieongkok,"makanan khas wonosobo "," Mie Ongklok", "Mi (atau bakmi) ongklok adalah mi rebus khas kota Wonosobo dan sekitarnya. Mi rebus ini dibuat dengan menggunakan kol, potongan daun kucai, dan kuah kental berkanji yang disebut loh. Mi ini banyak dijajakan di berbagai warung, rumah makan, maupun dijajakan keliling memakai gerobak di kota tersebut. "

        ))

        data?.add(DataModel(R.drawable.nasibogana,"makanan khas Tegal ","Nasi Bogana", "Nasi bogana adalah salah satu kuliner khas Tegal yang sangat populer. Terdiri dari kombinasi nasi gurih, ayam kari yang disuwir, oseng kacang panjang, telur pindang, serundeng sapi, sambal goreng hati ampela, irisan tahu dan tempe bacem Di tempat asalnya, nasi bogana disajikan dalam bungkusan daun pisang."
        ))

        data?.add(DataModel(R.drawable.nasigandul,"makanan khas Pati ","Nasi Gundul ", "Nasi gandul adalah salah satu makanan khas dari Pati, Jawa Tengah. Hidangan ini sangat sederhana, terdiri dari daging dan kuah dengan bumbu ringan. Namun demikian, nasi gandul terkenal nikmat dan banyak dijual di luar Pati. Ciri khas lain dari nasi gandul adalah alas piring dari daun pisang "
        ))

        data?.add(DataModel(R.drawable.tahupetis,"makanan khas semarang","tahu petis", "Tahu petis (Hanacaraka:ꦠꦲꦸ\u200Bꦥꦼꦠꦶꦱ꧀) adalah jajanan khas kota Semarang berupa tahu goreng yang dimakan dengan petis (saus berwarna hitam kental yang biasanya terbuat dari udang) yang dioleskan/disisipkan di tengah-tengah tahu. ... Sedangkan petisnya berasa manis agak sedikit asin."

        ))


        data?.add(DataModel(R.drawable.tempemendoan,"makanan khas Purwokerto","Tempe Mendoan", "Mendoan khas Purwokerto hanya digoreng setengah matang. Tekstur mendoan yang terlihat lembek dan basah memang jadi kekhasan tersendiri. Mendoan terlihat \"basah\" karena minyak yang membasahi tepung tempe masih melekat saat dihidangkan. Dari tekstur basah itu, nama mendoan tercetus "
        ))



        //Set data to Adapter
        recyclerview.adapter = DataAdapter(data, object : DataAdapter.OnClickListener{
            override fun detail(item: DataModel?) {
                val intent = Intent(this@MainActivity, DetailActivity::class.java)
                intent.putExtra("gambar", item?.gambar)
                intent.putExtra("nama", item?.nama)
                intent.putExtra("deskripsi", item?.deskripsi)
                intent.putExtra("keterangan", item?.keterangan)
                startActivity(intent)
            }

        })


    }
}