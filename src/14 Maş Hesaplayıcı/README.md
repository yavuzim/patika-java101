<p> "Employee" adında fabrika çalışanlarını temsil eden ve metotları ile çalışanların maaşlarını hesaplayan bir sınıf yazmalısınız. Bu sınıf 4 nitelik ve 5 metoda sahip olacaktır. </p>

<h5>Sınıfın Nitelikleri</h5>

<ul>
    <li>name : Çalışanın adı ve soyadı</li>
    <li>salary : Çalışanın maaşı</li>
    <li>workHours : Haftalık çalışma saati</li>
    <li>hireYear : İşe başlangıç yılı</li>
</ul>

<h5>Sınıfın Metotları</h5>
<ul>
    <li>Employee(name,salary,workHours,hireYear) : Kurucu metot olup 4 parametre alacaktır.</li>
    <li>
        <p>tax() : Maaşa uygulanan vergiyi hesaplayacaktır.</p>
        <ul>
            <li>Çalışanın maaşı 1000 TL'den az ise vergi uygulanmayacaktır.</li>
            <li>Çalışanın maaşı 1000 TL'den fazla ise maaşının %3'ü kadar vergi uygulanacaktır.</li>
        </ul>
    </li>
    <li>bonus() : Eğer çalışan haftada 40 saatten fazla çalışmış ise fazladan çalıştığı her saat başına 30 TL olacak şekilde bonus ücretleri hesaplayacaktır.</li>
    <li>
        <p>raiseSalary() : Çalışanın işe başlangıç yılına göre maaş artışını hesaplayacaktır. Şuan ki yılı 2021 olarak alın.</p>
        <ul>
            <li>Eğer çalışan 10 yıldan az bir süredir çalışıyorsa maaşına %5 zam yapılacaktır.</li>
            <li>Eğer çalışan 9 yıldan fazla ve 20 yıldan az çalışıyorsa maaşına %10 zam yapılacaktır.</li>
            <li>Eğer çalışan 19 yıldan fazla çalışıyorsa %15 zam yapılacaktır.</li>
        </ul>
    </li>
    <li>toString() : Çalışana ait bilgileri ekrana bastıracaktır.</li>
</ul>