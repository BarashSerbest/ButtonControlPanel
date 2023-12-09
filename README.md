# ButtonControlPanel GitHub README kısmı 

Buton kontrol paneli uygulaması nasıl kullanılacak? 
 GitHub'ta yer alan dosyaları indiriniz ve tek bir dosya içerisine atınız, sonrasında projenin main dosyasının yer aldığı "src/main/java/com/mycompany/barash_serbest_5220505051" dosyasının içerisine giriniz. Burada form uygulamasını çalıştırabilmek için ve diğer sınıf kodlarını inceleyebilmek için ".java" uzantılı üç dosyayı () "NetBeans" veya eşdeğeri nitelikte java ile çalışabileceğiniz bir IDE (Intellij IDEA veya Eclipse) ile açınız. Sonrasında kullandığınız IDE ile main dosyası olan "Barash_Serbest_5220505051.java" dosyasını kullanarak programı derleyip çalıştırınız. Artık program kullanıma hazır.   

GraphQL Nedir?
 GraphQL veri çekmek, sorgulamak, veriler üzerinde işlem yapmak için kullanılan REST tabanlı web servis sorgulama dilidir. GraphQL, 2012'de Facebook tarafından dahili olarak geliştirildi ve 2015'te herkese açık olarak yayınlandı. REST'e alternatif olarak kullanılan GraphQL, özellikle web uygulamalarında veri alışverişi için kullanılan bir teknolojidir. GraphQL sunucu ve istemciden oluşur. Sunucu tarafında istemciye gönderilecek olan verilerle ilgili “GraphQL şemaları (Schema)”, “İşlemler (Mutation)” yer alır. Temelde, istemci tarafından talep edilen verilerin tam olarak belirtilebildiği bir yapı sunar. Bu, istemcinin ihtiyacı olan verileri belirli bir endpoint üzerinden almasını sağlar ve gereksiz veri transferini önler.
 
Neden GraphQL kullanmalıyız? 
 REST tabanlı web servislerinde birçok alana sahip ve büyük boyuttaki veriler istemciye gönderildiğinde trafiğin fazla kullanılmasına neden olur çünkü REST tabanlı web servis hazırlarken farklı veriler için farklı adres (end-point) kullanılır. Bu sorunu çözmek için de REST API sunucusunda GraphQL sorgulama dili kullanılabilir. GraphQL sorgulama dilinin kullanılması web API'leri geliştirmek için bir yaklaşım sağlar. Bu özelliğiyle REST ve diğer web hizmeti mimarileriyle karşılaştırılabilir. GraphQL, istemcilerin talep ettikleri verilerin yapısını tanımlamasına olanak tanır ve veriler tanımlanan yapıda sunucudan döndürülür. Bu, aşırı büyük miktarda verinin döndürülmesini engeller ve sorgu sonuçlarının web'de önbelleğe alınmasını sekteye uğratabilir. Sorgu dilinin esnekliği ve zenginliği, basit API'ler için harcanılan efora değmeyecek kadar karmaşık olabilir. Örneğin, bir bireyin ebeveynlerini bildiren bir GraphQL arayüzü, tek bir sorguda tüm atalarının kümesini harcanılan efora değmeyecek kadar karmaşık olacağı için döndüremez.

GraphQL Sorgulama Dilinin Temel Bileşenleri Nedir?
 1.	Şema (Schema): GraphQL şeması, API'nin nasıl göründüğünü ve nasıl çalıştığını tanımlar. Bu, hangi tür verilerin istenebileceği ve hangi tür verilerin sunulabileceğini belirler.
 2.	Sorgu (Query): İstemci, istediği veriyi belirlemek için sorgularını yapar. Bu sorgular, GraphQL şemasına uygun olarak yapılandırılır.
 3.	Mutasyon (Mutation): Veritabanındaki değişiklikleri gerçekleştirmek için kullanılır. Veri eklemek, güncellemek veya silmek gibi işlemleri içerir.
 4.	Alt Sorgular (Nested Queries): GraphQL, ilişkisel veritabanlarından veri çekerken alt sorguları kullanma yeteneği sunar. Bu, verilerin daha derinlemesine ve etkileşimli bir şekilde çekilmesini sağlar.
 5.	Abonelik (Subscription): GraphQL abonelikleri, belirli olaylara (örneğin, bir veritabanı kaydının güncellenmesi) otomatik olarak tepki verebilmeyi sağlar.
    
GraphQL'in Amaçları
 Esnek Veri Alışverişi: İstemci, ihtiyacı olan verileri belirleyebilir ve sadece bu verileri alabilir. Bu, aşırı veri transferini engeller.
Tek Endpoint: GraphQL, bir API'nin tek bir endpoint'i kullanması sayesinde, birden fazla endpoint çağrısını azaltır. Bu, API'nin daha hızlı ve verimli olmasını sağlar.
İstemci Merkezli: İstemci, veri ihtiyaçlarını belirler ve sadece bu verileri alır. Bu, özellikle mobil uygulamalarda ve zayıf ağ bağlantıları olan durumlarda önemlidir.

GraphQL Nasıl Kullanılır?
 GraphQL, bir şema (schema) ile çalışır. Şema, sunucunun ne tür verileri sunabileceğini ve istemcinin hangi sorguları yapabileceğini tanımlar. İstemci, bu şemaya uygun sorguları kullanarak veri talep eder.
Örneğin, bir sipariş için ürün bilgilerini yönetebileceğimiz GraphQL “istek – yanıt” sorgusu: 
Sipariş için ürün bilgisi isteği sorgusu: 
{
  siparisler {
    id
    urunListesi {
      urun {
        ad
        fiyat
      }
      miktar
    }
    toplamTutarAmount
  }
}
Bu siparişteki ürün bilgisi isteği sorgusu için geri dönüş yapacak “yanıt” sorgusu:
{
  "veri": {
    "siparisler": [
      {
        "id": 1,
        "urunListesi": [
          {
            "urun": {
              "ad": "orange",
              "fiyat": 1.5
            },
            "miktar": 100
          }
        ],
        "toplamTutar": 150
      }
    ]
  }
} 

GraphQL Avantajları
 •	Esneklik ve Veri Kontrolü: İstemciler, ihtiyacı olan veriyi belirleyerek gereksiz veri transferini önler. Bu, mobil uygulamalar ve düşük bant genişliği koşulları için özellikle avantajlıdır.
 •	Tek Endpoint: RESTful API'lerdeki gibi farklı endpoint'ler yerine tek bir endpoint kullanılır. Bu, API'nin sadece bir tanesini hataya karşı koruma, optimize etme ve bakımını yapma anlamına gelir.
 •	Dökümantasyon ve Otomatik Tamamlama: GraphQL, otomatik olarak dökümantasyon üretebilir ve geliştiricilere sorgu yaparken yardımcı olacak şekilde otomatik tamamlama özellikleri sunabilir.
 •	Gelişmiş Hata Yönetimi: GraphQL, hataları açıkça tanımlar ve işler, bu da hata ayıklamayı kolaylaştırır.
 
GraphQL Dezavantajları
 •	Öğrenme Eğrisi: RESTful API'lere göre daha karmaşık bir yapıya sahip olduğu için öğrenmesi daha zordur ve daha fazla zaman alır. 
 •	Güvenlik Sorunları: Özellikle karmaşık sorgularla çalışıldığında kötü amaçlı kullanımların önlenmesi için dikkatli bir şekilde güvenlik önlemleri alınmalıdır.
 •	Cachleme Zorluğu: REST'in aksine, GraphQL'de bir endpoint'ten sadece belirli bir parça veri çekildiği için cache'leme biraz daha karmaşık olabilir.
 
GraphQL'in İdeal Kullanım Senaryoları
 •	Karmaşık İlişkiler: Eğer uygulamanızda çok sayıda ve karmaşık ilişkiler varsa, GraphQL bu durumla başa çıkabilir.
 •	Mobil Uygulamalar: GraphQL, mobil uygulamalarda kullanılmak üzere optimize edilmiştir. İstemci, sadece ihtiyaç duyduğu veriyi alabilir, bu da veri transferini minimize eder.
 •	Teknoloji Çeşitliliği: Farklı platformlarda ve teknolojilerde çalışan uygulamalar arasında veri paylaşımı gerekiyorsa, GraphQL bu çeşitliliği yönetmede etkilidir.
