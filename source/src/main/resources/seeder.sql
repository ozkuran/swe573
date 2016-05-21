INSERT INTO role (id, name)
     VALUES (1,"admin");

INSERT INTO role (id, name)
     VALUES (2,"worker");

INSERT INTO role (id, name)
     VALUES (3,"member");

INSERT INTO role (id, name)
     VALUES (4,"nonmember");

DELETE FROM product_type;
INSERT INTO product_type (id, name)
     VALUES (1,"zeytin");

INSERT INTO product_type (id, name)
     VALUES (2,"peynir");

INSERT INTO product_type (id, name)
     VALUES (3,"tursu");

INSERT INTO product_type (id, name)
     VALUES (4,"sut");

DELETE FROM package_type;
INSERT INTO package_type (id, name)
     VALUES (1, "kavanoz");

INSERT INTO package_type (id, name)
     VALUES (2, "vakumlu poset");


DELETE FROM announcement;
INSERT INTO announcement (title,date,content,photourl)
     VALUES ("17 Mayıs Salı 15:30 Baraka buluşması","2016-05-13","31 Mayıs’ta gerçekleşecek Genel Kurul toplantımızdan önce bir araya geliyoruz. Bu sene nasıl geçmiş, gelirler-giderler dengesine ne olmuş, harika gönüllülük hikayeleriyle kaç nöbet kurtulmuş, ürünlerimiz, üreticilerimiz ve aklımıza gelen tüm soruları bir konuşalım diyerek 17 Mayıs Salı günü 15:30’da Bükoop Baraka’da toplanıyoruz. Herkesi bekleriz!","http://www.bukoop.org/wp-content/uploads/2016/05/Baraka_photoshop.jpg");

INSERT INTO announcement (title,date,content,photourl)
VALUES ("Doğayla dost olan küçük çiftçilerdir","2016-05-05","Bukoop’un da katıldığı FAO toplantısından haberler;
http://www.birgun.net/haber-detay/dogayla-dost-olan-kucuk-ciftcilerdir-110965.html
Program;
http://2016.csoconsultation.org/pdf/agenda_en.pdf","http://www.bukoop.org/wp-content/uploads/2014/11/logo_placeholder.png");


INSERT INTO announcement (title,date,content,photourl)
VALUES ("Greyfurt geldi!","2016-05-05","Köyceğiz’deki üreticimiz Alp Pir’den greyfurt Baraka’ya yeniden geldi!
Mis gibi, kimyasalsız, bol vitaminli :) Yılın son güzel C vitaminlerini kaçırmayın!
Baraka haftaiçi 13.00-13.30 ve 17.00- 17.30 arası gönüllüler sayesinde açık!
Afiyetle,
Bukoop!","http://www.bukoop.org/wp-content/uploads/2016/05/IMG-20160428-WA0001_resized-1.jpg");

INSERT INTO announcement (title,date,content,photourl)
VALUES ("Sakarya Gevye’ye Mavi Çiftlik’e gidiyoruz!","2016-03-09","Mis keçi peyniri ve serin dondurmasıyla tanıdığınız Mavi Çiftlik’i, üreticimiz Ali Kuşçu’yu ziyarete gidiyoruz.
Toplanma yeri: Baraka (Kuzey Kampüs Shuttle durağının orada)
26 Mart Cumartesi
Saat: 09.30
Siz de gelmek isterseniz cansuplati@gmail.com adresine mutlaka e-mail atın ki yer durumunu ayarlayabilelim :)","http://www.bukoop.org/wp-content/uploads/2016/03/MAV%C4%B0C%C4%B0FTL%C4%B0KAF%C4%B0S.jpg");

DELETE FROM product;

DELETE FROM producer;


INSERT INTO producer (id,name,photourl)
VALUES (1, "Sındı Köyü Tarımsal Kalkınma Kooperatifi", "/images/farm001.jpg");

INSERT INTO producer (id,name,photourl)
VALUES (2, "Urfa Kadın Kooperatifi", "/images/farm002.jpg");

INSERT INTO producer (id,name,photourl)
VALUES (3, "Honaz Tarımsal Kalkınma Kooperatifi", "/images/farm003.jpg");

INSERT INTO producer (id,name,photourl)
VALUES (4, "Vakıflı Köyü Tarımsal Kalkınma Kooperatifi", "/images/farm001.jpg");

INSERT INTO producer (id,name,photourl)
VALUES (5, "Karaburun Kadın Kooperatifi", "/images/farm002.jpg");

INSERT INTO producer (id,name,photourl)
VALUES (6, "Cevat Öztel", "/images/farm006.jpg");

DELETE FROM product;

INSERT INTO product (id,description, package_type_id,producer_id,product_type_id,photourl,price)
    VALUES (1,"Siyah Zeytin",1,1,1,"/images/blackolive.jpg",10);

INSERT INTO product (id,description, package_type_id,producer_id,product_type_id,photourl,price)
VALUES (2,"Yeşil Zeytin",1,1,1,"/images/greenolive.jpg",10);

INSERT INTO product (id,description, package_type_id,producer_id,product_type_id,photourl,price)
VALUES (3,"Süt",1,2,4,"/images/milk.jpg",10);

INSERT INTO product (id,description, package_type_id,producer_id,product_type_id,photourl,price)
VALUES (4,"Süt",2,3,4,"/images/blackolive.jpg",10);

