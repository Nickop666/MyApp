package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import Adapter.CourseAdapter;
import model.Course;

public class Buildings extends AppCompatActivity {

    RecyclerView courseRecycle;
    CourseAdapter courseAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bildings);


        List<Course> courseList = new ArrayList<>();
        courseList.add(new Course(1, "olezhka","Отель «Онегин»",
                "Отель Онегин — это отличный выбор для тех, кто приехал в Екатеринбург. Это хорошее сочетание цены и качества, комфорта, удобства и услуг, призванных сделать пребывание здесь очень приятным." +"\n" +"Номера оборудованы ТВ с плоским экраном, кондиционером и мини-баром, а выйти в Сеть в Отель Онегин очень просто благодаря бесплатному Wi-Fi.\n" +

                        "Вы также можете воспользоваться следующими услугами, которые предлагает отель: услугами консьержа и обслуживанием номеров. Кроме того, к услугам гостей есть джакузи и бесплатный завтрак. Дополнительное удобство для гостей — бесплатная парковка.",
                "https://www.google.ru/maps/place/Онегин,+банкетный+ресторан/@56.8299739,60.6115801,17z/data=!4m6!3m5!1s0x43c16f7ee436ab87:0x545c050e0f23ee8d!8m2!3d56.8299739!4d60.614155!16s%2Fg%2F11n2d463fx",
                "https://hotelonegin.com/?utm_source=yandex&utm_medium=cpc&utm_campaign=13_brand_poisk_region&utm_content=13332165413&utm_term=%D0%BE%D1%82%D0%B5%D0%BB%D1%8C%20%D0%BE%D0%BD%D0%B5%D0%B3%D0%B8%D0%BD%20%D0%B5%D0%BA%D0%B0%D1%82%D0%B5%D1%80%D0%B8%D0%BD%D0%B1%D1%83%D1%80%D0%B3%20%D0%BE%D1%84%D0%B8%D1%86%D0%B8%D0%B0%D0%BB%D1%8C%D0%BD%D1%8B%D0%B9%20%D1%81%D0%B0%D0%B9%D1%82&_openstat=ZGlyZWN0LnlhbmRleC5ydTs4MjIyNjEzNjsxMzMzMjE2NTQxMzt3d3cueWFuZGV4LnJ1OnByZW1pdW0&yclid=2648352277478768639" ));

        courseList.add(new Course(2, "hyatt_regency","Отель «Hyatt Regency Ekaterinburg»",
                "Удачное расположение отеля позволяет гостям воспользоваться любым видом общественного транспорта (метро, трамвай, троллейбус, автобус). В шаговой доступности имеется множество кафе, магазинов и ресторанов. Приветливый персонал рад встретить гостей в любое время суток.\n" +

                "Отель удобен для размещения гостей , находящихся в служебных командировках (предоставляются все отчетные документы), спортивных и туристических групп, семейных пар с детьми от трёх лет.\n" +

                "Имеется наличный и безналичный расчет.",
                "https://www.google.ru/maps/place/Отель+Хаятт+Ридженси/@56.8429326,60.5895621,17z/data=!3m1!4b1!4m6!3m5!1s0x43c16e609553ddfb:0xa6ca3fb86b4a21c8!8m2!3d56.8429326!4d60.592137!16s%2Fg%2F11h53wmm1p",
                "https://rg-ekaterinburghotel.ru/rooms/?utm_source=yandex_direct&utm_medium=cpc&utm_campaign=hdk-dig-23-0001-hyatt-yekhr-search-rooms-brand-ru-143565&utm_content=ch_yandex_direct|cid_81924843|gid_5109558389|ad_13290691813|ph_42766043670|crt_0|pst_premium|ps_1|srct_search|src_none|devt_desktop|ret_42766043670|geo_54|cf_0|int_|tgt_42766043670|add_no|mrlid_24298|dop_&utm_term=%D0%BE%D1%82%D0%B5%D0%BB%D0%B8%20%D0%B5%D0%BA%D0%B0%D1%82%D0%B5%D1%80%D0%B8%D0%BD%D0%B1%D1%83%D1%80%D0%B3%D0%B0&_openstat=ZGlyZWN0LnlhbmRleC5ydTs4MTkyNDg0MzsxMzI5MDY5MTgxMzt5YW5kZXgucnU6cHJlbWl1bQ&yclid=2721580896240533503"));
        courseList.add(new Course(3, "reno","Отель «Реноме»",
                "Номера оборудованы кондиционером и мини-баром, а гости могут в любой момент быть онлайн благодаря бесплатному Wi-Fi, который предлагает отель.\n" +

                "Реноме предлагает круглосуточную стойку регистрации, обслуживание в номер и быструю регистрацию при заезде/выезде, чтобы сделать пребывание гостей здесь еще более приятным. К услугам гостей также сауна и ресторан. Те, кто приезжает в Реноме на машине, могут воспользоваться бесплатной парковкой.",
                "https://www.google.ru/maps/place/Реноме/@56.8275226,60.5967714,17z/data=!3m1!4b1!4m9!3m8!1s0x43c16eed85ae79c5:0x483e10e3d1fade52!5m2!4m1!1i2!8m2!3d56.8275227!4d60.6016423!16s%2Fg%2F11b6df9z98",
                "http://renomme-hotel.ru/"));


        setCourseRecycler(courseList);

    }

    private void setCourseRecycler(List<Course> courseList) {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);

        courseRecycle = findViewById(R.id.categoryRecycler);
        courseRecycle.setLayoutManager(layoutManager);

        courseAdapter = new CourseAdapter(this, courseList);
        courseRecycle.setAdapter(courseAdapter);
    }




    public void back(View view){
        Intent back = new Intent(this, MainActivity.class);
        startActivity(back);
    }
}